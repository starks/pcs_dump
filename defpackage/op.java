package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class op implements djy {
    static final og b;
    private static final Object d;
    volatile ok listeners;
    volatile Object value;
    volatile oo waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(op.class.getName());

    static {
        og onVar;
        try {
            onVar = new ol(AtomicReferenceFieldUpdater.newUpdater(oo.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(oo.class, oo.class, "next"), AtomicReferenceFieldUpdater.newUpdater(op.class, oo.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(op.class, ok.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(op.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            onVar = new on();
        }
        b = onVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    protected op() {
    }

    static Object a(djy djyVar) {
        if (djyVar instanceof op) {
            Object obj = ((op) djyVar).value;
            if (!(obj instanceof oh)) {
                return obj;
            }
            oh ohVar = (oh) obj;
            if (!ohVar.c) {
                return obj;
            }
            Throwable th = ohVar.d;
            return th != null ? new oh(false, th) : oh.b;
        }
        boolean zIsCancelled = djyVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return oh.b;
        }
        try {
            Object objF = a.f(djyVar);
            return objF == null ? d : objF;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new oh(false, e);
            }
            Objects.toString(djyVar);
            return new oj(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(djyVar)), e));
        } catch (ExecutionException e2) {
            return new oj(e2.getCause());
        } catch (Throwable th2) {
            return new oj(th2);
        }
    }

    static void d(op opVar) {
        ok okVar;
        ok okVar2;
        ok okVar3 = null;
        while (true) {
            oo ooVar = opVar.waiters;
            if (b.e(opVar, ooVar, oo.a)) {
                while (ooVar != null) {
                    Thread thread = ooVar.thread;
                    if (thread != null) {
                        ooVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    ooVar = ooVar.next;
                }
                do {
                    okVar = opVar.listeners;
                } while (!b.c(opVar, okVar, ok.a));
                while (true) {
                    okVar2 = okVar3;
                    okVar3 = okVar;
                    if (okVar3 == null) {
                        break;
                    }
                    okVar = okVar3.next;
                    okVar3.next = okVar2;
                }
                while (okVar2 != null) {
                    Runnable runnable = okVar2.b;
                    ok okVar4 = okVar2.next;
                    if (runnable instanceof om) {
                        om omVar = (om) runnable;
                        opVar = omVar.a;
                        if (opVar.value == omVar) {
                            if (b.d(opVar, omVar, a(omVar.b))) {
                                okVar3 = okVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i(runnable, okVar2.c);
                    }
                    okVar2 = okVar4;
                }
                return;
            }
        }
    }

    static void f(Object obj) {
        obj.getClass();
    }

    private final String g(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void h(StringBuilder sb) {
        try {
            Object objF = a.f(this);
            sb.append("SUCCESS, result=[");
            sb.append(g(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            c.log(Level.SEVERE, a.B(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }

    private final void j(oo ooVar) {
        ooVar.thread = null;
        while (true) {
            oo ooVar2 = this.waiters;
            if (ooVar2 != oo.a) {
                oo ooVar3 = null;
                while (ooVar2 != null) {
                    oo ooVar4 = ooVar2.next;
                    if (ooVar2.thread != null) {
                        ooVar3 = ooVar2;
                    } else if (ooVar3 != null) {
                        ooVar3.next = ooVar4;
                        if (ooVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, ooVar2, ooVar4)) {
                        break;
                    }
                    ooVar2 = ooVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object k(Object obj) throws ExecutionException {
        if (obj instanceof oh) {
            Throwable th = ((oh) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof oj) {
            throw new ExecutionException(((oj) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof om) {
            return "setFuture=[" + g(((om) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.djy
    public final void c(Runnable runnable, Executor executor) {
        f(executor);
        ok okVar = this.listeners;
        if (okVar != ok.a) {
            ok okVar2 = new ok(runnable, executor);
            do {
                okVar2.next = okVar;
                if (b.c(this, okVar, okVar2)) {
                    return;
                } else {
                    okVar = this.listeners;
                }
            } while (okVar != ok.a);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.value
            boolean r1 = r0 instanceof defpackage.om
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5a
            boolean r1 = defpackage.op.a
            if (r1 == 0) goto L1f
            oh r1 = new oh
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            oh r1 = defpackage.oh.a
            goto L26
        L24:
            oh r1 = defpackage.oh.b
        L26:
            r4 = r2
        L27:
            og r5 = defpackage.op.b
            boolean r5 = r5.d(r6, r0, r1)
            if (r5 == 0) goto L53
            d(r6)
            boolean r6 = r0 instanceof defpackage.om
            if (r6 == 0) goto L52
            om r0 = (defpackage.om) r0
            djy r6 = r0.b
            boolean r0 = r6 instanceof defpackage.op
            if (r0 == 0) goto L4f
            op r6 = (defpackage.op) r6
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L46
            r4 = r3
            goto L47
        L46:
            r4 = r2
        L47:
            boolean r5 = r0 instanceof defpackage.om
            r4 = r4 | r5
            if (r4 == 0) goto L4e
            r4 = r3
            goto L27
        L4e:
            return r3
        L4f:
            r6.cancel(r7)
        L52:
            return r3
        L53:
            java.lang.Object r0 = r6.value
            boolean r5 = r0 instanceof defpackage.om
            if (r5 != 0) goto L27
            return r4
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op.cancel(boolean):boolean");
    }

    protected boolean e(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof om))) {
            return k(obj2);
        }
        oo ooVar = this.waiters;
        if (ooVar != oo.a) {
            oo ooVar2 = new oo();
            do {
                ooVar2.a(ooVar);
                if (b.e(this, ooVar, ooVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(ooVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof om))));
                    return k(obj);
                }
                ooVar = this.waiters;
            } while (ooVar != oo.a);
        }
        return k(this.value);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof oh;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r2 instanceof om));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e) {
                Class<?> cls = e.getClass();
                Objects.toString(cls);
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                h(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof om))) {
                return k(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                oo ooVar = this.waiters;
                if (ooVar != oo.a) {
                    oo ooVar2 = new oo();
                    do {
                        ooVar2.a(ooVar);
                        if (b.e(this, ooVar, ooVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof om))) {
                                        return k(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    j(ooVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(ooVar2);
                        } else {
                            ooVar = this.waiters;
                        }
                    } while (ooVar != oo.a);
                }
                return k(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof om))) {
                    return k(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = String.valueOf(strConcat3).concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = String.valueOf(strConcat2).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(strConcat).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
