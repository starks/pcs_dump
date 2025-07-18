package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exr extends evl {
    private final exq e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(exr.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exr(eol eolVar) {
        super(eolVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new exq(this, eolVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.evl, defpackage.eol
    public final void d() {
        int i = exq.b;
        exq exqVar = this.e;
        if (!exqVar.a.getAndSet(true)) {
            exqVar.clear();
        }
        eol eolVar = this.a;
        exm exmVar = (exm) eolVar;
        exmVar.G.a(1, "shutdown() called");
        if (exmVar.A.compareAndSet(false, true)) {
            exmVar.m.execute(new ewf(eolVar, 8));
            exi exiVar = exmVar.I;
            exiVar.c.m.execute(new ewf(exiVar, 11));
            exmVar.m.execute(new ewf(eolVar, 7));
        }
    }
}
