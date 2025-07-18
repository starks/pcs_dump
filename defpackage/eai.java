package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eai implements feu {
    final /* synthetic */ eak a;

    public eai(eak eakVar) {
        this.a = eakVar;
    }

    @Override // defpackage.feu
    public final void a() {
        this.a.c.b(dgn.e);
        this.a.c.j.a(new eas(null));
    }

    @Override // defpackage.feu
    public final void b(Throwable th) {
        this.a.c.b(dgn.d);
        this.a.c.j.a(new ear(th));
    }

    @Override // defpackage.feu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void d(ecv ecvVar) {
        int i = ecvVar.b;
        this.a.c.k.d += ecvVar.getSerializedSize();
        asr asrVar = (asr) dgh.a.createBuilder();
        int iB = eck.b(ecvVar.b);
        int i2 = iB - 1;
        if (iB == 0) {
            throw null;
        }
        if (i2 == 0) {
            dgf dgfVar = dgf.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgh dghVar = (dgh) asrVar.a;
            dgfVar.getClass();
            dghVar.d = dgfVar;
            dghVar.c = 2;
        } else if (i2 == 1) {
            dgg dggVar = dgg.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgh dghVar2 = (dgh) asrVar.a;
            dggVar.getClass();
            dghVar2.d = dggVar;
            dghVar2.c = 3;
        } else if (i2 == 2) {
            asr asrVar2 = (asr) dge.a.createBuilder();
            ecj ecjVar = ecvVar.b == 3 ? (ecj) ecvVar.c : ecj.a;
            for (ech echVar : (ecjVar.b == 1 ? (eci) ecjVar.c : eci.a).b) {
                asr asrVar3 = (asr) dgd.a.createBuilder();
                int i3 = echVar.b;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dgd dgdVar = (dgd) asrVar3.a;
                dgdVar.b |= 1;
                dgdVar.c = i3;
                int size = echVar.c.size();
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dgd dgdVar2 = (dgd) asrVar3.a;
                dgdVar2.b |= 2;
                dgdVar2.d = size;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dge dgeVar = (dge) asrVar2.a;
                dgd dgdVar3 = (dgd) asrVar3.z();
                dgdVar3.getClass();
                efm efmVar = dgeVar.b;
                if (!efmVar.c()) {
                    dgeVar.b = efb.mutableCopy(efmVar);
                }
                dgeVar.b.add(dgdVar3);
            }
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgh dghVar3 = (dgh) asrVar.a;
            dge dgeVar2 = (dge) asrVar2.z();
            dgeVar2.getClass();
            dghVar3.d = dgeVar2;
            dghVar3.c = 4;
        } else if (i2 == 3) {
            dgc dgcVar = dgc.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgh dghVar4 = (dgh) asrVar.a;
            dgcVar.getClass();
            dghVar4.d = dgcVar;
            dghVar4.c = 5;
        }
        asr asrVar4 = (asr) dhd.a.createBuilder();
        asr asrVar5 = (asr) dgp.a.createBuilder();
        long serializedSize = ecvVar.getSerializedSize();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dgh dghVar5 = (dgh) asrVar.a;
        dghVar5.b = 1 | dghVar5.b;
        dghVar5.e = serializedSize;
        if (!asrVar5.a.isMutable()) {
            asrVar5.B();
        }
        dgp dgpVar = (dgp) asrVar5.a;
        dgh dghVar6 = (dgh) asrVar.z();
        dghVar6.getClass();
        dgpVar.c = dghVar6;
        dgpVar.b = 2;
        if (!asrVar4.a.isMutable()) {
            asrVar4.B();
        }
        eak eakVar = this.a;
        dhd dhdVar = (dhd) asrVar4.a;
        dgp dgpVar2 = (dgp) asrVar5.z();
        dgpVar2.getClass();
        dhdVar.d = dgpVar2;
        dhdVar.c = 10;
        eakVar.c.d(asrVar4);
        ebe ebeVar = this.a.c;
        ebeVar.j.a(new eat(ebeVar.f, ecvVar));
    }
}
