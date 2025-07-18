package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvs implements fwf {
    private final fvm a;
    private final Inflater b;
    private int c;
    private boolean d;

    public fvs(fvm fvmVar, Inflater inflater) {
        this.a = fvmVar;
        this.b = inflater;
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.a.a();
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) throws DataFormatException, IOException {
        do {
            long jC = c(fvkVar, j);
            if (jC > 0) {
                return jC;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.E());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(fvk fvkVar, long j) throws DataFormatException, IOException {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        try {
            fwa fwaVarY = fvkVar.y(1);
            int iMin = (int) Math.min(j, 8192 - fwaVarY.c);
            if (this.b.needsInput() && !this.a.E()) {
                fwa fwaVar = this.a.p().a;
                fwaVar.getClass();
                int i = fwaVar.c;
                int i2 = fwaVar.b;
                int i3 = i - i2;
                this.c = i3;
                this.b.setInput(fwaVar.a, i2, i3);
            }
            int iInflate = this.b.inflate(fwaVarY.a, fwaVarY.c, iMin);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - this.b.getRemaining();
                this.c -= remaining;
                this.a.D(remaining);
            }
            if (iInflate > 0) {
                fwaVarY.c += iInflate;
                long j2 = iInflate;
                fvkVar.b += j2;
                return j2;
            }
            if (fwaVarY.b != fwaVarY.c) {
                return 0L;
            }
            fvkVar.a = fwaVarY.a();
            fwb.b(fwaVarY);
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
