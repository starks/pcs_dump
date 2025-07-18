package defpackage;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Pair;
import com.google.android.apps.aicore.aidl.AIFeature;
import j$.time.Duration;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anj {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/attestation/impl/PccAttestationMeasurementClientImpl");
    private final Executor b;
    private final eol c;
    private final boolean d;
    private final Context e;
    private final avm f;
    private final auh g;
    private final api h;

    public anj(Executor executor, eol eolVar, avm avmVar, api apiVar, auh auhVar, boolean z, Context context) {
        this.b = executor;
        this.c = eolVar;
        this.h = apiVar;
        this.f = avmVar;
        this.g = auhVar;
        this.d = z;
        this.e = context;
    }

    private final synchronized Pair c(and andVar, byte[] bArr) {
        KeyPair keyPairGenerateKeyPair;
        Certificate[] certificateChain;
        boolean z = false;
        if (this.e.getPackageManager().hasSystemFeature("android.software.device_id_attestation") && ((Boolean) andVar.c.orElse(false)).booleanValue()) {
            z = true;
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("PcsAttestationKey", 12).setDigests("SHA-256").setSignaturePaddings("PSS", "PKCS1").setKeySize(AIFeature.Id.PIXEL_AI_FEATURE_48).setDevicePropertiesAttestationIncluded(z).setAttestationChallenge(bArr).build());
        keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        certificateChain = keyStore.getCertificateChain("PcsAttestationKey");
        return Pair.create(keyPairGenerateKeyPair, certificateChain == null ? new ArrayList() : Arrays.asList(certificateChain));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.djy a(defpackage.and r11, defpackage.ebn r12) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anj.a(and, ebn):djy");
    }

    public final djy b(and andVar) {
        djy djyVarA;
        int i = 1;
        clq.w(andVar.a.toSeconds() > 0, "TTL less than 1 second is not supported.");
        clq.w(andVar.a.compareTo(Duration.ofHours(24L)) < 0, "TTl should be less than 24 hours.");
        asr asrVar = (asr) atc.a.createBuilder();
        atk atkVar = atk.PCC_ATTESTATION_MEASUREMENT_REQUEST;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        auh auhVar = this.g;
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
        andVar.b.ifPresent(new ani(0));
        if (andVar.b.isPresent() && this.d) {
            asr asrVar2 = (asr) ebn.a.createBuilder();
            int i2 = ded.b;
            eea eeaVarR = eea.r(dec.a.a(((String) andVar.b.get()).getBytes()).e());
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((ebn) asrVar2.a).d = eeaVarR;
            eek eekVarO = ebz.o(andVar.a);
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ebn ebnVar = (ebn) asrVar2.a;
            eekVarO.getClass();
            ebnVar.c = eekVarO;
            ebnVar.b = 3;
            djyVarA = cnx.C((ebn) asrVar2.z());
        } else {
            asr asrVar3 = (asr) ebo.a.createBuilder();
            eek eekVarO2 = ebz.o(andVar.a);
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            ebo eboVar = (ebo) asrVar3.a;
            eekVarO2.getClass();
            eboVar.c = eekVarO2;
            eboVar.b |= 1;
            ebp ebpVar = (ebp) ebp.b(new bcn(2), this.c);
            ebo eboVar2 = (ebo) asrVar3.z();
            elu eluVar = ebpVar.a;
            epg epgVarA = ebq.a;
            if (epgVarA == null) {
                synchronized (ebq.class) {
                    epgVarA = ebq.a;
                    if (epgVarA == null) {
                        epd epdVarA = epg.a();
                        epdVarA.c = epf.UNARY;
                        epdVarA.d = epg.c("google.internal.android.keyattestation.v1.KeyAttestationService", "GenerateChallenge");
                        epdVarA.b();
                        ebo eboVar3 = ebo.a;
                        int i3 = fec.b;
                        epdVarA.a = new fea(eboVar3);
                        epdVarA.b = new fea(ebn.a);
                        epgVarA = epdVarA.a();
                        ebq.a = epgVarA;
                    }
                }
            }
            djyVarA = feo.a(eluVar.a(epgVarA, ebpVar.b), eboVar2);
        }
        return dij.j(djyVarA, new aqf(this, andVar, i, null), this.b);
    }
}
