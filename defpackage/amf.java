package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.aicore.aidl.TextEmbeddingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amf extends akg implements amg {
    public amf(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.miphone.astrea.ai.aidl.PccTextEmbeddingResultCallback");
    }

    @Override // defpackage.amg
    public final void a(int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // defpackage.amg
    public final void b(TextEmbeddingResult textEmbeddingResult) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        aki.b(parcelObtainAndWriteInterfaceToken, textEmbeddingResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
