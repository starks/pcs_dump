package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eya implements Closeable, eul {
    public exx a;
    private int b;
    private final fbh c;
    private final fbn d;
    private emt e;
    private boolean g;
    private eug h;
    private long j;
    private int m;
    private ffi q;
    private int p = 1;
    private int f = 5;
    private eug i = new eug();
    private boolean k = false;
    private int l = -1;
    private boolean n = false;
    private volatile boolean o = false;

    public eya(exx exxVar, emt emtVar, int i, fbh fbhVar, fbn fbnVar) {
        this.a = exxVar;
        this.e = emtVar;
        this.b = i;
        this.c = fbhVar;
        this.d = fbnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        if (r7.n == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        if (h() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eya.g():void");
    }

    private final boolean h() {
        return this.i.a == 0;
    }

    private final boolean i() throws Throwable {
        int i = 0;
        try {
            if (this.h == null) {
                this.h = new eug();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f - this.h.a;
                    if (i3 <= 0) {
                        if (i2 <= 0) {
                            return true;
                        }
                        this.a.o(i2);
                        if (this.p != 2) {
                            return true;
                        }
                        this.c.e();
                        this.m += i2;
                        return true;
                    }
                    int i4 = this.i.a;
                    if (i4 == 0) {
                        if (i2 > 0) {
                            this.a.o(i2);
                            if (this.p == 2) {
                                this.c.e();
                                this.m += i2;
                            }
                        }
                        return false;
                    }
                    int iMin = Math.min(i3, i4);
                    i2 += iMin;
                    this.h.h(this.i.g(iMin));
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.a.o(i);
                        if (this.p == 2) {
                            this.c.e();
                            this.m += i;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.eul
    public final void a() {
        if (f()) {
            return;
        }
        if (h()) {
            close();
        } else {
            this.n = true;
        }
    }

    @Override // defpackage.eul
    public final void b(eyx eyxVar) throws Throwable {
        boolean z = true;
        try {
            if (f() || this.n) {
                eyxVar.close();
                return;
            }
            this.i.h(eyxVar);
            try {
                g();
            } catch (Throwable th) {
                th = th;
                z = false;
                if (z) {
                    eyxVar.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.eul
    public final void c(int i) {
        clq.w(true, "numMessages must be > 0");
        if (f()) {
            return;
        }
        this.j += i;
        g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.eul
    public final void close() {
        if (f()) {
            return;
        }
        eug eugVar = this.h;
        boolean z = false;
        if (eugVar != null && eugVar.a > 0) {
            z = true;
        }
        try {
            eug eugVar2 = this.i;
            if (eugVar2 != null) {
                eugVar2.close();
            }
            eug eugVar3 = this.h;
            if (eugVar3 != null) {
                eugVar3.close();
            }
            this.q = null;
            this.i = null;
            this.h = null;
            this.a.g(z);
        } catch (Throwable th) {
            this.q = null;
            this.i = null;
            this.h = null;
            throw th;
        }
    }

    @Override // defpackage.eul
    public final void d(emt emtVar) {
        clq.G(true, "Already set full stream decompressor");
        this.e = emtVar;
    }

    @Override // defpackage.eul
    public final void e(int i) {
        this.b = i;
    }

    public final boolean f() {
        return this.i == null;
    }
}
