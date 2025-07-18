package defpackage;

import com.google.android.apps.aicore.aidl.ITarsResultCallback;
import com.google.android.apps.aicore.aidl.TarsResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amu extends ITarsResultCallback.Stub {
    final /* synthetic */ amc a;

    public amu(amc amcVar) {
        this.a = amcVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
    public final void onTarsFailure(int i) {
        this.a.a(i);
    }

    @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
    public final void onTarsSuccess(TarsResult tarsResult) {
        this.a.b(tarsResult);
    }
}
