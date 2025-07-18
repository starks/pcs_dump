package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgu extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(9);
    private static final String[] m = new String[0];
    public final bhm a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final byi[] g;
    public final boolean h;
    public bhl i;
    public final int j;
    public final bhe k;
    public final eix l;
    private final String[] n;

    public bgu(bhm bhmVar, eix eixVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byi[] byiVarArr, boolean z, String[] strArr2, int i, bhe bheVar) {
        this.a = bhmVar;
        this.l = eixVar;
        this.b = bArr;
        this.c = iArr;
        this.d = null;
        this.e = iArr2;
        this.f = null;
        this.g = byiVarArr;
        this.h = z;
        this.n = strArr2;
        this.j = i;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bgu) {
            bgu bguVar = (bgu) obj;
            if (a.g(this.a, bguVar.a) && Arrays.equals(this.b, bguVar.b) && Arrays.equals(this.c, bguVar.c) && Arrays.equals(this.d, bguVar.d) && a.g(this.l, bguVar.l) && Arrays.equals(this.e, bguVar.e) && Arrays.deepEquals(this.f, bguVar.f) && Arrays.equals(this.g, bguVar.g) && Arrays.equals(this.n, bguVar.n) && this.h == bguVar.h && a.g(this.i, bguVar.i) && this.j == bguVar.j && a.g(this.k, bguVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, Boolean.valueOf(this.h), this.n, this.i, Integer.valueOf(this.j), this.k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.l);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.n));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        bhl bhlVar = this.i;
        sb.append(bhlVar != null ? bhlVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.r(parcel, 2, this.a, i);
        bnh.m(parcel, 3, this.b);
        bnh.p(parcel, 4, this.c);
        bnh.t(parcel, 5, this.d);
        bnh.p(parcel, 6, this.e);
        bnh.n(parcel, 7, this.f);
        bnh.f(parcel, 8, this.h);
        bnh.v(parcel, 9, this.g, i);
        bnh.r(parcel, 11, this.i, i);
        String[] strArr = this.n;
        if (strArr == null) {
            strArr = m;
        }
        bnh.t(parcel, 12, strArr);
        bnh.j(parcel, 13, this.j);
        bnh.r(parcel, 14, this.k, i);
        bnh.e(parcel, iC);
    }

    public bgu(bhm bhmVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, byi[] byiVarArr, bhl bhlVar, String[] strArr2, int i, bhe bheVar) {
        this.a = bhmVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = byiVarArr;
        this.i = bhlVar;
        this.n = strArr2;
        this.j = i;
        this.l = null;
        this.k = bheVar;
    }
}
