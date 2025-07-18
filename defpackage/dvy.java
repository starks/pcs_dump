package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvy implements dks {
    public static final int a = doo.a;
    private static final ThreadLocal b = new dvw();
    private final byte[] c;
    private final SecretKeySpec d;

    static {
        new dvx();
    }

    public dvy(byte[] bArr, int i) throws GeneralSecurityException {
        if (!doo.a(a)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        dws.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.d = secretKeySpec;
        Cipher cipher = (Cipher) b.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.c = bArrC;
        c(bArrC);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b2 + b2) ^ ((bArr[i2] & 255) >>> 7)) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
            i = i2;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
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
