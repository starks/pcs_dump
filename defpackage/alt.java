package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.SmartReplyResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alt extends akg implements alu {
    public alt(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.ai.aidl.PccSmartReplyResultCallback");
    }

    @Override // defpackage.alu
    public final void a(int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.alu
    public final void b(SmartReplyResult smartReplyResult) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, smartReplyResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
