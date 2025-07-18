package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bih extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(19);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final bih f;

    public bih(boolean z, String str, int i, int i2, long j, bih bihVar) {
        this.a = z;
        this.b = str;
        this.c = bfe.e(i) - 1;
        this.d = bdg.c(i2) - 1;
        this.e = j;
        this.f = bihVar;
    }

    public final int a() {
        return bdg.c(this.d);
    }

    public final int b() {
        return bfe.e(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iC = bnh.c(parcel);
        bnh.f(parcel, 1, z);
        bnh.s(parcel, 2, this.b);
        bnh.j(parcel, 3, this.c);
        bnh.j(parcel, 4, this.d);
        bnh.k(parcel, 5, this.e);
        bnh.r(parcel, 6, this.f, i);
        bnh.e(parcel, iC);
    }
}
