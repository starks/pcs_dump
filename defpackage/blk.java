package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blk extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(4);
    public final bmm a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public blk(bmm bmmVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = bmmVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bmm bmmVar = this.a;
        int iC = bnh.c(parcel);
        bnh.r(parcel, 1, bmmVar, i);
        bnh.f(parcel, 2, this.b);
        bnh.f(parcel, 3, this.c);
        bnh.p(parcel, 4, this.d);
        bnh.j(parcel, 5, this.e);
        bnh.p(parcel, 6, this.f);
        bnh.e(parcel, iC);
    }
}
