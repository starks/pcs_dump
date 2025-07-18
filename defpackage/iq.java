package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iq extends AnimatorListenerAdapter {
    final /* synthetic */ ir a;
    private boolean b = false;

    public iq(ir irVar) {
        this.a = irVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            ir irVar = this.a;
            irVar.q = 0;
            irVar.c(0);
        } else {
            ir irVar2 = this.a;
            irVar2.q = 2;
            irVar2.b();
        }
    }
}
