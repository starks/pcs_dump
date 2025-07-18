package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fob implements djy {
    public final dki a = new dki();
    public boolean b;
    private final fna c;

    public fob(fna fnaVar) {
        this.c = fnaVar;
    }

    private static final void a(Object obj) throws Throwable {
        if (obj instanceof foa) {
            throw new CancellationException().initCause(((foa) obj).a);
        }
    }

    @Override // defpackage.djy
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.a.cancel(z)) {
            return false;
        }
        this.c.o(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object obj = this.a.get();
        a(obj);
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.a.isCancelled()) {
            return true;
        }
        if (!isDone() || this.b) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.b = true;
        }
        return a.f(this.a) instanceof foa;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object objF = a.f(this.a);
                if (objF instanceof foa) {
                    sb.append("CANCELLED, cause=[" + ((foa) objF).a + "]");
                } else {
                    sb.append(a.y(objF, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.a + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object obj = this.a.get(j, timeUnit);
        a(obj);
        return obj;
    }
}
