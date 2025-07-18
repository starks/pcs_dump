package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dok implements dks {
    private static final int a = doo.a;

    public dok(byte[] bArr) throws GeneralSecurityException {
        if (!doo.a(a)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!c()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
    }

    public static boolean c() {
        return dnx.c() != null;
    }

    @Override // defpackage.dks
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.dks
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
