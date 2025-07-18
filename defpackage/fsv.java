package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsv extends fss {
    final /* synthetic */ fsy c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsv(fsy fsyVar, long j) {
        super(fsyVar);
        this.c = fsyVar;
        this.d = j;
        if (j == 0) {
            c();
        }
    }

    @Override // defpackage.fss, defpackage.fwf
    public final long b(fvk fvkVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jB = super.b(fvkVar, Math.min(j2, j));
        if (jB == -1) {
            this.c.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j3 = this.d - jB;
        this.d = j3;
        if (j3 == 0) {
            c();
        }
        return jB;
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !frh.E(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
