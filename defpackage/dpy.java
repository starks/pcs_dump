package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpy implements dqf {
    private final int a;

    public dpy(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(a.x(i, "Unsupported key length: "));
        }
        this.a = i;
    }

    @Override // defpackage.dqf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dqf
    public final byte[] b() throws GeneralSecurityException {
        int i = this.a;
        if (i == 16) {
            return dql.i;
        }
        if (i == 32) {
            return dql.j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // defpackage.dqf
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException(a.x(length, "Unexpected key length: "));
        }
        int i2 = doa.a;
        if (!doo.a(doa.a)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyD = dnt.d(bArr);
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length2 = bArr3.length;
        if (length2 < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = dnt.a(bArr2);
        Cipher cipherC = dnt.c();
        cipherC.init(2, secretKeyD, algorithmParameterSpecA);
        return cipherC.doFinal(bArr3, i, length2 - i);
    }

    @Override // defpackage.dqf
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException(a.x(length, "Unexpected key length: "));
        }
        int i2 = doa.a;
        if (!doo.a(doa.a)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyD = dnt.d(bArr);
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = dnt.a(bArr2);
        Cipher cipherC = dnt.c();
        cipherC.init(1, secretKeyD, algorithmParameterSpecA);
        int length2 = bArr3.length;
        int outputSize = cipherC.getOutputSize(length2);
        if (outputSize > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr5 = new byte[i + outputSize];
        if (cipherC.doFinal(bArr3, 0, length2, bArr5, i) == outputSize) {
            return bArr5;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
