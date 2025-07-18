package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fby implements eub {
    final Executor a;
    final ScheduledExecutorService b;
    final SSLSocketFactory c;
    final fcu d;
    final int e;
    final int f = 65535;
    final int g = Integer.MAX_VALUE;
    final ekf h;
    private final eyg i;
    private final eyg j;
    private final boolean k;
    private final esz l;
    private final long m;
    private boolean n;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fby(eyg eygVar, eyg eygVar2, SSLSocketFactory sSLSocketFactory, fcu fcuVar, int i, boolean z, long j, long j2, int i2, int i3, ekf ekfVar) {
        this.i = eygVar;
        this.a = eygVar.a();
        this.j = eygVar2;
        this.b = (ScheduledExecutorService) eygVar2.a();
        this.c = sSLSocketFactory;
        this.d = fcuVar;
        this.e = i;
        this.k = z;
        this.l = new esz(j);
        this.m = j2;
        ekfVar.getClass();
        this.h = ekfVar;
    }

    @Override // defpackage.eub
    public final eui a(SocketAddress socketAddress, eua euaVar, elv elvVar) {
        if (this.n) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        esz eszVar = this.l;
        esy esyVar = new esy(eszVar, eszVar.c.get());
        ezk ezkVar = new ezk(esyVar, 7);
        fcg fcgVar = new fcg(this, (InetSocketAddress) socketAddress, euaVar.a, euaVar.b, evt.q, new fds(), euaVar.d, ezkVar);
        if (this.k) {
            long j = esyVar.a;
            long j2 = this.m;
            fcgVar.A = true;
            fcgVar.B = j;
            fcgVar.C = j2;
        }
        return fcgVar;
    }

    @Override // defpackage.eub
    public final ScheduledExecutorService b() {
        return this.b;
    }

    @Override // defpackage.eub, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.i.b(this.a);
        this.j.b(this.b);
    }
}
