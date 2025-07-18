package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fmo extends flx {
    private long c;
    public fgk d;
    private boolean e;

    public fmo() {
    }

    private static final long g(boolean z) {
        return z ? 4294967296L : 1L;
    }

    protected abstract Thread c();

    protected void h(long j, fmp fmpVar) {
        fmf fmfVar = fmf.c;
        if (fmfVar.s()) {
            fmfVar.h(j, fmpVar);
        } else {
            if (((fpf) fmfVar.f.a) != null) {
                throw null;
            }
            fmfVar.f.d(null, new fpf((byte[]) null));
            Object obj = fmfVar.f.a;
            obj.getClass();
            throw null;
        }
    }

    public void i() {
        throw null;
    }

    public long j() {
        throw null;
    }

    public final void k(boolean z) {
        long jG = this.c - g(z);
        this.c = jG;
        if (jG > 0) {
            return;
        }
        boolean z2 = fmd.a;
        if (this.e) {
            i();
        }
    }

    public final void l(fmj fmjVar) {
        fgk fgkVar = this.d;
        if (fgkVar == null) {
            fgkVar = new fgk();
            this.d = fgkVar;
        }
        fgkVar.addLast(fmjVar);
    }

    public final void m(boolean z) {
        this.c += g(z);
        if (z) {
            return;
        }
        this.e = true;
    }

    public final boolean n() {
        return this.c >= g(true);
    }

    public final boolean o() {
        fgk fgkVar = this.d;
        if (fgkVar == null) {
            return false;
        }
        fmj fmjVar = (fmj) (fgkVar.isEmpty() ? null : fgkVar.removeFirst());
        if (fmjVar == null) {
            return false;
        }
        fmjVar.run();
        return true;
    }

    protected final void p() {
        Thread threadC = c();
        if (Thread.currentThread() != threadC) {
            LockSupport.unpark(threadC);
        }
    }

    public fmo(byte[] bArr) {
        this();
    }
}
