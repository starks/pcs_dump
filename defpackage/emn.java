package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emn implements Runnable {
    final eml a;
    public final emr b;
    private final Executor c;

    public emn(Executor executor, eml emlVar, emr emrVar) {
        this.c = executor;
        this.a = emlVar;
        this.b = emrVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            emr.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
