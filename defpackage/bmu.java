package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmu extends akg implements bmv {
    public bmu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // defpackage.bmv
    public final void a(bmo bmoVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, bmoVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
