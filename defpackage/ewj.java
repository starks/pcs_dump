package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewj extends evk {
    public final etl a;
    private final eui b;

    public ewj(eui euiVar, etl etlVar) {
        this.b = euiVar;
        this.a = etlVar;
    }

    @Override // defpackage.evk, defpackage.etz
    public final etw a(epg epgVar, epc epcVar, elt eltVar, emb[] embVarArr) {
        return new ewi(this, b().a(epgVar, epcVar, eltVar, embVarArr));
    }

    @Override // defpackage.evk
    protected final eui b() {
        return this.b;
    }
}
