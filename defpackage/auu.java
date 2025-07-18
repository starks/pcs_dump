package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auu extends aux {
    private static final aso e = new aso();
    public static final Parcelable.Creator CREATOR = new apz(4);

    public auu(auj aujVar, auw auwVar, String str) {
        super(aujVar, auwVar, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b.toByteArray());
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
    }
}
