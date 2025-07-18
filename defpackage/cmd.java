package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmd implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ Matrix h;
    final /* synthetic */ cml i;

    public cmd(cml cmlVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
        this.i = cmlVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.i.D.setAlpha(cjl.a(this.a, this.b, 0.0f, 0.2f, fFloatValue));
        float f = this.d;
        float f2 = this.c;
        this.i.D.setScaleX(f2 + ((f - f2) * fFloatValue));
        float f3 = this.d;
        float f4 = this.e;
        this.i.D.setScaleY(f4 + ((f3 - f4) * fFloatValue));
        float f5 = this.g;
        float f6 = this.f;
        float f7 = fFloatValue * (f5 - f6);
        cml cmlVar = this.i;
        float f8 = f6 + f7;
        cmlVar.A = f8;
        cmlVar.e(f8, this.h);
        this.i.D.setImageMatrix(this.h);
    }
}
