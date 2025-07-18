package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ett extends euk {
    final /* synthetic */ etu a;
    final /* synthetic */ ffh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ett(etu etuVar, ffh ffhVar) {
        super(etuVar.b.f);
        this.b = ffhVar;
        this.a = etuVar;
    }

    @Override // defpackage.euk
    public final void a() {
        int i = ffg.a;
        etu etuVar = this.a;
        if (etuVar.a != null) {
            return;
        }
        try {
            etuVar.c.B();
        } catch (Throwable th) {
            this.a.b(eqo.c.d(th).e("Failed to call onReady."));
        }
    }
}
