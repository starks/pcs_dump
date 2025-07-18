package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eur extends elw {
    private static final Logger c = Logger.getLogger(eur.class.getName());
    private static final elw d = new euo();
    public final emr a;
    public elw b;
    private final ScheduledFuture e;
    private final Executor f;
    private volatile boolean g;
    private eqo h;
    private List i = new ArrayList();
    private euq j;
    private ebz k;

    protected eur(Executor executor, ScheduledExecutorService scheduledExecutorService, ems emsVar) {
        executor.getClass();
        this.f = executor;
        scheduledExecutorService.getClass();
        emr emrVarL = emr.l();
        this.a = emrVarL;
        ems emsVarB = emrVarL.b();
        ScheduledFuture<?> scheduledFutureSchedule = null;
        if (emsVar != null || emsVarB != null) {
            long jB = emsVar != null ? emsVar.b(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
            if (emsVarB != null && emsVarB.b(TimeUnit.NANOSECONDS) < jB) {
                jB = emsVarB.b(TimeUnit.NANOSECONDS);
                Logger logger = c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jB)));
                    if (emsVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(emsVar.b(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long jAbs = Math.abs(jB) / TimeUnit.SECONDS.toNanos(1L);
            long jAbs2 = Math.abs(jB) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            String str = true != (emsVar == null ? true : emsVarB == null ? false : emsVarB.d(emsVar)) ? "CallOptions" : "Context";
            if (jB < 0) {
                sb2.append("ClientCall started after ");
                sb2.append(str);
                sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline ");
                sb2.append(str);
                sb2.append(" will be exceeded in ");
            }
            sb2.append(jAbs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new cfz(this, sb2, 7, (short[]) null), jB, TimeUnit.NANOSECONDS);
        }
        this.e = scheduledFutureSchedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (this.g) {
                runnable.run();
            } else {
                this.i.add(runnable);
            }
        }
    }

    @Override // defpackage.elw
    public final void a(String str, Throwable th) {
        eqo eqoVar = eqo.c;
        eqo eqoVarE = str != null ? eqoVar.e(str) : eqoVar.e("Call cancelled without message");
        if (th != null) {
            eqoVarE = eqoVarE.d(th);
        }
        g(eqoVarE, false);
    }

    @Override // defpackage.elw
    public final void b() {
        j(new chg(this, 10, null));
    }

    @Override // defpackage.elw
    public final void c(int i) {
        if (this.g) {
            this.b.c(i);
        } else {
            j(new sp(this, i, 6, null));
        }
    }

    @Override // defpackage.elw
    public final void d(Object obj) {
        if (this.g) {
            this.b.d(obj);
        } else {
            j(new cfz(this, obj, 9, (short[]) null));
        }
    }

    @Override // defpackage.elw
    public final void e(ebz ebzVar, epc epcVar) {
        eqo eqoVar;
        boolean z;
        clq.G(this.k == null, "already started");
        synchronized (this) {
            this.k = ebzVar;
            eqoVar = this.h;
            z = this.g;
            if (!z) {
                euq euqVar = new euq(ebzVar);
                this.j = euqVar;
                ebzVar = euqVar;
            }
        }
        if (eqoVar != null) {
            this.f.execute(new eup(this, ebzVar, eqoVar));
        } else if (z) {
            this.b.e(ebzVar, epcVar);
        } else {
            j(new n(this, ebzVar, epcVar, 8));
        }
    }

    public final void g(eqo eqoVar, boolean z) {
        boolean z2;
        ebz ebzVar;
        synchronized (this) {
            if (this.b == null) {
                i(d);
                ebzVar = this.k;
                this.h = eqoVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                z2 = true;
                ebzVar = null;
            }
            if (z2) {
                j(new cfz((Object) this, (Object) eqoVar, 8, (byte[]) null));
            } else {
                if (ebzVar != null) {
                    this.f.execute(new eup(this, ebzVar, eqoVar));
                }
                h();
            }
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.i     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.g = r0     // Catch: java.lang.Throwable -> L42
            euq r0 = r3.j     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f
            eun r2 = new eun
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.i     // Catch: java.lang.Throwable -> L42
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eur.h():void");
    }

    public final void i(elw elwVar) {
        elw elwVar2 = this.b;
        clq.J(elwVar2 == null, "realCall already set to %s", elwVar2);
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = elwVar;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("realCall", this.b);
        return crtVarQ.toString();
    }

    protected void f() {
    }
}
