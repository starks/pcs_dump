package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class diw extends djw {
    private final Executor a;
    final /* synthetic */ dix b;

    public diw(dix dixVar, Executor executor) {
        this.b = dixVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.djw
    public final void d(Throwable th) {
        this.b.b = null;
        if (th instanceof ExecutionException) {
            this.b.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.e(th);
        }
    }

    @Override // defpackage.djw
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.e(e);
        }
    }

    @Override // defpackage.djw
    public final boolean g() {
        return this.b.isDone();
    }
}
