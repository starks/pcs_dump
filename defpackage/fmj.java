package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fmj extends fpr {
    public int a;

    public fmj(int i) {
        super(0L, false);
        this.a = -1;
    }

    public abstract Object b();

    public Throwable c(Object obj) {
        flq flqVar = obj instanceof flq ? (flq) obj : null;
        if (flqVar != null) {
            return flqVar.a;
        }
        return null;
    }

    public abstract fhk h();

    public final void j(Throwable th) {
        fme.d(h().d(), new fmc(a.y(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fhk, fia] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = fmd.a;
        try {
            fhk fhkVarH = h();
            ?? r1 = ((foj) fhkVarH).c;
            Object obj = ((foj) fhkVarH).e;
            fhq fhqVarD = r1.d();
            Object objB = fpe.b(fhqVarD, obj);
            fna fnaVar = null;
            fnt fntVarC = objB != fpe.a ? flw.c(r1, fhqVarD, objB) : null;
            try {
                fhq fhqVarD2 = r1.d();
                Object objB2 = b();
                Throwable thC = c(objB2);
                if (thC == null && this.a == 1) {
                    fnaVar = (fna) fhqVarD2.get(fna.c);
                }
                if (fnaVar != null && !fnaVar.p()) {
                    Throwable thM = fnaVar.m();
                    i();
                    if (fmd.c) {
                        thM = fpb.a(thM, r1);
                    }
                    r1.e(ffh.b(thM));
                } else if (thC != null) {
                    r1.e(ffh.b(thC));
                } else {
                    r1.e(a(objB2));
                }
                if (fntVarC != null && !fntVarC.L()) {
                    return;
                }
                fpe.c(fhqVarD, objB);
            } catch (Throwable th) {
                if (fntVarC == null || fntVarC.L()) {
                    fpe.c(fhqVarD, objB);
                }
                throw th;
            }
        } catch (Throwable th2) {
            j(th2);
        }
    }

    public void i() {
    }

    public Object a(Object obj) {
        return obj;
    }
}
