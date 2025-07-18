package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlq {

    @Deprecated
    static final dvo a = dvo.a;

    static {
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        drs.a.c(dlr.a);
        drs.a.b(dlr.b);
        dtc.a();
        if (!doo.a(dlu.e)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        drx drxVar = dnq.a;
        drt drtVar = drt.a;
        drtVar.e(dnq.a);
        drtVar.f(dnq.b);
        drtVar.g(dnq.c);
        drtVar.h(dnq.d);
        drs.a.b(dlu.a);
        drr drrVar = drr.a;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", dnh.e);
        dpa dpaVar = new dpa(null);
        dpaVar.d(16);
        dpaVar.e(32);
        dpaVar.g(16);
        dpaVar.f(16);
        dpaVar.a = dlv.c;
        dpaVar.f = dlw.c;
        map.put("AES128_CTR_HMAC_SHA256_RAW", dpaVar.c());
        map.put("AES256_CTR_HMAC_SHA256", dnh.f);
        dpa dpaVar2 = new dpa(null);
        dpaVar2.d(32);
        dpaVar2.e(32);
        dpaVar2.g(32);
        dpaVar2.f(16);
        dpaVar2.a = dlv.c;
        dpaVar2.f = dlw.c;
        map.put("AES256_CTR_HMAC_SHA256_RAW", dpaVar2.c());
        drrVar.b(DesugarCollections.unmodifiableMap(map));
        drp.a.a(dlu.c, dlx.class);
        drn.a.c(dlu.d, dlx.class);
        dra.a.c(dlu.b, dlu.e, true);
        if (!doo.a(dmf.e)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        drx drxVar2 = dnu.a;
        drt drtVar2 = drt.a;
        drtVar2.e(dnu.a);
        drtVar2.f(dnu.b);
        drtVar2.g(dnu.c);
        drtVar2.h(dnu.d);
        drs.a.b(dmf.a);
        drr drrVar2 = drr.a;
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", dnh.a);
        enh enhVar = new enh((char[]) null, (byte[]) null);
        enhVar.k();
        enhVar.l(16);
        enhVar.m();
        enhVar.c = dmg.c;
        map2.put("AES128_GCM_RAW", enhVar.j());
        map2.put("AES256_GCM", dnh.b);
        enh enhVar2 = new enh((char[]) null, (byte[]) null);
        enhVar2.k();
        enhVar2.l(32);
        enhVar2.m();
        enhVar2.c = dmg.c;
        map2.put("AES256_GCM_RAW", enhVar2.j());
        drrVar2.b(DesugarCollections.unmodifiableMap(map2));
        drp.a.a(dmf.c, dmh.class);
        drn.a.c(dmf.d, dmh.class);
        dra.a.c(dmf.b, dmf.e, true);
        if (dop.a()) {
            return;
        }
        dsa dsaVar = dma.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        drx drxVar3 = dnr.a;
        drt drtVar3 = drt.a;
        drtVar3.e(dnr.a);
        drtVar3.f(dnr.b);
        drtVar3.g(dnr.c);
        drtVar3.h(dnr.d);
        drs.a.b(dma.a);
        drr drrVar3 = drr.a;
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", dnh.c);
        enh enhVar3 = new enh(null, null, null);
        enhVar3.o(16);
        enhVar3.p(16);
        enhVar3.q();
        enhVar3.d = dmb.c;
        map3.put("AES128_EAX_RAW", enhVar3.n());
        map3.put("AES256_EAX", dnh.d);
        enh enhVar4 = new enh(null, null, null);
        enhVar4.o(16);
        enhVar4.p(32);
        enhVar4.q();
        enhVar4.d = dmb.c;
        map3.put("AES256_EAX_RAW", enhVar4.n());
        drrVar3.b(DesugarCollections.unmodifiableMap(map3));
        drn.a.c(dma.c, dmc.class);
        dra.a.b(dma.b, true);
        dsa dsaVar2 = dmj.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        drx drxVar4 = dnv.a;
        drt drtVar4 = drt.a;
        drtVar4.e(dnv.a);
        drtVar4.f(dnv.b);
        drtVar4.g(dnv.c);
        drtVar4.h(dnv.d);
        if (dmj.a()) {
            drs.a.b(dmj.a);
            drr drrVar4 = drr.a;
            HashMap map4 = new HashMap();
            eqh eqhVar = new eqh((char[]) null);
            eqhVar.f(16);
            eqhVar.b = dmk.a;
            map4.put("AES128_GCM_SIV", eqhVar.e());
            eqh eqhVar2 = new eqh((char[]) null);
            eqhVar2.f(16);
            eqhVar2.b = dmk.c;
            map4.put("AES128_GCM_SIV_RAW", eqhVar2.e());
            eqh eqhVar3 = new eqh((char[]) null);
            eqhVar3.f(32);
            eqhVar3.b = dmk.a;
            map4.put("AES256_GCM_SIV", eqhVar3.e());
            eqh eqhVar4 = new eqh((char[]) null);
            eqhVar4.f(32);
            eqhVar4.b = dmk.c;
            map4.put("AES256_GCM_SIV_RAW", eqhVar4.e());
            drrVar4.b(DesugarCollections.unmodifiableMap(map4));
            drp.a.a(dmj.c, dml.class);
            drn.a.c(dmj.b, dml.class);
            dra.a.b(dmj.d, true);
        }
        dsa dsaVar3 = dmn.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        drx drxVar5 = dny.a;
        drt drtVar5 = drt.a;
        drtVar5.e(dny.a);
        drtVar5.f(dny.b);
        drtVar5.g(dny.c);
        drtVar5.h(dny.d);
        drs.a.b(dmn.a);
        drn.a.c(dmn.b, dmp.class);
        drr drrVar5 = drr.a;
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new dmp(dmo.a));
        map5.put("CHACHA20_POLY1305_RAW", new dmp(dmo.c));
        drrVar5.b(DesugarCollections.unmodifiableMap(map5));
        dra.a.b(dmn.c, true);
        dsa dsaVar4 = dmq.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        drx drxVar6 = dmw.a;
        drt drtVar6 = drt.a;
        drtVar6.e(dmw.a);
        drtVar6.f(dmw.b);
        drtVar6.g(dmw.c);
        drtVar6.h(dmw.d);
        drs.a.b(dmq.a);
        drn.a.c(dmq.c, dmv.class);
        dra.a.b(dmq.b, true);
        dkz dkzVar = dms.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        drx drxVar7 = dnf.a;
        drt drtVar7 = drt.a;
        drtVar7.e(dnf.a);
        drtVar7.f(dnf.b);
        drtVar7.g(dnf.c);
        drtVar7.h(dnf.d);
        drn.a.c(dms.b, dna.class);
        drs.a.b(dms.c);
        dra.a.b(dms.a, true);
        dsa dsaVar5 = dnn.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        drx drxVar8 = dol.a;
        drt drtVar8 = drt.a;
        drtVar8.e(dol.a);
        drtVar8.f(dol.b);
        drtVar8.g(dol.c);
        drtVar8.h(dol.d);
        drs.a.b(dnn.a);
        drr drrVar6 = drr.a;
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new dnp(dno.a));
        map6.put("XCHACHA20_POLY1305_RAW", new dnp(dno.c));
        drrVar6.b(DesugarCollections.unmodifiableMap(map6));
        drn.a.c(dnn.d, dnp.class);
        drp.a.a(dnn.c, dnp.class);
        dra.a.b(dnn.b, true);
        drx drxVar9 = doj.a;
        drt drtVar9 = drt.a;
        drtVar9.e(doj.a);
        drtVar9.f(doj.b);
        drtVar9.g(doj.c);
        drtVar9.h(doj.d);
        drr drrVar7 = drr.a;
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", dnh.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", dnh.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", dnh.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", dnh.j);
        drrVar7.b(DesugarCollections.unmodifiableMap(map7));
        drs.a.b(dnj.b);
        drn.a.c(dnj.a, dnl.class);
    }
}
