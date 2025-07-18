package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class evm extends epo {
    public final epo a;

    public evm(epo epoVar) {
        this.a = epoVar;
    }

    @Override // defpackage.epo
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.epo
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.epo
    public void c() {
        throw null;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", this.a);
        return crtVarQ.toString();
    }
}
