package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.LLMResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alp extends akg implements alq {
    public alp(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.ai.aidl.PccLlmResultCallback");
    }

    @Override // defpackage.alq
    public final void a(int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.alq
    public final void b(LLMResult lLMResult) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, lLMResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
