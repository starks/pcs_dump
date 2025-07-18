package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbs implements fwd {
    public final fbt c;
    public fwd f;
    public Socket g;
    public int h;
    public int i;
    private final fae j;
    private boolean l;
    public final Object a = new Object();
    public final fvk b = new fvk();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public fbs(fae faeVar, fbt fbtVar) {
        faeVar.getClass();
        this.j = faeVar;
        this.c = fbtVar;
    }

    @Override // defpackage.fwd
    public final fwh a() {
        return fwh.k;
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = ffg.a;
        synchronized (this.a) {
            this.b.bi(fvkVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && this.b.g() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new fbo(this));
                return;
            }
            try {
                this.g.close();
            } catch (IOException e) {
                this.c.b(e);
            }
        }
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new ezk(this, 6));
    }

    @Override // defpackage.fwd, java.io.Flushable
    public final void flush() throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = ffg.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new fbp(this));
        }
    }
}
