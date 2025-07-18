package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byk extends bmr implements Comparable {
    public static final Parcelable.Creator CREATOR = new byl(0);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public byk(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    final void a(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str = this.e;
            aso.F(str);
            sb.append(str);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError("Invalid type: " + this.a + ", " + i);
            }
            sb.append("'");
            byte[] bArr = this.f;
            aso.F(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        byk bykVar = (byk) obj;
        int iCompareTo = this.a.compareTo(bykVar.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.g;
        int iB = b(i, bykVar.g);
        if (iB != 0) {
            return iB;
        }
        if (i == 1) {
            long j = this.b;
            long j2 = bykVar.b;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.c;
            if (z == bykVar.c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.d, bykVar.d);
        }
        if (i == 4) {
            String str = this.e;
            String str2 = bykVar.e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(a.x(i, "Invalid enum value: "));
        }
        byte[] bArr = this.f;
        byte[] bArr2 = bykVar.f;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i2 = 0; i2 < Math.min(this.f.length, bykVar.f.length); i2++) {
            int i3 = this.f[i2] - bykVar.f[i2];
            if (i3 != 0) {
                return i3;
            }
        }
        return b(this.f.length, bykVar.f.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof byk) {
            byk bykVar = (byk) obj;
            if (a.g(this.a, bykVar.a) && (i = this.g) == bykVar.g && this.h == bykVar.h && this.i == bykVar.i) {
                if (i != 1) {
                    if (i == 2) {
                        return this.c == bykVar.c;
                    }
                    if (i == 3) {
                        return this.d == bykVar.d;
                    }
                    if (i == 4) {
                        return a.g(this.e, bykVar.e);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.f, bykVar.f);
                    }
                    throw new AssertionError(a.x(i, "Invalid enum value: "));
                }
                if (this.b == bykVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        String str = this.a;
        if (!byl.b(str)) {
            bnh.s(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            bnh.k(parcel, 3, j);
        }
        if (this.c) {
            bnh.f(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            bnh.g(parcel, 5, d);
        }
        String str2 = this.e;
        if (!byl.b(str2)) {
            bnh.s(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!byl.b(bArr)) {
            bnh.m(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!byl.a(i2)) {
            bnh.j(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!byl.a(i3)) {
            bnh.j(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!byl.a(i4)) {
            bnh.j(parcel, 10, i4);
        }
        bnh.e(parcel, iC);
    }
}
