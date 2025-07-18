package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exb implements Executor {
    private final eyg a;
    private Executor b;

    public exb(eyg eygVar) {
        this.a = eygVar;
    }

    final synchronized Executor a() {
        if (this.b == null) {
            Executor executor = (Executor) this.a.a();
            executor.getClass();
            this.b = executor;
        }
        return this.b;
    }

    final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
