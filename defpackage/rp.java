package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rp {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public rp(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    static rp b(int i) {
        rx rxVar = rx.a;
        int i2 = rq.e;
        float fA = rq.a(Color.red(i));
        float fA2 = rq.a(Color.green(i));
        float fA3 = rq.a(Color.blue(i));
        float[][] fArr = rq.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * fA) + (fArr2[1] * fA2);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * fA) + (fArr3[1] * fA2);
        float[] fArr4 = fArr[2];
        float[] fArr5 = {f + (fArr2[2] * fA3), f2 + (fArr3[2] * fA3), (fA * fArr4[0]) + (fA2 * fArr4[1]) + (fA3 * fArr4[2])};
        float[][] fArr6 = rq.a;
        float f3 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f4 = fArr7[0] * f3;
        float f5 = fArr5[1];
        float f6 = fArr7[1] * f5;
        float f7 = fArr5[2];
        float f8 = fArr7[2] * f7;
        float[] fArr8 = fArr6[1];
        float f9 = fArr8[0] * f3;
        float f10 = fArr8[1] * f5;
        float f11 = fArr8[2] * f7;
        float[] fArr9 = fArr6[2];
        float f12 = f3 * fArr9[0];
        float f13 = f5 * fArr9[1];
        float f14 = f7 * fArr9[2];
        float[] fArr10 = rxVar.g;
        float f15 = fArr10[0] * (f4 + f6 + f8);
        float f16 = fArr10[1] * (f9 + f10 + f11);
        float f17 = fArr10[2] * (f12 + f13 + f14);
        float fPow = (float) Math.pow((rxVar.h * Math.abs(f15)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((rxVar.h * Math.abs(f16)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((rxVar.h * Math.abs(f17)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float fAtan2 = (((float) Math.atan2(((float) ((fSignum + fSignum2) - (d + d))) / 9.0f, ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f18 = fSignum2 * 20.0f;
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float f20 = (((((40.0f * fSignum) + f18) + fSignum3) / 20.0f) * rxVar.c) / rxVar.b;
        float f21 = rxVar.e;
        float fPow4 = (float) Math.pow(f20, rxVar.j * 0.69f);
        float f22 = rxVar.e;
        float f23 = fPow4 * 100.0f;
        float fSqrt = ((float) Math.sqrt(f23 / 100.0f)) * 5.7971015f * (rxVar.b + 4.0f) * rxVar.i;
        float f24 = (((fSignum * 20.0f) + f18) + (fSignum3 * 21.0f)) / 20.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rxVar.f), 0.73d)) * ((float) Math.pow(((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rxVar.d) * ((float) Math.sqrt((r4 * r4) + (r0 * r0)))) / (f24 + 0.305f), 0.9d)) * ((float) Math.sqrt(f23 / 100.0d));
        float f25 = rxVar.i * fPow5;
        float f26 = rxVar.e;
        float fSqrt2 = (float) Math.sqrt((r9 * 0.69f) / (rxVar.b + 4.0f));
        double d2 = f19;
        float fLog = ((float) Math.log((0.0228f * f25) + 1.0f)) * 43.85965f;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr5[0] = fAtan2;
        fArr5[1] = fPow5;
        float[] fArr11 = {f23, fSqrt, f25, fSqrt2 * 50.0f, (1.7f * f23) / ((0.007f * f23) + 1.0f), fCos * fLog, fLog * fSin};
        return new rp(fAtan2, fPow5, fArr11[0], fArr11[4], fArr11[5], fArr11[6]);
    }

    public static rp c(float f, float f2, float f3) {
        rx rxVar = rx.a;
        float f4 = rxVar.e;
        double d = f / 100.0d;
        Math.sqrt(d);
        float f5 = rxVar.b;
        float f6 = rxVar.i * f2;
        float fSqrt = (float) Math.sqrt(d);
        float f7 = rxVar.e;
        Math.sqrt(((f2 / fSqrt) * 0.69f) / (rxVar.b + 4.0f));
        double d2 = (3.1415927f * f3) / 180.0f;
        float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        return new rp(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    final int a(rx rxVar) {
        float f = this.b;
        float fSqrt = 0.0f;
        if (f != 0.0d) {
            double d = this.c;
            if (d != 0.0d) {
                fSqrt = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, rxVar.f), 0.73d), 1.1111111111111112d);
        double d2 = (this.a * 3.1415927f) / 180.0f;
        double dCos = Math.cos(2.0d + d2) + 3.8d;
        float f2 = rxVar.e;
        float fPow2 = rxVar.b * ((float) Math.pow(this.c / 100.0d, 1.4492753673265821d / rxVar.j));
        float f3 = ((float) dCos) * 0.25f * 3846.1538f * rxVar.d;
        float f4 = fPow2 / rxVar.c;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f5 = (((0.305f + f4) * 23.0f) * fPow) / (((f3 * 23.0f) + ((11.0f * fPow) * fCos)) + ((108.0f * fPow) * fSin));
        float f6 = fCos * f5;
        float f7 = f5 * fSin;
        float f8 = f4 * 460.0f;
        float fMax = (float) Math.max(0.0d, (Math.abs(r0) * 27.13d) / (400.0d - Math.abs(r0)));
        float fSignum = Math.signum((((451.0f * f6) + f8) + (288.0f * f7)) / 1403.0f) * (100.0f / rxVar.h);
        float fPow3 = (float) Math.pow(fMax, 2.380952380952381d);
        float fMax2 = (float) Math.max(0.0d, (Math.abs(r10) * 27.13d) / (400.0d - Math.abs(r10)));
        float fSignum2 = Math.signum(((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f) * (100.0f / rxVar.h);
        float fPow4 = (float) Math.pow(fMax2, 2.380952380952381d);
        float fMax3 = (float) Math.max(0.0d, (Math.abs(r11) * 27.13d) / (400.0d - Math.abs(r11)));
        float fSignum3 = Math.signum(((f8 - (220.0f * f6)) - (6300.0f * f7)) / 1403.0f) * (100.0f / rxVar.h);
        float fPow5 = (float) Math.pow(fMax3, 2.380952380952381d);
        float[] fArr = rxVar.g;
        float f9 = (fSignum * fPow3) / fArr[0];
        float f10 = (fSignum2 * fPow4) / fArr[1];
        float f11 = (fSignum3 * fPow5) / fArr[2];
        float[][] fArr2 = rq.b;
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f9;
        float f13 = fArr3[1] * f10;
        float f14 = fArr3[2] * f11;
        float[] fArr4 = fArr2[1];
        float f15 = fArr4[0] * f9;
        float f16 = fArr4[1] * f10;
        float f17 = fArr4[2] * f11;
        float[] fArr5 = fArr2[2];
        return ry.a(f12 + f13 + f14, f15 + f16 + f17, (f9 * fArr5[0]) + (f10 * fArr5[1]) + (f11 * fArr5[2]));
    }
}
