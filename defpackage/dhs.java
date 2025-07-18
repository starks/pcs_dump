package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhs extends dhr {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(die.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(die.class, die.class, "next");
    private static final AtomicReferenceFieldUpdater c;
    private static final AtomicReferenceFieldUpdater d;
    private static final AtomicReferenceFieldUpdater e;

    static {
        dhr dhrVar = dif.f;
        c = AtomicReferenceFieldUpdater.newUpdater(dif.class, die.class, "waiters");
        d = AtomicReferenceFieldUpdater.newUpdater(dif.class, dhw.class, "listeners");
        e = AtomicReferenceFieldUpdater.newUpdater(dif.class, Object.class, "value");
    }

    @Override // defpackage.dhr
    public final dhw a(dif difVar, dhw dhwVar) {
        return (dhw) d.getAndSet(difVar, dhwVar);
    }

    @Override // defpackage.dhr
    public final die b(dif difVar, die dieVar) {
        return (die) c.getAndSet(difVar, dieVar);
    }

    @Override // defpackage.dhr
    public final void c(die dieVar, die dieVar2) {
        b.lazySet(dieVar, dieVar2);
    }

    @Override // defpackage.dhr
    public final void d(die dieVar, Thread thread) {
        a.lazySet(dieVar, thread);
    }

    @Override // defpackage.dhr
    public final boolean e(dif difVar, dhw dhwVar, dhw dhwVar2) {
        return a.e(d, difVar, dhwVar, dhwVar2);
    }

    @Override // defpackage.dhr
    public final boolean f(dif difVar, Object obj, Object obj2) {
        return a.e(e, difVar, obj, obj2);
    }

    @Override // defpackage.dhr
    public final boolean g(dif difVar, die dieVar, die dieVar2) {
        return a.e(c, difVar, dieVar, dieVar2);
    }
}
