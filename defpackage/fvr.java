package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvr implements fwf {
    private byte a;
    private final fvz b;
    private final Inflater c;
    private final fvs d;
    private final CRC32 e;

    public fvr(fwf fwfVar) {
        fvz fvzVar = new fvz(fwfVar);
        this.b = fvzVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new fvs(fvzVar, inflater);
        this.e = new CRC32();
    }

    private final void c(fvk fvkVar, long j, long j2) {
        fwa fwaVar = fvkVar.a;
        fwaVar.getClass();
        while (true) {
            long j3 = fwaVar.c - fwaVar.b;
            if (j < j3) {
                break;
            }
            fwaVar = fwaVar.f;
            fwaVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (fwaVar.b + j);
            int iMin = (int) Math.min(fwaVar.c - i, j2);
            this.e.update(fwaVar.a, i, iMin);
            fwaVar = fwaVar.f;
            fwaVar.getClass();
            j2 -= iMin;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + fjz.x(fwv.l(i2)) + " != expected 0x" + fjz.x(fwv.l(i)));
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.b.a();
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) throws DataFormatException, IOException {
        byte b = this.a;
        if (b == 0) {
            this.b.C(10L);
            byte bC = this.b.b.c(3L);
            int i = (bC >> 1) & 1;
            if (i != 0) {
                c(this.b.b, 0L, 10L);
            }
            d("ID1ID2", 8075, this.b.z());
            this.b.D(8L);
            if (((bC >> 2) & 1) == 1) {
                this.b.C(2L);
                if (i != 0) {
                    c(this.b.b, 0L, 2L);
                }
                long jA = (char) this.b.b.A();
                this.b.C(jA);
                if (i != 0) {
                    c(this.b.b, 0L, jA);
                }
                this.b.D(jA);
            }
            if (((bC >> 3) & 1) == 1) {
                long jG = this.b.g();
                if (jG == -1) {
                    throw new EOFException();
                }
                long j2 = jG + 1;
                if (i != 0) {
                    c(this.b.b, 0L, j2);
                }
                this.b.D(j2);
            }
            if (((bC >> 4) & 1) == 1) {
                long jG2 = this.b.g();
                if (jG2 == -1) {
                    throw new EOFException();
                }
                long j3 = jG2 + 1;
                if (i != 0) {
                    c(this.b.b, 0L, j3);
                }
                this.b.D(j3);
            }
            if (i != 0) {
                fvz fvzVar = this.b;
                fvzVar.C(2L);
                d("FHCRC", fvzVar.b.A(), (short) this.e.getValue());
                this.e.reset();
            }
            this.a = (byte) 1;
            b = 1;
        }
        if (b != 1) {
            if (b == 2) {
            }
            return -1L;
        }
        long j4 = fvkVar.b;
        long jB = this.d.b(fvkVar, j);
        if (jB != -1) {
            c(fvkVar, j4, jB);
            return jB;
        }
        this.a = (byte) 2;
        d("CRC", this.b.c(), (int) this.e.getValue());
        d("ISIZE", this.b.c(), (int) this.c.getBytesWritten());
        this.a = (byte) 3;
        if (!this.b.E()) {
            throw new IOException("gzip finished without exhausting source");
        }
        return -1L;
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
