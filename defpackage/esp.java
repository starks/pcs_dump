package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esp implements faw {
    private final elp a;
    private epc b;
    private InputStream c;
    private final erz d;
    private final esi e;

    public esp(erz erzVar, esi esiVar, elp elpVar) {
        this.d = erzVar;
        this.e = esiVar;
        this.a = elpVar;
    }

    @Override // defpackage.faw
    public final elp a() {
        return this.a;
    }

    @Override // defpackage.faw
    public final fbh b() {
        return this.e.c;
    }

    @Override // defpackage.faw
    public final String c() {
        return (String) this.a.a(erm.d);
    }

    @Override // defpackage.faw
    public final void d(eqo eqoVar) {
        synchronized (this.d) {
            this.d.c(eqoVar);
        }
    }

    @Override // defpackage.faw
    public final void e(eqo eqoVar, epc epcVar) {
        try {
            synchronized (this.e) {
                esi esiVar = this.e;
                epc epcVar2 = this.b;
                InputStream inputStream = this.c;
                if (esiVar.e == null) {
                    if (epcVar2 != null) {
                        esiVar.d = epcVar2;
                    }
                    esiVar.b();
                    if (inputStream != null) {
                        esiVar.a(inputStream);
                    }
                    clq.F(esiVar.f == null);
                    esiVar.e = eqoVar;
                    esiVar.f = epcVar;
                    esiVar.c();
                    esiVar.d();
                }
            }
            synchronized (this.d) {
                this.d.l(eqoVar);
            }
        } catch (eqp e) {
            synchronized (this.d) {
                this.d.b(e.a);
            }
        }
    }

    @Override // defpackage.fbi
    public final void h(int i) {
        synchronized (this.d) {
            this.d.m();
        }
    }

    @Override // defpackage.faw
    public final void j(fax faxVar) {
        synchronized (this.d) {
            this.d.f(this.e, faxVar);
        }
    }

    @Override // defpackage.fbi
    public final void k(InputStream inputStream) {
        if (this.c == null) {
            this.c = inputStream;
            return;
        }
        synchronized (this.d) {
            this.d.b(eqo.k.e("too many messages"));
        }
    }

    @Override // defpackage.fbi
    public final boolean l() {
        return this.e.e();
    }

    @Override // defpackage.faw
    public final void m(epc epcVar) {
        this.b = epcVar;
    }

    public final String toString() {
        esi esiVar = this.e;
        return "SingleMessageServerStream[" + this.d.toString() + "/" + esiVar.toString() + "]";
    }

    @Override // defpackage.fbi
    public final void f() {
    }

    @Override // defpackage.fbi
    public final void g() {
    }

    @Override // defpackage.fbi
    public final void i(eme emeVar) {
    }
}
