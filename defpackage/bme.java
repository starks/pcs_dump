package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bme extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(6);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public bme(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, i2);
        bnh.j(parcel, 2, this.b);
        bnh.j(parcel, 3, this.c);
        bnh.k(parcel, 4, this.d);
        bnh.k(parcel, 5, this.e);
        bnh.s(parcel, 6, this.f);
        bnh.s(parcel, 7, this.g);
        bnh.j(parcel, 8, this.h);
        bnh.j(parcel, 9, this.i);
        bnh.e(parcel, iC);
    }
}
