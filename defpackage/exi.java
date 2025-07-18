package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exi extends elu {
    public final String b;
    final /* synthetic */ exm c;
    public final AtomicReference a = new AtomicReference(exm.e);
    private final elu d = new exf(this);

    public exi(exm exmVar, String str) {
        this.c = exmVar;
        this.b = str;
    }

    @Override // defpackage.elu
    public final elw a(epg epgVar, elt eltVar) {
        if (this.a.get() != exm.e) {
            return c(epgVar, eltVar);
        }
        exm exmVar = this.c;
        exmVar.m.execute(new ewf(this, 12));
        if (this.a.get() != exm.e) {
            return c(epgVar, eltVar);
        }
        if (this.c.A.get()) {
            return new exg();
        }
        exh exhVar = new exh(this, emr.l(), epgVar, eltVar);
        exm exmVar2 = this.c;
        exmVar2.m.execute(new euy(this, exhVar, 7, null));
        return exhVar;
    }

    @Override // defpackage.elu
    public final String b() {
        return this.b;
    }

    public final elw c(epg epgVar, elt eltVar) {
        enm enmVar = (enm) this.a.get();
        if (enmVar == null) {
            return this.d.a(epgVar, eltVar);
        }
        if (!(enmVar instanceof ext)) {
            return new ewz(enmVar, this.d, this.c.k, epgVar, eltVar);
        }
        exs exsVarB = ((ext) enmVar).b.b(epgVar);
        if (exsVarB != null) {
            eltVar = eltVar.e(exs.a, exsVarB);
        }
        return this.d.a(epgVar, eltVar);
    }

    final void d(enm enmVar) {
        Collection collection;
        enm enmVar2 = (enm) this.a.get();
        this.a.set(enmVar);
        if (enmVar2 != exm.e || (collection = this.c.w) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((exh) it.next()).j();
        }
    }
}
