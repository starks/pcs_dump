package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evy {
    private static final Logger g = Logger.getLogger(evy.class.getName());
    public final long a;
    public final csf b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;
    public long f;

    public evy(long j, csf csfVar) {
        this.a = j;
        this.b = csfVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            g.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(fuu fuuVar, Executor executor, Throwable th) {
        a(executor, new euy(fuuVar, th, 2));
    }
}
