package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwt {
    private final byte[] a;

    private dwt(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static dwt b(byte[] bArr) {
        if (bArr != null) {
            return new dwt(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwt) {
            return Arrays.equals(((dwt) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + dcr.X(this.a) + ")";
    }
}
