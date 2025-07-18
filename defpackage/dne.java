package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dne implements drb {
    private final /* synthetic */ int a;

    public /* synthetic */ dne(int i) {
        this.a = i;
    }

    @Override // defpackage.drb
    public final dky a(dsk dskVar, dln dlnVar) throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                drx drxVar = dnf.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar = ((dsf) dskVar).c;
                    een eenVar = een.a;
                    egr egrVar = egr.a;
                    dvl dvlVar = (dvl) efb.parseFrom(dvl.a, eeaVar, een.a);
                    if (dvlVar.c == 0) {
                        dvm dvmVar = dvlVar.d;
                        if (dvmVar == null) {
                            dvmVar = dvm.a;
                        }
                        return dmx.b(dnf.a(dvmVar, ((dsf) dskVar).e), ((dsf) dskVar).f);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(dvlVar));
                } catch (efp e) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
                }
            case 1:
                drx drxVar2 = dmw.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar2 = ((dsf) dskVar).c;
                    een eenVar2 = een.a;
                    egr egrVar2 = egr.a;
                    dvj dvjVar = (dvj) efb.parseFrom(dvj.a, eeaVar2, een.a);
                    if (dvjVar.c == 0) {
                        dvk dvkVar = dvjVar.d;
                        if (dvkVar == null) {
                            dvkVar = dvk.a;
                        }
                        return dmt.b(new dmv(dvkVar.b, dmw.a(((dsf) dskVar).e)), ((dsf) dskVar).f);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(dvjVar));
                } catch (efp e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            case 2:
                drx drxVar3 = dnq.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar3 = ((dsf) dskVar).c;
                    een eenVar3 = een.a;
                    egr egrVar3 = egr.a;
                    dtr dtrVar = (dtr) efb.parseFrom(dtr.a, eeaVar3, een.a);
                    if (dtrVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dtt dttVar = dtrVar.d;
                    if (dttVar == null) {
                        dttVar = dtt.a;
                    }
                    if (dttVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    dur durVar = dtrVar.e;
                    if (durVar == null) {
                        durVar = dur.a;
                    }
                    if (durVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    dpa dpaVar = new dpa(null);
                    dtt dttVar2 = dtrVar.d;
                    if (dttVar2 == null) {
                        dttVar2 = dtt.a;
                    }
                    dpaVar.d(dttVar2.e.d());
                    dur durVar2 = dtrVar.e;
                    if (durVar2 == null) {
                        durVar2 = dur.a;
                    }
                    dpaVar.e(durVar2.e.d());
                    dtt dttVar3 = dtrVar.d;
                    if (dttVar3 == null) {
                        dttVar3 = dtt.a;
                    }
                    dtv dtvVar = dttVar3.d;
                    if (dtvVar == null) {
                        dtvVar = dtv.a;
                    }
                    dpaVar.f(dtvVar.b);
                    dur durVar3 = dtrVar.e;
                    if (durVar3 == null) {
                        durVar3 = dur.a;
                    }
                    dut dutVar = durVar3.d;
                    if (dutVar == null) {
                        dutVar = dut.a;
                    }
                    dpaVar.g(dutVar.c);
                    dur durVar4 = dtrVar.e;
                    if (durVar4 == null) {
                        durVar4 = dur.a;
                    }
                    dut dutVar2 = durVar4.d;
                    if (dutVar2 == null) {
                        dutVar2 = dut.a;
                    }
                    duq duqVarB = duq.b(dutVar2.b);
                    if (duqVarB == null) {
                        duqVarB = duq.UNRECOGNIZED;
                    }
                    dpaVar.a = dnq.a(duqVarB);
                    dpaVar.f = dnq.b(((dsf) dskVar).e);
                    dlx dlxVarC = dpaVar.c();
                    enh enhVar = new enh(null, null, null, null);
                    enhVar.d = dlxVarC;
                    dtt dttVar4 = dtrVar.d;
                    if (dttVar4 == null) {
                        dttVar4 = dtt.a;
                    }
                    enhVar.a = fsc.az(dttVar4.e.x());
                    dur durVar5 = dtrVar.e;
                    if (durVar5 == null) {
                        durVar5 = dur.a;
                    }
                    enhVar.b = fsc.az(durVar5.e.x());
                    enhVar.c = ((dsf) dskVar).f;
                    return enhVar.r();
                } catch (efp unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 3:
                drx drxVar4 = dnr.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar4 = ((dsf) dskVar).c;
                    een eenVar4 = een.a;
                    egr egrVar4 = egr.a;
                    dtw dtwVar = (dtw) efb.parseFrom(dtw.a, eeaVar4, een.a);
                    if (dtwVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    enh enhVar2 = new enh(null, null, null);
                    enhVar2.p(dtwVar.e.d());
                    dty dtyVar = dtwVar.d;
                    if (dtyVar == null) {
                        dtyVar = dty.a;
                    }
                    enhVar2.o(dtyVar.b);
                    enhVar2.q();
                    enhVar2.d = dnr.a(((dsf) dskVar).e);
                    dmc dmcVarN = enhVar2.n();
                    euw euwVar = new euw((char[]) null);
                    euwVar.c = dmcVarN;
                    euwVar.a = fsc.az(dtwVar.e.x());
                    euwVar.b = ((dsf) dskVar).f;
                    return euwVar.j();
                } catch (efp unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 4:
                drx drxVar5 = dnu.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar5 = ((dsf) dskVar).c;
                    een eenVar5 = een.a;
                    egr egrVar5 = egr.a;
                    dtz dtzVar = (dtz) efb.parseFrom(dtz.a, eeaVar5, een.a);
                    if (dtzVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    enh enhVar3 = new enh((char[]) null, (byte[]) null);
                    enhVar3.l(dtzVar.c.d());
                    enhVar3.k();
                    enhVar3.m();
                    enhVar3.c = dnu.a(((dsf) dskVar).e);
                    dmh dmhVarJ = enhVar3.j();
                    euw euwVar2 = new euw((char[]) null);
                    euwVar2.c = dmhVarJ;
                    euwVar2.a = fsc.az(dtzVar.c.x());
                    euwVar2.b = ((dsf) dskVar).f;
                    return euwVar2.i();
                } catch (efp unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 5:
                drx drxVar6 = dnv.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar6 = ((dsf) dskVar).c;
                    een eenVar6 = een.a;
                    egr egrVar6 = egr.a;
                    dub dubVar = (dub) efb.parseFrom(dub.a, eeaVar6, een.a);
                    if (dubVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqh eqhVar = new eqh((char[]) null);
                    eqhVar.f(dubVar.c.d());
                    eqhVar.b = dnv.a(((dsf) dskVar).e);
                    dml dmlVarE = eqhVar.e();
                    euw euwVar3 = new euw((char[]) null);
                    euwVar3.c = dmlVarE;
                    euwVar3.a = fsc.az(dubVar.c.x());
                    euwVar3.b = ((dsf) dskVar).f;
                    return euwVar3.h();
                } catch (efp unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 6:
                drx drxVar7 = dny.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar7 = ((dsf) dskVar).c;
                    een eenVar7 = een.a;
                    egr egrVar7 = egr.a;
                    duf dufVar = (duf) efb.parseFrom(duf.a, eeaVar7, een.a);
                    if (dufVar.b == 0) {
                        return dmm.b(dny.a(((dsf) dskVar).e), fsc.az(dufVar.c.x()), ((dsf) dskVar).f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (efp unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 7:
                drx drxVar8 = doj.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar8 = ((dsf) dskVar).c;
                    een eenVar8 = een.a;
                    egr egrVar8 = egr.a;
                    dvp dvpVar = (dvp) efb.parseFrom(dvp.a, eeaVar8, een.a);
                    if (dvpVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (dvpVar.e.d() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    dnk dnkVarA = doj.a(((dsf) dskVar).e);
                    dvr dvrVar = dvpVar.d;
                    if (dvrVar == null) {
                        dvrVar = dvr.a;
                    }
                    return dni.b(dnl.b(dnkVarA, dvrVar.b), fsc.az(dvpVar.e.x()), ((dsf) dskVar).f);
                } catch (efp unused6) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 8:
                drx drxVar9 = dol.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar9 = ((dsf) dskVar).c;
                    een eenVar9 = een.a;
                    egr egrVar9 = egr.a;
                    dvs dvsVar = (dvs) efb.parseFrom(dvs.a, eeaVar9, een.a);
                    if (dvsVar.b == 0) {
                        return dnm.b(dol.a(((dsf) dskVar).e), fsc.az(dvsVar.c.x()), ((dsf) dskVar).f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (efp unused7) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 9:
                drx drxVar10 = dox.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    eea eeaVar10 = ((dsf) dskVar).c;
                    een eenVar10 = een.a;
                    egr egrVar10 = egr.a;
                    dud dudVar = (dud) efb.parseFrom(dud.a, eeaVar10, een.a);
                    if (dudVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqh eqhVar2 = new eqh((byte[]) null);
                    eqhVar2.d(dudVar.c.d());
                    eqhVar2.a = dox.a(((dsf) dskVar).e);
                    dot dotVarC = eqhVar2.c();
                    euw euwVar4 = new euw((char[]) null);
                    euwVar4.c = dotVarC;
                    euwVar4.a = fsc.az(dudVar.c.x());
                    euwVar4.b = ((dsf) dskVar).f;
                    return euwVar4.g();
                } catch (efp unused8) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            case 10:
                drx drxVar11 = dpp.a;
                dsf dsfVar = (dsf) dskVar;
                if (!dsfVar.a.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ".concat(String.valueOf(dsfVar.a)));
                }
                try {
                    eea eeaVar11 = ((dsf) dskVar).c;
                    een eenVar11 = een.a;
                    egr egrVar11 = egr.a;
                    dva dvaVar = (dva) efb.parseFrom(dva.a, eeaVar11, een.a);
                    if (dvaVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dvn dvnVar = ((dsf) dskVar).e;
                    duy duyVar = dvaVar.d;
                    if (duyVar == null) {
                        duyVar = duy.a;
                    }
                    dpn dpnVarA = dpp.a(dvnVar, duyVar);
                    return dpq.b(dpnVarA, dpp.d(dpnVarA.a, dvaVar.e.x()), ((dsf) dskVar).f);
                } catch (efp unused9) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            case 11:
                drx drxVar12 = dpp.a;
                dsf dsfVar2 = (dsf) dskVar;
                if (!dsfVar2.a.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ".concat(String.valueOf(dsfVar2.a)));
                }
                try {
                    eea eeaVar12 = ((dsf) dskVar).c;
                    een eenVar12 = een.a;
                    egr egrVar12 = egr.a;
                    duz duzVar = (duz) efb.parseFrom(duz.a, eeaVar12, een.a);
                    if (duzVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dva dvaVar2 = duzVar.d;
                    if (dvaVar2 == null) {
                        dvaVar2 = dva.a;
                    }
                    if (dvaVar2.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dvn dvnVar2 = ((dsf) dskVar).e;
                    duy duyVar2 = dvaVar2.d;
                    if (duyVar2 == null) {
                        duyVar2 = duy.a;
                    }
                    dpn dpnVarA2 = dpp.a(dvnVar2, duyVar2);
                    return dpo.e(dpq.b(dpnVarA2, dpp.d(dpnVarA2.a, dvaVar2.e.x()), ((dsf) dskVar).f), fsc.az(dcr.ar(new BigInteger(1, duzVar.e.x()), dql.a(dpnVarA2.a))));
                } catch (efp unused10) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
            case 12:
                drx drxVar13 = dqe.a;
                dsf dsfVar3 = (dsf) dskVar;
                if (!dsfVar3.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ".concat(String.valueOf(dsfVar3.a)));
                }
                try {
                    eea eeaVar13 = ((dsf) dskVar).c;
                    een eenVar13 = een.a;
                    egr egrVar13 = egr.a;
                    dum dumVar = (dum) efb.parseFrom(dum.a, eeaVar13, een.a);
                    if (dumVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dvn dvnVar3 = ((dsf) dskVar).e;
                    duk dukVar = dumVar.d;
                    if (dukVar == null) {
                        dukVar = duk.a;
                    }
                    dpf dpfVarB = dqe.b(dvnVar3, dukVar);
                    if (!dpfVarB.b.equals(dpb.d)) {
                        return dph.c(dpfVarB, new ECPoint(new BigInteger(1, dumVar.e.x()), new BigInteger(1, dumVar.f.x())), ((dsf) dskVar).f);
                    }
                    if (dumVar.f.w()) {
                        return dph.b(dpfVarB, dwt.b(dumVar.e.x()), ((dsf) dskVar).f);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (efp | IllegalArgumentException unused11) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 13:
                drx drxVar14 = dqe.a;
                dsf dsfVar4 = (dsf) dskVar;
                if (!dsfVar4.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ".concat(String.valueOf(dsfVar4.a)));
                }
                try {
                    eea eeaVar14 = ((dsf) dskVar).c;
                    een eenVar14 = een.a;
                    egr egrVar14 = egr.a;
                    dul dulVar = (dul) efb.parseFrom(dul.a, eeaVar14, een.a);
                    if (dulVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dum dumVar2 = dulVar.d;
                    if (dumVar2 == null) {
                        dumVar2 = dum.a;
                    }
                    if (dumVar2.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dvn dvnVar4 = ((dsf) dskVar).e;
                    duk dukVar2 = dumVar2.d;
                    if (dukVar2 == null) {
                        dukVar2 = duk.a;
                    }
                    dpf dpfVarB2 = dqe.b(dvnVar4, dukVar2);
                    if (!dpfVarB2.b.equals(dpb.d)) {
                        return dpg.e(dph.c(dpfVarB2, new ECPoint(new BigInteger(1, dumVar2.e.x()), new BigInteger(1, dumVar2.f.x())), ((dsf) dskVar).f), new fsc(new BigInteger(1, dulVar.e.x())));
                    }
                    dph dphVarB = dph.b(dpfVarB2, dwt.b(dumVar2.e.x()), ((dsf) dskVar).f);
                    fsc fscVarAz = fsc.az(dulVar.e.x());
                    if (dphVarB.c == null) {
                        throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
                    }
                    byte[] bArrU = fscVarAz.U();
                    byte[] bArrC = dphVarB.c.c();
                    if (bArrU.length != 32) {
                        throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
                    }
                    if (Arrays.equals(dcr.U(bArrU), bArrC)) {
                        return new dpg(dphVarB, null, fscVarAz);
                    }
                    throw new GeneralSecurityException("Invalid private key for public key.");
                } catch (efp | IllegalArgumentException unused12) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 14:
                drx drxVar15 = dti.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar15 = ((dsf) dskVar).c;
                    een eenVar15 = een.a;
                    egr egrVar15 = egr.a;
                    dto dtoVar = (dto) efb.parseFrom(dto.a, eeaVar15, een.a);
                    if (dtoVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euw euwVar5 = new euw((byte[]) null, (byte[]) null);
                    euwVar5.d(dtoVar.d.d());
                    dtq dtqVar = dtoVar.e;
                    if (dtqVar == null) {
                        dtqVar = dtq.a;
                    }
                    euwVar5.e(dtqVar.b);
                    euwVar5.c = dti.a(((dsf) dskVar).e);
                    dst dstVarC = euwVar5.c();
                    euw euwVar6 = new euw((char[]) null, (byte[]) null);
                    euwVar6.c = dstVarC;
                    euwVar6.b = fsc.az(dtoVar.d.x());
                    euwVar6.a = ((dsf) dskVar).f;
                    return euwVar6.f();
                } catch (efp | IllegalArgumentException unused13) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                drx drxVar16 = dtl.a;
                if (!((dsf) dskVar).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    eea eeaVar16 = ((dsf) dskVar).c;
                    een eenVar16 = een.a;
                    egr egrVar16 = egr.a;
                    dur durVar6 = (dur) efb.parseFrom(dur.a, eeaVar16, een.a);
                    if (durVar6.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    enh enhVar4 = new enh((byte[]) null, (byte[]) null);
                    enhVar4.g(durVar6.e.d());
                    dut dutVar3 = durVar6.d;
                    if (dutVar3 == null) {
                        dutVar3 = dut.a;
                    }
                    enhVar4.h(dutVar3.c);
                    exo exoVar = dtl.f;
                    dut dutVar4 = durVar6.d;
                    if (dutVar4 == null) {
                        dutVar4 = dut.a;
                    }
                    duq duqVarB2 = duq.b(dutVar4.b);
                    if (duqVarB2 == null) {
                        duqVarB2 = duq.UNRECOGNIZED;
                    }
                    enhVar4.b = (dsz) exoVar.e(duqVarB2);
                    enhVar4.a = (dta) dtl.e.e(((dsf) dskVar).e);
                    dtb dtbVarF = enhVar4.f();
                    euw euwVar7 = new euw((char[]) null);
                    euwVar7.c = dtbVarF;
                    euwVar7.a = fsc.az(durVar6.e.x());
                    euwVar7.b = ((dsf) dskVar).f;
                    return euwVar7.b();
                } catch (efp | IllegalArgumentException unused14) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }
}
