package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbu implements fdj {
    private static final Logger a = Logger.getLogger(fcg.class.getName());
    private final fbt b;
    private final fdj c;
    private final frj d = new frj(Level.FINE, fcg.class);

    public fbu(fbt fbtVar, fdj fdjVar) {
        this.b = fbtVar;
        this.c = fdjVar;
    }

    @Override // defpackage.fdj
    public final void a(fdu fduVar) {
        frj frjVar = this.d;
        if (frjVar.a()) {
            ((Logger) frjVar.a).logp((Level) frjVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", fbc.c(2).concat(" SETTINGS: ack=true"));
        }
        try {
            this.c.a(fduVar);
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void b(boolean z, int i, int i2) {
        long j = i2;
        long j2 = i;
        if (z) {
            frj frjVar = this.d;
            long j3 = j2 << 32;
            long j4 = j & 4294967295L;
            if (frjVar.a()) {
                long j5 = j4 | j3;
                Object obj = frjVar.a;
                Logger logger = (Logger) obj;
                logger.logp((Level) frjVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", fbc.c(2) + " PING: ack=true bytes=" + j5);
            }
        } else {
            this.d.d(2, (j & 4294967295L) | (j2 << 32));
        }
        try {
            this.c.b(z, i, i2);
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void c(int i, fdi fdiVar) {
        this.d.e(2, i, fdiVar);
        try {
            this.c.c(i, fdiVar);
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.c.close();
        } catch (IOException e) {
            a.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.fdj
    public final int d() {
        return this.c.d();
    }

    @Override // defpackage.fdj
    public final void e() {
        try {
            this.c.e();
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void f(boolean z, int i, fvk fvkVar, int i2) {
        this.d.b(2, i, fvkVar, i2, z);
        try {
            this.c.f(z, i, fvkVar, i2);
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void g() {
        try {
            this.c.g();
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void h(fdu fduVar) {
        this.d.f(2, fduVar);
        try {
            this.c.h(fduVar);
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void i(int i, long j) {
        this.d.g(2, i, j);
        try {
            this.c.i(i, j);
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void j(fdi fdiVar, byte[] bArr) {
        this.d.c(2, 0, fdiVar, fvn.h(bArr));
        try {
            this.c.j(fdiVar, bArr);
            this.c.g();
        } catch (IOException e) {
            this.b.b(e);
        }
    }

    @Override // defpackage.fdj
    public final void k(boolean z, int i, List list) {
        try {
            this.c.k(z, i, list);
        } catch (IOException e) {
            this.b.b(e);
        }
    }
}
