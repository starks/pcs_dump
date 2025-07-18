package defpackage;

import java.io.IOException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftx implements fwf {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final fvm f;

    public ftx(fvm fvmVar) {
        this.f = fvmVar;
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.f.a();
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) throws IOException {
        int i;
        int iF;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                this.f.D(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iG = frh.g(this.f);
                    this.d = iG;
                    this.a = iG;
                    int iA = frh.A(this.f.d());
                    this.b = frh.A(this.f.d());
                    if (fty.a.isLoggable(Level.FINE)) {
                        fty.a.fine(ftf.a.a(true, this.c, this.a, iA, this.b));
                    }
                    iF = this.f.f() & Integer.MAX_VALUE;
                    this.c = iF;
                    if (iA != 9) {
                        throw new IOException(iA + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jB = this.f.b(fvkVar, Math.min(j, i2));
                if (jB != -1) {
                    this.d -= (int) jB;
                    return jB;
                }
            }
            return -1L;
        } while (iF == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
