package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsp {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public bsp(aqr aqrVar, aqv aqvVar, bpv bpvVar) {
        this.c = aqrVar;
        this.b = aqvVar;
        this.a = bpvVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [bqm, java.lang.Object] */
    public final bxq a(String str, edl edlVar, eea eeaVar, dfa dfaVar, String str2, dzi dziVar) {
        bsx bsxVar = (bsx) this.a;
        bpz bpzVar = bsxVar.c;
        return new bxq(bsxVar.a, bpzVar, this.b, bsxVar.d, str, edlVar, eeaVar, dfaVar, ((brb) this.c).H(str, edlVar, true != bpzVar.bm() ? null : dziVar), str2, dziVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bpz, java.lang.Object] */
    public final bpz b() {
        if (((aqr) this.c).k()) {
            return this.c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bqm, java.lang.Object] */
    public final bqm c() {
        if (((aqr) this.c).m()) {
            return this.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void d() {
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r02 = this.a;
        ((ahc) this.c).n();
        r02.run();
    }

    public /* synthetic */ bsp(bsx bsxVar, bqm bqmVar, brb brbVar) {
        this.a = bsxVar;
        this.b = bqmVar;
        this.c = brbVar;
    }

    public /* synthetic */ bsp(Runnable runnable, ahc ahcVar, Runnable runnable2) {
        this.b = runnable;
        this.c = ahcVar;
        this.a = runnable2;
    }

    public /* synthetic */ bsp(Map.Entry entry, ExecutorService executorService, cde cdeVar) {
        this.a = entry;
        this.c = executorService;
        this.b = cdeVar;
    }
}
