package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fel extends fek {
    private final feu b;
    private final fei c;

    public fel(feu feuVar, fei feiVar) {
        this.b = feuVar;
        this.c = feiVar;
    }

    @Override // defpackage.ebz
    public final void A(Object obj) {
        ((eai) this.b).d((ecv) obj);
        this.c.d(1);
    }

    @Override // defpackage.fek
    public final void D() {
        this.c.d(1);
    }

    @Override // defpackage.ebz
    public final void y(eqo eqoVar, epc epcVar) {
        if (eqoVar.g()) {
            this.b.a();
        } else {
            this.b.b(new eqr(eqoVar, epcVar));
        }
    }

    @Override // defpackage.ebz
    public final void B() {
    }

    @Override // defpackage.ebz
    public final void z(epc epcVar) {
    }
}
