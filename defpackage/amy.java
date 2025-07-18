package defpackage;

import android.app.PendingIntent;
import android.app.StatsManager;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amy implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ amy(bnz bnzVar, String str, bbc bbcVar, int i) {
        this.d = i;
        this.a = bnzVar;
        this.c = str;
        this.b = bbcVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.apps.aicore.aidl.ISmartReplyService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.apps.aicore.aidl.ISummarizationService, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.d;
        if (i == 0) {
            return this.a.prepareInferenceEngine(new ana(this.b));
        }
        if (i == 1) {
            return this.a.prepareInferenceEngine(new ams(this.b));
        }
        if (i == 2) {
            Object obj = this.b;
            return ((arc) this.c).c((StatsManager) this.a, (PendingIntent) obj);
        }
        ((bnz) this.a).c().edit().putString(bnz.f((String) this.c), det.g.h(((edg) this.b).toByteArray())).apply();
        return null;
    }

    public /* synthetic */ amy(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
