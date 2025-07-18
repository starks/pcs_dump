package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnt extends akg implements bnu {
    public bnt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    @Override // defpackage.bnu
    public final bnq a(String str, bnj bnjVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        aki.b(parcelObtainAndWriteInterfaceToken, bnjVar);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        bnq bnqVar = (bnq) aki.a(parcelTransactAndReadException, bnq.CREATOR);
        parcelTransactAndReadException.recycle();
        return bnqVar;
    }

    @Override // defpackage.bnu
    public final void b() {
        transactOneway(3, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.bnu
    public final void c(String str) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bnu
    public final byte[] d(Map map) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeMap(map);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        byte[] bArrCreateByteArray = parcelTransactAndReadException.createByteArray();
        parcelTransactAndReadException.recycle();
        return bArrCreateByteArray;
    }
}
