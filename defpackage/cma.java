package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cma extends AnimatorListenerAdapter {
    final /* synthetic */ cmi a = null;
    final /* synthetic */ cml b;
    private boolean c;

    public cma(cml cmlVar, cmi cmiVar) {
        this.b = cmlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cml cmlVar = this.b;
        cmlVar.C = 0;
        cmlVar.w = null;
        if (this.c) {
            return;
        }
        cmlVar.D.g(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.D.g(0, false);
        cml cmlVar = this.b;
        cmlVar.C = 1;
        cmlVar.w = animator;
        this.c = false;
    }
}
