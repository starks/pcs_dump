package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnv extends akg implements bnw {
    public bnv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    @Override // defpackage.bnw
    public final bnu a() {
        bnu bntVar;
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
        if (strongBinder == null) {
            bntVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            bntVar = iInterfaceQueryLocalInterface instanceof bnu ? (bnu) iInterfaceQueryLocalInterface : new bnt(strongBinder);
        }
        parcelTransactAndReadException.recycle();
        return bntVar;
    }
}
