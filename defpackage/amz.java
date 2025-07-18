package defpackage;

import com.google.android.apps.aicore.aidl.ISmartReplyResultCallback;
import com.google.android.apps.aicore.aidl.SmartReplyResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amz extends ISmartReplyResultCallback.Stub {
    final /* synthetic */ alu a;

    public amz(alu aluVar) {
        this.a = aluVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
    public final void onSmartReplyInferenceFailure(int i) {
        this.a.a(i);
    }

    @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
    public final void onSmartReplyInferenceSuccess(SmartReplyResult smartReplyResult) {
        this.a.b(smartReplyResult);
    }
}
