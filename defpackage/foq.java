package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foq extends flx implements fmh {
    public final flx c;
    private final int d;
    private final flg e;
    private final Object f;
    private final ekf g;

    /* JADX WARN: Multi-variable type inference failed */
    public foq(flx flxVar, int i) {
        if ((flxVar instanceof fmh ? (fmh) flxVar : null) == null) {
            int i2 = fmg.a;
        }
        this.c = flxVar;
        this.d = i;
        this.e = fjp.t(0);
        this.g = new ekf((byte[]) null, (char[]) null);
        this.f = new Object();
    }

    public final Runnable c() {
        while (true) {
            Runnable runnable = (Runnable) this.g.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f) {
                this.e.a();
                if (this.g.b() == 0) {
                    return null;
                }
                this.e.d();
            }
        }
    }

    @Override // defpackage.flx
    public final void d(fhq fhqVar, Runnable runnable) {
        this.g.e(runnable);
        if (this.e.a < this.d) {
            synchronized (this.f) {
                if (this.e.a >= this.d) {
                    return;
                }
                this.e.d();
                Runnable runnableC = c();
                if (runnableC == null) {
                    return;
                }
                this.c.d(this, new fop(this, runnableC));
            }
        }
    }

    @Override // defpackage.flx
    public final String toString() {
        return this.c + ".limitedParallelism(" + this.d + ")";
    }
}
