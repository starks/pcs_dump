package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzs extends bmr implements bjh {
    public static final Parcelable.Creator CREATOR = new byl(6);
    public final List a;
    public final String b;

    public bzs(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iC = bnh.c(parcel);
        bnh.u(parcel, 1, list);
        bnh.s(parcel, 2, this.b);
        bnh.e(parcel, iC);
    }
}
