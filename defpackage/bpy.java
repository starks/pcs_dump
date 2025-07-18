package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpy extends bpw {
    public static final Parcelable.Creator CREATOR = new bji(13);
    public final String a;
    public final String b;
    public final int c;
    public final bqi d;
    private final byte[] e;

    public bpy(String str, String str2, int i, bqi bqiVar, byte[] bArr) {
        clq.v(!str.isEmpty());
        clq.v(!str2.isEmpty());
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bqiVar;
        this.e = bArr == null ? new byte[0] : bArr;
    }

    public final byte[] a() {
        byte[] bArr = this.e;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpy)) {
            return false;
        }
        bpy bpyVar = (bpy) obj;
        return a.g(this.a, bpyVar.a) && a.g(this.b, bpyVar.b) && this.c == bpyVar.c && a.g(this.d, bpyVar.d) && Arrays.equals(this.e, bpyVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.s(parcel, 2, this.b);
        bnh.j(parcel, 3, this.c);
        bnh.r(parcel, 4, this.d, i);
        bnh.m(parcel, 5, a());
        bnh.e(parcel, iC);
    }
}
