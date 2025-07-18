package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fud implements Closeable {
    private static final Logger b = Logger.getLogger(ftf.class.getName());
    public int a;
    private final fvl c;
    private final boolean d;
    private final fvk e;
    private boolean f;
    private final ftd g;

    public fud(fvl fvlVar, boolean z) {
        fvlVar.getClass();
        this.c = fvlVar;
        this.d = true;
        fvk fvkVar = new fvk();
        this.e = fvkVar;
        this.a = 16384;
        this.g = new ftd(fvkVar);
    }

    public final synchronized void a(fui fuiVar) {
        fuiVar.getClass();
        if (this.f) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((fuiVar.a & 32) != 0) {
            i = ((int[]) fuiVar.b)[5];
        }
        this.a = i;
        if (fuiVar.b() != -1) {
            ftd ftdVar = this.g;
            int iB = fuiVar.b();
            ftdVar.a = iB;
            int iMin = Math.min(iB, 16384);
            int i2 = ftdVar.e;
            if (i2 != iMin) {
                if (iMin < i2) {
                    ftdVar.c = Math.min(ftdVar.c, iMin);
                }
                ftdVar.d = true;
                ftdVar.e = iMin;
                int i3 = ftdVar.i;
                if (iMin < i3) {
                    if (iMin == 0) {
                        ftdVar.a();
                    } else {
                        ftdVar.e(i3 - iMin);
                    }
                }
            }
        }
        e(0, 0, 4, 1);
        this.c.flush();
    }

    public final synchronized void b() {
        if (this.f) {
            throw new IOException("closed");
        }
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(frh.j(">> CONNECTION ".concat(ftf.b.d()), new Object[0]));
        }
        this.c.J(ftf.b);
        this.c.flush();
    }

    public final synchronized void c(boolean z, int i, fvk fvkVar, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            fvl fvlVar = this.c;
            fvkVar.getClass();
            fvlVar.bi(fvkVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        this.c.close();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    public final void e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
            logger.fine(ftf.a.a(false, i5, i6, i7, i8));
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int i9 = this.a;
        if (i6 > i9) {
            throw new IllegalArgumentException(a.D(i6, i9, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            throw new IllegalArgumentException(a.x(i5, "reserved bit set: "));
        }
        fvl fvlVar = this.c;
        byte[] bArr = frh.a;
        fvlVar.P((i6 >>> 16) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        fvlVar.P((i6 >>> 8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        fvlVar.P(i6 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        this.c.P(i7);
        this.c.P(i8);
        this.c.S(Integer.MAX_VALUE & i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(boolean r17, int r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fud.f(boolean, int, java.util.List):void");
    }

    public final synchronized void g(boolean z, int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        this.c.S(i);
        this.c.S(i2);
        this.c.flush();
    }

    public final synchronized void h(int i, fta ftaVar) {
        ftaVar.getClass();
        if (this.f) {
            throw new IOException("closed");
        }
        e(i, 4, 3, 0);
        this.c.S(ftaVar.o);
        this.c.flush();
    }

    public final synchronized void i(fui fuiVar) {
        if (this.f) {
            throw new IOException("closed");
        }
        int i = 0;
        e(0, Integer.bitCount(fuiVar.a) * 6, 4, 0);
        while (i < 10) {
            if (fuiVar.f(i)) {
                this.c.U(i != 4 ? i != 7 ? i : 4 : 3);
                this.c.S(fuiVar.a(i));
            }
            i++;
        }
        this.c.flush();
    }

    public final synchronized void j(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.C(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
        }
        e(i, 4, 8, 0);
        this.c.S((int) j);
        this.c.flush();
    }

    public final synchronized void k(int i, fta ftaVar) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(0, 8, 7, 0);
        this.c.S(i);
        this.c.S(ftaVar.o);
        this.c.flush();
    }
}
