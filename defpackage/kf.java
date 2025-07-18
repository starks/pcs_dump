package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kf extends wo {
    public static final Parcelable.Creator CREATOR = new lh(1);
    public Parcelable a;

    public kf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? jy.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.wo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public kf(Parcelable parcelable) {
        super(parcelable);
    }
}
