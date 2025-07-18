package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqa implements dqc {
    private final int a;

    public dqa(dmh dmhVar) throws GeneralSecurityException {
        if (dmhVar.b != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (dmhVar.c != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (dmhVar.d != dmg.c) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.a = dmhVar.a;
    }

    @Override // defpackage.dqc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dqc
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.a) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey secretKeyD = dnt.d(bArr);
        if (length < i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = dnt.b(bArr2, i, 12);
        Cipher cipherC = dnt.c();
        cipherC.init(2, secretKeyD, algorithmParameterSpecB);
        return cipherC.doFinal(bArr2, i + 12, (length - i) - 12);
    }

    @Override // defpackage.dqc
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.a) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey secretKeyD = dnt.d(bArr);
        byte[] bArrB = dsi.b(12);
        AlgorithmParameterSpec algorithmParameterSpecA = dnt.a(bArrB);
        Cipher cipherC = dnt.c();
        cipherC.init(1, secretKeyD, algorithmParameterSpecA);
        int length = bArr4.length;
        int outputSize = cipherC.getOutputSize(length);
        int length2 = bArr2.length;
        int length3 = bArr3.length;
        int i = length2 + length3;
        if (outputSize > 2147483635 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = i + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i2 + outputSize);
        System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
        System.arraycopy(bArrB, 0, bArrCopyOf, i, 12);
        if (cipherC.doFinal(bArr4, 0, length, bArrCopyOf, i2) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
