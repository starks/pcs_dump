package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmi extends fpa {
    public final flg b;

    public fmi(fhq fhqVar, fhk fhkVar) {
        super(fhqVar, fhkVar);
        this.b = fjp.t(0);
    }

    @Override // defpackage.fpa, defpackage.fnh
    protected final void f(Object obj) {
        h(obj);
    }

    @Override // defpackage.fpa, defpackage.flk
    protected final void h(Object obj) {
        do {
            int i = this.b.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                fhk fhkVar = this.d;
                fok.a(fjp.C(fhkVar), fjp.o(obj, fhkVar));
                return;
            }
        } while (!this.b.c(0, 2));
    }
}
