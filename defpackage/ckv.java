package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckv implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public ckv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new coz(parcel, null) : new cmq(parcel, null) : new clb(parcel, null) : new cjt(parcel, null) : new ckw(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new coz[i] : new cmq[i] : new clb[i] : new cjt[i] : new ckw[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new ckw(parcel, classLoader);
        }
        if (i == 1) {
            return new cjt(parcel, classLoader);
        }
        if (i == 2) {
            return new clb(parcel, classLoader);
        }
        if (i != 3) {
            return new coz(parcel, classLoader);
        }
        return new cmq(parcel, classLoader);
    }
}
