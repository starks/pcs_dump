package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bki extends akh implements bkj {
    public bki() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) aki.a(parcel, Status.CREATOR);
        enforceNoDataAvail(parcel);
        a(status);
        return true;
    }
}
