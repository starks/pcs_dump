package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbp extends fbr {
    final /* synthetic */ fbs a;
    final ffh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbp(fbs fbsVar) {
        super(fbsVar);
        this.a = fbsVar;
        this.b = ffg.b();
    }

    @Override // defpackage.fbr
    public final void a() {
        fvk fvkVar = new fvk();
        int i = ffg.a;
        synchronized (this.a.a) {
            fvk fvkVar2 = this.a.b;
            fvkVar.bi(fvkVar2, fvkVar2.b);
            this.a.e = false;
        }
        this.a.f.bi(fvkVar, fvkVar.b);
        this.a.f.flush();
    }
}
