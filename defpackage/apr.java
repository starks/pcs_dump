package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apr extends akg implements aps {
    public apr(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.fl.brella.api.IInAppResultHandler");
    }

    @Override // defpackage.aps
    public final void a(apy apyVar, List list, apw apwVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, apyVar);
        parcelObtainAndWriteInterfaceToken.writeInt(1);
        parcelObtainAndWriteInterfaceToken.writeTypedList(list);
        aki.d(parcelObtainAndWriteInterfaceToken, apwVar);
        transactOneway(3, parcelObtainAndWriteInterfaceToken);
    }
}
