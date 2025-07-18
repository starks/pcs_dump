package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsq implements cdc {
    public final /* synthetic */ ExecutorService a;
    public final /* synthetic */ cde b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ fsc d;
    private final /* synthetic */ int e;

    public /* synthetic */ bsq(fsc fscVar, Map.Entry entry, ExecutorService executorService, cde cdeVar, int i) {
        this.e = i;
        this.d = fscVar;
        this.c = entry;
        this.a = executorService;
        this.b = cdeVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.csg
    public final Object a() {
        if (this.e == 0) {
            cde cdeVar = this.b;
            return new brl(this.d, new bsp((Map.Entry) this.c, this.a, cdeVar));
        }
        cde cdeVar2 = this.b;
        ?? r1 = this.c;
        ExecutorService executorService = this.a;
        fsc fscVar = this.d;
        return new dwy(fscVar, new bss(fscVar, executorService, r1, cdeVar2));
    }

    public /* synthetic */ bsq(fsc fscVar, ExecutorService executorService, dxb dxbVar, cde cdeVar, int i) {
        this.e = i;
        this.d = fscVar;
        this.a = executorService;
        this.c = dxbVar;
        this.b = cdeVar;
    }
}
