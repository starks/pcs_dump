package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewl implements exv {
    final eui a;
    boolean b = false;
    final /* synthetic */ ewn c;

    public ewl(ewn ewnVar, eui euiVar) {
        this.c = ewnVar;
        this.a = euiVar;
    }

    @Override // defpackage.exv
    public final elp a(elp elpVar) {
        Iterator it = this.c.e.iterator();
        if (!it.hasNext()) {
            return elpVar;
        }
        throw null;
    }

    @Override // defpackage.exv
    public final void b(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.exv
    public final void c() {
        this.c.c.a(2, "READY");
        this.c.f.execute(new ewf(this, 3));
    }

    @Override // defpackage.exv
    public final void d(eqo eqoVar) {
        this.c.c.b(2, "{0} SHUTDOWN with {1}", this.a.c(), ewn.k(eqoVar));
        this.b = true;
        this.c.f.execute(new euy(this, eqoVar, 5, null));
    }

    @Override // defpackage.exv
    public final void e() {
        clq.G(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.c.b(2, "{0} Terminated", this.a.c());
        enl.c(this.c.b.f, this.a);
        this.c.f(this.a, false);
        Iterator it = this.c.e.iterator();
        if (it.hasNext()) {
            throw null;
        }
        ewn ewnVar = this.c;
        ewnVar.f.execute(new ewf(this, 4));
    }
}
