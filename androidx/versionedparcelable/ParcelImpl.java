package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.air;
import defpackage.ais;
import defpackage.f;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new f(19);
    private final ais a;

    public ParcelImpl(Parcel parcel) {
        this.a = new air(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new air(parcel).k(this.a);
    }
}
