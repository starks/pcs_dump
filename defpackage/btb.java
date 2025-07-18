package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btb extends akg implements btd {
    public btb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
    }

    @Override // defpackage.btd
    public final void a(long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        transactOneway(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.btd
    public final void b(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, byte[] bArr, btg btgVar, long j, byte[] bArr2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(str3);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        int i2 = aki.a;
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeInt(z3 ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        aki.d(parcelObtainAndWriteInterfaceToken, btgVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.btd
    public final void c(String str, byte[] bArr, boolean z, boolean z2, byte[] bArr2, btg btgVar, long j) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        int i = aki.a;
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
        aki.d(parcelObtainAndWriteInterfaceToken, btgVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        transactOneway(5, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.btd
    public final boolean d() {
        Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }
}
