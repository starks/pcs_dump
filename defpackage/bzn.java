package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzn extends bmr implements bjh {
    public static final Parcelable.Creator CREATOR = new byl(5);
    final int a;
    public int b;
    public Intent c;

    public bzn(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.a);
        bnh.j(parcel, 2, this.b);
        bnh.r(parcel, 3, this.c, i);
        bnh.e(parcel, iC);
    }

    public bzn() {
        this(2, 0, null);
    }
}
