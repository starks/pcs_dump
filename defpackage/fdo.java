package defpackage;

import java.io.IOException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdo implements fwf {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final fvm f;

    public fdo(fvm fvmVar) {
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
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iB = fds.b(this.f);
                    this.d = iB;
                    this.a = iB;
                    int iD = this.f.d() & 255;
                    this.b = (byte) (this.f.d() & 255);
                    byte b = (byte) iD;
                    if (fds.a.isLoggable(Level.FINE)) {
                        fds.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", fdp.a(true, this.c, this.a, b, this.b));
                    }
                    iF = this.f.f() & Integer.MAX_VALUE;
                    this.c = iF;
                    if (b != 9) {
                        throw fds.c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
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
        throw fds.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
