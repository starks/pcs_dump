package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eti implements eub {
    private final eub a;

    public eti(eub eubVar, Executor executor) {
        this.a = eubVar;
        executor.getClass();
    }

    @Override // defpackage.eub
    public final eui a(SocketAddress socketAddress, eua euaVar, elv elvVar) {
        return new eth(this.a.a(socketAddress, euaVar, elvVar), euaVar.a);
    }

    @Override // defpackage.eub
    public final ScheduledExecutorService b() {
        return this.a.b();
    }

    @Override // defpackage.eub, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
