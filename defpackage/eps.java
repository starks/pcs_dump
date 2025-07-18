package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eps extends eqc {
    @Override // defpackage.eqc
    public void a(eqo eqoVar, epc epcVar) {
        throw null;
    }

    public abstract eqc b();

    @Override // defpackage.eqc
    public void c() {
        throw null;
    }

    @Override // defpackage.eqc
    public final elp f() {
        return b().f();
    }

    @Override // defpackage.eqc
    public final void g(epc epcVar) {
        b().g(epcVar);
    }

    @Override // defpackage.eqc
    public final boolean h() {
        return b().h();
    }

    @Override // defpackage.eqc
    public final boolean i() {
        return b().i();
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", b());
        return crtVarQ.toString();
    }
}
