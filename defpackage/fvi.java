package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvi implements fwf {
    final /* synthetic */ fvj a;
    final /* synthetic */ fwf b;

    public fvi(fvj fvjVar, fwf fwfVar) {
        this.a = fvjVar;
        this.b = fwfVar;
    }

    @Override // defpackage.fwf
    public final /* synthetic */ fwh a() {
        return this.a;
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) throws IOException {
        fvj fvjVar = this.a;
        fvjVar.e();
        try {
            long jB = this.b.b(fvkVar, j);
            if (fvjVar.f()) {
                throw fvjVar.b(null);
            }
            return jB;
        } catch (IOException e) {
            if (fvjVar.f()) {
                throw fvjVar.b(e);
            }
            throw e;
        } finally {
            fvjVar.f();
        }
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
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

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
