package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bif extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(15);
    public final boolean a;
    public final boolean b;

    public bif(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iC = bnh.c(parcel);
        bnh.f(parcel, 1, z);
        bnh.f(parcel, 2, this.b);
        bnh.e(parcel, iC);
    }
}
