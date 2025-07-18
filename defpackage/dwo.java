package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwo implements dtn {
    public static final int a = doo.a;
    private static final ThreadLocal b = new dwn();
    private final SecretKey c;
    private byte[] d;
    private byte[] e;

    public dwo(byte[] bArr) throws GeneralSecurityException {
        dws.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrAp = dcr.ap(cipherB.doFinal(new byte[16]));
        this.d = bArrAp;
        this.e = dcr.ap(bArrAp);
    }

    private static Cipher b() throws GeneralSecurityException {
        if (doo.a(a)) {
            return (Cipher) b.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // defpackage.dtn
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.c;
        Cipher cipherB = b();
        cipherB.init(1, secretKey);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        byte[] bArrAn = i2 * 16 == length ? dcr.an(bArr, i3 * 16, this.d, 16) : dcr.am(dcr.ao(Arrays.copyOfRange(bArr, i3 * 16, length)), this.e);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i4 = 0; i4 < i3; i4++) {
            c(bArr2, bArr, i4 * 16, bArr3);
            if (cipherB.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        c(bArr2, bArrAn, 0, bArr3);
        if (cipherB.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
