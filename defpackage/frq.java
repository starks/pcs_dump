package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frq extends fvo {
    final /* synthetic */ frs a;
    private final long c;
    private boolean d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frq(frs frsVar, fwd fwdVar, long j) {
        super(fwdVar);
        fwdVar.getClass();
        this.a = frsVar;
        this.c = j;
    }

    private final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return this.a.e(false, true, iOException);
    }

    @Override // defpackage.fvo, defpackage.fwd
    public final void bi(fvk fvkVar, long j) throws IOException {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.e + j;
        long j3 = this.c;
        if (j2 <= j3) {
            try {
                this.b.bi(fvkVar, j);
                this.e += j;
                return;
            } catch (IOException e) {
                throw c(e);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.e + j));
    }

    @Override // defpackage.fvo, defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e != this.c) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.b.close();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.fvo, defpackage.fwd, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
