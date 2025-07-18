package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkq implements fku {
    private final AtomicReference a;

    public fkq(fku fkuVar) {
        this.a = new AtomicReference(fkuVar);
    }

    @Override // defpackage.fku
    public final Iterator a() {
        fku fkuVar = (fku) this.a.getAndSet(null);
        if (fkuVar != null) {
            return fkuVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
