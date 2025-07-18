package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afx extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new yk();
    private static final int[] g = {-16777216};
    public final afw a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private Animator i;

    public afx(Context context) {
        un.y(context);
        this.b = context.getResources();
        afw afwVar = new afw();
        this.a = afwVar;
        afwVar.i = g;
        afwVar.d(0);
        afwVar.f(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new afu(this, afwVar, 0));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(e);
        valueAnimatorOfFloat.addListener(new afv(this, afwVar));
        this.i = valueAnimatorOfFloat;
    }

    static final void e(float f2, afw afwVar) {
        if (f2 <= 0.75f) {
            afwVar.u = afwVar.b();
            return;
        }
        int iB = afwVar.b();
        int[] iArr = afwVar.i;
        afwVar.a();
        int i = iArr[0];
        int i2 = iB >> 24;
        int i3 = iB >> 16;
        int i4 = iB >> 8;
        int i5 = iB & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        int i6 = i >> 24;
        int i7 = i >> 16;
        int i8 = i >> 8;
        int i9 = i & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        int i10 = i8 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        int i11 = i7 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i12 = (i4 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE) + ((int) ((i10 - r4) * f3));
        int i13 = (i3 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE) + ((int) ((i11 - r3) * f3));
        afwVar.u = (((i2 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE) + ((int) (f3 * ((i6 & AIFeature.Id.ROSIE_ROBOT_TRANSLATE) - r2)))) << 24) | (i13 << 16) | (i12 << 8) | (i5 + ((int) ((i9 - i5) * f3)));
    }

    final void a(float f2, afw afwVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.d) {
            e(f2, afwVar);
            double dFloor = Math.floor(afwVar.m / 0.8f) + 1.0d;
            float f3 = afwVar.k;
            float f4 = afwVar.l;
            afwVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            afwVar.f = f4;
            float f5 = afwVar.m;
            afwVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = afwVar.m;
            if (f2 < 0.5f) {
                interpolation = afwVar.k;
                interpolation2 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = afwVar.k + 0.79f;
                interpolation = f7 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.c;
            afwVar.e = interpolation;
            afwVar.f = interpolation2;
            afwVar.g = f8;
            this.h = f9 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.e(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        afw afwVar = this.a;
        if (f2 != afwVar.p) {
            afwVar.p = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        afw afwVar = this.a;
        afwVar.e = 0.0f;
        afwVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        afw afwVar = this.a;
        float f2 = afwVar.q;
        float fMin = (afwVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((afwVar.r * afwVar.p) / 2.0f, afwVar.h / 2.0f);
        }
        RectF rectF = afwVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = afwVar.e;
        float f4 = afwVar.g;
        float f5 = f3 + f4;
        float f6 = afwVar.f + f4;
        afwVar.b.setColor(afwVar.u);
        afwVar.b.setAlpha(afwVar.t);
        float f7 = afwVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, afwVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        float f9 = f5 * 360.0f;
        float f10 = (f6 * 360.0f) - f9;
        canvas.drawArc(rectF, f9, f10, false, afwVar.b);
        if (afwVar.n) {
            Path path = afwVar.o;
            if (path == null) {
                afwVar.o = new Path();
                afwVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f11 = (afwVar.r * afwVar.p) / 2.0f;
            afwVar.o.moveTo(0.0f, 0.0f);
            afwVar.o.lineTo(afwVar.r * afwVar.p, 0.0f);
            Path path2 = afwVar.o;
            float f12 = afwVar.r;
            float f13 = afwVar.p;
            path2.lineTo((f12 * f13) / 2.0f, afwVar.s * f13);
            afwVar.o.offset((fMin2 + rectF.centerX()) - f11, rectF.centerY() + (afwVar.h / 2.0f));
            afwVar.o.close();
            afwVar.c.setColor(afwVar.u);
            afwVar.c.setAlpha(afwVar.t);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(afwVar.o, afwVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        this.a.g();
        afw afwVar = this.a;
        if (afwVar.f != afwVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
        } else {
            afwVar.d(0);
            this.a.c();
            this.i.setDuration(1332L);
            this.i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.e(false);
        this.a.d(0);
        this.a.c();
        invalidateSelf();
    }
}
