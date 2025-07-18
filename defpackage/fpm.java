package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpm extends fmt implements Executor {
    public static final fpm c = new fpm();
    private static final flx d = fpu.c.f(fjz.P("kotlinx.coroutines.io.parallelism", fjs.i(64, fpd.a), 0, 0, 12));

    private fpm() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.flx
    public final void d(fhq fhqVar, Runnable runnable) {
        d.d(fhqVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(fhr.a, runnable);
    }

    @Override // defpackage.flx
    public final String toString() {
        return "Dispatchers.IO";
    }
}
