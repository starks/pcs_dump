package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fam implements fax {
    public final emk a;
    public final ffh b;
    private final Executor c;
    private final Executor d;
    private final faw e;
    private fax f;

    public fam(Executor executor, Executor executor2, faw fawVar, emk emkVar, ffh ffhVar) {
        this.c = executor;
        this.d = executor2;
        this.e = fawVar;
        this.a = emkVar;
        this.b = ffhVar;
    }

    @Override // defpackage.fax
    public final void a(eqo eqoVar) {
        int i = ffg.a;
        if (!eqoVar.g()) {
            Throwable entVar = eqoVar.q;
            if (entVar == null) {
                eqo eqoVarE = eqo.c.e("RPC cancelled");
                eox eoxVar = ens.a;
                entVar = new ent(eqoVarE);
            }
            this.d.execute(new fah(this.a, entVar));
        }
        this.c.execute(new fai(this, ffg.b(), eqoVar));
    }

    @Override // defpackage.fax
    public final void b() {
        int i = ffg.a;
        this.c.execute(new faj(this, ffg.b()));
    }

    public final fax c() {
        fax faxVar = this.f;
        if (faxVar != null) {
            return faxVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.fbk
    public final void d(fbj fbjVar) {
        int i = ffg.a;
        this.c.execute(new fak(this, ffg.b(), fbjVar));
    }

    @Override // defpackage.fbk
    public final void e() {
        int i = ffg.a;
        this.c.execute(new fal(this, ffg.b()));
    }

    public final void f(Throwable th) {
        this.e.e(eqo.d.e("Application error processing RPC").d(th), new epc());
    }

    final void g(fax faxVar) {
        faxVar.getClass();
        clq.G(this.f == null, "Listener already set");
        this.f = faxVar;
    }
}
