package defpackage;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sb {
    public char a;
    public final float[] b;

    public sb(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = d4 * dSin;
        double d6 = d4;
        double d7 = f4;
        double d8 = f6;
        double d9 = (((-f) * dSin) + (d6 * dCos)) / d8;
        double d10 = (((-f3) * dSin) + (d7 * dCos)) / d8;
        double d11 = d9 - d10;
        double d12 = f5;
        double d13 = ((d3 * dCos) + d5) / d12;
        double d14 = ((f3 * dCos) + (d7 * dSin)) / d12;
        double d15 = d13 - d14;
        double d16 = (d15 * d15) + (d11 * d11);
        if (d16 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d16);
            float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d17);
        double d18 = (d9 + d10) / 2.0d;
        double d19 = d15 * dSqrt;
        double d20 = (d13 + d14) / 2.0d;
        double d21 = dSqrt * d11;
        if (z == z2) {
            d = d20 - d21;
            d2 = d18 + d19;
        } else {
            d = d20 + d21;
            d2 = d18 - d19;
        }
        double d22 = d2;
        double d23 = d;
        double dAtan2 = Math.atan2(d9 - d22, d13 - d);
        double dAtan22 = Math.atan2(d10 - d22, d14 - d23) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 += dAtan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d24 = d23 * d12;
        double d25 = d22 * d8;
        double d26 = d24 * dCos;
        double d27 = d25 * dSin;
        double d28 = d24 * dSin;
        double d29 = d25 * dCos;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d30 = -d12;
        double d31 = d30 * dCos2;
        double d32 = d8 * dSin2;
        double d33 = d30 * dSin2;
        double d34 = d8 * dCos2;
        double d35 = (dSin3 * d33) + (dCos3 * d34);
        double d36 = (d31 * dSin3) - (d32 * dCos3);
        double d37 = d3;
        int i = 0;
        double d38 = dAtan2;
        while (i < iCeil) {
            double d39 = d12;
            double d40 = (dAtan22 / iCeil) + d38;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            double d41 = d40 - d38;
            double dTan = Math.tan(d41 / 2.0d);
            double dSin5 = (Math.sin(d41) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            int i2 = iCeil;
            double d42 = d37 + (d36 * dSin5);
            path.rLineTo(0.0f, 0.0f);
            double d43 = d28 + d29 + (d39 * dSin2 * dCos4) + (d34 * dSin4);
            double d44 = ((d26 - d27) + ((d39 * dCos2) * dCos4)) - (d32 * dSin4);
            double d45 = (dSin4 * d33) + (dCos4 * d34);
            double d46 = (d31 * dSin4) - (d32 * dCos4);
            path.cubicTo((float) d42, (float) (d6 + (d35 * dSin5)), (float) (d44 - (dSin5 * d46)), (float) (d43 - (dSin5 * d45)), (float) d44, (float) d43);
            i++;
            d6 = d43;
            d33 = d33;
            d37 = d44;
            dCos2 = dCos2;
            dAtan22 = dAtan22;
            d35 = d45;
            d12 = d39;
            d36 = d46;
            dSin2 = dSin2;
            iCeil = i2;
            d38 = d40;
        }
    }

    public sb(sb sbVar) {
        this.a = sbVar.a;
        float[] fArr = sbVar.b;
        this.b = ul.p(fArr, fArr.length);
    }
}
