package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efn {
    static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        eee.K(bArr);
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean c(egi egiVar) {
        if (!(egiVar instanceof edh)) {
            return false;
        }
        throw null;
    }

    static void d(Object obj) {
        obj.getClass();
    }

    static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("messageType");
        }
    }
}
