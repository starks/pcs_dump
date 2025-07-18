package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ol extends og {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public ol(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.og
    public final void a(oo ooVar, oo ooVar2) {
        this.b.lazySet(ooVar, ooVar2);
    }

    @Override // defpackage.og
    public final void b(oo ooVar, Thread thread) {
        this.a.lazySet(ooVar, thread);
    }

    @Override // defpackage.og
    public final boolean c(op opVar, ok okVar, ok okVar2) {
        return a.e(this.d, opVar, okVar, okVar2);
    }

    @Override // defpackage.og
    public final boolean d(op opVar, Object obj, Object obj2) {
        return a.e(this.e, opVar, obj, obj2);
    }

    @Override // defpackage.og
    public final boolean e(op opVar, oo ooVar, oo ooVar2) {
        return a.e(this.c, opVar, ooVar, ooVar2);
    }
}
