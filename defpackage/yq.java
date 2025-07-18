package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yq implements yx {
    private final yp a;
    private final yx b;

    public yq(yp ypVar, yx yxVar) {
        this.a = ypVar;
        this.b = yxVar;
    }

    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) {
        switch (yuVar) {
            case ON_CREATE:
                this.a.a();
                break;
            case ON_START:
                this.a.e();
                break;
            case ON_RESUME:
                this.a.d();
                break;
            case ON_PAUSE:
                this.a.c();
                break;
            case ON_STOP:
                this.a.f();
                break;
            case ON_DESTROY:
                this.a.b();
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.g(yzVar, yuVar);
        }
    }
}
