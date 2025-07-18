package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehi {
    public static final ehi a = new ehi(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    public ehi(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    private static void g(int i, Object obj, fsc fscVar) {
        int iB = ehu.b(i);
        int iA = ehu.a(i);
        if (iB == 0) {
            fscVar.G(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            fscVar.C(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            fscVar.x(iA, (eea) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(new efo());
            }
            fscVar.B(iA, ((Integer) obj).intValue());
        } else {
            fscVar.N(iA);
            ((ehi) obj).f(fscVar);
            fscVar.z(iA);
        }
    }

    public final int a() {
        int iAb;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int iA = ehu.a(i4);
            int iB = ehu.b(i4);
            if (iB == 0) {
                iAb = eei.ab(iA, ((Long) this.d[i3]).longValue());
            } else if (iB == 1) {
                ((Long) this.d[i3]).longValue();
                iAb = eei.au(iA);
            } else if (iB == 2) {
                iAb = eei.G(iA, (eea) this.d[i3]);
            } else if (iB == 3) {
                int iY = eei.Y(iA);
                iAb = iY + iY + ((ehi) this.d[i3]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(new efo());
                }
                ((Integer) this.d[i3]).intValue();
                iAb = eei.at(iA);
            }
            i2 += iAb;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ehi)) {
            return false;
        }
        ehi ehiVar = (ehi) obj;
        int i = this.b;
        if (i == ehiVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = ehiVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = ehiVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void f(fsc fscVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                g(this.c[i], this.d[i], fscVar);
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public ehi() {
        this(0, new int[8], new Object[8], true);
    }
}
