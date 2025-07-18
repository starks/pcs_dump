package defpackage;

import com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback;
import com.google.android.apps.aicore.aidl.TextEmbeddingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amv extends ITextEmbeddingResultCallback.Stub {
    final /* synthetic */ amg a;

    public amv(amg amgVar) {
        this.a = amgVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
    public final void onTextEmbeddingInferenceFailure(int i) {
        this.a.a(i);
    }

    @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
    public final void onTextEmbeddingInferenceSuccess(TextEmbeddingResult textEmbeddingResult) {
        this.a.b(textEmbeddingResult);
    }
}
