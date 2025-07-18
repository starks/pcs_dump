package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvz implements fvm {
    public final fwf a;
    public final fvk b = new fvk();
    public boolean c;

    public fvz(fwf fwfVar) {
        this.a = fwfVar;
    }

    @Override // defpackage.fvm
    public final void C(long j) throws EOFException {
        if (!e(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.fvm
    public final void D(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            fvk fvkVar = this.b;
            if (fvkVar.b == 0 && this.a.b(fvkVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.b.b);
            this.b.D(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.fvm
    public final boolean E() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fvk fvkVar = this.b;
        return fvkVar.E() && this.a.b(fvkVar, 8192L) == -1;
    }

    @Override // defpackage.fvm
    public final byte[] F() {
        this.b.N(this.a);
        return this.b.F();
    }

    @Override // defpackage.fvm
    public final byte[] G(long j) throws EOFException {
        C(j);
        return this.b.G(j);
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.a.a();
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.C(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fvk fvkVar2 = this.b;
        if (fvkVar2.b == 0 && this.a.b(fvkVar2, 8192L) == -1) {
            return -1L;
        }
        return this.b.b(fvkVar, Math.min(j, this.b.b));
    }

    public final int c() throws EOFException {
        C(4L);
        int iF = this.b.f();
        int i = iF >>> 24;
        int i2 = 16711680 & iF;
        int i3 = 65280 & iF;
        return ((iF & AIFeature.Id.ROSIE_ROBOT_TRANSLATE) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fwf
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.B();
    }

    @Override // defpackage.fvm
    public final byte d() throws EOFException {
        C(1L);
        return this.b.d();
    }

    public final boolean e(long j) {
        fvk fvkVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.C(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            fvkVar = this.b;
            if (fvkVar.b >= j) {
                return true;
            }
        } while (this.a.b(fvkVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.fvm
    public final int f() throws EOFException {
        C(4L);
        return this.b.f();
    }

    public final long g() {
        return h((byte) 0, Long.MAX_VALUE);
    }

    public final long h(byte b, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (jMax < j) {
            byte b2 = b;
            long j2 = j;
            long jH = this.b.h(b2, jMax, j2);
            if (jH != -1) {
                return jH;
            }
            fvk fvkVar = this.b;
            long j3 = fvkVar.b;
            if (j3 >= j2 || this.a.b(fvkVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
            b = b2;
            j = j2;
        }
        return -1L;
    }

    @Override // defpackage.fvm
    public final long i() throws EOFException {
        byte bC;
        C(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!e(i2)) {
                break;
            }
            bC = this.b.c(i);
            if ((bC < 48 || bC > 57) && ((bC < 97 || bC > 102) && (bC < 65 || bC > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            String string = Integer.toString(bC, 16);
            string.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return this.b.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.fvm
    public final InputStream j() {
        return new fvy(this, 0);
    }

    @Override // defpackage.fvm
    public final String n() {
        return o(Long.MAX_VALUE);
    }

    @Override // defpackage.fvm
    public final String o(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.C(j, "limit < 0: "));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jH = h((byte) 10, j2);
        if (jH != -1) {
            return fwi.a(this.b, jH);
        }
        if (j2 < Long.MAX_VALUE && e(j2) && this.b.c((-1) + j2) == 13 && e(1 + j2) && this.b.c(j2) == 10) {
            return fwi.a(this.b, j2);
        }
        fvk fvkVar = new fvk();
        fvk fvkVar2 = this.b;
        fvkVar2.H(fvkVar, 0L, Math.min(32L, fvkVar2.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b.b, j) + " content=" + fvkVar.u().d() + "…");
    }

    @Override // defpackage.fvm, defpackage.fvl
    public final fvk p() {
        return this.b;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fvk fvkVar = this.b;
        if (fvkVar.b == 0 && this.a.b(fvkVar, 8192L) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.fvm
    public final fvn v(long j) throws EOFException {
        C(j);
        return this.b.v(j);
    }

    @Override // defpackage.fvm
    public final short z() throws EOFException {
        C(2L);
        return this.b.z();
    }
}
