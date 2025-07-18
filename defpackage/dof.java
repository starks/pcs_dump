package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dof {
    private static final int b = doo.a;
    public final SecretKey a;

    public dof(byte[] bArr) throws GeneralSecurityException {
        if (!doo.a(b)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!a()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = new SecretKeySpec(bArr, "ChaCha20");
    }

    public static boolean a() {
        return dnx.c() != null;
    }
}
