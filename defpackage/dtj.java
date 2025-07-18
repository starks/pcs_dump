package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtj implements dsu {
    private static final int a = doo.a;

    public dtj() throws GeneralSecurityException {
        if (!doo.a(a)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
