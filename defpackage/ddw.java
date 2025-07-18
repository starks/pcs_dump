package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddw extends ddy implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public ddw(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.ddy
    public final int a() {
        int length = this.a.length;
        clq.H(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.ddy
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.ddy
    public final long c() {
        int length = this.a.length;
        clq.H(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.ddy
    public final boolean d(ddy ddyVar) {
        if (this.a.length != ddyVar.f().length) {
            return false;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == ddyVar.f()[i];
            i++;
        }
    }

    @Override // defpackage.ddy
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.ddy
    public final byte[] f() {
        return this.a;
    }
}
