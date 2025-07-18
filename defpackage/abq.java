package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abq extends abg {
    public static final Parcelable.Creator CREATOR = new f(15);
    public final int a;

    public abq(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public abq(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
