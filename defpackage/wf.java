package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wf {
    public int a;
    public int b;
    public float c;
    public float d;
    public float j;
    public int k;
    public long e = Long.MIN_VALUE;
    public long i = -1;
    public long f = 0;
    public int g = 0;
    public int h = 0;

    public final float a(long j) {
        if (j < this.e) {
            return 0.0f;
        }
        long j2 = this.i;
        if (j2 < 0 || j < j2) {
            return wg.a((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.j;
        return (1.0f - f) + (f * wg.a((j - j2) / this.k, 0.0f, 1.0f));
    }
}
