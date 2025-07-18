package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpp {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    public static final drx e;
    public static final drx f;
    public static final exo g;
    private static final dwt h;
    private static final dwt i;
    private static final exo j;
    private static final exo k;
    private static final exo l;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        h = dwtVarB;
        dwt dwtVarB2 = dsp.b("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        i = dwtVarB2;
        a = new drx(dpn.class, dsg.class, new dnb(10));
        b = new drx(dwtVarB, dsg.class, new dnc(10));
        c = new drx(dpq.class, dsf.class, new dnd(10));
        e = new drx(dwtVarB2, dsf.class, new dne(10));
        d = new drx(dpo.class, dsf.class, new dnd(11));
        f = new drx(dwtVarB, dsf.class, new dne(11));
        eqh eqhVar = new eqh();
        eqhVar.b(dvn.RAW, dpm.c);
        eqhVar.b(dvn.TINK, dpm.a);
        eqhVar.b(dvn.LEGACY, dpm.b);
        eqhVar.b(dvn.CRUNCHY, dpm.b);
        g = eqhVar.n();
        eqh eqhVar2 = new eqh();
        eqhVar2.b(duw.DHKEM_P256_HKDF_SHA256, dpl.a);
        eqhVar2.b(duw.DHKEM_P384_HKDF_SHA384, dpl.b);
        eqhVar2.b(duw.DHKEM_P521_HKDF_SHA512, dpl.c);
        eqhVar2.b(duw.DHKEM_X25519_HKDF_SHA256, dpl.f);
        j = eqhVar2.n();
        eqh eqhVar3 = new eqh();
        eqhVar3.b(duv.HKDF_SHA256, dpk.a);
        eqhVar3.b(duv.HKDF_SHA384, dpk.b);
        eqhVar3.b(duv.HKDF_SHA512, dpk.c);
        k = eqhVar3.n();
        eqh eqhVar4 = new eqh();
        eqhVar4.b(duu.AES_128_GCM, dpi.a);
        eqhVar4.b(duu.AES_256_GCM, dpi.b);
        eqhVar4.b(duu.CHACHA20_POLY1305, dpi.c);
        l = eqhVar4.n();
    }

    public static dpn a(dvn dvnVar, duy duyVar) {
        enh enhVar = new enh(null);
        enhVar.c = (dpm) g.e(dvnVar);
        exo exoVar = j;
        duw duwVarB = duw.b(duyVar.b);
        if (duwVarB == null) {
            duwVarB = duw.UNRECOGNIZED;
        }
        enhVar.d = (dpl) exoVar.e(duwVarB);
        exo exoVar2 = k;
        duv duvVarB = duv.b(duyVar.c);
        if (duvVarB == null) {
            duvVarB = duv.UNRECOGNIZED;
        }
        enhVar.b = (dpk) exoVar2.e(duvVarB);
        exo exoVar3 = l;
        duu duuVarB = duu.b(duyVar.d);
        if (duuVarB == null) {
            duuVarB = duu.UNRECOGNIZED;
        }
        enhVar.a = (dpi) exoVar3.e(duuVarB);
        return enhVar.i();
    }

    public static duy b(dpn dpnVar) {
        asr asrVar = (asr) duy.a.createBuilder();
        duw duwVar = (duw) j.d(dpnVar.a);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((duy) asrVar.a).b = duwVar.a();
        duv duvVar = (duv) k.d(dpnVar.b);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((duy) asrVar.a).c = duvVar.a();
        duu duuVar = (duu) l.d(dpnVar.c);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((duy) asrVar.a).d = duuVar.a();
        return (duy) asrVar.z();
    }

    public static dva c(dpq dpqVar) {
        asr asrVar = (asr) dva.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dva) asrVar.a).c = 0;
        duy duyVarB = b(dpqVar.a);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dva dvaVar = (dva) asrVar.a;
        duyVarB.getClass();
        dvaVar.d = duyVarB;
        dvaVar.b |= 1;
        eea eeaVarR = eea.r(dpqVar.b.c());
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dva) asrVar.a).e = eeaVarR;
        return (dva) asrVar.z();
    }

    public static dwt d(dpl dplVar, byte[] bArr) throws GeneralSecurityException {
        int i2;
        BigInteger bigInteger = new BigInteger(1, bArr);
        byte[] bArr2 = dql.a;
        if (dplVar == dpl.f) {
            i2 = 32;
        } else if (dplVar == dpl.a) {
            i2 = 65;
        } else if (dplVar == dpl.b) {
            i2 = 97;
        } else {
            if (dplVar != dpl.c) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i2 = 133;
        }
        return dwt.b(dcr.ar(bigInteger, i2));
    }
}
