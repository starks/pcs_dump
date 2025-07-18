package defpackage;

import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ams extends IPrepareInferenceEngineCallback.Stub {
    final /* synthetic */ IPrepareInferenceEngineCallback a;

    public ams(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
        this.a = iPrepareInferenceEngineCallback;
    }

    @Override // com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback
    public final void onPreparationFailure(int i) {
        this.a.onPreparationFailure(i);
    }

    @Override // com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback
    public final void onPreparationSuccess() {
        this.a.onPreparationSuccess();
    }
}
