package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class doc {
    int[] a;
    private final int b;

    public doc(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = dnz.d(bArr);
        this.b = i;
    }

    private final void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferC = c(bArr, this.b + i2);
            if (i2 == i) {
                dcr.ak(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                dcr.ak(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    final ByteBuffer c(byte[] bArr, int i) {
        int[] iArrB = b(dnz.d(bArr), i);
        int[] iArr = (int[]) iArrB.clone();
        dnz.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrB[i2] = iArrB[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public final byte[] e(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
