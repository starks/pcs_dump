package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdr implements fdj {
    private final fvl a;
    private final fvk b;
    private final fdm c;
    private int d;
    private boolean e;

    public fdr(fvl fvlVar) {
        this.a = fvlVar;
        fvk fvkVar = new fvk();
        this.b = fvkVar;
        this.c = new fdm(fvkVar);
        this.d = 16384;
    }

    @Override // defpackage.fdj
    public final synchronized void a(fdu fduVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.d;
        if ((fduVar.a & 32) != 0) {
            i = ((int[]) fduVar.c)[5];
        }
        this.d = i;
        l(0, 0, (byte) 4, (byte) 1);
        this.a.flush();
    }

    @Override // defpackage.fdj
    public final synchronized void b(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        l(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.a.S(i);
        this.a.S(i2);
        this.a.flush();
    }

    @Override // defpackage.fdj
    public final synchronized void c(int i, fdi fdiVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (fdiVar.s == -1) {
            throw new IllegalArgumentException();
        }
        l(i, 4, (byte) 3, (byte) 0);
        this.a.S(fdiVar.s);
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.a.close();
    }

    @Override // defpackage.fdj
    public final int d() {
        return this.d;
    }

    @Override // defpackage.fdj
    public final synchronized void e() {
        if (this.e) {
            throw new IOException("closed");
        }
        if (fds.a.isLoggable(Level.FINE)) {
            fds.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", fds.b.d()));
        }
        this.a.K(fds.b.m());
        this.a.flush();
    }

    @Override // defpackage.fdj
    public final synchronized void f(boolean z, int i, fvk fvkVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        l(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.a.bi(fvkVar, i2);
        }
    }

    @Override // defpackage.fdj
    public final synchronized void g() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    @Override // defpackage.fdj
    public final synchronized void h(fdu fduVar) {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        l(0, Integer.bitCount(fduVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (fduVar.c(i2)) {
                if (i2 == 4) {
                    int i3 = i2;
                    i2 = 3;
                    i = i3;
                } else {
                    i = 7;
                    if (i2 == 7) {
                        i2 = 4;
                    } else {
                        i = i2;
                    }
                }
                this.a.U(i2);
                this.a.S(fduVar.a(i));
                i2 = i;
            }
            i2++;
        }
        this.a.flush();
    }

    @Override // defpackage.fdj
    public final synchronized void i(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw fds.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        l(i, 4, (byte) 8, (byte) 0);
        this.a.S((int) j);
        this.a.flush();
    }

    @Override // defpackage.fdj
    public final synchronized void j(fdi fdiVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (fdiVar.s == -1) {
            throw fds.d("errorCode.httpCode == -1", new Object[0]);
        }
        l(0, 8, (byte) 7, (byte) 0);
        this.a.S(0);
        this.a.S(fdiVar.s);
        this.a.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // defpackage.fdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void k(boolean r17, int r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdr.k(boolean, int, java.util.List):void");
    }

    final void l(int i, int i2, byte b, byte b2) {
        if (fds.a.isLoggable(Level.FINE)) {
            fds.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", fdp.a(false, i, i2, b, b2));
        }
        int i3 = this.d;
        if (i2 > i3) {
            throw fds.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw fds.d("reserved bit set: %s", Integer.valueOf(i));
        }
        fvl fvlVar = this.a;
        fvlVar.P((i2 >>> 16) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        fvlVar.P((i2 >>> 8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        fvlVar.P(i2 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        this.a.P(b);
        this.a.P(b2);
        this.a.S(i & Integer.MAX_VALUE);
    }
}
