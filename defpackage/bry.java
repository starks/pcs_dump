package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bry extends akg implements bsa {
    public bry(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
    }

    @Override // defpackage.bsa
    public final void a(Status status, long j, long j2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, status);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        parcelObtainAndWriteInterfaceToken.writeLong(j2);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bsa
    public final void b(bru bruVar, long j, long j2) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bruVar);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        parcelObtainAndWriteInterfaceToken.writeLong(j2);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }
}
