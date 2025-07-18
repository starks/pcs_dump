package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clr {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public clr(Context context) {
        boolean zM = cnx.m(context, R.attr.elevationOverlayEnabled, false);
        int iK = clq.k(context, R.attr.elevationOverlayColor);
        int iK2 = clq.k(context, R.attr.elevationOverlayAccentColor);
        int iK3 = clq.k(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = zM;
        this.d = iK;
        this.e = iK2;
        this.b = iK3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        if (!this.a || ry.c(i, AIFeature.Id.ROSIE_ROBOT_TRANSLATE) != this.b) {
            return i;
        }
        float fMin = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int i3 = clq.i(ry.c(i, AIFeature.Id.ROSIE_ROBOT_TRANSLATE), this.d, fMin);
        if (fMin > 0.0f && (i2 = this.e) != 0) {
            i3 = ry.b(ry.c(i2, c), i3);
        }
        return ry.c(i3, iAlpha);
    }
}
