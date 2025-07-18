package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fej extends dif {
    public final elw a;

    public fej(elw elwVar) {
        this.a = elwVar;
    }

    @Override // defpackage.dif
    protected final String a() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("clientCall", this.a);
        return crtVarQ.toString();
    }

    @Override // defpackage.dif
    protected final boolean d(Object obj) {
        return super.d(obj);
    }

    @Override // defpackage.dif
    public final boolean e(Throwable th) {
        return super.e(th);
    }

    @Override // defpackage.dif
    protected final void n() {
        this.a.a("GrpcFuture was cancelled", null);
    }
}
