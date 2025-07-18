package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zf extends zg implements yx {
    final yz a;
    final /* synthetic */ zh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(zh zhVar, yz yzVar, zj zjVar) {
        super(zhVar, zjVar);
        this.b = zhVar;
        this.a = yzVar;
    }

    @Override // defpackage.zg
    public final boolean a() {
        return this.a.E().a().a(yv.STARTED);
    }

    @Override // defpackage.zg
    public final void b() {
        this.a.E().c(this);
    }

    @Override // defpackage.zg
    public final boolean c(yz yzVar) {
        return this.a == yzVar;
    }

    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) {
        yv yvVarA = this.a.E().a();
        if (yvVarA == yv.DESTROYED) {
            this.b.h(this.c);
            return;
        }
        yv yvVar = null;
        while (yvVar != yvVarA) {
            d(a());
            yvVar = yvVarA;
            yvVarA = this.a.E().a();
        }
    }
}
