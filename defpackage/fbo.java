package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbo extends fbr {
    final /* synthetic */ fbs a;
    final ffh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbo(fbs fbsVar) {
        super(fbsVar);
        this.a = fbsVar;
        this.b = ffg.b();
    }

    @Override // defpackage.fbr
    public final void a() {
        int i;
        fvk fvkVar = new fvk();
        int i2 = ffg.a;
        synchronized (this.a.a) {
            fvk fvkVar2 = this.a.b;
            fvkVar.bi(fvkVar2, fvkVar2.g());
            fbs fbsVar = this.a;
            fbsVar.d = false;
            i = fbsVar.i;
        }
        this.a.f.bi(fvkVar, fvkVar.b);
        synchronized (this.a.a) {
            this.a.i -= i;
        }
    }
}
