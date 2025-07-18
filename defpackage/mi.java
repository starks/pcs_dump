package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mi implements lr {
    final /* synthetic */ mk a;
    private final me b;

    public mi(mk mkVar, me meVar) {
        this.a = mkVar;
        this.b = meVar;
    }

    @Override // defpackage.lr
    public final void a() {
        this.a.a.remove(this.b);
        if (fjs.c(this.a.b, this.b)) {
            this.b.a();
            this.a.b = null;
        }
        this.b.f(this);
        fin finVar = this.b.d;
        if (finVar != null) {
            finVar.a();
        }
        this.b.d = null;
    }
}
