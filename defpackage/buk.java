package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buk extends akg implements bum {
    public buk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    @Override // defpackage.bum
    public final void a(String str, bpf bpfVar, bpf bpfVar2, buj bujVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar2);
        aki.d(parcelObtainAndWriteInterfaceToken, bujVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bum
    public final void b(String str, bpf bpfVar, bpf bpfVar2, buj bujVar, bpf bpfVar3) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar2);
        aki.d(parcelObtainAndWriteInterfaceToken, bujVar);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar3);
        transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bum
    public final boolean c() {
        Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }
}
