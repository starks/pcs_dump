package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmx extends AnimatorListenerAdapter {
    final /* synthetic */ cmy a;

    public cmx(cmy cmyVar) {
        this.a = cmyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (animator == null) {
            this.a.a = null;
        }
    }
}
