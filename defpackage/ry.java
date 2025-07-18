package defpackage;

import android.graphics.Color;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ry {
    public static final /* synthetic */ int a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(e((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), e((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), e((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int b(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iRed = Color.red(i);
        int iRed2 = Color.red(i2);
        int i3 = 255 - (((255 - iAlpha) * (255 - iAlpha2)) / AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        return Color.argb(i3, d(iRed, iAlpha2, iRed2, iAlpha, i3), d(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), d(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    public static int c(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    private static int d(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * AIFeature.Id.ROSIE_ROBOT_TRANSLATE) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
    }

    private static int e(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
    }
}
