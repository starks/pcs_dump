package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etq extends euk {
    final /* synthetic */ epc a;
    final /* synthetic */ etu b;
    final /* synthetic */ ffh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etq(etu etuVar, ffh ffhVar, epc epcVar) {
        super(etuVar.b.f);
        this.c = ffhVar;
        this.a = epcVar;
        this.b = etuVar;
    }

    @Override // defpackage.euk
    public final void a() {
        int i = ffg.a;
        etu etuVar = this.b;
        if (etuVar.a != null) {
            return;
        }
        try {
            etuVar.c.z(this.a);
        } catch (Throwable th) {
            this.b.b(eqo.c.d(th).e("Failed to read headers"));
        }
    }
}
