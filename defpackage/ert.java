package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ert extends InputStream implements InputStreamRetargetInterface, env {
    private byte[][] a;
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public ert(byte[] bArr) {
        this.a = null;
        int length = bArr.length;
        this.b = length <= 0 ? null : bArr;
        this.e = length;
    }

    private final void a() {
        int i = this.c + 1;
        this.c = i;
        this.d = 0;
        byte[][] bArr = this.a;
        if (bArr == null || i >= bArr.length) {
            this.b = null;
        } else {
            this.b = bArr[i];
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        byte[][] bArr = this.a;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                eru.a(bArr2);
            }
        } else {
            byte[] bArr3 = this.b;
            if (bArr3 != null) {
                eru.a(bArr3);
            }
        }
        this.b = null;
        this.a = null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return -1;
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte b = bArr[i];
        this.e--;
        if (i2 == bArr.length) {
            a();
        }
        return b;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public ert(byte[][] bArr, int i) {
        this.a = bArr;
        this.e = i;
        if (bArr.length > 0) {
            this.b = bArr[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.b;
            if (bArr2 == null) {
                break;
            }
            int[] iArr = {i3, bArr2.length - this.d, this.e};
            clq.v(true);
            int i4 = iArr[0];
            for (int i5 = 1; i5 < 3; i5++) {
                int i6 = iArr[i5];
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            System.arraycopy(this.b, this.d, bArr, i, i4);
            i += i4;
            i3 -= i4;
            this.e -= i4;
            if (i3 == 0) {
                int i7 = this.d + i4;
                this.d = i7;
                if (i7 == this.b.length) {
                    a();
                }
            } else {
                a();
            }
        }
        int i8 = i2 - i3;
        if (i8 > 0 || this.e > 0) {
            return i8;
        }
        return -1;
    }
}
