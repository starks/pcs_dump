package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apn extends akg implements apo {
    public apn(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.fl.brella.api.IExampleStoreIterator");
    }

    @Override // defpackage.apo
    public final void a(apq apqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, apqVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
