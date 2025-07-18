package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dnc implements drv {
    private final /* synthetic */ int a;

    public /* synthetic */ dnc(int i) {
        this.a = i;
    }

    @Override // defpackage.drv
    public final dli a(dsk dskVar) throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                drx drxVar = dnf.a;
                dsg dsgVar = (dsg) dskVar;
                if (!dsgVar.b.b.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar.b.b)));
                }
                try {
                    eea eeaVar = ((dsg) dskVar).b.c;
                    een eenVar = een.a;
                    egr egrVar = egr.a;
                    dvm dvmVar = (dvm) efb.parseFrom(dvm.a, eeaVar, een.a);
                    dvn dvnVarB = dvn.b(dsgVar.b.d);
                    if (dvnVarB == null) {
                        dvnVarB = dvn.UNRECOGNIZED;
                    }
                    return dnf.a(dvmVar, dvnVarB);
                } catch (efp e) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
                }
            case 1:
                drx drxVar2 = dmw.a;
                dsg dsgVar2 = (dsg) dskVar;
                if (!dsgVar2.b.b.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar2.b.b)));
                }
                try {
                    eea eeaVar2 = ((dsg) dskVar).b.c;
                    een eenVar2 = een.a;
                    egr egrVar2 = egr.a;
                    String str = ((dvk) efb.parseFrom(dvk.a, eeaVar2, een.a)).b;
                    dvn dvnVarB2 = dvn.b(dsgVar2.b.d);
                    if (dvnVarB2 == null) {
                        dvnVarB2 = dvn.UNRECOGNIZED;
                    }
                    return new dmv(str, dmw.a(dvnVarB2));
                } catch (efp e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            case 2:
                drx drxVar3 = dnq.a;
                dsg dsgVar3 = (dsg) dskVar;
                if (!dsgVar3.b.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar3.b.b)));
                }
                try {
                    eea eeaVar3 = ((dsg) dskVar).b.c;
                    een eenVar3 = een.a;
                    egr egrVar3 = egr.a;
                    dts dtsVar = (dts) efb.parseFrom(dts.a, eeaVar3, een.a);
                    dus dusVar = dtsVar.d;
                    if (dusVar == null) {
                        dusVar = dus.a;
                    }
                    if (dusVar.e != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dpa dpaVar = new dpa(null);
                    dtu dtuVar = dtsVar.c;
                    if (dtuVar == null) {
                        dtuVar = dtu.a;
                    }
                    dpaVar.d(dtuVar.d);
                    dus dusVar2 = dtsVar.d;
                    if (dusVar2 == null) {
                        dusVar2 = dus.a;
                    }
                    dpaVar.e(dusVar2.d);
                    dtu dtuVar2 = dtsVar.c;
                    if (dtuVar2 == null) {
                        dtuVar2 = dtu.a;
                    }
                    dtv dtvVar = dtuVar2.c;
                    if (dtvVar == null) {
                        dtvVar = dtv.a;
                    }
                    dpaVar.f(dtvVar.b);
                    dus dusVar3 = dtsVar.d;
                    if (dusVar3 == null) {
                        dusVar3 = dus.a;
                    }
                    dut dutVar = dusVar3.c;
                    if (dutVar == null) {
                        dutVar = dut.a;
                    }
                    dpaVar.g(dutVar.c);
                    dus dusVar4 = dtsVar.d;
                    if (dusVar4 == null) {
                        dusVar4 = dus.a;
                    }
                    dut dutVar2 = dusVar4.c;
                    if (dutVar2 == null) {
                        dutVar2 = dut.a;
                    }
                    duq duqVarB = duq.b(dutVar2.b);
                    if (duqVarB == null) {
                        duqVarB = duq.UNRECOGNIZED;
                    }
                    dpaVar.a = dnq.a(duqVarB);
                    dvn dvnVarB3 = dvn.b(dsgVar3.b.d);
                    if (dvnVarB3 == null) {
                        dvnVarB3 = dvn.UNRECOGNIZED;
                    }
                    dpaVar.f = dnq.b(dvnVarB3);
                    return dpaVar.c();
                } catch (efp e3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                }
            case 3:
                drx drxVar4 = dnr.a;
                dsg dsgVar4 = (dsg) dskVar;
                if (!dsgVar4.b.b.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar4.b.b)));
                }
                try {
                    eea eeaVar4 = ((dsg) dskVar).b.c;
                    een eenVar4 = een.a;
                    egr egrVar4 = egr.a;
                    dtx dtxVar = (dtx) efb.parseFrom(dtx.a, eeaVar4, een.a);
                    enh enhVar = new enh(null, null, null);
                    enhVar.p(dtxVar.d);
                    dty dtyVar = dtxVar.c;
                    if (dtyVar == null) {
                        dtyVar = dty.a;
                    }
                    enhVar.o(dtyVar.b);
                    enhVar.q();
                    dvn dvnVarB4 = dvn.b(dsgVar4.b.d);
                    if (dvnVarB4 == null) {
                        dvnVarB4 = dvn.UNRECOGNIZED;
                    }
                    enhVar.d = dnr.a(dvnVarB4);
                    return enhVar.n();
                } catch (efp e4) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                }
            case 4:
                drx drxVar5 = dnu.a;
                dsg dsgVar5 = (dsg) dskVar;
                if (!dsgVar5.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar5.b.b)));
                }
                try {
                    eea eeaVar5 = ((dsg) dskVar).b.c;
                    een eenVar5 = een.a;
                    egr egrVar5 = egr.a;
                    dua duaVar = (dua) efb.parseFrom(dua.a, eeaVar5, een.a);
                    if (duaVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    enh enhVar2 = new enh((char[]) null, (byte[]) null);
                    enhVar2.l(duaVar.b);
                    enhVar2.k();
                    enhVar2.m();
                    dvn dvnVarB5 = dvn.b(dsgVar5.b.d);
                    if (dvnVarB5 == null) {
                        dvnVarB5 = dvn.UNRECOGNIZED;
                    }
                    enhVar2.c = dnu.a(dvnVarB5);
                    return enhVar2.j();
                } catch (efp e5) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                }
            case 5:
                drx drxVar6 = dnv.a;
                dsg dsgVar6 = (dsg) dskVar;
                if (!dsgVar6.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar6.b.b)));
                }
                try {
                    eea eeaVar6 = ((dsg) dskVar).b.c;
                    een eenVar6 = een.a;
                    egr egrVar6 = egr.a;
                    duc ducVar = (duc) efb.parseFrom(duc.a, eeaVar6, een.a);
                    if (ducVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    eqh eqhVar = new eqh((char[]) null);
                    eqhVar.f(ducVar.b);
                    dvn dvnVarB6 = dvn.b(dsgVar6.b.d);
                    if (dvnVarB6 == null) {
                        dvnVarB6 = dvn.UNRECOGNIZED;
                    }
                    eqhVar.b = dnv.a(dvnVarB6);
                    return eqhVar.e();
                } catch (efp e6) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                }
            case 6:
                drx drxVar7 = dny.a;
                dsg dsgVar7 = (dsg) dskVar;
                if (!dsgVar7.b.b.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar7.b.b)));
                }
                try {
                    eea eeaVar7 = ((dsg) dskVar).b.c;
                    een eenVar7 = een.a;
                    egr egrVar7 = egr.a;
                    dvn dvnVarB7 = dvn.b(dsgVar7.b.d);
                    if (dvnVarB7 == null) {
                        dvnVarB7 = dvn.UNRECOGNIZED;
                    }
                    return new dmp(dny.a(dvnVarB7));
                } catch (efp e7) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                }
            case 7:
                drx drxVar8 = doj.a;
                dsg dsgVar8 = (dsg) dskVar;
                if (!dsgVar8.b.b.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar8.b.b)));
                }
                try {
                    eea eeaVar8 = ((dsg) dskVar).b.c;
                    een eenVar8 = een.a;
                    egr egrVar8 = egr.a;
                    dvq dvqVar = (dvq) efb.parseFrom(dvq.a, eeaVar8, een.a);
                    if (dvqVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    dvn dvnVarB8 = dvn.b(dsgVar8.b.d);
                    if (dvnVarB8 == null) {
                        dvnVarB8 = dvn.UNRECOGNIZED;
                    }
                    dnk dnkVarA = doj.a(dvnVarB8);
                    dvr dvrVar = dvqVar.d;
                    if (dvrVar == null) {
                        dvrVar = dvr.a;
                    }
                    return dnl.b(dnkVarA, dvrVar.b);
                } catch (efp e8) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
                }
            case 8:
                drx drxVar9 = dol.a;
                dsg dsgVar9 = (dsg) dskVar;
                if (!dsgVar9.b.b.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar9.b.b)));
                }
                try {
                    eea eeaVar9 = ((dsg) dskVar).b.c;
                    een eenVar9 = een.a;
                    egr egrVar9 = egr.a;
                    if (((dvt) efb.parseFrom(dvt.a, eeaVar9, een.a)).b != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    dvn dvnVarB9 = dvn.b(dsgVar9.b.d);
                    if (dvnVarB9 == null) {
                        dvnVarB9 = dvn.UNRECOGNIZED;
                    }
                    return new dnp(dol.a(dvnVarB9));
                } catch (efp e9) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e9);
                }
            case 9:
                drx drxVar10 = dox.a;
                dsg dsgVar10 = (dsg) dskVar;
                if (!dsgVar10.b.b.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(dsgVar10.b.b)));
                }
                try {
                    eea eeaVar10 = ((dsg) dskVar).b.c;
                    een eenVar10 = een.a;
                    egr egrVar10 = egr.a;
                    due dueVar = (due) efb.parseFrom(due.a, eeaVar10, een.a);
                    if (dueVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqh eqhVar2 = new eqh((byte[]) null);
                    eqhVar2.d(dueVar.b);
                    dvn dvnVarB10 = dvn.b(dsgVar10.b.d);
                    if (dvnVarB10 == null) {
                        dvnVarB10 = dvn.UNRECOGNIZED;
                    }
                    eqhVar2.a = dox.a(dvnVarB10);
                    return eqhVar2.c();
                } catch (efp e10) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
                }
            case 10:
                drx drxVar11 = dpp.a;
                dsg dsgVar11 = (dsg) dskVar;
                if (!dsgVar11.b.b.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar11.b.b)));
                }
                try {
                    eea eeaVar11 = ((dsg) dskVar).b.c;
                    een eenVar11 = een.a;
                    egr egrVar11 = egr.a;
                    dux duxVar = (dux) efb.parseFrom(dux.a, eeaVar11, een.a);
                    dvn dvnVarB11 = dvn.b(dsgVar11.b.d);
                    if (dvnVarB11 == null) {
                        dvnVarB11 = dvn.UNRECOGNIZED;
                    }
                    duy duyVar = duxVar.c;
                    if (duyVar == null) {
                        duyVar = duy.a;
                    }
                    return dpp.a(dvnVarB11, duyVar);
                } catch (efp e11) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e11);
                }
            case 11:
                drx drxVar12 = dqe.a;
                dsg dsgVar12 = (dsg) dskVar;
                if (!dsgVar12.b.b.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar12.b.b)));
                }
                try {
                    eea eeaVar12 = ((dsg) dskVar).b.c;
                    een eenVar12 = een.a;
                    egr egrVar12 = egr.a;
                    duj dujVar = (duj) efb.parseFrom(duj.a, eeaVar12, een.a);
                    dvn dvnVarB12 = dvn.b(dsgVar12.b.d);
                    if (dvnVarB12 == null) {
                        dvnVarB12 = dvn.UNRECOGNIZED;
                    }
                    duk dukVar = dujVar.c;
                    if (dukVar == null) {
                        dukVar = duk.a;
                    }
                    return dqe.b(dvnVarB12, dukVar);
                } catch (efp e12) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e12);
                }
            case 12:
                drx drxVar13 = dti.a;
                dsg dsgVar13 = (dsg) dskVar;
                if (!dsgVar13.b.b.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar13.b.b)));
                }
                try {
                    eea eeaVar13 = ((dsg) dskVar).b.c;
                    een eenVar13 = een.a;
                    egr egrVar13 = egr.a;
                    dtp dtpVar = (dtp) efb.parseFrom(dtp.a, eeaVar13, een.a);
                    euw euwVar = new euw((byte[]) null, (byte[]) null);
                    euwVar.d(dtpVar.c);
                    dtq dtqVar = dtpVar.d;
                    if (dtqVar == null) {
                        dtqVar = dtq.a;
                    }
                    euwVar.e(dtqVar.b);
                    dvn dvnVarB13 = dvn.b(dsgVar13.b.d);
                    if (dvnVarB13 == null) {
                        dvnVarB13 = dvn.UNRECOGNIZED;
                    }
                    euwVar.c = dti.a(dvnVarB13);
                    return euwVar.c();
                } catch (efp e13) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e13);
                }
            default:
                drx drxVar14 = dtl.a;
                dsg dsgVar14 = (dsg) dskVar;
                if (!dsgVar14.b.b.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(dsgVar14.b.b)));
                }
                try {
                    eea eeaVar14 = ((dsg) dskVar).b.c;
                    een eenVar14 = een.a;
                    egr egrVar14 = egr.a;
                    dus dusVar5 = (dus) efb.parseFrom(dus.a, eeaVar14, een.a);
                    if (dusVar5.e != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + dusVar5.e);
                    }
                    enh enhVar3 = new enh((byte[]) null, (byte[]) null);
                    enhVar3.g(dusVar5.d);
                    dut dutVar3 = dusVar5.c;
                    if (dutVar3 == null) {
                        dutVar3 = dut.a;
                    }
                    enhVar3.h(dutVar3.c);
                    exo exoVar = dtl.f;
                    dut dutVar4 = dusVar5.c;
                    if (dutVar4 == null) {
                        dutVar4 = dut.a;
                    }
                    duq duqVarB2 = duq.b(dutVar4.b);
                    if (duqVarB2 == null) {
                        duqVarB2 = duq.UNRECOGNIZED;
                    }
                    enhVar3.b = (dsz) exoVar.e(duqVarB2);
                    exo exoVar2 = dtl.e;
                    dvn dvnVarB14 = dvn.b(dsgVar14.b.d);
                    if (dvnVarB14 == null) {
                        dvnVarB14 = dvn.UNRECOGNIZED;
                    }
                    enhVar3.a = (dta) exoVar2.e(dvnVarB14);
                    return enhVar3.f();
                } catch (efp e14) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e14);
                }
        }
    }
}
