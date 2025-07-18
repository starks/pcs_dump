package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhh extends akg implements bhi {
    public bhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // defpackage.bhi
    public final void a(bhg bhgVar, bgy bgyVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bhgVar);
        aki.b(parcelObtainAndWriteInterfaceToken, bgyVar);
        transactOneway(8, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bhi
    public final void b(bhg bhgVar, bgu bguVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bhgVar);
        aki.b(parcelObtainAndWriteInterfaceToken, bguVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
