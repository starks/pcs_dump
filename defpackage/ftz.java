package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftz implements fwd {
    public final boolean a;
    public boolean b;
    final /* synthetic */ fuc c;
    private final fvk d = new fvk();

    public ftz(fuc fucVar, boolean z) {
        this.c = fucVar;
        this.a = z;
    }

    /* JADX WARN: Finally extract failed */
    private final void c(boolean z) {
        long jMin;
        boolean z2;
        fuc fucVar = this.c;
        synchronized (fucVar) {
            fucVar.j.e();
            while (fucVar.e >= fucVar.f && !this.a && !this.b && fucVar.b() == null) {
                try {
                    fucVar.k();
                } catch (Throwable th) {
                    fucVar.j.c();
                    throw th;
                }
            }
            fucVar.j.c();
            fucVar.f();
            jMin = Math.min(fucVar.f - fucVar.e, this.d.b);
            fucVar.e += jMin;
            boolean z3 = false;
            if (z && jMin == this.d.b) {
                z3 = true;
            }
            z2 = z3;
        }
        this.c.j.e();
        try {
            fuc fucVar2 = this.c;
            fucVar2.b.h(fucVar2.a, z2, this.d, jMin);
        } finally {
            this.c.j.c();
        }
    }

    @Override // defpackage.fwd
    public final fwh a() {
        return this.c.j;
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) {
        byte[] bArr = frh.a;
        this.d.bi(fvkVar, j);
        while (this.d.b >= 16384) {
            c(false);
        }
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = frh.a;
        fuc fucVar = this.c;
        synchronized (fucVar) {
            if (this.b) {
                return;
            }
            fta ftaVarB = fucVar.b();
            fuc fucVar2 = this.c;
            if (!fucVar2.h.a) {
                if (this.d.b > 0) {
                    while (this.d.b > 0) {
                        c(true);
                    }
                } else if (ftaVarB == null) {
                    fucVar2.b.h(fucVar2.a, true, null, 0L);
                }
            }
            synchronized (this.c) {
                this.b = true;
            }
            this.c.b.e();
            this.c.e();
        }
    }

    @Override // defpackage.fwd, java.io.Flushable
    public final void flush() {
        byte[] bArr = frh.a;
        fuc fucVar = this.c;
        synchronized (fucVar) {
            fucVar.f();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.e();
        }
    }
}
