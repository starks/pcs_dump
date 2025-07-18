package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class djh extends cwo implements Future, djy {
    protected djh() {
    }

    protected abstract djy a();

    protected /* bridge */ /* synthetic */ Future b() {
        throw null;
    }

    @Override // defpackage.djy
    public final void c(Runnable runnable, Executor executor) {
        a().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return b().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return b().isDone();
    }

    protected djh(byte[] bArr) {
        this();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return b().get(j, timeUnit);
    }
}
