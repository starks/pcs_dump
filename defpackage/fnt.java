package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnt extends fpa {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    public fnt(fhq fhqVar, fhk fhkVar) {
        super(fhqVar.get(fnu.a) == null ? fhqVar.plus(fnu.a) : fhqVar, fhkVar);
        this.b = new ThreadLocal();
        if (fhkVar.d().get(fhm.a) instanceof flx) {
            return;
        }
        Object objB = fpe.b(fhqVar, null);
        fpe.c(fhqVar, objB);
        K(fhqVar, objB);
    }

    public final void K(fhq fhqVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new ffs(fhqVar, obj));
    }

    public final boolean L() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.fpa, defpackage.flk
    protected final void h(Object obj) {
        if (this.threadLocalIsSet) {
            ffs ffsVar = (ffs) this.b.get();
            if (ffsVar != null) {
                fpe.c((fhq) ffsVar.a, ffsVar.b);
            }
            this.b.remove();
        }
        Object objO = fjp.o(obj, this.d);
        fhk fhkVar = this.d;
        fhq fhqVarD = fhkVar.d();
        Object objB = fpe.b(fhqVarD, null);
        fnt fntVarC = objB != fpe.a ? flw.c(fhkVar, fhqVarD, objB) : null;
        try {
            this.d.e(objO);
            if (fntVarC == null || fntVarC.L()) {
                fpe.c(fhqVarD, objB);
            }
        } catch (Throwable th) {
            if (fntVarC == null || fntVarC.L()) {
                fpe.c(fhqVarD, objB);
            }
            throw th;
        }
    }
}
