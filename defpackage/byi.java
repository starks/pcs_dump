package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byi extends bmr {
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    public final byte[][] k;
    public static final byte[][] a = new byte[0][];
    public static final Parcelable.Creator CREATOR = new byl(1);

    public byi(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
        this.k = bArr7;
    }

    public static byte[][] a(List list, byh byhVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            byi byiVar = (byi) it.next();
            if (byiVar != null && (bArrA2 = byhVar.a(byiVar)) != null) {
                length += bArrA2.length;
            }
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            byi byiVar2 = (byi) it2.next();
            if (byiVar2 != null && (bArrA = byhVar.a(byiVar2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new byo(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.i;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetH = dcr.h(length);
        for (int i : iArr) {
            hashSetH.add(Integer.valueOf(i));
        }
        return hashSetH;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetH = dcr.h(length);
        for (byte[] bArr2 : bArr) {
            aso.F(bArr2);
            hashSetH.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetH;
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            aso.F(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof byi) {
            byi byiVar = (byi) obj;
            if (a.g(this.b, byiVar.b) && a.g(c(), byiVar.c()) && a.g(e(this.d), e(byiVar.d)) && a.g(e(this.e), e(byiVar.e)) && a.g(e(this.f), e(byiVar.f)) && a.g(e(this.g), e(byiVar.g)) && a.g(d(this.h), d(byiVar.h)) && a.g(b(this.j), b(byiVar.j)) && a.g(e(this.k), e(byiVar.k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.b;
        sb.append(str == null ? "null" : a.z(str, "'", "'"));
        sb.append(", direct==");
        byte[] bArr = this.c;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.d);
        sb.append(", ");
        f(sb, "PSEUDO=", this.e);
        sb.append(", ");
        f(sb, "ALWAYS=", this.f);
        sb.append(", ");
        f(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        f(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.j).toArray()));
        sb.append(", ");
        f(sb, "external=", this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 2, this.b);
        bnh.m(parcel, 3, this.c);
        bnh.n(parcel, 4, this.d);
        bnh.n(parcel, 5, this.e);
        bnh.n(parcel, 6, this.f);
        bnh.n(parcel, 7, this.g);
        bnh.p(parcel, 8, this.h);
        bnh.n(parcel, 9, this.i);
        bnh.p(parcel, 10, this.j);
        bnh.n(parcel, 11, this.k);
        bnh.e(parcel, iC);
    }
}
