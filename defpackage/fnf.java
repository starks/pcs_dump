package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnf extends fne {
    private final fnh a;
    private final fng f;
    private final flp g;
    private final Object h;

    public fnf(fnh fnhVar, fng fngVar, flp flpVar, Object obj) {
        this.a = fnhVar;
        this.f = fngVar;
        this.g = flpVar;
        this.h = obj;
    }

    @Override // defpackage.fne
    public final void b(Throwable th) {
        boolean z = fmd.a;
        fnh fnhVar = this.a;
        fng fngVar = this.f;
        flp flpVar = this.g;
        flp flpVarY = fnhVar.y(flpVar);
        Object obj = this.h;
        if (flpVarY == null || !fnhVar.I(fngVar, flpVarY, obj)) {
            fngVar.a.j(2);
            flp flpVarY2 = fnhVar.y(flpVar);
            if (flpVarY2 == null || !fnhVar.I(fngVar, flpVarY2, obj)) {
                fnhVar.f(fnhVar.s(fngVar, obj));
            }
        }
    }

    @Override // defpackage.fne
    public final boolean c() {
        return false;
    }
}
