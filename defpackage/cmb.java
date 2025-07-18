package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmb extends AnimatorListenerAdapter {
    final /* synthetic */ cmi a = null;
    final /* synthetic */ cml b;

    public cmb(cml cmlVar, cmi cmiVar) {
        this.b = cmlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cml cmlVar = this.b;
        cmlVar.C = 0;
        cmlVar.w = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.D.g(0, false);
        cml cmlVar = this.b;
        cmlVar.C = 2;
        cmlVar.w = animator;
    }
}
