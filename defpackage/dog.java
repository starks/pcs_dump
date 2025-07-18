package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dog extends doc {
    public dog(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.doc
    public final int a() {
        return 24;
    }

    @Override // defpackage.doc
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = this.a;
        int i2 = dnz.a;
        int[] iArr4 = new int[16];
        dnz.b(iArr4, iArr3);
        iArr4[12] = iArr[0];
        iArr4[13] = iArr[1];
        iArr4[14] = iArr[2];
        iArr4[15] = iArr[3];
        dnz.c(iArr4);
        iArr4[4] = iArr4[12];
        iArr4[5] = iArr4[13];
        iArr4[6] = iArr4[14];
        iArr4[7] = iArr4[15];
        dnz.b(iArr2, Arrays.copyOf(iArr4, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
