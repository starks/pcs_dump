package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rx {
    static final rx a;
    public final float b;
    public final float c;
    public final float d;
    public final float e = 0.69f;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = rq.c;
        double dC = rq.c();
        float[][] fArr2 = rq.a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = fArr3[1] * f3;
        float f5 = fArr[2];
        float f6 = fArr3[2] * f5;
        float[] fArr4 = fArr2[1];
        float f7 = fArr4[0] * f;
        float f8 = fArr4[1] * f3;
        float f9 = fArr4[2] * f5;
        float[] fArr5 = fArr2[2];
        float f10 = f * fArr5[0];
        float f11 = f3 * fArr5[1];
        float f12 = f5 * fArr5[2];
        float f13 = (float) ((dC * 63.66197723675813d) / 100.0d);
        float fExp = 1.0f - (((float) Math.exp(((-f13) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float f14 = f7 + f8 + f9;
        float f15 = f2 + f4 + f6;
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / ((f10 + f11) + f12)) * fExp) + 1.0f) - fExp};
        float f16 = 1.0f / ((5.0f * f13) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float f19 = f17 * f13;
        float fCbrt = (float) Math.cbrt(f13 * 5.0d);
        float fC = rq.c() / fArr[1];
        double d2 = fC;
        float fSqrt = (float) Math.sqrt(d2);
        float fPow = (float) Math.pow(d2, 0.2d);
        float f20 = f19 + (0.1f * f18 * f18 * fCbrt);
        float fPow2 = (float) Math.pow(((fArr6[0] * f20) * f15) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((fArr6[1] * f20) * f14) / 100.0d, 0.42d);
        float fPow4 = (float) Math.pow(((fArr6[2] * f20) * r5) / 100.0d, 0.42d);
        float[] fArr7 = {fPow2, fPow3, fPow4};
        float f21 = fArr7[0];
        float f22 = fArr7[1];
        float f23 = (400.0f * fPow4) / (fPow4 + 27.13f);
        float[] fArr8 = {(f21 * 400.0f) / (f21 + 27.13f), (f22 * 400.0f) / (f22 + 27.13f), f23};
        float f24 = fArr8[0];
        float f25 = 0.725f / fPow;
        a = new rx(fC, (f24 + f24 + fArr8[1] + (f23 * 0.05f)) * f25, f25, f25, 0.69f, fArr6, f20, (float) Math.pow(f20, 0.25d), fSqrt + 1.48f);
    }

    private rx(float f, float f2, float f3, float f4, float f5, float[] fArr, float f6, float f7, float f8) {
        this.f = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.g = fArr;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }
}
