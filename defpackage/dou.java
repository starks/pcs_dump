package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dou {
    static {
        dvo dvoVar = dvo.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        drs.a.c(dov.a);
        drs.a.b(dov.b);
        if (dop.a()) {
            return;
        }
        dsa dsaVar = dor.a;
        if (!doo.a(doo.a)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        drx drxVar = dox.a;
        drt drtVar = drt.a;
        drtVar.e(dox.a);
        drtVar.f(dox.b);
        drtVar.g(dox.c);
        drtVar.h(dox.d);
        drs.a.b(dor.a);
        drr drrVar = drr.a;
        HashMap map = new HashMap();
        map.put("AES256_SIV", dow.a);
        eqh eqhVar = new eqh((byte[]) null);
        eqhVar.d(64);
        eqhVar.a = dos.c;
        map.put("AES256_SIV_RAW", eqhVar.c());
        drrVar.b(DesugarCollections.unmodifiableMap(map));
        drp.a.a(dor.c, dot.class);
        drn.a.c(dor.d, dot.class);
        dra.a.b(dor.b, true);
    }
}
