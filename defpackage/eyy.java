package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyy extends InputStream implements InputStreamRetargetInterface, env {
    private final eyx a;

    public eyy(eyx eyxVar) {
        eyxVar.getClass();
        this.a = eyxVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.f();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a.f() == 0) {
            return -1;
        }
        return this.a.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int iMin = (int) Math.min(this.a.f(), j);
        this.a.l(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.f() == 0) {
            return -1;
        }
        int iMin = Math.min(this.a.f(), i2);
        this.a.k(bArr, i, iMin);
        return iMin;
    }
}
