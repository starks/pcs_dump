package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auv extends ava {
    private static final aso k = new aso();
    public static final Parcelable.Creator CREATOR = new apz(5);

    public auv(int i, aux auxVar, String str, int i2, long j, long j2, Instant instant, long j3, ajc ajcVar) {
        super(i, auxVar, str, i2, j, j2, instant, j3, ajcVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(ayg.e(this.j));
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeLong(this.h);
        parcel.writeByteArray(this.i.toByteArray());
    }
}
