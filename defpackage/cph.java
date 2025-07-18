package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cph implements cpi {
    private final IBinder a;

    public cph(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.cpi
    public final byte[] a() {
        Parcel parcelObtain = Parcel.obtain(this.a);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.pd.ISecureService");
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createByteArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
