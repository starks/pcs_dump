package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffv implements Serializable, ffo {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ffv.class, Object.class, "c");
    private volatile fin b;
    private volatile Object c = ffx.a;

    public ffv(fin finVar) {
        this.b = finVar;
    }

    private final Object writeReplace() {
        return new ffm(a());
    }

    @Override // defpackage.ffo
    public final Object a() {
        Object obj = this.c;
        if (obj != ffx.a) {
            return obj;
        }
        fin finVar = this.b;
        if (finVar != null) {
            Object objA = finVar.a();
            if (a.e(a, this, ffx.a, objA)) {
                this.b = null;
                return objA;
            }
        }
        return this.c;
    }

    @Override // defpackage.ffo
    public final boolean b() {
        return this.c != ffx.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
