package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpr extends akg implements bps {
    public bpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // defpackage.bps
    public final int a() {
        Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }

    @Override // defpackage.bps
    public final int b(bpf bpfVar, String str, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }

    @Override // defpackage.bps
    public final int c(bpf bpfVar, String str, boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }

    @Override // defpackage.bps
    public final bpf d(bpf bpfVar, String str, int i) {
        bpf bpdVar;
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
        if (strongBinder == null) {
            bpdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
        }
        parcelTransactAndReadException.recycle();
        return bpdVar;
    }

    @Override // defpackage.bps
    public final bpf e(bpf bpfVar, String str, int i, bpf bpfVar2) {
        bpf bpdVar;
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar2);
        Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
        IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
        if (strongBinder == null) {
            bpdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
        }
        parcelTransactAndReadException.recycle();
        return bpdVar;
    }

    @Override // defpackage.bps
    public final bpf f(bpf bpfVar, String str, int i) {
        bpf bpdVar;
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
        IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
        if (strongBinder == null) {
            bpdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
        }
        parcelTransactAndReadException.recycle();
        return bpdVar;
    }

    @Override // defpackage.bps
    public final bpf g(bpf bpfVar, String str, boolean z, long j) {
        bpf bpdVar;
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bpfVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
        IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
        if (strongBinder == null) {
            bpdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(strongBinder);
        }
        parcelTransactAndReadException.recycle();
        return bpdVar;
    }
}
