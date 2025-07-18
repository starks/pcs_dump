package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqb extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(14);
    public final String a;
    public final byte[] b;
    public final int c;
    public final byte[] d;
    public final byte[] e;

    public bqb(String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        if (!clq.O(str) && bArr != null) {
            z = true;
        }
        aso.z(z, "Collection name cannot be null or empty. Selection criteria cannot be null.");
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = bArr2;
        this.e = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqb)) {
            return false;
        }
        bqb bqbVar = (bqb) obj;
        return this.a.equals(bqbVar.a) && Arrays.equals(this.b, bqbVar.b) && this.c == bqbVar.c && Arrays.equals(this.d, bqbVar.d) && Arrays.equals(this.e, bqbVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.m(parcel, 2, this.b);
        bnh.j(parcel, 3, this.c);
        bnh.m(parcel, 4, this.d);
        bnh.m(parcel, 5, this.e);
        bnh.e(parcel, iC);
    }
}
