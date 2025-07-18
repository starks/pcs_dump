package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fes extends fjp {
    final /* synthetic */ fet a;
    private final eqc b;
    private boolean c;
    private boolean d;
    private Object e;
    private final feq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fes(fet fetVar, feq feqVar, eqc eqcVar) {
        super((char[]) null);
        this.a = fetVar;
        this.c = true;
        this.b = eqcVar;
        this.f = feqVar;
    }

    @Override // defpackage.fjp
    public final void S() {
        feq feqVar = this.f;
        if (feqVar.e != null) {
            return;
        }
        feqVar.b = true;
    }

    @Override // defpackage.fjp
    public final void d() {
        if (this.c) {
            Object obj = this.e;
            if (obj == null) {
                this.b.a(eqo.k.e("Half-closed without a request"), new epc());
                return;
            }
            fet fetVar = this.a;
            fetVar.a.a(obj, this.f);
            this.e = null;
            this.f.c = true;
            if (this.d) {
                f();
            }
        }
    }

    @Override // defpackage.fjp
    public final void e(Object obj) {
        if (this.e == null) {
            this.e = obj;
        } else {
            this.b.a(eqo.k.e("Too many requests"), new epc());
            this.c = false;
        }
    }

    @Override // defpackage.fjp
    public final void f() {
        this.d = true;
        Runnable runnable = this.f.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.fjp
    public final void c() {
    }
}
