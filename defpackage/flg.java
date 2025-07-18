package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flg {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(flg.class, "a");
    public volatile int a = 0;
    private final fjp c;

    public flg(int i, fjp fjpVar) {
        this.c = fjpVar;
    }

    public final int a() {
        int iDecrementAndGet = b.decrementAndGet(this);
        flj fljVar = flj.a;
        return iDecrementAndGet;
    }

    public final void b(int i) {
        this.a = i;
        flj fljVar = flj.a;
    }

    public final boolean c(int i, int i2) {
        boolean zCompareAndSet = b.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == flj.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void d() {
        b.incrementAndGet(this);
        flj fljVar = flj.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
