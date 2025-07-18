package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsx extends fss {
    private boolean c;

    public fsx(fsy fsyVar) {
        super(fsyVar);
    }

    @Override // defpackage.fss, defpackage.fwf
    public final long b(fvk fvkVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        if (this.c) {
            return -1L;
        }
        long jB = super.b(fvkVar, j);
        if (jB != -1) {
            return jB;
        }
        this.c = true;
        c();
        return -1L;
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c();
        }
        d();
    }
}
