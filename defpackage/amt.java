package defpackage;

import com.google.android.apps.aicore.aidl.LLMRequest;
import com.google.android.apps.aicore.aidl.SmartReplyRequest;
import com.google.android.apps.aicore.aidl.SummarizationRequest;
import com.google.android.apps.aicore.aidl.TarsRequest;
import com.google.android.apps.aicore.aidl.TextEmbeddingRequest;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amt implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ bmr b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ akh d;
    private final /* synthetic */ int e;

    public /* synthetic */ amt(akh akhVar, Object obj, bmr bmrVar, Object obj2, int i) {
        this.e = i;
        this.d = akhVar;
        this.a = obj;
        this.b = bmrVar;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [amc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [alq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [alu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [amg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.apps.aicore.aidl.ITarsService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.apps.aicore.aidl.ISummarizationService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.apps.aicore.aidl.ITextEmbeddingService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.apps.aicore.aidl.ILLMService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.google.android.apps.aicore.aidl.ISmartReplyService, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.e;
        if (i == 0) {
            return this.a.runCancellableInference((TarsRequest) this.b, new amu(this.c));
        }
        if (i == 1) {
            return this.a.runCancellableInference((SummarizationRequest) this.b, new amr(this.c));
        }
        if (i == 2) {
            return this.a.runCancellableInference((TextEmbeddingRequest) this.b, new amv(this.c));
        }
        if (i != 3) {
            return this.a.runCancellableInference((SmartReplyRequest) this.b, new amz(this.c));
        }
        return this.a.runCancellableInference((LLMRequest) this.b, new amx(this.c));
    }
}
