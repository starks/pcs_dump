package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flf {
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(flf.class, "b");
    private volatile int b = 0;
    private final fjp c;

    public flf(boolean z, fjp fjpVar) {
        this.c = fjpVar;
    }

    public final boolean a() {
        return this.b != 0;
    }

    public final boolean b() {
        boolean zCompareAndSet = a.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.c == flj.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void c() {
        this.b = 1;
        flj fljVar = flj.a;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
