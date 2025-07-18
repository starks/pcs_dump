package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drn {
    private final Map c = new HashMap();
    private static final drm b = new dlz(12);
    public static final drn a = d();

    public static drg b(drh drhVar, Integer num) throws GeneralSecurityException {
        dve dveVar = drhVar.a.b;
        dkz dkzVarA = dra.a.a(dveVar.b);
        dra draVar = dra.a;
        if (!((Boolean) draVar.b.get(dveVar.b)).booleanValue()) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        dvc dvcVarA = dkzVarA.a(dveVar.c);
        String str = dvcVarA.b;
        eea eeaVar = dvcVarA.c;
        dvb dvbVarB = dvb.b(dvcVarA.d);
        if (dvbVarB == null) {
            dvbVarB = dvb.UNRECOGNIZED;
        }
        dvn dvnVarB = dvn.b(dveVar.d);
        if (dvnVarB == null) {
            dvnVarB = dvn.UNRECOGNIZED;
        }
        return new drg(dsf.a(str, eeaVar, dvbVarB, dvnVarB, num), dln.a);
    }

    private static drn d() {
        drn drnVar = new drn();
        try {
            drnVar.c(b, drh.class);
            return drnVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized dky a(dli dliVar, Integer num) {
        drm drmVar;
        drmVar = (drm) this.c.get(dliVar.getClass());
        if (drmVar == null) {
            throw new GeneralSecurityException(a.H(dliVar, "Cannot create a new key for parameters ", ": no key creator for this class was registered."));
        }
        return drmVar.a(dliVar, num);
    }

    public final synchronized void c(drm drmVar, Class cls) {
        drm drmVar2 = (drm) this.c.get(cls);
        if (drmVar2 != null && !drmVar2.equals(drmVar)) {
            throw new GeneralSecurityException(a.G(cls, "Different key creator for parameters class ", " already inserted"));
        }
        this.c.put(cls, drmVar);
    }
}
