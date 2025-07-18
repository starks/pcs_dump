package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface eub extends Closeable {
    eui a(SocketAddress socketAddress, eua euaVar, elv elvVar);

    ScheduledExecutorService b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
