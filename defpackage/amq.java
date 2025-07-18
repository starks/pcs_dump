package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.apps.aicore.aidl.IAICoreService;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amq implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ amq(IAICoreService iAICoreService, AIFeature aIFeature, int i) {
        this.c = i;
        this.a = iAICoreService;
        this.b = aIFeature;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.apps.aicore.aidl.IAICoreService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.apps.aicore.aidl.IAICoreService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.apps.aicore.aidl.IAICoreService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.android.apps.aicore.aidl.IAICoreService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.apps.aicore.aidl.IAICoreService, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            return this.a.getSmartReplyService((AIFeature) this.b);
        }
        if (i == 1) {
            return this.a.getLLMService((AIFeature) this.b);
        }
        if (i == 2) {
            return this.a.getTarsService((AIFeature) this.b);
        }
        if (i == 3) {
            return this.a.getTextEmbeddingService((AIFeature) this.b);
        }
        if (i == 4) {
            return this.a.getSummarizationService((AIFeature) this.b);
        }
        if (i != 5) {
            chc.e((chc) this.b, (chd) this.a);
            return null;
        }
        Optional optionalOfNullable = Optional.ofNullable(((bnz) this.b).c().getString(bnz.f((String) this.a), null));
        if (!optionalOfNullable.isPresent()) {
            return Optional.empty();
        }
        return Optional.of((bbc) efb.parseFrom(bbc.a, det.g.i((CharSequence) optionalOfNullable.get()), een.a()));
    }

    public /* synthetic */ amq(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
