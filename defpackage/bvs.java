package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvs extends akg implements bvu {
    public bvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }

    @Override // defpackage.bvu
    public final int a() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        int i = parcelTransactAndReadException.readInt();
        parcelTransactAndReadException.recycle();
        return i;
    }

    @Override // defpackage.bvu
    public final void b(bqg bqgVar, boolean z, List list, bkj bkjVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, bqgVar);
        parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        parcelObtainAndWriteInterfaceToken.writeTypedList(list);
        aki.d(parcelObtainAndWriteInterfaceToken, bkjVar);
        transactOneway(3, parcelObtainAndWriteInterfaceToken);
    }
}
