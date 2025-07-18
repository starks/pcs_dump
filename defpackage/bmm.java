package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmm extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(9);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public bmm(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, i2);
        bnh.f(parcel, 2, this.b);
        bnh.f(parcel, 3, this.c);
        bnh.j(parcel, 4, this.d);
        bnh.j(parcel, 5, this.e);
        bnh.e(parcel, iC);
    }
}
