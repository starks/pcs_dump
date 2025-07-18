package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fac extends fab {
    private final AtomicIntegerFieldUpdater a;

    public fac(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.fab
    public final boolean a(fae faeVar) {
        return this.a.compareAndSet(faeVar, 0, -1);
    }

    @Override // defpackage.fab
    public final void b(fae faeVar) {
        this.a.set(faeVar, 0);
    }
}
