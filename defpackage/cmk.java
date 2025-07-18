package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cmk extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ cml b;
    private float c;
    private float d;

    public cmk(cml cmlVar) {
        this.b = cmlVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            coa coaVar = this.b.m;
            this.c = coaVar == null ? 0.0f : coaVar.a();
            this.d = a();
            this.a = true;
        }
        cml cmlVar = this.b;
        float f = this.c;
        cmlVar.l((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
