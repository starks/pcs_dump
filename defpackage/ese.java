package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ese implements faw {
    private final elp a;
    private final erz b;
    private final esi c;

    public ese(erz erzVar, esi esiVar, elp elpVar) {
        this.b = erzVar;
        this.c = esiVar;
        this.a = elpVar;
    }

    @Override // defpackage.faw
    public final elp a() {
        return this.a;
    }

    @Override // defpackage.faw
    public final fbh b() {
        return this.c.c;
    }

    @Override // defpackage.faw
    public final String c() {
        return (String) this.a.a(erm.d);
    }

    @Override // defpackage.faw
    public final void d(eqo eqoVar) {
        synchronized (this.b) {
            this.b.c(eqoVar);
        }
    }

    @Override // defpackage.faw
    public final void e(eqo eqoVar, epc epcVar) {
        try {
            synchronized (this.c) {
                esi esiVar = this.c;
                if (esiVar.e == null) {
                    clq.F(esiVar.f == null);
                    esiVar.e = eqoVar;
                    esiVar.f = epcVar;
                    esiVar.b();
                    esiVar.c();
                    esiVar.d();
                }
            }
            synchronized (this.b) {
                this.b.l(eqoVar);
            }
        } catch (eqp e) {
            synchronized (this.b) {
                this.b.b(e.a);
            }
        }
    }

    @Override // defpackage.fbi
    public final void h(int i) {
        synchronized (this.b) {
            this.b.m();
        }
    }

    @Override // defpackage.faw
    public final void j(fax faxVar) {
        synchronized (this.b) {
            this.b.f(this.c, faxVar);
        }
    }

    @Override // defpackage.fbi
    public final void k(InputStream inputStream) {
        try {
            synchronized (this.c) {
                this.c.a(inputStream);
                this.c.d();
            }
        } catch (eqp e) {
            synchronized (this.b) {
                this.b.b(e.a);
            }
        }
    }

    @Override // defpackage.fbi
    public final boolean l() {
        return this.c.e();
    }

    @Override // defpackage.faw
    public final void m(epc epcVar) {
        try {
            synchronized (this.c) {
                esi esiVar = this.c;
                esiVar.d = epcVar;
                esiVar.b();
                esiVar.d();
            }
        } catch (eqp e) {
            synchronized (this.b) {
                this.b.b(e.a);
            }
        }
    }

    public final String toString() {
        esi esiVar = this.c;
        return "MultiMessageServerStream[" + this.b.toString() + "/" + esiVar.toString() + "]";
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
