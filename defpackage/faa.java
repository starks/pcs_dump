package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class faa implements Executor {
    private static final Logger a = Logger.getLogger(faa.class.getName());
    private boolean b;
    private ArrayDeque c;

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        if (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque(4);
            }
            this.c.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
            if (this.c != null) {
                a();
            }
            this.b = false;
        } catch (Throwable th) {
            try {
                a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", "Exception while executing runnable " + runnable.toString(), th);
                if (this.c != null) {
                    a();
                }
                this.b = false;
            } catch (Throwable th2) {
                if (this.c != null) {
                    a();
                }
                this.b = false;
                throw th2;
            }
        }
    }
}
