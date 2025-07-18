package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtk implements dsu {
    private static final int a = doo.b;

    public dtk() throws GeneralSecurityException {
        if (!doo.a(a)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
