package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuc {
    public final int a;
    public final ftv b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final fua g;
    public final ftz h;
    public final fub i;
    public final fub j;
    public IOException k;
    private final ArrayDeque l;
    private boolean m;
    private fta n;

    public fuc(int i, ftv ftvVar, boolean z, boolean z2, fqo fqoVar) {
        this.a = i;
        this.b = ftvVar;
        this.f = ftvVar.t.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.l = arrayDeque;
        this.g = new fua(this, ftvVar.s.c(), z2);
        this.h = new ftz(this, z);
        this.i = new fub(this);
        this.j = new fub(this);
        if (fqoVar == null) {
            if (!l()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (l()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(fqoVar);
        }
    }

    private final boolean n(fta ftaVar, IOException iOException) {
        byte[] bArr = frh.a;
        synchronized (this) {
            if (this.n != null) {
                return false;
            }
            this.n = ftaVar;
            this.k = iOException;
            notifyAll();
            if (this.g.b) {
                if (this.h.a) {
                    return false;
                }
            }
            this.b.b(this.a);
            return true;
        }
    }

    public final synchronized fqo a() {
        Object objRemoveFirst;
        this.i.e();
        while (this.l.isEmpty() && this.n == null) {
            try {
                k();
            } catch (Throwable th) {
                this.i.c();
                throw th;
            }
        }
        this.i.c();
        if (this.l.isEmpty()) {
            IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            fta ftaVar = this.n;
            ftaVar.getClass();
            throw new fuj(ftaVar);
        }
        objRemoveFirst = this.l.removeFirst();
        objRemoveFirst.getClass();
        return (fqo) objRemoveFirst;
    }

    public final synchronized fta b() {
        return this.n;
    }

    public final fwd c() {
        synchronized (this) {
            if (!this.m && !l()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public final void d(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void e() {
        boolean z;
        boolean zM;
        byte[] bArr = frh.a;
        synchronized (this) {
            fua fuaVar = this.g;
            z = false;
            if (!fuaVar.b && fuaVar.e) {
                ftz ftzVar = this.h;
                if (ftzVar.a || ftzVar.b) {
                    z = true;
                }
            }
            zM = m();
        }
        if (z) {
            g(fta.i, null);
        } else {
            if (zM) {
                return;
            }
            this.b.b(this.a);
        }
    }

    public final void f() throws IOException {
        ftz ftzVar = this.h;
        if (ftzVar.b) {
            throw new IOException("stream closed");
        }
        if (ftzVar.a) {
            throw new IOException("stream finished");
        }
        fta ftaVar = this.n;
        if (ftaVar != null) {
            IOException iOException = this.k;
            if (iOException == null) {
                throw new fuj(ftaVar);
            }
            throw iOException;
        }
    }

    public final void g(fta ftaVar, IOException iOException) {
        ftaVar.getClass();
        if (n(ftaVar, iOException)) {
            this.b.j(this.a, ftaVar);
        }
    }

    public final void h(fta ftaVar) {
        ftaVar.getClass();
        if (n(ftaVar, null)) {
            this.b.k(this.a, ftaVar);
        }
    }

    public final void i(fqo fqoVar, boolean z) {
        boolean zM;
        fqoVar.getClass();
        byte[] bArr = frh.a;
        synchronized (this) {
            if (this.m) {
                if (!z) {
                    z = false;
                    this.m = true;
                    this.l.add(fqoVar);
                    if (z) {
                    }
                    zM = m();
                    notifyAll();
                }
                this.g.b = true;
                zM = m();
                notifyAll();
            } else {
                this.m = true;
                this.l.add(fqoVar);
                if (z) {
                    this.g.b = true;
                }
                zM = m();
                notifyAll();
            }
        }
        if (zM) {
            return;
        }
        this.b.b(this.a);
    }

    public final synchronized void j(fta ftaVar) {
        ftaVar.getClass();
        if (this.n == null) {
            this.n = ftaVar;
            notifyAll();
        }
    }

    public final void k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean l() {
        return (this.a & 1) == 1;
    }

    public final synchronized boolean m() {
        if (this.n != null) {
            return false;
        }
        fua fuaVar = this.g;
        if (fuaVar.b || fuaVar.e) {
            ftz ftzVar = this.h;
            if (ftzVar.a || ftzVar.b) {
                if (this.m) {
                    return false;
                }
            }
        }
        return true;
    }
}
