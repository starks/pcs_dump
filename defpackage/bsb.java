package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsb extends akg implements bsd {
    public bsb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
    }

    @Override // defpackage.bsd
    public final void a(String str, byte[] bArr, byte[] bArr2, bsa bsaVar, byte[] bArr3) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
        aki.d(parcelObtainAndWriteInterfaceToken, bsaVar);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr3);
        transactOneway(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bsd
    public final boolean b() {
        Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }
}
