package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class diq extends dia {
    public static final din a;
    private static final djx b = new djx(diq.class);
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        Throwable th;
        din dipVar;
        try {
            dipVar = new dio();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            dipVar = new dip();
        }
        Throwable th3 = th;
        a = dipVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public diq(int i) {
        this.remaining = i;
    }

    public abstract void g(Set set);
}
