package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvv implements dwm {
    public static final int b = doo.b;
    private static final ThreadLocal c = new dvu();
    public final int a;
    private final SecretKeySpec d;
    private final int e;

    public dvv(byte[] bArr, int i) throws GeneralSecurityException {
        if (!doo.a(b)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        dws.a(bArr.length);
        this.d = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) c.get()).getBlockSize();
        this.e = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.a = i;
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) c.get();
        int i4 = this.a;
        byte[] bArr4 = new byte[this.e];
        System.arraycopy(bArr3, 0, bArr4, 0, i4);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.d, ivParameterSpec);
        } else {
            cipher.init(2, this.d, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
