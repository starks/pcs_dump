package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmf extends fmq implements Runnable {
    private static volatile Thread _thread;
    public static final fmf c;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Long l;
        fmf fmfVar = new fmf();
        c = fmfVar;
        fmfVar.m(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        g = timeUnit.toNanos(l.longValue());
    }

    private fmf() {
    }

    private final synchronized Thread u() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(c.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void v() {
        if (x()) {
            debugStatus = 3;
            ((fmq) this).e.c(null);
            this.f.c(null);
            notifyAll();
        }
    }

    private final synchronized boolean w() {
        if (x()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean x() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void y() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.fmo
    protected final Thread c() {
        Thread thread = _thread;
        return thread == null ? u() : thread;
    }

    @Override // defpackage.fmq
    public final void g(Runnable runnable) {
        if (debugStatus == 4) {
            y();
        }
        super.g(runnable);
    }

    @Override // defpackage.fmo
    protected final void h(long j, fmp fmpVar) {
        y();
    }

    @Override // defpackage.fmq, defpackage.fmo
    public final void i() {
        debugStatus = 4;
        super.i();
    }

    @Override // java.lang.Runnable
    public final void run() {
        fnq fnqVar = fnq.a;
        fnq.b.set(this);
        try {
            if (w()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j2 = j();
                    if (j2 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = g + jNanoTime;
                        }
                        j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            break;
                        } else if (j2 >= Long.MAX_VALUE) {
                            j2 = Long.MAX_VALUE;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (j2 > 0) {
                        if (x()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, j2);
                        }
                    }
                }
            }
            _thread = null;
            v();
            if (t()) {
                return;
            }
            c();
        } catch (Throwable th) {
            _thread = null;
            v();
            if (!t()) {
                c();
            }
            throw th;
        }
    }

    @Override // defpackage.flx
    public final String toString() {
        return "DefaultExecutor";
    }
}
