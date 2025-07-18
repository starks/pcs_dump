package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fua implements fwf {
    public final long a;
    public boolean b;
    public final fvk c = new fvk();
    public final fvk d = new fvk();
    public boolean e;
    final /* synthetic */ fuc f;

    public fua(fuc fucVar, long j, boolean z) {
        this.f = fucVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.f.i;
    }

    @Override // defpackage.fwf
    public final long b(fvk fvkVar, long j) throws Throwable {
        Throwable th;
        Throwable fujVar;
        boolean z;
        long jB;
        do {
            fuc fucVar = this.f;
            synchronized (fucVar) {
                fucVar.i.e();
                try {
                    th = null;
                    if (fucVar.b() == null || this.b) {
                        fujVar = null;
                    } else {
                        fujVar = fucVar.k;
                        if (fujVar == null) {
                            fta ftaVarB = fucVar.b();
                            ftaVarB.getClass();
                            fujVar = new fuj(ftaVarB);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    fvk fvkVar2 = this.d;
                    long j2 = fvkVar2.b;
                    z = false;
                    if (j2 > 0) {
                        jB = fvkVar2.b(fvkVar, Math.min(j, j2));
                        long j3 = fucVar.c + jB;
                        fucVar.c = j3;
                        long j4 = j3 - fucVar.d;
                        if (fujVar == null) {
                            ftv ftvVar = fucVar.b;
                            if (j4 >= ftvVar.s.c() / 2) {
                                ftvVar.l(fucVar.a, j4);
                                fucVar.d = fucVar.c;
                            }
                        } else {
                            th = fujVar;
                        }
                    } else {
                        if (this.b || fujVar != null) {
                            th = fujVar;
                        } else {
                            fucVar.k();
                            z = true;
                        }
                        jB = -1;
                    }
                } finally {
                    fucVar.i.c();
                }
            }
        } while (z);
        if (jB != -1) {
            return jB;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    public final void c(long j) {
        byte[] bArr = frh.a;
        this.f.b.g(j);
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        fuc fucVar = this.f;
        synchronized (fucVar) {
            this.e = true;
            fvk fvkVar = this.d;
            j = fvkVar.b;
            fvkVar.B();
            fucVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.e();
    }
}
