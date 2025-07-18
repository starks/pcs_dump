package defpackage;

import com.google.android.apps.aicore.aidl.ILLMResultCallback;
import com.google.android.apps.aicore.aidl.LLMResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amw extends ILLMResultCallback.Stub {
    final /* synthetic */ alq a;

    public amw(alq alqVar) {
        this.a = alqVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
    public final void onLLMInferenceFailure(int i) {
        this.a.a(i);
    }

    @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
    public final void onLLMInferenceSuccess(LLMResult lLMResult) {
        this.a.b(lLMResult);
    }
}
