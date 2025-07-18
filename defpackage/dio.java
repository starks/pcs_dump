package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dio extends din {
    private static final AtomicReferenceFieldUpdater a;
    private static final AtomicIntegerFieldUpdater b;

    static {
        din dinVar = diq.a;
        a = AtomicReferenceFieldUpdater.newUpdater(diq.class, Set.class, "seenExceptions");
        b = AtomicIntegerFieldUpdater.newUpdater(diq.class, "remaining");
    }

    @Override // defpackage.din
    public final int a(diq diqVar) {
        return b.decrementAndGet(diqVar);
    }

    @Override // defpackage.din
    public final void b(diq diqVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(diqVar, null, set) && atomicReferenceFieldUpdater.get(diqVar) == null) {
        }
    }
}
