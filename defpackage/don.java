package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class don implements dks {
    private static final byte[] a = dcr.Y("7a806c");
    private static final byte[] b = dcr.Y("46bb91c3c5");
    private static final byte[] c = dcr.Y("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] d = dcr.Y("bae8e37fc83441b16034566b");
    private static final byte[] e = dcr.Y("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    static {
        new dom();
    }

    public don(byte[] bArr) throws InvalidAlgorithmParameterException {
        dws.a(bArr.length);
        new SecretKeySpec(bArr, "AES");
    }

    public static boolean c(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = d;
            cipher.init(2, new SecretKeySpec(c, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(b);
            byte[] bArr2 = e;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), a);
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
