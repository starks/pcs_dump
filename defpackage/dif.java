package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dif extends dkr implements djy {
    private static final Object a;
    static final boolean d;
    static final djx e;
    public static final dhr f;
    public volatile dhw listeners;
    public volatile Object value;
    public volatile die waiters;

    static {
        boolean z;
        dhr dhyVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new djx(dif.class);
        Throwable th3 = null;
        try {
            dhyVar = new did();
            th = null;
            th2 = null;
        } catch (Error | Exception e2) {
            try {
                dhyVar = new dhs();
            } catch (Error | Exception e3) {
                th3 = e3;
                dhyVar = new dhy();
            }
            th = th3;
            th2 = e2;
        }
        f = dhyVar;
        if (th != null) {
            djx djxVar = e;
            djxVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            djxVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
        a = new Object();
    }

    protected dif() {
    }

    private final void g(StringBuilder sb) {
        try {
            Object objF = a.f(this);
            sb.append("SUCCESS, result=[");
            if (objF == null) {
                sb.append("null");
            } else if (objF == this) {
                sb.append("this future");
            } else {
                sb.append(objF.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objF)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void h(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof dhx) {
            sb.append(", setFuture=[");
            i(sb, ((dhx) obj).b);
            sb.append("]");
        } else {
            try {
                strConcat = a();
                if (true == clq.O(strConcat)) {
                    strConcat = null;
                }
            } catch (Exception | StackOverflowError e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            g(sb);
        }
    }

    private final void i(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object k(djy djyVar) {
        Throwable thL;
        if (djyVar instanceof dhz) {
            Object dhtVar = ((dif) djyVar).value;
            if (dhtVar instanceof dht) {
                dht dhtVar2 = (dht) dhtVar;
                if (dhtVar2.c) {
                    Throwable th = dhtVar2.d;
                    dhtVar = th != null ? new dht(false, th) : dht.b;
                }
            }
            dhtVar.getClass();
            return dhtVar;
        }
        if ((djyVar instanceof dkr) && (thL = ((dkr) djyVar).l()) != null) {
            return new dhv(thL);
        }
        boolean zIsCancelled = djyVar.isCancelled();
        if ((!d) && zIsCancelled) {
            dht dhtVar3 = dht.b;
            dhtVar3.getClass();
            return dhtVar3;
        }
        try {
            Object objF = a.f(djyVar);
            if (!zIsCancelled) {
                return objF == null ? a : objF;
            }
            return new dht(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(djyVar)));
        } catch (Error | Exception e2) {
            return new dhv(e2);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new dhv(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(djyVar))), e3)) : new dht(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new dht(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(djyVar))), e4)) : new dhv(e4.getCause());
        }
    }

    public static void m(dif difVar, boolean z) {
        dhw dhwVar = null;
        while (true) {
            for (die dieVarB = f.b(difVar, die.a); dieVarB != null; dieVarB = dieVarB.next) {
                Thread thread = dieVarB.thread;
                if (thread != null) {
                    dieVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                difVar.n();
            }
            difVar.b();
            dhw dhwVar2 = dhwVar;
            dhw dhwVarA = f.a(difVar, dhw.a);
            dhw dhwVar3 = dhwVar2;
            while (dhwVarA != null) {
                dhw dhwVar4 = dhwVarA.next;
                dhwVarA.next = dhwVar3;
                dhwVar3 = dhwVarA;
                dhwVarA = dhwVar4;
            }
            while (dhwVar3 != null) {
                dhwVar = dhwVar3.next;
                Runnable runnable = dhwVar3.b;
                runnable.getClass();
                if (runnable instanceof dhx) {
                    dhx dhxVar = (dhx) runnable;
                    difVar = dhxVar.a;
                    if (difVar.value == dhxVar) {
                        if (f.f(difVar, dhxVar, k(dhxVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dhwVar3.c;
                    executor.getClass();
                    j(runnable, executor);
                }
                dhwVar3 = dhwVar;
            }
            return;
            z = false;
        }
    }

    private final void q(die dieVar) {
        dieVar.thread = null;
        while (true) {
            die dieVar2 = this.waiters;
            if (dieVar2 != die.a) {
                die dieVar3 = null;
                while (dieVar2 != null) {
                    die dieVar4 = dieVar2.next;
                    if (dieVar2.thread != null) {
                        dieVar3 = dieVar2;
                    } else if (dieVar3 != null) {
                        dieVar3.next = dieVar4;
                        if (dieVar3.thread == null) {
                            break;
                        }
                    } else if (!f.g(this, dieVar2, dieVar4)) {
                        break;
                    }
                    dieVar2 = dieVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object r(Object obj) throws ExecutionException {
        if (obj instanceof dht) {
            Throwable th = ((dht) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof dhv) {
            throw new ExecutionException(((dhv) obj).b);
        }
        if (obj == a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.djy
    public void c(Runnable runnable, Executor executor) {
        dhw dhwVar;
        executor.getClass();
        if (!isDone() && (dhwVar = this.listeners) != dhw.a) {
            dhw dhwVar2 = new dhw(runnable, executor);
            do {
                dhwVar2.next = dhwVar;
                if (f.e(this, dhwVar, dhwVar2)) {
                    return;
                } else {
                    dhwVar = this.listeners;
                }
            } while (dhwVar != dhw.a);
        }
        j(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.value
            boolean r1 = r0 instanceof defpackage.dhx
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5d
            boolean r1 = defpackage.dif.d
            if (r1 == 0) goto L1f
            dht r1 = new dht
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L29
        L1f:
            if (r7 == 0) goto L24
            dht r1 = defpackage.dht.a
            goto L26
        L24:
            dht r1 = defpackage.dht.b
        L26:
            r1.getClass()
        L29:
            r4 = r2
        L2a:
            dhr r5 = defpackage.dif.f
            boolean r5 = r5.f(r6, r0, r1)
            if (r5 == 0) goto L56
            m(r6, r7)
            boolean r6 = r0 instanceof defpackage.dhx
            if (r6 == 0) goto L55
            dhx r0 = (defpackage.dhx) r0
            djy r6 = r0.b
            boolean r0 = r6 instanceof defpackage.dhz
            if (r0 == 0) goto L52
            dif r6 = (defpackage.dif) r6
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L49
            r4 = r3
            goto L4a
        L49:
            r4 = r2
        L4a:
            boolean r5 = r0 instanceof defpackage.dhx
            r4 = r4 | r5
            if (r4 == 0) goto L51
            r4 = r3
            goto L2a
        L51:
            return r3
        L52:
            r6.cancel(r7)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r6.value
            boolean r5 = r0 instanceof defpackage.dhx
            if (r5 != 0) goto L2a
            return r4
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dif.cancel(boolean):boolean");
    }

    protected boolean d(Object obj) {
        if (obj == null) {
            obj = a;
        }
        if (!f.f(this, null, obj)) {
            return false;
        }
        m(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        th.getClass();
        if (!f.f(this, null, new dhv(th))) {
            return false;
        }
        m(this, false);
        return true;
    }

    public boolean f(djy djyVar) {
        dhv dhvVar;
        djyVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (djyVar.isDone()) {
                if (!f.f(this, null, k(djyVar))) {
                    return false;
                }
                m(this, false);
                return true;
            }
            dhx dhxVar = new dhx(this, djyVar);
            if (f.f(this, null, dhxVar)) {
                try {
                    djyVar.c(dhxVar, diy.a);
                } catch (Throwable th) {
                    try {
                        dhvVar = new dhv(th);
                    } catch (Error | Exception unused) {
                        dhvVar = dhv.a;
                    }
                    f.f(this, dhxVar, dhvVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof dht) {
            djyVar.cancel(((dht) obj).c);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof dhx))) {
            return r(obj2);
        }
        die dieVar = this.waiters;
        if (dieVar != die.a) {
            die dieVar2 = new die();
            do {
                dieVar2.a(dieVar);
                if (f.g(this, dieVar, dieVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            q(dieVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof dhx))));
                    return r(obj);
                }
                dieVar = this.waiters;
            } while (dieVar != die.a);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return r(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof dht;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r2 instanceof dhx));
    }

    @Override // defpackage.dkr
    public final Throwable l() {
        if (!(this instanceof dhz)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof dhv) {
            return ((dhv) obj).b;
        }
        return null;
    }

    public final void o(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(p());
        }
    }

    protected final boolean p() {
        Object obj = this.value;
        return (obj instanceof dht) && ((dht) obj).c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            h(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof dhx))) {
                return r(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                die dieVar = this.waiters;
                if (dieVar != die.a) {
                    die dieVar2 = new die();
                    do {
                        dieVar2.a(dieVar);
                        if (f.g(this, dieVar, dieVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof dhx))) {
                                        return r(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    q(dieVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            q(dieVar2);
                        } else {
                            dieVar = this.waiters;
                        }
                    } while (dieVar != die.a);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return r(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof dhx))) {
                    return r(obj4);
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

    protected void b() {
    }

    protected void n() {
    }
}
