package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djg extends djr {
    private final djy a;

    public djg(djy djyVar) {
        super(null);
        djyVar.getClass();
        this.a = djyVar;
    }

    @Override // defpackage.dif, defpackage.djy
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.dif, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.dif, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.dif, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.dif, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.dif
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.dif, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
