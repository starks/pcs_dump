package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frr extends fvp {
    final /* synthetic */ frs a;
    private final long c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frr(frs frsVar, fwf fwfVar, long j) {
        super(fwfVar);
        fwfVar.getClass();
        this.a = frsVar;
        this.c = j;
        this.e = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // defpackage.fvp, defpackage.fwf
    public final long b(fvk fvkVar, long j) throws IOException {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jB = this.b.b(fvkVar, j);
            if (this.e) {
                this.e = false;
            }
            if (jB == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.d + jB;
            long j3 = this.c;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.c + " bytes but received " + j2);
            }
            this.d = j2;
            if (j2 == j3) {
                c(null);
            }
            return jB;
        } catch (IOException e) {
            throw c(e);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
        }
        return this.a.e(true, false, iOException);
    }

    @Override // defpackage.fvp, defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            this.b.close();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
