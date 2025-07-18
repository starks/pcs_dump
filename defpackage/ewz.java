package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewz extends emy {
    public final emr a;
    private final enm b;
    private final elu c;
    private final Executor d;
    private final epg e;
    private elt f;
    private elw g;

    public ewz(enm enmVar, elu eluVar, Executor executor, epg epgVar, elt eltVar) {
        this.b = enmVar;
        this.c = eluVar;
        this.e = epgVar;
        Executor executor2 = eltVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        this.f = eltVar.b(executor);
        this.a = emr.l();
    }

    @Override // defpackage.epr, defpackage.elw
    public final void a(String str, Throwable th) {
        elw elwVar = this.g;
        if (elwVar != null) {
            elwVar.a(str, th);
        }
    }

    @Override // defpackage.emy, defpackage.elw
    public final void e(ebz ebzVar, epc epcVar) {
        new eod(this.e, epcVar, this.f, exm.f);
        exo exoVarA = this.b.a();
        eqo eqoVar = (eqo) exoVarA.a;
        if (!eqoVar.g()) {
            this.d.execute(new ewy(this, ebzVar, evt.b(eqoVar)));
            this.g = exm.g;
            return;
        }
        exs exsVarB = ((exu) exoVarA.b).b(this.e);
        if (exsVarB != null) {
            this.f = this.f.e(exs.a, exsVarB);
        }
        elw elwVarA = this.c.a(this.e, this.f);
        this.g = elwVarA;
        elwVarA.e(ebzVar, epcVar);
    }

    @Override // defpackage.emy, defpackage.epr
    protected final elw f() {
        return this.g;
    }
}
