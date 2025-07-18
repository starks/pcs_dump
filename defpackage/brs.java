package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brs extends akg implements bru {
    public brs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
    }

    @Override // defpackage.bru
    public final void a(bkj bkjVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, bkjVar);
        transactOneway(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bru
    public final void b(brx brxVar, int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.d(parcelObtainAndWriteInterfaceToken, brxVar);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }
}
