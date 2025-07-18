package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exf extends elu {
    final /* synthetic */ exi a;

    public exf(exi exiVar) {
        this.a = exiVar;
    }

    @Override // defpackage.elu
    public final elw a(epg epgVar, elt eltVar) {
        Executor executorE = this.a.c.e(eltVar);
        exm exmVar = this.a.c;
        etv etvVar = new etv(epgVar, executorE, eltVar, exmVar.R, exmVar.C ? null : this.a.c.i.b(), this.a.c.E);
        etvVar.k = this.a.c.n;
        return etvVar;
    }

    @Override // defpackage.elu
    public final String b() {
        return this.a.b;
    }
}
