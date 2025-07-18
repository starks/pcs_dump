package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebe implements Runnable {
    protected final String a;
    protected final ebi b;
    protected final ebb c;
    protected final long d;
    protected final int e;
    protected final cbx f;
    public final dki g;
    public final ebh h;
    public final csm i;
    public final eab j;
    public final eau k;
    public final ebq l;
    protected final egc m;
    private final AtomicInteger n;
    private final AtomicBoolean o;

    public ebe(dzv dzvVar) throws eba {
        this((eaf) dzvVar);
        if (ebl.a.a(this.f)) {
            return;
        }
        eaz eazVar = new eaz();
        eazVar.b = "Could not initialize PIR library.";
        eazVar.a();
        eazVar.d = dgy.c;
        throw new eba(eazVar);
    }

    private static void e(ebb ebbVar, String str, String str2, long j, AtomicInteger atomicInteger, eau eauVar, asr asrVar) {
        asr asrVar2 = (asr) dhe.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar = (dhd) asrVar.a;
        dhd dhdVar2 = dhd.a;
        dhdVar.b |= 1;
        dhdVar.e = str;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar3 = (dhd) asrVar.a;
        dhdVar3.b |= 2;
        dhdVar3.f = str2;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar4 = (dhd) asrVar.a;
        dhdVar4.b |= 4;
        dhdVar4.g = j;
        long jA = eauVar.a.a(TimeUnit.MILLISECONDS);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar5 = (dhd) asrVar.a;
        dhdVar5.b |= 16;
        dhdVar5.i = jA;
        long andIncrement = atomicInteger.getAndIncrement();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar6 = (dhd) asrVar.a;
        dhdVar6.b |= 8;
        dhdVar6.h = andIncrement;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dhe dheVar = (dhe) asrVar2.a;
        dhd dhdVar7 = (dhd) asrVar.z();
        dhdVar7.getClass();
        dheVar.c = dhdVar7;
        dheVar.b = 1;
        ebbVar.b((dhe) asrVar2.z());
    }

    public final void a() {
        this.o.set(true);
        this.j.a(new eag(null));
    }

    public final void b(int i) {
        asr asrVar = (asr) dhd.a.createBuilder();
        asr asrVar2 = (asr) dgp.a.createBuilder();
        asr asrVar3 = (asr) dgo.a.createBuilder();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        dgo dgoVar = (dgo) asrVar3.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        dgoVar.c = i2;
        dgoVar.b |= 1;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dgp dgpVar = (dgp) asrVar2.a;
        dgo dgoVar2 = (dgo) asrVar3.z();
        dgoVar2.getClass();
        dgpVar.c = dgoVar2;
        dgpVar.b = 3;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar = (dhd) asrVar.a;
        dgp dgpVar2 = (dgp) asrVar2.z();
        dgpVar2.getClass();
        dhdVar.d = dgpVar2;
        dhdVar.c = 10;
        d(asrVar);
    }

    public final void c(asr asrVar, csf csfVar) {
        asr asrVar2 = (asr) dhd.a.createBuilder();
        long jA = csfVar.a(TimeUnit.MILLISECONDS);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dgt dgtVar = (dgt) asrVar.a;
        dgt dgtVar2 = dgt.a;
        dgtVar.b |= 1;
        dgtVar.e = jA;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dhd dhdVar = (dhd) asrVar2.a;
        dgt dgtVar3 = (dgt) asrVar.z();
        dgtVar3.getClass();
        dhdVar.d = dgtVar3;
        dhdVar.c = 9;
        d(asrVar2);
    }

    public final void d(asr asrVar) {
        ebi ebiVar = this.b;
        e(this.c, ebiVar.c(), ebiVar.d(), this.d, this.n, this.k, asrVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    protected ebe(eaf eafVar) {
        this((ebd) eafVar);
        this.h = eafVar.a;
        ebq ebqVar = eafVar.c;
        ebqVar.getClass();
        this.l = ebqVar;
        csm csmVar = eafVar.b;
        csmVar.getClass();
        this.i = csmVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.n = atomicInteger;
        eau eauVar = new eau(csmVar);
        this.k = eauVar;
        this.g = new dki();
        this.j = new eab(new eaw(this));
        this.o = new AtomicBoolean(false);
        ebb ebbVar = this.c;
        ebi ebiVar = this.b;
        String strC = ebiVar.c();
        String strD = ebiVar.d();
        long j = this.d;
        asr asrVar = (asr) dhd.a.createBuilder();
        dhc dhcVar = dhc.a;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar = (dhd) asrVar.a;
        dhcVar.getClass();
        dhdVar.d = dhcVar;
        dhdVar.c = 6;
        e(ebbVar, strC, strD, j, atomicInteger, eauVar, asrVar);
    }

    protected ebe(ebd ebdVar) {
        ebi ebiVar = ebdVar.e;
        ebiVar.getClass();
        this.b = ebiVar;
        egc egcVar = ebdVar.j;
        egcVar.getClass();
        this.m = egcVar;
        String str = ebdVar.d;
        str.getClass();
        this.a = str;
        ebb ebbVar = ebdVar.f;
        ebbVar.getClass();
        this.c = ebbVar;
        this.d = ebdVar.g;
        this.e = ebdVar.h;
        cbx cbxVar = ebdVar.i;
        cbxVar.getClass();
        this.f = cbxVar;
    }
}
