package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class evj implements ety {
    @Override // defpackage.ety
    public void a(eqo eqoVar, etx etxVar, epc epcVar) {
        throw null;
    }

    protected abstract ety b();

    @Override // defpackage.ety
    public final void c(epc epcVar) {
        b().c(epcVar);
    }

    @Override // defpackage.fbk
    public final void d(fbj fbjVar) {
        b().d(fbjVar);
    }

    @Override // defpackage.fbk
    public final void e() {
        b().e();
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", b());
        return crtVarQ.toString();
    }
}
