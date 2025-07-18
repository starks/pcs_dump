package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dlz implements drm {
    private final /* synthetic */ int a;

    public /* synthetic */ dlz(int i) {
        this.a = i;
    }

    @Override // defpackage.drm
    public final dky a(dli dliVar, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        dwe dweVar;
        dwt dwtVarB;
        fsc fscVarAz;
        switch (this.a) {
            case 0:
                dmc dmcVar = (dmc) dliVar;
                int i = dmcVar.a;
                dsa dsaVar = dma.a;
                if (i == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                euw euwVar = new euw((char[]) null);
                euwVar.c = dmcVar;
                euwVar.b = num;
                euwVar.a = fsc.ay(dmcVar.a);
                return euwVar.j();
            case 1:
                dlx dlxVar = (dlx) dliVar;
                int i2 = dlxVar.a;
                dsa dsaVar2 = dlu.a;
                if (i2 != 16 && dlxVar.a != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                enh enhVar = new enh(null, null, null, null);
                enhVar.d = dlxVar;
                enhVar.c = num;
                enhVar.a = fsc.ay(dlxVar.a);
                enhVar.b = fsc.ay(dlxVar.b);
                return enhVar.r();
            case 2:
                dmh dmhVar = (dmh) dliVar;
                int i3 = dmhVar.a;
                dsa dsaVar3 = dmf.a;
                if (i3 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                euw euwVar2 = new euw((char[]) null);
                euwVar2.c = dmhVar;
                euwVar2.b = num;
                euwVar2.a = fsc.ay(dmhVar.a);
                return euwVar2.i();
            case 3:
                dml dmlVar = (dml) dliVar;
                dsa dsaVar4 = dmj.a;
                euw euwVar3 = new euw((char[]) null);
                euwVar3.c = dmlVar;
                euwVar3.b = num;
                euwVar3.a = fsc.ay(dmlVar.a);
                return euwVar3.h();
            case 4:
                dmo dmoVar = ((dmp) dliVar).a;
                dsa dsaVar5 = dmn.a;
                return dmm.b(dmoVar, fsc.ay(32), num);
            case 5:
                dsa dsaVar6 = dmq.a;
                return dmt.b((dmv) dliVar, num);
            case 6:
                dkz dkzVar = dms.a;
                return dmx.b((dna) dliVar, num);
            case 7:
                return dni.b((dnl) dliVar, fsc.ay(32), num);
            case 8:
                dno dnoVar = ((dnp) dliVar).a;
                dsa dsaVar7 = dnn.a;
                return dnm.b(dnoVar, fsc.ay(32), num);
            case 9:
                dot dotVar = (dot) dliVar;
                dor.a(dotVar);
                euw euwVar4 = new euw((char[]) null);
                euwVar4.c = dotVar;
                euwVar4.b = num;
                euwVar4.a = fsc.ay(dotVar.a);
                return euwVar4.g();
            case 10:
                dpf dpfVar = (dpf) dliVar;
                dpb dpbVar = dpfVar.b;
                dsa dsaVar8 = doz.a;
                if (dpbVar == dpb.a) {
                    eCParameterSpec = dqy.a;
                } else if (dpbVar == dpb.b) {
                    eCParameterSpec = dqy.b;
                } else {
                    if (dpbVar != dpb.c) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(String.valueOf(dpbVar))));
                    }
                    eCParameterSpec = dqy.c;
                }
                KeyPair keyPairAb = dcr.ab(eCParameterSpec);
                return dpg.e(dph.c(dpfVar, ((ECPublicKey) keyPairAb.getPublic()).getW(), num), new fsc(((ECPrivateKey) keyPairAb.getPrivate()).getS()));
            case 11:
                dpn dpnVar = (dpn) dliVar;
                dpl dplVar = dpnVar.a;
                dsa dsaVar9 = dqk.a;
                if (dplVar.equals(dpl.f)) {
                    byte[] bArrT = dcr.T();
                    fscVarAz = fsc.az(bArrT);
                    dwtVarB = dwt.b(dcr.U(bArrT));
                } else {
                    if (!dpnVar.a.equals(dpl.a) && !dpnVar.a.equals(dpl.b) && !dpnVar.a.equals(dpl.c)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    dpl dplVar2 = dpnVar.a;
                    byte[] bArr = dql.a;
                    if (dplVar2 == dpl.a) {
                        dweVar = dwe.NIST_P256;
                    } else if (dplVar2 == dpl.b) {
                        dweVar = dwe.NIST_P384;
                    } else {
                        if (dplVar2 != dpl.c) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        dweVar = dwe.NIST_P521;
                    }
                    KeyPair keyPairAa = dcr.aa(dweVar);
                    dwtVarB = dwt.b(dcr.ai(dweVar, dwf.UNCOMPRESSED, ((ECPublicKey) keyPairAa.getPublic()).getW()));
                    fscVarAz = fsc.az(dcr.ar(((ECPrivateKey) keyPairAa.getPrivate()).getS(), dql.a(dpnVar.a)));
                }
                return dpo.e(dpq.b(dpnVar, dwtVarB, num), fscVarAz);
            case 12:
                return drn.b((drh) dliVar, num);
            case 13:
                dst dstVar = (dst) dliVar;
                dsr.a(dstVar);
                euw euwVar5 = new euw((char[]) null, (byte[]) null);
                euwVar5.c = dstVar;
                euwVar5.b = fsc.ay(dstVar.a);
                euwVar5.a = num;
                return euwVar5.f();
            default:
                dtb dtbVar = (dtb) dliVar;
                dsa dsaVar10 = dsy.a;
                euw euwVar6 = new euw((char[]) null);
                euwVar6.c = dtbVar;
                euwVar6.a = fsc.ay(dtbVar.a);
                euwVar6.b = num;
                return euwVar6.b();
        }
    }
}
