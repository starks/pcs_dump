package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzq extends akg implements bzr {
    public bzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // defpackage.bzr
    public final void a(bzu bzuVar, bzp bzpVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, bzuVar);
        aki.d(parcelObtainAndWriteInterfaceToken, bzpVar);
        transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
    }
}
