package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dql {
    public static final byte[] a = b(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;

    static {
        b(1, 2);
        b = b(2, 32);
        c = b(2, 16);
        d = b(2, 17);
        e = b(2, 18);
        f = b(2, 1);
        g = b(2, 2);
        h = b(2, 3);
        i = b(2, 1);
        j = b(2, 2);
        k = b(2, 3);
        l = new byte[0];
        n = "KEM".getBytes(dsp.a);
        m = "HPKE".getBytes(dsp.a);
        o = "HPKE-v1".getBytes(dsp.a);
    }

    public static int a(dpl dplVar) throws GeneralSecurityException {
        if (dplVar == dpl.f || dplVar == dpl.a) {
            return 32;
        }
        if (dplVar == dpl.b) {
            return 48;
        }
        if (dplVar == dpl.c) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static byte[] b(int i2, int i3) {
        if (i3 < 0 || i3 >= (1 << (i2 * 8))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        }
        return bArr;
    }

    static byte[] c(byte[] bArr) {
        return dcr.al(n, bArr);
    }

    public static byte[] d(String str, byte[] bArr, byte[] bArr2) {
        return dcr.al(o, bArr2, str.getBytes(dsp.a), bArr);
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2, int i2) {
        return dcr.al(b(2, i2), o, bArr2, str.getBytes(dsp.a), bArr);
    }
}
