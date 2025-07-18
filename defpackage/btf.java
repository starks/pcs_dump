package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class btf extends akh implements btg {
    public btf() {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 6) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            b(bArrCreateByteArray, i3);
        } else {
            if (i != 7) {
                return false;
            }
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            a(bArrCreateByteArray2);
        }
        parcel2.writeNoException();
        return true;
    }
}
