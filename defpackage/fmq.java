package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fmq extends fmo implements fmh {
    private final flf c;
    public final fli e;
    public final fli f;

    public fmq() {
        super(null);
        this.e = fjp.v(null);
        this.f = fjp.v(null);
        this.c = fjp.s(false);
    }

    private final void u() {
        fpf fpfVar = (fpf) this.f.a;
        if (fpfVar == null || fpfVar.d()) {
            return;
        }
        System.nanoTime();
        synchronized (fpfVar) {
        }
    }

    private final boolean v(Runnable runnable) {
        while (true) {
            Object obj = this.e.a;
            if (s()) {
                return false;
            }
            if (obj == null) {
                if (this.e.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof fow) {
                fow fowVar = (fow) obj;
                int iA = fowVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                this.e.d(obj, fowVar.c());
            } else {
                if (obj == fmr.a) {
                    return false;
                }
                fow fowVar2 = new fow(8, true);
                fowVar2.a((Runnable) obj);
                fowVar2.a(runnable);
                if (this.e.d(obj, fowVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.flx
    public final void d(fhq fhqVar, Runnable runnable) {
        g(runnable);
    }

    public void g(Runnable runnable) {
        u();
        if (v(runnable)) {
            p();
        } else {
            fmf.c.g(runnable);
        }
    }

    @Override // defpackage.fmo
    public void i() {
        fpg fpgVarC;
        fnq fnqVar = fnq.a;
        fnq.b.set(null);
        this.c.c();
        boolean z = fmd.a;
        while (true) {
            Object obj = this.e.a;
            if (obj == null) {
                if (this.e.d(null, fmr.a)) {
                    break;
                }
            } else if (obj instanceof fow) {
                ((fow) obj).d();
                break;
            } else {
                if (obj == fmr.a) {
                    break;
                }
                fow fowVar = new fow(8, true);
                fowVar.a((Runnable) obj);
                if (this.e.d(obj, fowVar)) {
                    break;
                }
            }
        }
        while (j() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            fpf fpfVar = (fpf) this.f.a;
            if (fpfVar == null) {
                return;
            }
            synchronized (fpfVar) {
                fpgVarC = fpfVar.a() > 0 ? fpfVar.c(0) : null;
            }
            fmp fmpVar = (fmp) fpgVarC;
            if (fmpVar == null) {
                return;
            } else {
                h(jNanoTime, fmpVar);
            }
        }
    }

    @Override // defpackage.fmo
    public final long j() {
        Runnable runnable;
        if (o()) {
            return 0L;
        }
        u();
        fli fliVar = this.e;
        while (true) {
            Object obj = fliVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof fow)) {
                if (obj == fmr.a) {
                    break;
                }
                if (this.e.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                fow fowVar = (fow) obj;
                Object objB = fowVar.b();
                if (objB != fow.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                this.e.d(obj, fowVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        fgk fgkVar = this.d;
        if (((fgkVar == null || fgkVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = this.e.a;
        if (obj2 != null) {
            if (!(obj2 instanceof fow)) {
                return obj2 == fmr.a ? Long.MAX_VALUE : 0L;
            }
            if (!((fow) obj2).e()) {
                return 0L;
            }
        }
        fpf fpfVar = (fpf) this.f.a;
        if (fpfVar == null) {
            return Long.MAX_VALUE;
        }
        fpfVar.b();
        return Long.MAX_VALUE;
    }

    public final boolean s() {
        return this.c.a();
    }

    protected final boolean t() {
        fgk fgkVar = this.d;
        if (fgkVar != null && !fgkVar.isEmpty()) {
            return false;
        }
        fpf fpfVar = (fpf) this.f.a;
        if (fpfVar != null && !fpfVar.d()) {
            return false;
        }
        Object obj = this.e.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof fow ? ((fow) obj).e() : obj == fmr.a;
    }
}
