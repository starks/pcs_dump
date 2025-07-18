package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnx implements dks {
    private static final int e = doo.a;
    private static final byte[] a = dcr.Y("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] b = dcr.Y("070000004041424344454647");
    private static final byte[] c = dcr.Y("a0784d7a4716f3feb4f64e7f4b39bf04");
    private static final ThreadLocal d = new dnw();

    public dnx(byte[] bArr) throws GeneralSecurityException {
        if (!doo.a(e)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!d()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        new SecretKeySpec(bArr, "ChaCha20");
    }

    public static Cipher c() {
        return (Cipher) d.get();
    }

    public static boolean d() {
        return d.get() != null;
    }

    public static boolean e(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(b);
            byte[] bArr = a;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = c;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
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
