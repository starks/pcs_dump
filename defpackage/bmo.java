package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmo extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(10);
    public final int a;
    public List b;

    public bmo(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, i2);
        bnh.w(parcel, 2, this.b);
        bnh.e(parcel, iC);
    }
}
