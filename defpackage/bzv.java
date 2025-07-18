package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzv extends bmr {
    public static final Parcelable.Creator CREATOR = new byl(8);
    final int a;
    public final bho b;
    public final bmk c;

    public bzv(int i, bho bhoVar, bmk bmkVar) {
        this.a = i;
        this.b = bhoVar;
        this.c = bmkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.a);
        bnh.r(parcel, 2, this.b, i);
        bnh.r(parcel, 3, this.c, i);
        bnh.e(parcel, iC);
    }
}
