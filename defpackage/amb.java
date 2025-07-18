package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.TarsResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amb extends akg implements amc {
    public amb(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.ai.aidl.PccTarsResultCallback");
    }

    @Override // defpackage.amc
    public final void a(int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.amc
    public final void b(TarsResult tarsResult) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, tarsResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
