package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class evi implements etw {
    @Override // defpackage.etw
    public final elp B() {
        throw null;
    }

    protected abstract etw a();

    @Override // defpackage.etw
    public final void c(ewa ewaVar) {
        a().c(ewaVar);
    }

    @Override // defpackage.etw
    public final void d(eqo eqoVar) {
        a().d(eqoVar);
    }

    @Override // defpackage.etw
    public final void e() {
        a().e();
    }

    @Override // defpackage.fbi
    public final void f() {
        a().f();
    }

    @Override // defpackage.fbi
    public final void g() {
        a().g();
    }

    @Override // defpackage.fbi
    public final void h(int i) {
        a().h(i);
    }

    @Override // defpackage.fbi
    public final void i(eme emeVar) {
        a().i(emeVar);
    }

    @Override // defpackage.etw
    public final void j(ems emsVar) {
        a().j(emsVar);
    }

    @Override // defpackage.fbi
    public final void k(InputStream inputStream) {
        a().k(inputStream);
    }

    @Override // defpackage.fbi
    public final boolean l() {
        return a().l();
    }

    @Override // defpackage.etw
    public final void m(emu emuVar) {
        a().m(emuVar);
    }

    @Override // defpackage.etw
    public final void n(int i) {
        a().n(i);
    }

    @Override // defpackage.etw
    public final void o(int i) {
        a().o(i);
    }

    @Override // defpackage.etw
    public void p(ety etyVar) {
        throw null;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", a());
        return crtVarQ.toString();
    }
}
