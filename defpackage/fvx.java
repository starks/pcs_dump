package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvx implements fvl {
    public final fwd a;
    public final fvk b = new fvk();
    public boolean c;

    public fvx(fwd fwdVar) {
        this.a = fwdVar;
    }

    @Override // defpackage.fvl
    public final void J(fvn fvnVar) {
        fvnVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.J(fvnVar);
        c();
    }

    @Override // defpackage.fvl
    public final void K(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.q(bArr);
        c();
    }

    @Override // defpackage.fvl
    public final void M(byte[] bArr, int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.L(bArr, 0, i);
        c();
    }

    @Override // defpackage.fvl
    public final void P(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.P(i);
        c();
    }

    @Override // defpackage.fvl
    public final void Q(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.Q(j);
        c();
    }

    @Override // defpackage.fvl
    public final void S(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.S(i);
        c();
    }

    @Override // defpackage.fvl
    public final void U(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.U(i);
        c();
    }

    @Override // defpackage.fwd
    public final fwh a() {
        return this.a.a();
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.bi(fvkVar, j);
        c();
    }

    public final fvl c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jG = this.b.g();
        if (jG > 0) {
            this.a.bi(this.b, jG);
        }
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fwd
    public final void close() throws Throwable {
        Throwable th;
        if (this.c) {
            return;
        }
        try {
            fvk fvkVar = this.b;
            long j = fvkVar.b;
            th = null;
            if (j > 0) {
                this.a.bi(fvkVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.fvl, defpackage.fwd, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fvk fvkVar = this.b;
        long j = fvkVar.b;
        if (j > 0) {
            this.a.bi(fvkVar, j);
        }
        this.a.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.fvl
    public final fvk p() {
        return this.b;
    }

    @Override // defpackage.fvl
    public final fvl t(String str) {
        str.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.t(str);
        return c();
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        c();
        return iWrite;
    }
}
