package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flh {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(flh.class, "b");
    public volatile long b;
    public final fjp c;

    public flh(long j, fjp fjpVar) {
        this.c = fjpVar;
        this.b = j;
    }

    public final long a(long j) {
        long jAddAndGet = a.addAndGet(this, j);
        flj fljVar = flj.a;
        return jAddAndGet;
    }

    public final void b(long j) {
        this.b = j;
        flj fljVar = flj.a;
    }

    public final boolean c(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == flj.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
