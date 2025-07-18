package defpackage;

import com.google.intelligence.micore.pir.core.PirClientModuleJNI;
import com.google.intelligence.micore.pir.core.PirClientSwig;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eaq extends eah {
    final /* synthetic */ ebe e;
    private final dzy f;
    private final PirClientSwig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaq(ebe ebeVar, eol eolVar, dzy dzyVar, PirClientSwig pirClientSwig, feu feuVar) {
        super(ebeVar, eolVar, feuVar);
        this.e = ebeVar;
        this.f = dzyVar;
        this.g = pirClientSwig;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() throws eba {
        ebf ebfVar;
        super.i();
        edc edcVar = this.f.d;
        if (edcVar == null) {
            edcVar = edc.a;
        }
        ebe ebeVar = this.e;
        int i = edcVar.b;
        ebi ebiVar = ebeVar.b;
        if (ebiVar.a() < 0 || ebiVar.a() >= i) {
            eaz eazVar = new eaz();
            eazVar.b = "Invalid entry index in Pir Uri";
            eazVar.a();
            eazVar.d = dgy.m;
            throw new eba(eazVar);
        }
        try {
            csf csfVarB = csf.b(ebeVar.i);
            PirClientSwig pirClientSwig = this.g;
            PirClientModuleJNI.PirClientSwig_beginSession(pirClientSwig.a, pirClientSwig, this.e.b.a());
            ebe ebeVar2 = this.e;
            asr asrVar = (asr) dgt.a.createBuilder();
            dgq dgqVar = dgq.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgt dgtVar = (dgt) asrVar.a;
            dgqVar.getClass();
            dgtVar.d = dgqVar;
            dgtVar.c = 3;
            ebeVar2.c(asrVar, csfVarB);
            ebe ebeVar3 = this.e;
            PirClientSwig pirClientSwig2 = this.g;
            csf csfVarB2 = csf.b(ebeVar3.i);
            byte[] bArrPirClientSwig_createRequest = PirClientModuleJNI.PirClientSwig_createRequest(pirClientSwig2.a, pirClientSwig2);
            if (bArrPirClientSwig_createRequest == null) {
                ebfVar = null;
            } else {
                try {
                    ebfVar = (ebf) efb.parseFrom(ebf.a, bArrPirClientSwig_createRequest, een.a());
                } catch (efp e) {
                    throw new RuntimeException("Unable to parse com.google.intelligence.micore.pir.PirRequest protocol message.", e);
                }
            }
            ebe ebeVar4 = this.e;
            asr asrVar2 = (asr) dgt.a.createBuilder();
            dgr dgrVar = dgr.a;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dgt dgtVar2 = (dgt) asrVar2.a;
            dgrVar.getClass();
            dgtVar2.d = dgrVar;
            dgtVar2.c = 4;
            ebeVar4.c(asrVar2, csfVarB2);
            feu feuVar = this.d;
            asr asrVar3 = (asr) eby.a.createBuilder();
            asr asrVar4 = (asr) ebx.a.createBuilder();
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            ebx ebxVar = (ebx) asrVar4.a;
            ebfVar.getClass();
            ebxVar.c = ebfVar;
            ebxVar.b |= 1;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            eby ebyVar = (eby) asrVar3.a;
            ebx ebxVar2 = (ebx) asrVar4.z();
            ebxVar2.getClass();
            ebyVar.c = ebxVar2;
            ebyVar.b = 2;
            feuVar.c((eby) asrVar3.z());
            return this;
        } catch (Exception e2) {
            eaz eazVar2 = new eaz();
            eazVar2.c = e2;
            eazVar2.b = "Failed to begin PIR session.";
            eazVar2.d = dgy.n;
            throw new eba(eazVar2);
        }
    }

    @Override // defpackage.eaa
    public final String c() {
        return "SelectingFile";
    }

    @Override // defpackage.eae
    public final eae h(ecu ecuVar) throws eba {
        int iB = ecs.b(ecuVar.b);
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(String.format(Locale.US, "Unrecognized output: %s", ecs.a(ecs.b(ecuVar.b))));
            }
            if (ecuVar.b == 2) {
            } else {
                ecr ecrVar = ecr.a;
            }
            eaz eazVar = new eaz();
            eazVar.b = "Select File failed";
            eazVar.a();
            eazVar.d = dgy.o;
            throw new eba(eazVar);
        }
        if (ecuVar.b == 1) {
        } else {
            ect ectVar = ect.a;
        }
        try {
            dzy dzyVar = this.f;
            long jB = this.e.m.b();
            long jC = ebq.c(dzyVar);
            long jD = ebq.d(dzyVar);
            clq.C(jB % jC == 0, "byteOffset %s is not a multiple of chunk size %s", jB, jC);
            clq.C(jB >= 0 && jB < jD, "byteOffset %s must be at least 0 and less than %s", jB, jD);
            long j = jB / jC;
            ebe ebeVar = this.e;
            return new eam(ebeVar, this.c, this.f, this.g, this.d, (int) j, ebeVar.e);
        } catch (Exception e) {
            try {
                this.e.m.c();
                eaz eazVar2 = new eaz();
                eazVar2.c = e;
                eazVar2.b = "Failed to resume partial download, may be corrupt or already complete. The output has been deleted so subsequent retries start from scratch.";
                eazVar2.d = dgy.v;
                throw new eba(eazVar2);
            } catch (Exception e2) {
                eaz eazVar3 = new eaz();
                eazVar3.c = e2;
                eazVar3.b = "Failed to delete the partially downloaded file after detecting a corruption.";
                eazVar3.d = dgy.w;
                throw new eba(eazVar3);
            }
        }
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.f;
    }
}
