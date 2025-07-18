package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agv extends AnimatorListenerAdapter {
    final /* synthetic */ nv a;
    final /* synthetic */ ahc b;

    public agv(ahc ahcVar, nv nvVar) {
        this.b = ahcVar;
        this.a = nvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k.add(animator);
    }
}
