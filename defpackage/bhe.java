package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhe extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(11);
    public final int a;
    public final int b;
    public final int c;

    public bhe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, i2);
        bnh.j(parcel, 2, this.b);
        bnh.j(parcel, 3, this.c);
        bnh.e(parcel, iC);
    }
}
