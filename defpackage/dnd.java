package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dnd implements drc {
    private final /* synthetic */ int a;

    public /* synthetic */ dnd(int i) {
        this.a = i;
    }

    @Override // defpackage.drc
    public final dsk a(dky dkyVar, dln dlnVar) {
        switch (this.a) {
            case 0:
                dmx dmxVar = (dmx) dkyVar;
                drx drxVar = dnf.a;
                asr asrVar = (asr) dvl.a.createBuilder();
                dvm dvmVarB = dnf.b(dmxVar.a);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                dvl dvlVar = (dvl) asrVar.a;
                dvmVarB.getClass();
                dvlVar.d = dvmVarB;
                dvlVar.b |= 1;
                return dsf.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((dvl) asrVar.z()).toByteString(), dvb.REMOTE, dnf.c(dmxVar.a.a), dmxVar.c);
            case 1:
                dmt dmtVar = (dmt) dkyVar;
                drx drxVar2 = dmw.a;
                asr asrVar2 = (asr) dvj.a.createBuilder();
                asr asrVar3 = (asr) dvk.a.createBuilder();
                dmv dmvVar = dmtVar.a;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                String str = dmvVar.a;
                dvk dvkVar = (dvk) asrVar3.a;
                str.getClass();
                dvkVar.b = str;
                dvk dvkVar2 = (dvk) asrVar3.z();
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dvj dvjVar = (dvj) asrVar2.a;
                dvkVar2.getClass();
                dvjVar.d = dvkVar2;
                dvjVar.b |= 1;
                return dsf.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((dvj) asrVar2.z()).toByteString(), dvb.REMOTE, dmw.b(dmtVar.a.b), dmtVar.c);
            case 2:
                dls dlsVar = (dls) dkyVar;
                drx drxVar3 = dnq.a;
                asr asrVar4 = (asr) dtr.a.createBuilder();
                asr asrVar5 = (asr) dtt.a.createBuilder();
                asr asrVar6 = (asr) dtv.a.createBuilder();
                dlx dlxVar = dlsVar.a;
                if (!asrVar6.a.isMutable()) {
                    asrVar6.B();
                }
                ((dtv) asrVar6.a).b = dlxVar.c;
                dtv dtvVar = (dtv) asrVar6.z();
                if (!asrVar5.a.isMutable()) {
                    asrVar5.B();
                }
                dtt dttVar = (dtt) asrVar5.a;
                dtvVar.getClass();
                dttVar.d = dtvVar;
                dttVar.b |= 1;
                eea eeaVarR = eea.r(dlsVar.d.U());
                if (!asrVar5.a.isMutable()) {
                    asrVar5.B();
                }
                ((dtt) asrVar5.a).e = eeaVarR;
                dtt dttVar2 = (dtt) asrVar5.z();
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                dtr dtrVar = (dtr) asrVar4.a;
                dttVar2.getClass();
                dtrVar.d = dttVar2;
                dtrVar.b |= 1;
                asr asrVar7 = (asr) dur.a.createBuilder();
                dut dutVarC = dnq.c(dlsVar.a);
                if (!asrVar7.a.isMutable()) {
                    asrVar7.B();
                }
                dur durVar = (dur) asrVar7.a;
                dutVarC.getClass();
                durVar.d = dutVarC;
                durVar.b |= 1;
                eea eeaVarR2 = eea.r(dlsVar.e.U());
                if (!asrVar7.a.isMutable()) {
                    asrVar7.B();
                }
                ((dur) asrVar7.a).e = eeaVarR2;
                dur durVar2 = (dur) asrVar7.z();
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                dtr dtrVar2 = (dtr) asrVar4.a;
                durVar2.getClass();
                dtrVar2.e = durVar2;
                dtrVar2.b |= 2;
                return dsf.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((dtr) asrVar4.z()).toByteString(), dvb.SYMMETRIC, dnq.d(dlsVar.a.e), dlsVar.c);
            case 3:
                dly dlyVar = (dly) dkyVar;
                drx drxVar4 = dnr.a;
                asr asrVar8 = (asr) dtw.a.createBuilder();
                dty dtyVarB = dnr.b(dlyVar.a);
                if (!asrVar8.a.isMutable()) {
                    asrVar8.B();
                }
                dtw dtwVar = (dtw) asrVar8.a;
                dtyVarB.getClass();
                dtwVar.d = dtyVarB;
                dtwVar.b |= 1;
                eea eeaVarR3 = eea.r(dlyVar.d.U());
                if (!asrVar8.a.isMutable()) {
                    asrVar8.B();
                }
                ((dtw) asrVar8.a).e = eeaVarR3;
                return dsf.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((dtw) asrVar8.z()).toByteString(), dvb.SYMMETRIC, dnr.c(dlyVar.a.d), dlyVar.c);
            case 4:
                dmd dmdVar = (dmd) dkyVar;
                dnu.c(dmdVar.a);
                asr asrVar9 = (asr) dtz.a.createBuilder();
                eea eeaVarR4 = eea.r(dmdVar.d.U());
                if (!asrVar9.a.isMutable()) {
                    asrVar9.B();
                }
                ((dtz) asrVar9.a).c = eeaVarR4;
                return dsf.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((dtz) asrVar9.z()).toByteString(), dvb.SYMMETRIC, dnu.b(dmdVar.a.d), dmdVar.c);
            case 5:
                dmi dmiVar = (dmi) dkyVar;
                drx drxVar5 = dnv.a;
                asr asrVar10 = (asr) dub.a.createBuilder();
                eea eeaVarR5 = eea.r(dmiVar.d.U());
                if (!asrVar10.a.isMutable()) {
                    asrVar10.B();
                }
                ((dub) asrVar10.a).c = eeaVarR5;
                return dsf.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((dub) asrVar10.z()).toByteString(), dvb.SYMMETRIC, dnv.b(dmiVar.a.b), dmiVar.c);
            case 6:
                dmm dmmVar = (dmm) dkyVar;
                drx drxVar6 = dny.a;
                asr asrVar11 = (asr) duf.a.createBuilder();
                eea eeaVarR6 = eea.r(dmmVar.d.U());
                if (!asrVar11.a.isMutable()) {
                    asrVar11.B();
                }
                ((duf) asrVar11.a).c = eeaVarR6;
                return dsf.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((duf) asrVar11.z()).toByteString(), dvb.SYMMETRIC, dny.b(dmmVar.a.a), dmmVar.c);
            case 7:
                dni dniVar = (dni) dkyVar;
                drx drxVar7 = doj.a;
                asr asrVar12 = (asr) dvp.a.createBuilder();
                eea eeaVarR7 = eea.r(dniVar.d.U());
                if (!asrVar12.a.isMutable()) {
                    asrVar12.B();
                }
                ((dvp) asrVar12.a).e = eeaVarR7;
                asr asrVar13 = (asr) dvr.a.createBuilder();
                dnl dnlVar = dniVar.a;
                if (!asrVar13.a.isMutable()) {
                    asrVar13.B();
                }
                ((dvr) asrVar13.a).b = dnlVar.b;
                dvr dvrVar = (dvr) asrVar13.z();
                if (!asrVar12.a.isMutable()) {
                    asrVar12.B();
                }
                dvp dvpVar = (dvp) asrVar12.a;
                dvrVar.getClass();
                dvpVar.d = dvrVar;
                dvpVar.b |= 1;
                return dsf.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((dvp) asrVar12.z()).toByteString(), dvb.SYMMETRIC, doj.b(dniVar.a.a), dniVar.c);
            case 8:
                dnm dnmVar = (dnm) dkyVar;
                drx drxVar8 = dol.a;
                asr asrVar14 = (asr) dvs.a.createBuilder();
                eea eeaVarR8 = eea.r(dnmVar.d.U());
                if (!asrVar14.a.isMutable()) {
                    asrVar14.B();
                }
                ((dvs) asrVar14.a).c = eeaVarR8;
                return dsf.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((dvs) asrVar14.z()).toByteString(), dvb.SYMMETRIC, dol.b(dnmVar.a.a), dnmVar.c);
            case 9:
                doq doqVar = (doq) dkyVar;
                drx drxVar9 = dox.a;
                asr asrVar15 = (asr) dud.a.createBuilder();
                eea eeaVarR9 = eea.r(doqVar.d.U());
                if (!asrVar15.a.isMutable()) {
                    asrVar15.B();
                }
                ((dud) asrVar15.a).c = eeaVarR9;
                return dsf.a("type.googleapis.com/google.crypto.tink.AesSivKey", ((dud) asrVar15.z()).toByteString(), dvb.SYMMETRIC, dox.b(doqVar.a.b), doqVar.c);
            case 10:
                dpq dpqVar = (dpq) dkyVar;
                return dsf.a("type.googleapis.com/google.crypto.tink.HpkePublicKey", dpp.c(dpqVar).toByteString(), dvb.ASYMMETRIC_PUBLIC, (dvn) dpp.g.d(dpqVar.a.d), dpqVar.d);
            case 11:
                dpo dpoVar = (dpo) dkyVar;
                drx drxVar10 = dpp.a;
                asr asrVar16 = (asr) duz.a.createBuilder();
                if (!asrVar16.a.isMutable()) {
                    asrVar16.B();
                }
                ((duz) asrVar16.a).c = 0;
                dva dvaVarC = dpp.c(dpoVar.a);
                if (!asrVar16.a.isMutable()) {
                    asrVar16.B();
                }
                duz duzVar = (duz) asrVar16.a;
                dvaVarC.getClass();
                duzVar.d = dvaVarC;
                duzVar.b |= 1;
                eea eeaVarR10 = eea.r(dpoVar.b.U());
                if (!asrVar16.a.isMutable()) {
                    asrVar16.B();
                }
                ((duz) asrVar16.a).e = eeaVarR10;
                return dsf.a("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((duz) asrVar16.z()).toByteString(), dvb.ASYMMETRIC_PRIVATE, (dvn) dpp.g.d(dpoVar.c().d), dpoVar.a());
            case 12:
                dph dphVar = (dph) dkyVar;
                return dsf.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", dqe.d(dphVar).toByteString(), dvb.ASYMMETRIC_PUBLIC, (dvn) dqe.g.d(dphVar.a.e), dphVar.e);
            case 13:
                dpg dpgVar = (dpg) dkyVar;
                drx drxVar11 = dqe.a;
                asr asrVar17 = (asr) dul.a.createBuilder();
                if (!asrVar17.a.isMutable()) {
                    asrVar17.B();
                }
                ((dul) asrVar17.a).c = 0;
                dum dumVarD = dqe.d(dpgVar.a);
                if (!asrVar17.a.isMutable()) {
                    asrVar17.B();
                }
                dul dulVar = (dul) asrVar17.a;
                dumVarD.getClass();
                dulVar.d = dumVarD;
                dulVar.b |= 1;
                if (dpgVar.c().b.equals(dpb.d)) {
                    eea eeaVarR11 = eea.r(dpgVar.b.U());
                    if (!asrVar17.a.isMutable()) {
                        asrVar17.B();
                    }
                    ((dul) asrVar17.a).e = eeaVarR11;
                } else {
                    eea eeaVarR12 = eea.r(dcr.ar((BigInteger) dpgVar.c.a, dqe.a(dpgVar.c().b)));
                    if (!asrVar17.a.isMutable()) {
                        asrVar17.B();
                    }
                    ((dul) asrVar17.a).e = eeaVarR12;
                }
                return dsf.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((dul) asrVar17.z()).toByteString(), dvb.ASYMMETRIC_PRIVATE, (dvn) dqe.g.d(dpgVar.c().e), dpgVar.a());
            case 14:
                return ((drg) dkyVar).b(dlnVar);
            case 15:
                dsq dsqVar = (dsq) dkyVar;
                drx drxVar12 = dti.a;
                asr asrVar18 = (asr) dto.a.createBuilder();
                dtq dtqVarB = dti.b(dsqVar.a);
                if (!asrVar18.a.isMutable()) {
                    asrVar18.B();
                }
                dto dtoVar = (dto) asrVar18.a;
                dtqVarB.getClass();
                dtoVar.e = dtqVarB;
                dtoVar.b |= 1;
                eea eeaVarR13 = eea.r(dsqVar.d.U());
                if (!asrVar18.a.isMutable()) {
                    asrVar18.B();
                }
                ((dto) asrVar18.a).d = eeaVarR13;
                return dsf.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((dto) asrVar18.z()).toByteString(), dvb.SYMMETRIC, dti.c(dsqVar.a.c), dsqVar.c);
            default:
                dsx dsxVar = (dsx) dkyVar;
                drx drxVar13 = dtl.a;
                asr asrVar19 = (asr) dur.a.createBuilder();
                dut dutVarA = dtl.a(dsxVar.a);
                if (!asrVar19.a.isMutable()) {
                    asrVar19.B();
                }
                dur durVar3 = (dur) asrVar19.a;
                dutVarA.getClass();
                durVar3.d = dutVarA;
                durVar3.b |= 1;
                eea eeaVarR14 = eea.r(dsxVar.d.U());
                if (!asrVar19.a.isMutable()) {
                    asrVar19.B();
                }
                ((dur) asrVar19.a).e = eeaVarR14;
                return dsf.a("type.googleapis.com/google.crypto.tink.HmacKey", ((dur) asrVar19.z()).toByteString(), dvb.SYMMETRIC, (dvn) dtl.e.d(dsxVar.a.c), dsxVar.c);
        }
    }
}
