package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvt implements fwf {
    private final InputStream a;
    private final fwh b;

    public fvt(InputStream inputStream, fwh fwhVar) {
        this.a = inputStream;
        this.b = fwhVar;
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.b;
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) throws IOException {
        try {
            this.b.l();
            fwa fwaVarY = fvkVar.y(1);
            int i = this.a.read(fwaVarY.a, fwaVarY.c, (int) Math.min(j, 8192 - fwaVarY.c));
            if (i != -1) {
                fwaVarY.c += i;
                long j2 = i;
                fvkVar.b += j2;
                return j2;
            }
            if (fwaVarY.b != fwaVarY.c) {
                return -1L;
            }
            fvkVar.a = fwaVarY.a();
            fwb.b(fwaVarY);
            return -1L;
        } catch (AssertionError e) {
            if (fvu.c(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
