package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fal extends euk {
    final /* synthetic */ fam a;
    final /* synthetic */ ffh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fal(fam famVar, ffh ffhVar) {
        super(famVar.a);
        this.b = ffhVar;
        this.a = famVar;
    }

    @Override // defpackage.euk
    public final void a() {
        try {
            int i = ffg.a;
            this.a.c().e();
        } catch (Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
