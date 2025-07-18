package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fen extends fek {
    private final fej b;
    private Object c;
    private boolean d = false;

    public fen(fej fejVar) {
        this.b = fejVar;
    }

    @Override // defpackage.ebz
    public final void A(Object obj) {
        if (this.d) {
            throw new eqr(eqo.k.e("More than one value received for unary call"));
        }
        this.c = obj;
        this.d = true;
    }

    @Override // defpackage.fek
    public final void D() {
        this.b.a.c(2);
    }

    @Override // defpackage.ebz
    public final void y(eqo eqoVar, epc epcVar) {
        if (!eqoVar.g()) {
            this.b.e(new eqr(eqoVar, epcVar));
            return;
        }
        if (!this.d) {
            this.b.e(new eqr(eqo.k.e("No value received for unary call"), epcVar));
        }
        this.b.d(this.c);
    }

    @Override // defpackage.ebz
    public final void z(epc epcVar) {
    }
}
