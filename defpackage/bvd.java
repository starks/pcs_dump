package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvd extends akg implements bve {
    public bvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
    }

    @Override // defpackage.bve
    public final bvc a(byte[] bArr, bpf bpfVar, int i, int i2, double d) {
        bvc bvbVar;
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        parcelObtainAndWriteInterfaceToken.writeInt(i2);
        parcelObtainAndWriteInterfaceToken.writeDouble(d);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
        if (strongBinder == null) {
            bvbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestHandle");
            bvbVar = iInterfaceQueryLocalInterface instanceof bvc ? (bvc) iInterfaceQueryLocalInterface : new bvb(strongBinder);
        }
        parcelTransactAndReadException.recycle();
        return bvbVar;
    }
}
