package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvk extends akg implements bvl {
    public bvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
    }

    @Override // defpackage.bvl
    public final void a(byte[] bArr) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.bvl
    public final void b(byte[] bArr) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
    }
}
