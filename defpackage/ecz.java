package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecz extends bmr {
    public static final Parcelable.Creator CREATOR = new byl(13);
    public final String a;
    public final List b;

    public ecz(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.w(parcel, 2, this.b);
        bnh.e(parcel, iC);
    }
}
