package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezd implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new eqr(eqo.c(th).e("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
