package defpackage;

import java.lang.Thread;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewv implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ exm a;

    public ewv(exm exmVar) {
        this.a = exmVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        exm.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(this.a.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        exm exmVar = this.a;
        if (exmVar.u) {
            return;
        }
        exmVar.u = true;
        try {
            exmVar.f(true);
            exmVar.j(false);
        } finally {
            exmVar.k(new enz(eoc.a(eqo.k.e("Panic! This is a bug!").d(th))));
            exmVar.I.d(null);
            exmVar.G.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            exmVar.p.a(emh.TRANSIENT_FAILURE);
        }
    }
}
