package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ets extends euk {
    final /* synthetic */ eqo a;
    final /* synthetic */ epc b;
    final /* synthetic */ etu c;
    final /* synthetic */ ffh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ets(etu etuVar, ffh ffhVar, eqo eqoVar, epc epcVar) {
        super(etuVar.b.f);
        this.d = ffhVar;
        this.a = eqoVar;
        this.b = epcVar;
        this.c = etuVar;
    }

    @Override // defpackage.euk
    public final void a() {
        int i = ffg.a;
        this.c.b.g.c();
        eqo eqoVar = this.a;
        epc epcVar = this.b;
        eqo eqoVar2 = this.c.a;
        if (eqoVar2 != null) {
            epcVar = new epc();
            eqoVar = eqoVar2;
        }
        try {
            etv.g(this.c.c, eqoVar, epcVar);
        } finally {
            this.c.b.e.a(eqoVar.g());
        }
    }
}
