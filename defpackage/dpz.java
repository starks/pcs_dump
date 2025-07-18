package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpz implements dqf {
    @Override // defpackage.dqf
    public final int a() {
        return 32;
    }

    @Override // defpackage.dqf
    public final byte[] b() {
        return dql.k;
    }

    @Override // defpackage.dqf
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException(a.x(32, "Unexpected key length: "));
        }
        if (!dof.a()) {
            return new dod(bArr).c(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
        dof dofVar = new dof(bArr);
        if (bArr3 == null) {
            throw new NullPointerException("ciphertext is null");
        }
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        int length = bArr3.length;
        if (length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        SecretKey secretKey = dofVar.a;
        Cipher cipherC = dnx.c();
        cipherC.init(2, secretKey, ivParameterSpec);
        return cipherC.doFinal(bArr3, i, length - i);
    }

    @Override // defpackage.dqf
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException(a.x(32, "Unexpected key length: "));
        }
        if (!dof.a()) {
            dod dodVar = new dod(bArr);
            int length = bArr3.length;
            if (length > 2147483631) {
                throw new GeneralSecurityException("plaintext too long");
            }
            int i2 = Integer.MAX_VALUE - i;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
            dodVar.b(byteBufferAllocate, bArr2, bArr3, bArr4);
            byte[] bArrArray = byteBufferAllocate.array();
            int length2 = bArrArray.length;
            if (length2 > i2) {
                throw new InvalidAlgorithmParameterException("Plaintext too long");
            }
            byte[] bArr5 = new byte[i + length2];
            System.arraycopy(bArrArray, 0, bArr5, i, length2);
            return bArr5;
        }
        dof dofVar = new dof(bArr);
        if (bArr3 == null) {
            throw new NullPointerException("plaintext is null");
        }
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        int i3 = Integer.MAX_VALUE - i;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        SecretKey secretKey = dofVar.a;
        Cipher cipherC = dnx.c();
        cipherC.init(1, secretKey, ivParameterSpec);
        int length3 = bArr3.length;
        int outputSize = cipherC.getOutputSize(length3);
        if (outputSize > i3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr6 = new byte[i + outputSize];
        if (cipherC.doFinal(bArr3, 0, length3, bArr6, i) == outputSize) {
            return bArr6;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
