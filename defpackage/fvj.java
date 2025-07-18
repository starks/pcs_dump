package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fvj extends fwh {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static fvj f;
    public static final fwv j = new fwv();
    public int g;
    public fvj h;
    public long i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        c = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    protected IOException b(IOException iOException) {
        throw null;
    }

    public final long d(long j2) {
        return this.i - j2;
    }

    public final void e() {
        long j2 = this.l;
        boolean zG = g();
        if (j2 == 0) {
            if (!zG) {
                return;
            } else {
                j2 = 0;
            }
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.g != 0) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            this.g = 1;
            fwv.k(this, j2, zG);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            int i = this.g;
            this.g = 0;
            if (i != 1) {
                return i == 2;
            }
            fvj fvjVar = f;
            while (fvjVar != null) {
                fvj fvjVar2 = fvjVar.h;
                if (fvjVar2 == this) {
                    fvjVar.h = this.h;
                    this.h = null;
                    return false;
                }
                fvjVar = fvjVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
