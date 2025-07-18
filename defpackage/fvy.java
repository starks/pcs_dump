package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvy extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fvy(fvk fvkVar, int i) {
        this.b = i;
        this.a = fvkVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        if (this.b != 0) {
            jMin = Math.min(((fvk) this.a).b, 2147483647L);
        } else {
            fvz fvzVar = (fvz) this.a;
            if (fvzVar.c) {
                throw new IOException("closed");
            }
            jMin = Math.min(fvzVar.b.b, 2147483647L);
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            return;
        }
        ((fvz) this.a).close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte bD;
        if (this.b != 0) {
            fvk fvkVar = (fvk) this.a;
            if (fvkVar.b <= 0) {
                return -1;
            }
            bD = fvkVar.d();
        } else {
            fvz fvzVar = (fvz) this.a;
            if (fvzVar.c) {
                throw new IOException("closed");
            }
            fvk fvkVar2 = fvzVar.b;
            if (fvkVar2.b == 0 && fvzVar.a.b(fvkVar2, 8192L) == -1) {
                return -1;
            }
            bD = ((fvz) this.a).b.d();
        }
        return bD & 255;
    }

    public final String toString() {
        if (this.b != 0) {
            Object obj = this.a;
            Objects.toString(obj);
            return obj.toString().concat(".inputStream()");
        }
        Object obj2 = this.a;
        Objects.toString(obj2);
        return obj2.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return this.b != 0 ? DesugarInputStream.transferTo(this, outputStream) : DesugarInputStream.transferTo(this, outputStream);
    }

    public fvy(fvz fvzVar, int i) {
        this.b = i;
        this.a = fvzVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.b != 0) {
            bArr.getClass();
            return ((fvk) this.a).e(bArr, i, i2);
        }
        bArr.getClass();
        if (!((fvz) this.a).c) {
            fwv.m(bArr.length, i, i2);
            fvz fvzVar = (fvz) this.a;
            fvk fvkVar = fvzVar.b;
            if (fvkVar.b == 0 && fvzVar.a.b(fvkVar, 8192L) == -1) {
                return -1;
            }
            return ((fvz) this.a).b.e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
