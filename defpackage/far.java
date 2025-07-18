package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class far implements faz {
    public final fay a;
    public Future b;
    public final /* synthetic */ fas c;
    private elp d;

    public far(fas fasVar, fay fayVar) {
        this.c = fasVar;
        this.a = fayVar;
    }

    @Override // defpackage.faz
    public final elp a(elp elpVar) {
        this.b.cancel(false);
        this.b = null;
        Iterator it = this.c.h.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.d = elpVar;
        return elpVar;
    }

    @Override // defpackage.faz
    public final void b(faw fawVar, String str, epc epcVar) {
        ffh ffhVarA = ffg.a();
        Executor faeVar = this.c.e != diy.a ? new fae(this.c.e) : new faa();
        if (epcVar.g(evt.c)) {
            String str2 = (String) epcVar.b(evt.c);
            if (this.c.p.a(str2) == null) {
                fawVar.j(fas.c);
                fawVar.e(eqo.j.e(String.format("Can't find decompressor for %s", str2)), new epc());
                return;
            }
        }
        fbh fbhVarB = fawVar.b();
        fbhVarB.getClass();
        Long l = (Long) epcVar.b(evt.b);
        emr emrVar = this.c.o;
        fjp[] fjpVarArr = fbhVarB.b;
        if (fjpVarArr.length > 0) {
            fjp fjpVar = fjpVarArr[0];
            throw null;
        }
        emr emrVarM = emrVar.m(enr.a, this.c);
        emk emkVar = l == null ? new emk(emrVarM) : emrVarM.k(ems.g(l.longValue(), TimeUnit.NANOSECONDS, this.c.t), ((erm) this.a).f);
        ffh ffhVarB = ffg.b();
        fam famVar = new fam(faeVar, this.c.e, fawVar, emkVar, ffhVarA);
        fawVar.j(famVar);
        dki dkiVar = new dki();
        faeVar.execute(new faq(this, emkVar, ffhVarA, ffhVarB, str, fawVar, famVar, dkiVar, fbhVarB, epcVar));
        faeVar.execute(new fap(this, emkVar, ffhVarB, ffhVarA, dkiVar, str, epcVar, fawVar, famVar));
    }

    @Override // defpackage.faz
    public final void c() {
        Future future = this.b;
        if (future != null) {
            future.cancel(false);
            this.b = null;
        }
        Iterator it = this.c.h.iterator();
        if (it.hasNext()) {
            throw null;
        }
        fas fasVar = this.c;
        fay fayVar = this.a;
        synchronized (fasVar.m) {
            if (!fasVar.n.remove(fayVar)) {
                throw new AssertionError("Transport already removed");
            }
            enl.c((enk) fasVar.r.g.get(Long.valueOf(enl.a(fasVar))), fayVar);
            synchronized (fasVar.m) {
            }
        }
    }
}
