package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blz implements bma {
    private final IBinder a;

    public blz(IBinder iBinder) {
        this.a = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bma
    public final void a(bly blyVar, blm blmVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(blyVar);
            parcelObtain.writeInt(1);
            bji.a(blmVar, parcelObtain, 0);
            this.a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
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
