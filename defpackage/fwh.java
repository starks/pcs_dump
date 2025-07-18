package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fwh {
    public static final fwh k = new fwg();
    private boolean a;
    private long b;
    public long l;

    public boolean g() {
        return this.a;
    }

    public long h() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public fwh i() {
        this.a = false;
        return this;
    }

    public fwh j(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public fwh k(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            throw new IllegalArgumentException(a.C(j, "timeout < 0: "));
        }
        this.l = timeUnit.toNanos(j);
        return this;
    }

    public void l() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public fwh m() {
        this.l = 0L;
        return this;
    }
}
