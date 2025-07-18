package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evh implements etz {
    final eqo a;
    private final etx b;

    public evh(eqo eqoVar, etx etxVar) {
        clq.w(!eqoVar.g(), "error must not be OK");
        this.a = eqoVar;
        this.b = etxVar;
    }

    @Override // defpackage.etz
    public final etw a(epg epgVar, epc epcVar, elt eltVar, emb[] embVarArr) {
        return new evg(this.a, this.b, embVarArr);
    }

    @Override // defpackage.enu
    public final eno c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
