package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class epr extends elw {
    @Override // defpackage.elw
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // defpackage.elw
    public final void b() {
        f().b();
    }

    @Override // defpackage.elw
    public final void c(int i) {
        f().c(i);
    }

    protected abstract elw f();

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", f());
        return crtVarQ.toString();
    }
}
