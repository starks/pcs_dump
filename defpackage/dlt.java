package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dlt implements drz {
    private final /* synthetic */ int a;

    @Override // defpackage.drz
    public final Object a(dky dkyVar) throws GeneralSecurityException {
        byte[] bArrC;
        byte[] bArrC2;
        byte[] bArrC3;
        int i;
        switch (this.a) {
            case 0:
                return dwg.c((dls) dkyVar);
            case 1:
                drg drgVar = (drg) dkyVar;
                dsf dsfVarB = drgVar.b(dln.a);
                asr asrVar = (asr) dvc.a.createBuilder();
                String str = dsfVarB.a;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                dvc dvcVar = (dvc) asrVar.a;
                str.getClass();
                dvcVar.b = str;
                eea eeaVar = dsfVarB.c;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                dvc dvcVar2 = (dvc) asrVar.a;
                eeaVar.getClass();
                dvcVar2.c = eeaVar;
                dvb dvbVar = dsfVarB.d;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ((dvc) asrVar.a).d = dvbVar.a();
                dvn dvnVar = dsfVarB.e;
                int iOrdinal = dvnVar.ordinal();
                if (iOrdinal == 1) {
                    bArrC = dru.b(drgVar.a().intValue()).c();
                } else if (iOrdinal == 2) {
                    bArrC = dru.a(drgVar.a().intValue()).c();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(dvnVar))));
                    }
                    bArrC = dru.a(drgVar.a().intValue()).c();
                } else {
                    bArrC = dru.a.c();
                }
                return new doi(bArrC, 0);
            case 2:
                dly dlyVar = (dly) dkyVar;
                if (!doo.a(dvy.a)) {
                    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
                }
                int i2 = dlyVar.a.c;
                if (i2 != 16) {
                    throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + i2);
                }
                fsc fscVar = dlyVar.d;
                dmc dmcVar = dlyVar.a;
                dwt dwtVar = dlyVar.b;
                byte[] bArrU = fscVar.U();
                dwtVar.c();
                return new dvy(bArrU, dmcVar.b);
            case 3:
                dmd dmdVar = (dmd) dkyVar;
                dmh dmhVar = dmdVar.a;
                int i3 = dvz.a;
                if (dmhVar.b != 12) {
                    throw new GeneralSecurityException("Expected IV Size 12, got " + dmdVar.a.b);
                }
                int i4 = dmdVar.a.c;
                if (i4 == 16) {
                    return new dvz(dmdVar.d.U(), dmdVar.b);
                }
                throw new GeneralSecurityException("Expected tag Size 16, got " + i4);
            case 4:
                dmi dmiVar = (dmi) dkyVar;
                fsc fscVar2 = dmiVar.d;
                dwt dwtVar2 = dmiVar.b;
                byte[] bArrU2 = fscVar2.U();
                dwtVar2.c();
                return new don(bArrU2);
            case 5:
                dmm dmmVar = (dmm) dkyVar;
                dsa dsaVar = dmn.a;
                if (dnx.d()) {
                    fsc fscVar3 = dmmVar.d;
                    dwt dwtVar3 = dmmVar.b;
                    byte[] bArrU3 = fscVar3.U();
                    dwtVar3.c();
                    return new dnx(bArrU3);
                }
                fsc fscVar4 = dmmVar.d;
                dwt dwtVar4 = dmmVar.b;
                byte[] bArrU4 = fscVar4.U();
                dwtVar4.c();
                return new doi(bArrU4, 3, (byte[]) null);
            case 6:
                dmt dmtVar = (dmt) dkyVar;
                dmv dmvVar = dmtVar.a;
                dsa dsaVar2 = dmq.a;
                return doi.c(dlg.a(dmvVar.a).a(dmtVar.a.a), dmtVar.b);
            case 7:
                dmx dmxVar = (dmx) dkyVar;
                dna dnaVar = dmxVar.a;
                dkz dkzVar = dms.a;
                String str2 = dnaVar.b;
                dlg.a(str2).a(str2);
                int i5 = dmr.a;
                try {
                    byte[] bArrT = cnx.t(dnaVar.c);
                    een eenVar = een.a;
                    egr egrVar = egr.a;
                    return doi.c(new dmr((dve) efb.parseFrom(dve.a, bArrT, een.a)), dmxVar.b);
                } catch (efp e) {
                    throw new GeneralSecurityException(e);
                }
            case 8:
                dni dniVar = (dni) dkyVar;
                int i6 = dniVar.a.b;
                fsc fscVar5 = dniVar.d;
                dwt dwtVar5 = dniVar.b;
                int i7 = dniVar.a.b;
                return new doi(fscVar5.U(), dwtVar5, 2);
            case 9:
                dnm dnmVar = (dnm) dkyVar;
                dsa dsaVar3 = dnn.a;
                if (dok.c()) {
                    fsc fscVar6 = dnmVar.d;
                    dwt dwtVar6 = dnmVar.b;
                    byte[] bArrU5 = fscVar6.U();
                    dwtVar6.c();
                    return new dok(bArrU5);
                }
                fsc fscVar7 = dnmVar.d;
                dwt dwtVar7 = dnmVar.b;
                byte[] bArrU6 = fscVar7.U();
                dwtVar7.c();
                return new doi(bArrU6, 4, (char[]) null);
            case 10:
                doq doqVar = (doq) dkyVar;
                dor.a(doqVar.a);
                return dwb.a(doqVar);
            case 11:
                drg drgVar2 = (drg) dkyVar;
                dsf dsfVarB2 = drgVar2.b(dln.a);
                asr asrVar2 = (asr) dvc.a.createBuilder();
                String str3 = dsfVarB2.a;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dvc dvcVar3 = (dvc) asrVar2.a;
                str3.getClass();
                dvcVar3.b = str3;
                eea eeaVar2 = dsfVarB2.c;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dvc dvcVar4 = (dvc) asrVar2.a;
                eeaVar2.getClass();
                dvcVar4.c = eeaVar2;
                dvb dvbVar2 = dsfVarB2.d;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ((dvc) asrVar2.a).d = dvbVar2.a();
                dvn dvnVar2 = dsfVarB2.e;
                int iOrdinal2 = dvnVar2.ordinal();
                if (iOrdinal2 == 1) {
                    dru.b(drgVar2.a().intValue()).c();
                } else if (iOrdinal2 == 2) {
                    dru.a(drgVar2.a().intValue()).c();
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        throw new GeneralSecurityException(a.I(dvnVar2, "unknown output prefix type "));
                    }
                    dru.a(drgVar2.a().intValue()).c();
                } else {
                    dru.a.c();
                }
                return new doy();
            case 12:
                dpg dpgVar = (dpg) dkyVar;
                ECPrivateKey eCPrivateKeyAc = dcr.ac((dwe) dwd.a.d(dpgVar.c().b), dcr.aq((BigInteger) dpgVar.c.a));
                byte[] bArrC4 = new byte[0];
                if (dpgVar.c().g != null) {
                    bArrC4 = dpgVar.c().g.c();
                }
                return new dwc(eCPrivateKeyAc, bArrC4, dwd.b(dpgVar.c().c), (dwf) dwd.b.d(dpgVar.c().d), dqd.a(dpgVar.c()), dpgVar.f().c());
            case 13:
                dph dphVar = (dph) dkyVar;
                dwe dweVar = (dwe) dwd.a.d(dphVar.a.b);
                byte[] byteArray = dphVar.b.getAffineX().toByteArray();
                byte[] byteArray2 = dphVar.b.getAffineY().toByteArray();
                ECParameterSpec eCParameterSpecAf = dcr.af(dweVar);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                dqy.f(eCPoint, eCParameterSpecAf.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) dwj.e.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecAf));
                byte[] bArrC5 = new byte[0];
                dwt dwtVar8 = dphVar.a.g;
                if (dwtVar8 != null) {
                    bArrC5 = dwtVar8.c();
                }
                return new dwd(eCPublicKey, bArrC5, dwd.b(dphVar.a.c), (dwf) dwd.b.d(dphVar.a.d), dqd.a(dphVar.a), dphVar.d.c());
            case 14:
                drg drgVar3 = (drg) dkyVar;
                dsf dsfVarB3 = drgVar3.b(dln.a);
                asr asrVar3 = (asr) dvc.a.createBuilder();
                String str4 = dsfVarB3.a;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dvc dvcVar5 = (dvc) asrVar3.a;
                str4.getClass();
                dvcVar5.b = str4;
                eea eeaVar3 = dsfVarB3.c;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dvc dvcVar6 = (dvc) asrVar3.a;
                eeaVar3.getClass();
                dvcVar6.c = eeaVar3;
                dvb dvbVar3 = dsfVarB3.d;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                ((dvc) asrVar3.a).d = dvbVar3.a();
                dkw dkwVar = (dkw) dlm.c((dvc) asrVar3.z(), dkw.class);
                dvn dvnVar3 = dsfVarB3.e;
                int iOrdinal3 = dvnVar3.ordinal();
                if (iOrdinal3 == 1) {
                    bArrC2 = dru.b(drgVar3.a().intValue()).c();
                } else if (iOrdinal3 == 2) {
                    bArrC2 = dru.a(drgVar3.a().intValue()).c();
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(dvnVar3))));
                    }
                    bArrC2 = dru.a(drgVar3.a().intValue()).c();
                } else {
                    bArrC2 = dru.a.c();
                }
                return new dqm(dkwVar, bArrC2);
            case 15:
                drg drgVar4 = (drg) dkyVar;
                dsf dsfVarB4 = drgVar4.b(dln.a);
                asr asrVar4 = (asr) dvc.a.createBuilder();
                String str5 = dsfVarB4.a;
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                dvc dvcVar7 = (dvc) asrVar4.a;
                str5.getClass();
                dvcVar7.b = str5;
                eea eeaVar4 = dsfVarB4.c;
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                dvc dvcVar8 = (dvc) asrVar4.a;
                eeaVar4.getClass();
                dvcVar8.c = eeaVar4;
                dvb dvbVar4 = dsfVarB4.d;
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                ((dvc) asrVar4.a).d = dvbVar4.a();
                dkx dkxVar = (dkx) dlm.c((dvc) asrVar4.z(), dkx.class);
                dvn dvnVar4 = dsfVarB4.e;
                int iOrdinal4 = dvnVar4.ordinal();
                if (iOrdinal4 == 1) {
                    bArrC3 = dru.b(drgVar4.a().intValue()).c();
                } else if (iOrdinal4 == 2) {
                    bArrC3 = dru.a(drgVar4.a().intValue()).c();
                } else if (iOrdinal4 != 3) {
                    if (iOrdinal4 != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(dvnVar4))));
                    }
                    bArrC3 = dru.a(drgVar4.a().intValue()).c();
                } else {
                    bArrC3 = dru.a.c();
                }
                return new dqn(dkxVar, bArrC3);
            case 16:
                dpo dpoVar = (dpo) dkyVar;
                dpn dpnVarC = dpoVar.c();
                dqj dqjVarC = dqi.c(dpnVarC.a);
                fsc fscVarD = dqi.d(dpnVarC.b);
                dqf dqfVarB = dqi.b(dpnVarC.c);
                dpl dplVar = dpnVarC.a;
                if (dplVar.equals(dpl.f)) {
                    i = 32;
                } else if (dplVar.equals(dpl.a)) {
                    i = 65;
                } else if (dplVar.equals(dpl.b)) {
                    i = 97;
                } else {
                    if (!dplVar.equals(dpl.c)) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    i = 133;
                }
                int i8 = i;
                dpl dplVar2 = dpoVar.c().a;
                if (dplVar2.equals(dpl.f) || dplVar2.equals(dpl.a) || dplVar2.equals(dpl.b) || dplVar2.equals(dpl.c)) {
                    return new dqh(new exo(dwt.b(dpoVar.b.U()), dpoVar.a.b), dqjVarC, fscVarD, dqfVarB, i8, dpoVar.f());
                }
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            case 17:
                dpq dpqVar = (dpq) dkyVar;
                dpn dpnVar = dpqVar.a;
                return new dqi(dpqVar.b, dqi.c(dpnVar.a), dqi.d(dpnVar.b), dqi.b(dpnVar.c), dpqVar.c);
            case 18:
                dsr.a(((dsq) dkyVar).a);
                return new dtj();
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                dsq dsqVar = (dsq) dkyVar;
                dsr.a(dsqVar.a);
                return new dwr(dsqVar);
            default:
                return new dtk();
        }
    }
}
