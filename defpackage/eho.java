package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class eho {
    static final String d(ByteBuffer byteBuffer, int i, int i2) throws efp {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (!ebz.t(b)) {
                break;
            }
            i++;
            ebz.q(b, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (ebz.t(b2)) {
                ebz.q(b2, cArr, i6);
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (ebz.t(b3)) {
                        i++;
                        ebz.q(b3, cArr, i6);
                        i6++;
                    }
                }
            } else {
                if (ebz.v(b2)) {
                    if (i7 >= i4) {
                        throw new efp("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    ebz.s(b2, byteBuffer.get(i7), cArr, i6);
                } else if (ebz.u(b2)) {
                    if (i7 >= i4 - 1) {
                        throw new efp("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    ebz.r(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new efp("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    ebz.p(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public abstract int a(String str, byte[] bArr, int i, int i2);

    public abstract String b(byte[] bArr, int i, int i2);

    public abstract String c(ByteBuffer byteBuffer, int i, int i2);

    public abstract int e(byte[] bArr, int i, int i2);
}
