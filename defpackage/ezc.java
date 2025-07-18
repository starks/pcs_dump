package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezc {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final csf g;

    public ezc(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, csf csfVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = csfVar;
        csfVar.d();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
