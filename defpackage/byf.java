package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byf extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(20);
    public final byte[] a;

    public byf(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.m(parcel, 2, this.a);
        bnh.e(parcel, iC);
    }
}
