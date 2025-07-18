package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fpp extends fmt {
    private final int c;
    public final fpl d;
    private final int e;
    private final long f;
    private final String g;

    public fpp(int i, int i2, long j, String str) {
        this.c = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        this.d = new fpl(i, i2, j, str);
    }

    public void close() {
        this.d.close();
    }

    @Override // defpackage.flx
    public final void d(fhq fhqVar, Runnable runnable) {
        this.d.d(runnable, false);
    }
}
