package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mh implements yx, lr {
    final /* synthetic */ mk a;
    private final yw b;
    private final me c;
    private lr d;

    public mh(mk mkVar, yw ywVar, me meVar) {
        ywVar.getClass();
        this.a = mkVar;
        this.b = ywVar;
        this.c = meVar;
        ywVar.b(this);
    }

    @Override // defpackage.lr
    public final void a() {
        this.b.c(this);
        this.c.f(this);
        lr lrVar = this.d;
        if (lrVar != null) {
            lrVar.a();
        }
        this.d = null;
    }

    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) {
        if (yuVar == yu.ON_START) {
            mk mkVar = this.a;
            me meVar = this.c;
            mkVar.a.add(meVar);
            mi miVar = new mi(mkVar, meVar);
            meVar.e(miVar);
            mkVar.d();
            meVar.d = new mj(mkVar, 0);
            this.d = miVar;
            return;
        }
        if (yuVar != yu.ON_STOP) {
            if (yuVar == yu.ON_DESTROY) {
                a();
            }
        } else {
            lr lrVar = this.d;
            if (lrVar != null) {
                lrVar.a();
            }
        }
    }
}
