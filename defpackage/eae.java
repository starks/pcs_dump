package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class eae implements eaa {
    csf a;
    final /* synthetic */ ebe b;

    public eae(ebe ebeVar) {
        this.b = ebeVar;
    }

    @Override // defpackage.eaa
    public /* bridge */ /* synthetic */ eaa a() {
        throw null;
    }

    @Override // defpackage.eaa
    public final void d() {
        csf csfVar = this.a;
        asr asrVar = (asr) dhd.a.createBuilder();
        asr asrVar2 = (asr) dgx.a.createBuilder();
        asr asrVar3 = (asr) dgw.a.createBuilder();
        int iK = k();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        dgw dgwVar = (dgw) asrVar3.a;
        int i = iK - 1;
        if (iK == 0) {
            throw null;
        }
        dgwVar.c = i;
        dgwVar.b |= 1;
        long jA = csfVar.a(TimeUnit.MILLISECONDS);
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        dgw dgwVar2 = (dgw) asrVar3.a;
        dgwVar2.b |= 2;
        dgwVar2.d = jA;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dgx dgxVar = (dgx) asrVar2.a;
        dgw dgwVar3 = (dgw) asrVar3.z();
        dgwVar3.getClass();
        dgxVar.c = dgwVar3;
        dgxVar.b = 2;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ebe ebeVar = this.b;
        dhd dhdVar = (dhd) asrVar.a;
        dgx dgxVar2 = (dgx) asrVar2.z();
        dgxVar2.getClass();
        dhdVar.d = dgxVar2;
        dhdVar.c = 8;
        ebeVar.d(asrVar);
    }

    @Override // defpackage.eaa
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public eae b(Throwable th) {
        eba ebaVar;
        Object[] objArr = {th, c()};
        cbx cbxVar = this.b.f;
        cbxVar.a(Level.INFO, cbxVar.a, th, "PirDownloadTask: Exception %s in state %s", objArr);
        if (th instanceof eba) {
            ebaVar = (eba) th;
        } else {
            eaz eazVar = new eaz();
            eazVar.c = th;
            eazVar.b = "Internal error.";
            eazVar.a();
            eazVar.d = dgy.c;
            ebaVar = new eba(eazVar);
        }
        ebe ebeVar = this.b;
        asr asrVar = (asr) dhd.a.createBuilder();
        asr asrVar2 = (asr) dhb.a.createBuilder();
        asr asrVar3 = (asr) dgz.a.createBuilder();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        int i = ebaVar.a;
        dgz dgzVar = (dgz) asrVar3.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        dgzVar.d = i2;
        dgzVar.b |= 2;
        int iK = k();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        dgz dgzVar2 = (dgz) asrVar3.a;
        int i3 = iK - 1;
        if (iK == 0) {
            throw null;
        }
        dgzVar2.c = i3;
        dgzVar2.b |= 1;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dhb dhbVar = (dhb) asrVar2.a;
        dgz dgzVar3 = (dgz) asrVar3.z();
        dgzVar3.getClass();
        dhbVar.c = dgzVar3;
        dhbVar.b = 2;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dhd dhdVar = (dhd) asrVar.a;
        dhb dhbVar2 = (dhb) asrVar2.z();
        dhbVar2.getClass();
        dhdVar.d = dhbVar2;
        dhdVar.c = 7;
        ebeVar.d(asrVar);
        return new ean(this.b, ebaVar);
    }

    public eae f(ecj ecjVar) throws eba {
        eaz eazVar = new eaz();
        eazVar.b("Unexpected GetChunksResponse message in state %s", c());
        eazVar.d = dgy.h;
        throw new eba(eazVar);
    }

    public eae g(ecq ecqVar) throws eba {
        eaz eazVar = new eaz();
        eazVar.b("Unexpected SelectDatabaseResponse message in state %s", c());
        eazVar.d = dgy.f;
        throw new eba(eazVar);
    }

    public eae h(ecu ecuVar) throws eba {
        eaz eazVar = new eaz();
        eazVar.b("Unexpected SelectFileResponse message in state %s", c());
        eazVar.d = dgy.g;
        throw new eba(eazVar);
    }

    public final void i() {
        c();
        asr asrVar = (asr) dhd.a.createBuilder();
        asr asrVar2 = (asr) dgx.a.createBuilder();
        asr asrVar3 = (asr) dgv.a.createBuilder();
        int iK = k();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        dgv dgvVar = (dgv) asrVar3.a;
        int i = iK - 1;
        if (iK == 0) {
            throw null;
        }
        dgvVar.c = i;
        dgvVar.b |= 1;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dgx dgxVar = (dgx) asrVar2.a;
        dgv dgvVar2 = (dgv) asrVar3.z();
        dgvVar2.getClass();
        dgxVar.c = dgvVar2;
        dgxVar.b = 1;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ebe ebeVar = this.b;
        dhd dhdVar = (dhd) asrVar.a;
        dgx dgxVar2 = (dgx) asrVar2.z();
        dgxVar2.getClass();
        dhdVar.d = dgxVar2;
        dhdVar.c = 8;
        ebeVar.d(asrVar);
        this.a = csf.b(this.b.i);
    }

    public eae j() throws eba {
        eaz eazVar = new eaz();
        eazVar.b("Unexpected Run Event in state %s", c());
        eazVar.d = dgy.e;
        throw new eba(eazVar);
    }

    public abstract int k();
}
