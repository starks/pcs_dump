package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.SummarizationResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alx extends akg implements aly {
    public alx(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.ai.aidl.PccSummarizationResultCallback");
    }

    @Override // defpackage.aly
    public final void a(int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.aly
    public final void b(SummarizationResult summarizationResult) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, summarizationResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
