package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agw extends AnimatorListenerAdapter {
    final /* synthetic */ ahc a;

    public agw(ahc ahcVar) {
        this.a = ahcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
        animator.removeListener(this);
    }
}
