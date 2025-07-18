package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvh implements fwd {
    final /* synthetic */ fvj a;
    final /* synthetic */ fwd b;

    public fvh(fvj fvjVar, fwd fwdVar) {
        this.a = fvjVar;
        this.b = fwdVar;
    }

    @Override // defpackage.fwd
    public final /* synthetic */ fwh a() {
        return this.a;
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) throws IOException {
        fwv.m(fvkVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            fwa fwaVar = fvkVar.a;
            fwaVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += fwaVar.c - fwaVar.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    fwaVar = fwaVar.f;
                    fwaVar.getClass();
                }
            }
            fvj fvjVar = this.a;
            fwd fwdVar = this.b;
            fvjVar.e();
            try {
                try {
                    fwdVar.bi(fvkVar, j2);
                    if (fvjVar.f()) {
                        throw fvjVar.b(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!fvjVar.f()) {
                        throw e;
                    }
                    throw fvjVar.b(e);
                }
            } catch (Throwable th) {
                fvjVar.f();
                throw th;
            }
        }
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        fvj fvjVar = this.a;
        fvjVar.e();
        try {
            this.b.close();
            if (fvjVar.f()) {
                throw fvjVar.b(null);
            }
        } catch (IOException e) {
            if (!fvjVar.f()) {
                throw e;
            }
            throw fvjVar.b(e);
        } finally {
            fvjVar.f();
        }
    }

    @Override // defpackage.fwd, java.io.Flushable
    public final void flush() throws IOException {
        fvj fvjVar = this.a;
        fvjVar.e();
        try {
            this.b.flush();
            if (fvjVar.f()) {
                throw fvjVar.b(null);
            }
        } catch (IOException e) {
            if (!fvjVar.f()) {
                throw e;
            }
            throw fvjVar.b(e);
        } finally {
            fvjVar.f();
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
