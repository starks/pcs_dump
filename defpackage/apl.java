package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apl extends akg implements apm {
    public apl(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.fl.brella.api.IExampleStore");
    }

    @Override // defpackage.apm
    public final void a(String str, byte[] bArr, byte[] bArr2, apu apuVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
        aki.d(parcelObtainAndWriteInterfaceToken, apuVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.apm
    public final void b(String str, byte[] bArr, byte[] bArr2, apu apuVar, byte[] bArr3) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
        aki.d(parcelObtainAndWriteInterfaceToken, apuVar);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr3);
        transactOneway(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.apm
    public final boolean c() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }
}
