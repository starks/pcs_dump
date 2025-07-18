package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class evk implements eui {
    @Override // defpackage.etz
    public etw a(epg epgVar, epc epcVar, elt eltVar, emb[] embVarArr) {
        throw null;
    }

    protected abstract eui b();

    @Override // defpackage.enu
    public final eno c() {
        return b().c();
    }

    @Override // defpackage.exw
    public void d(eqo eqoVar) {
        b().d(eqoVar);
    }

    @Override // defpackage.exw
    public final void e(eqo eqoVar) {
        throw null;
    }

    @Override // defpackage.exw
    public final void g(exv exvVar) {
        b().g(exvVar);
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", b());
        return crtVarQ.toString();
    }
}
