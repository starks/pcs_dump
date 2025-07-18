package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blj extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(3);
    Bundle a;
    bhq[] b;
    int c;
    blk d;

    public blj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.l(parcel, 1, this.a);
        bnh.v(parcel, 2, this.b, i);
        bnh.j(parcel, 3, this.c);
        bnh.r(parcel, 4, this.d, i);
        bnh.e(parcel, iC);
    }

    public blj(Bundle bundle, bhq[] bhqVarArr, int i, blk blkVar) {
        this.a = bundle;
        this.b = bhqVarArr;
        this.c = i;
        this.d = blkVar;
    }
}
