package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdh implements ebb {
    private final feu a;
    private final String b;
    private final avm c;
    private final bnz d;

    public bdh(feu feuVar, avm avmVar, bnz bnzVar, String str) {
        this.a = feuVar;
        this.c = avmVar;
        this.d = bnzVar;
        this.b = str;
    }

    private final void f(String str, long j, int i) {
        if (!this.c.h(auw.PIR, str) || this.c.a().isEmpty()) {
            return;
        }
        aux auxVar = (aux) ((avs) this.c.a().get()).h(str).get();
        clq.v(auxVar.b() == auw.PIR);
        clq.v(auxVar.a().b == 3);
        auj aujVarA = auxVar.a();
        clq.v(str.matches((aujVarA.b == 3 ? (auo) aujVarA.c : auo.a).c));
        this.c.d(ayg.g(auxVar, i, j, str));
    }

    @Override // defpackage.ebb
    public final void a(int i) {
        das dasVar = bdj.a;
        if (((AtomicBoolean) this.d.b).get()) {
            return;
        }
        try {
            feu feuVar = this.a;
            asr asrVar = (asr) bdd.a.createBuilder();
            asr asrVar2 = (asr) bdb.a.createBuilder();
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            bdb bdbVar = (bdb) asrVar2.a;
            bdbVar.b |= 1;
            bdbVar.c = i;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            bdd bddVar = (bdd) asrVar.a;
            bdb bdbVar2 = (bdb) asrVar2.z();
            bdbVar2.getClass();
            bddVar.c = bdbVar2;
            bddVar.b = 2;
            feuVar.c((bdd) asrVar.z());
        } catch (eqr e) {
            c(this.b, e);
        }
    }

    @Override // defpackage.ebb
    public final void b(dhe dheVar) {
        das dasVar = bdj.a;
        if (((AtomicBoolean) this.d.b).get()) {
            return;
        }
        try {
            feu feuVar = this.a;
            asr asrVar = (asr) bdd.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            bdd bddVar = (bdd) asrVar.a;
            dheVar.getClass();
            bddVar.c = dheVar;
            bddVar.b = 1;
            feuVar.c((bdd) asrVar.z());
        } catch (eqr e) {
            c(this.b, e);
        }
    }

    public final void c(String str, eqr eqrVar) {
        f(str, ((AtomicLong) this.d.a).get(), 2);
        if (((feq) this.a).d()) {
            bdj.b.j(eqrVar, "WARNING: Call cancelled by client.");
        } else {
            this.a.b(eqrVar);
        }
    }

    @Override // defpackage.ebb
    public final void d(Exception exc) {
        das dasVar = bdj.a;
        f(this.b, ((AtomicLong) this.d.a).get(), 2);
        ((AtomicBoolean) this.d.b).set(true);
        this.a.b(exc);
    }

    @Override // defpackage.ebb
    public final void e() {
        das dasVar = bdj.a;
        f(this.b, ((AtomicLong) this.d.a).get(), 1);
        ((AtomicBoolean) this.d.b).set(true);
        this.a.a();
    }
}
