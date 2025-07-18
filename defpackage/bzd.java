package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzd extends akg implements bze {
    public bzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    @Override // defpackage.bze
    public final void a(bzc bzcVar, String str) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bzcVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bze
    public final void b(bzc bzcVar, byte[] bArr) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bzcVar);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bze
    public final void c(bza bzaVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bzaVar);
        transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bze
    public final void d(bzc bzcVar, String str, int i, String[] strArr, byte[] bArr) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bzcVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bze
    public final void e(String str, byy byyVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        aki.d(parcelObtainAndWriteInterfaceToken, byyVar);
        transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bze
    public final void f(bzc bzcVar, String str, String str2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bzcVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(null);
        transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
    }
}
