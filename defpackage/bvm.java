package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvm extends akg implements bvo {
    public bvm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
    }

    @Override // defpackage.bvo
    public final bpf a(String str) {
        bpf bpdVar;
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
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

    @Override // defpackage.bvo
    public final void b(boolean z) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i = aki.a;
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bvo
    public final boolean c() {
        Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }

    @Override // defpackage.bvo
    public final boolean d() {
        Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }

    @Override // defpackage.bvo
    public final boolean e() {
        Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }

    @Override // defpackage.bvo
    public final boolean f() {
        Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        boolean zE = aki.e(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zE;
    }
}
