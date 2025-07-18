package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvg extends Thread {
    public fvg() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        fvj fvjVarJ;
        while (true) {
            try {
                reentrantLock = fvj.b;
                reentrantLock.lock();
                try {
                    fvjVarJ = fwv.j();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (fvjVarJ == fvj.f) {
                fvj.f = null;
                return;
            } else {
                reentrantLock.unlock();
                if (fvjVarJ != null) {
                    fvjVarJ.a();
                }
            }
        }
    }
}
