package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnt {
    private static final ThreadLocal a = new dns();

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec b(byte[] bArr, int i, int i2) {
        Charset charset = dsp.a;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    public static Cipher c() {
        return (Cipher) a.get();
    }

    public static SecretKey d(byte[] bArr) throws InvalidAlgorithmParameterException {
        dws.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
