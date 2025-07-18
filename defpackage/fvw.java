package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvw implements fwd {
    private final OutputStream a;
    private final fwh b;

    public fvw(OutputStream outputStream, fwh fwhVar) {
        this.a = outputStream;
        this.b = fwhVar;
    }

    @Override // defpackage.fwd
    public final fwh a() {
        return this.b;
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) throws IOException {
        fwv.m(fvkVar.b, 0L, j);
        while (j > 0) {
            this.b.l();
            fwa fwaVar = fvkVar.a;
            fwaVar.getClass();
            int iMin = (int) Math.min(j, fwaVar.c - fwaVar.b);
            this.a.write(fwaVar.a, fwaVar.b, iMin);
            int i = fwaVar.b + iMin;
            fwaVar.b = i;
            long j2 = iMin;
            fvkVar.b -= j2;
            j -= j2;
            if (i == fwaVar.c) {
                fvkVar.a = fwaVar.a();
                fwb.b(fwaVar);
            }
        }
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.fwd, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
