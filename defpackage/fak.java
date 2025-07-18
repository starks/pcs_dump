package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fak extends euk {
    final /* synthetic */ fbj a;
    final /* synthetic */ fam b;
    final /* synthetic */ ffh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fak(fam famVar, ffh ffhVar, fbj fbjVar) {
        super(famVar.a);
        this.c = ffhVar;
        this.a = fbjVar;
        this.b = famVar;
    }

    @Override // defpackage.euk
    public final void a() {
        try {
            int i = ffg.a;
            this.b.c().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
