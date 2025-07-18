package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwc extends fvn {
    public final transient byte[][] f;
    public final transient int[] g;

    public fwc(byte[][] bArr, int[] iArr) {
        super(fvn.a.b);
        this.f = bArr;
        this.g = iArr;
    }

    private final fvn p() {
        return new fvn(m());
    }

    private final Object writeReplace() {
        return p();
    }

    @Override // defpackage.fvn
    public final byte a(int i) {
        fwv.m(this.g[this.f.length - 1], i, 1L);
        int iA = fwv.a(this, i);
        int i2 = iA == 0 ? 0 : this.g[iA - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[iA][(i - i2) + iArr[bArr.length + iA]];
    }

    @Override // defpackage.fvn
    public final int b() {
        return this.g[this.f.length - 1];
    }

    @Override // defpackage.fvn
    public final String d() {
        return p().d();
    }

    @Override // defpackage.fvn
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fvn) {
            fvn fvnVar = (fvn) obj;
            return fvnVar.b() == b() && n(fvnVar, b());
        }
        return false;
    }

    @Override // defpackage.fvn
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            byte[] bArr3 = bArr2[i2];
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr3[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.fvn
    public final fvn i() {
        return p().i();
    }

    @Override // defpackage.fvn
    public final boolean j(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iA = fwv.a(this, i);
        while (i < i5) {
            if (iA == 0) {
                iA = 0;
                i4 = 0;
            } else {
                i4 = this.g[iA - 1];
            }
            int[] iArr = this.g;
            int i6 = iArr[iA] - i4;
            int i7 = iArr[this.f.length + iA];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!fwv.n(this.f[iA], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.fvn
    public final byte[] l() {
        return m();
    }

    @Override // defpackage.fvn
    public final byte[] m() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.f;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.g;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ffh.ae(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.fvn
    public final boolean n(fvn fvnVar, int i) {
        int i2;
        fvnVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int iA = fwv.a(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iA == 0) {
                iA = 0;
                i2 = 0;
            } else {
                i2 = this.g[iA - 1];
            }
            int[] iArr = this.g;
            int i5 = iArr[iA] - i2;
            int i6 = iArr[this.f.length + iA];
            int iMin = Math.min(i, i5 + i2) - i3;
            if (!fvnVar.j(i4, this.f[iA], i6 + (i3 - i2), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.fvn
    public final void o(fvk fvkVar, int i) {
        int i2;
        int iA = fwv.a(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (iA == 0) {
                iA = 0;
                i2 = 0;
            } else {
                i2 = this.g[iA - 1];
            }
            int[] iArr = this.g;
            int i4 = iArr[iA] - i2;
            int i5 = iArr[this.f.length + iA];
            int iMin = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            fwa fwaVar = new fwa(this.f[iA], i6, i6 + iMin, true);
            fwa fwaVar2 = fvkVar.a;
            if (fwaVar2 == null) {
                fwaVar.g = fwaVar;
                fwaVar.f = fwaVar.g;
                fvkVar.a = fwaVar.f;
            } else {
                fwa fwaVar3 = fwaVar2.g;
                fwaVar3.getClass();
                fwaVar3.d(fwaVar);
            }
            i3 += iMin;
            iA++;
        }
        fvkVar.b += i;
    }

    @Override // defpackage.fvn
    public final String toString() {
        return p().toString();
    }
}
