package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtc {

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
        drs.a.c(dtg.a);
        drs.a.b(dtg.b);
        drs.a.c(dsw.a);
        if (!doo.a(dsy.f)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        drx drxVar = dtl.a;
        drt drtVar = drt.a;
        drtVar.e(dtl.a);
        drtVar.f(dtl.b);
        drtVar.g(dtl.c);
        drtVar.h(dtl.d);
        drs.a.b(dsy.a);
        drs.a.b(dsy.b);
        drr drrVar = drr.a;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", dth.a);
        enh enhVar = new enh((byte[]) null, (byte[]) null);
        enhVar.g(32);
        enhVar.h(16);
        enhVar.a = dta.d;
        enhVar.b = dsz.c;
        map.put("HMAC_SHA256_128BITTAG_RAW", enhVar.f());
        enh enhVar2 = new enh((byte[]) null, (byte[]) null);
        enhVar2.g(32);
        enhVar2.h(32);
        enhVar2.a = dta.a;
        enhVar2.b = dsz.c;
        map.put("HMAC_SHA256_256BITTAG", enhVar2.f());
        enh enhVar3 = new enh((byte[]) null, (byte[]) null);
        enhVar3.g(32);
        enhVar3.h(32);
        enhVar3.a = dta.d;
        enhVar3.b = dsz.c;
        map.put("HMAC_SHA256_256BITTAG_RAW", enhVar3.f());
        enh enhVar4 = new enh((byte[]) null, (byte[]) null);
        enhVar4.g(64);
        enhVar4.h(16);
        enhVar4.a = dta.a;
        enhVar4.b = dsz.e;
        map.put("HMAC_SHA512_128BITTAG", enhVar4.f());
        enh enhVar5 = new enh((byte[]) null, (byte[]) null);
        enhVar5.g(64);
        enhVar5.h(16);
        enhVar5.a = dta.d;
        enhVar5.b = dsz.e;
        map.put("HMAC_SHA512_128BITTAG_RAW", enhVar5.f());
        enh enhVar6 = new enh((byte[]) null, (byte[]) null);
        enhVar6.g(64);
        enhVar6.h(32);
        enhVar6.a = dta.a;
        enhVar6.b = dsz.e;
        map.put("HMAC_SHA512_256BITTAG", enhVar6.f());
        enh enhVar7 = new enh((byte[]) null, (byte[]) null);
        enhVar7.g(64);
        enhVar7.h(32);
        enhVar7.a = dta.d;
        enhVar7.b = dsz.e;
        map.put("HMAC_SHA512_256BITTAG_RAW", enhVar7.f());
        map.put("HMAC_SHA512_512BITTAG", dth.b);
        enh enhVar8 = new enh((byte[]) null, (byte[]) null);
        enhVar8.g(64);
        enhVar8.h(64);
        enhVar8.a = dta.d;
        enhVar8.b = dsz.e;
        map.put("HMAC_SHA512_512BITTAG_RAW", enhVar8.f());
        drrVar.b(DesugarCollections.unmodifiableMap(map));
        drn.a.c(dsy.e, dtb.class);
        drp.a.a(dsy.d, dtb.class);
        dra.a.c(dsy.c, dsy.f, true);
        if (dop.a()) {
            return;
        }
        drm drmVar = dsr.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        drx drxVar2 = dti.a;
        drt drtVar2 = drt.a;
        drtVar2.e(dti.a);
        drtVar2.f(dti.b);
        drtVar2.g(dti.c);
        drtVar2.h(dti.d);
        drn.a.c(dsr.a, dst.class);
        drs.a.b(dsr.b);
        drs.a.b(dsr.c);
        drr drrVar2 = drr.a;
        HashMap map2 = new HashMap();
        map2.put("AES_CMAC", dth.c);
        map2.put("AES256_CMAC", dth.c);
        euw euwVar = new euw((byte[]) null, (byte[]) null);
        euwVar.d(32);
        euwVar.e(16);
        euwVar.c = dss.d;
        map2.put("AES256_CMAC_RAW", euwVar.c());
        drrVar2.b(DesugarCollections.unmodifiableMap(map2));
        dra.a.b(dsr.d, true);
    }
}
