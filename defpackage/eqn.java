package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqn implements epb {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private static boolean c(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    @Override // defpackage.epb
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new String(bArr, 0);
            }
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                break;
            }
            i++;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 >= length2) {
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), StandardCharsets.UTF_8);
            }
            int i3 = i2 + 1;
            if (bArr[i2] == 37 && i2 + 2 < length2) {
                try {
                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i3, 2, StandardCharsets.US_ASCII), 16));
                    i2 += 3;
                } catch (NumberFormatException unused) {
                }
            }
            byteBufferAllocate.put(bArr[i2]);
            i2 = i3;
        }
    }

    @Override // defpackage.epb
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (c(bytes[i])) {
                byte[] bArr = new byte[((length - i) * 3) + i];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    int i3 = i2 + 1;
                    byte b = bytes[i];
                    if (c(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = a;
                        bArr[i3] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2 = i3;
                    }
                    i++;
                }
                return Arrays.copyOf(bArr, i2);
            }
            i++;
        }
    }
}
