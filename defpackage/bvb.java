package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvb extends akg implements bvc {
    public bvb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestHandle");
    }

    @Override // defpackage.bvc
    public final void a() {
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.bvc
    public final void b(bva bvaVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bvaVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bvc
    public final void c() {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.bvc
    public final byte[] d() {
        Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        byte[] bArrCreateByteArray = parcelTransactAndReadException.createByteArray();
        parcelTransactAndReadException.recycle();
        return bArrCreateByteArray;
    }
}
