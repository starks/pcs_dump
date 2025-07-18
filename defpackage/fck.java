package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fck extends est {
    private final fvk a;

    public fck(fvk fvkVar) {
        this.a = fvkVar;
    }

    @Override // defpackage.est, defpackage.eyx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.a.B();
    }

    @Override // defpackage.eyx
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.eyx
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.eyx
    public final eyx g(int i) {
        fvk fvkVar = new fvk();
        fvkVar.bi(this.a, i);
        return new fck(fvkVar);
    }

    @Override // defpackage.eyx
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eyx
    public final void j(OutputStream outputStream, int i) throws IOException {
        outputStream.getClass();
        fvk fvkVar = this.a;
        long j = i;
        fwv.m(fvkVar.b, 0L, j);
        fwa fwaVar = fvkVar.a;
        while (j > 0) {
            fwaVar.getClass();
            int iMin = (int) Math.min(j, fwaVar.c - fwaVar.b);
            outputStream.write(fwaVar.a, fwaVar.b, iMin);
            int i2 = fwaVar.b + iMin;
            fwaVar.b = i2;
            long j2 = iMin;
            fvkVar.b -= j2;
            j -= j2;
            if (i2 == fwaVar.c) {
                fwa fwaVarA = fwaVar.a();
                fvkVar.a = fwaVarA;
                fwb.b(fwaVar);
                fwaVar = fwaVarA;
            }
        }
    }

    @Override // defpackage.eyx
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iE = this.a.e(bArr, i, i2);
            if (iE == -1) {
                throw new IndexOutOfBoundsException(a.E(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= iE;
            i += iE;
        }
    }

    @Override // defpackage.eyx
    public final void l(int i) {
        try {
            this.a.D(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
