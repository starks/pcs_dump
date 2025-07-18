package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eaj implements feu {
    final /* synthetic */ feu a;
    final /* synthetic */ eak b;

    public eaj(eak eakVar, feu feuVar) {
        this.a = feuVar;
        this.b = eakVar;
    }

    @Override // defpackage.feu
    public final void a() {
        this.b.c.b(dgn.c);
        fei feiVar = (fei) this.a;
        feiVar.a.b();
        feiVar.e = true;
    }

    @Override // defpackage.feu
    public final void b(Throwable th) {
        this.b.c.b(dgn.b);
        fei feiVar = (fei) this.a;
        feiVar.a.a("Cancelled by client with StreamObserver.onError()", th);
        feiVar.d = true;
    }

    @Override // defpackage.feu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        eby ebyVar = (eby) obj;
        int i = ebyVar.b;
        efb efbVar = (efb) obj;
        this.b.c.k.c += efbVar.getSerializedSize();
        fei feiVar = (fei) this.a;
        clq.G(!feiVar.d, "Stream was terminated by error, no further calls are allowed");
        clq.G(!feiVar.e, "Stream is already completed, no further calls are allowed");
        feiVar.a.d(obj);
        asr asrVar = (asr) dgm.a.createBuilder();
        int iA = ebv.a(ebyVar.b);
        int i2 = iA - 1;
        if (iA == 0) {
            throw null;
        }
        if (i2 == 0) {
            dgk dgkVar = dgk.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgm dgmVar = (dgm) asrVar.a;
            dgkVar.getClass();
            dgmVar.d = dgkVar;
            dgmVar.c = 2;
        } else if (i2 == 1) {
            dgl dglVar = dgl.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgm dgmVar2 = (dgm) asrVar.a;
            dglVar.getClass();
            dgmVar2.d = dglVar;
            dgmVar2.c = 3;
        } else if (i2 == 2) {
            asr asrVar2 = (asr) dgj.a.createBuilder();
            for (ebt ebtVar : (ebyVar.b == 3 ? (ebu) ebyVar.c : ebu.a).b) {
                asr asrVar3 = (asr) dgi.a.createBuilder();
                int i3 = ebtVar.b;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dgi dgiVar = (dgi) asrVar3.a;
                dgiVar.b |= 1;
                dgiVar.c = i3;
                int i4 = ebtVar.c;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dgi dgiVar2 = (dgi) asrVar3.a;
                dgiVar2.b |= 2;
                dgiVar2.d = i4;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dgj dgjVar = (dgj) asrVar2.a;
                dgi dgiVar3 = (dgi) asrVar3.z();
                dgiVar3.getClass();
                efm efmVar = dgjVar.b;
                if (!efmVar.c()) {
                    dgjVar.b = efb.mutableCopy(efmVar);
                }
                dgjVar.b.add(dgiVar3);
            }
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgm dgmVar3 = (dgm) asrVar.a;
            dgj dgjVar2 = (dgj) asrVar2.z();
            dgjVar2.getClass();
            dgmVar3.d = dgjVar2;
            dgmVar3.c = 4;
        }
        asr asrVar4 = (asr) dhd.a.createBuilder();
        asr asrVar5 = (asr) dgp.a.createBuilder();
        long serializedSize = efbVar.getSerializedSize();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dgm dgmVar4 = (dgm) asrVar.a;
        dgmVar4.b |= 1;
        dgmVar4.e = serializedSize;
        if (!asrVar5.a.isMutable()) {
            asrVar5.B();
        }
        dgp dgpVar = (dgp) asrVar5.a;
        dgm dgmVar5 = (dgm) asrVar.z();
        dgmVar5.getClass();
        dgpVar.c = dgmVar5;
        dgpVar.b = 1;
        if (!asrVar4.a.isMutable()) {
            asrVar4.B();
        }
        eak eakVar = this.b;
        dhd dhdVar = (dhd) asrVar4.a;
        dgp dgpVar2 = (dgp) asrVar5.z();
        dgpVar2.getClass();
        dhdVar.d = dgpVar2;
        dhdVar.c = 10;
        eakVar.c.d(asrVar4);
    }
}
