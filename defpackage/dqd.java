package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqd {
    public static final byte[] a = new byte[0];

    public static dqc a(dpf dpfVar) throws GeneralSecurityException {
        dli dliVar = dpfVar.f;
        if (dliVar instanceof dmh) {
            return new dqa((dmh) dliVar);
        }
        if (dliVar instanceof dlx) {
            return new dqb((dlx) dliVar, 1);
        }
        if (dliVar instanceof dot) {
            return new dqb((dot) dliVar, 0);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(String.valueOf(dliVar))));
    }
}
