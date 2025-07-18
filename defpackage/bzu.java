package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzu extends bmr {
    public static final Parcelable.Creator CREATOR = new byl(7);
    final int a;
    final bmj b;

    public bzu(int i, bmj bmjVar) {
        this.a = i;
        this.b = bmjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.a);
        bnh.r(parcel, 2, this.b, i);
        bnh.e(parcel, iC);
    }
}
