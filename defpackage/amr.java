package defpackage;

import com.google.android.apps.aicore.aidl.ISummarizationResultCallback;
import com.google.android.apps.aicore.aidl.SummarizationResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amr extends ISummarizationResultCallback.Stub {
    final /* synthetic */ aly a;

    public amr(aly alyVar) {
        this.a = alyVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ISummarizationResultCallback
    public final void onSummarizationInferenceFailure(int i) {
        this.a.a(i);
    }

    @Override // com.google.android.apps.aicore.aidl.ISummarizationResultCallback
    public final void onSummarizationInferenceSuccess(SummarizationResult summarizationResult) {
        this.a.b(summarizationResult);
    }
}
