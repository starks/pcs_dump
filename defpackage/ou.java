package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ou implements djy {
    final WeakReference a;
    public final op b = new ot(this);

    public ou(oq oqVar) {
        this.a = new WeakReference(oqVar);
    }

    public final boolean a(Throwable th) {
        op.f(th);
        oj ojVar = new oj(th);
        og ogVar = op.b;
        op opVar = this.b;
        if (!ogVar.d(opVar, null, ojVar)) {
            return false;
        }
        op.d(opVar);
        return true;
    }

    @Override // defpackage.djy
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        oq oqVar = (oq) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || oqVar == null) {
            return zCancel;
        }
        oqVar.a = null;
        oqVar.b = null;
        oqVar.c.e(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
