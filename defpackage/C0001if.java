package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001if extends AnimatorListenerAdapter {
    final /* synthetic */ km a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ ks d;

    public C0001if(ks ksVar, km kmVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = ksVar;
        this.a = kmVar;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.b(this.a);
        this.d.n.remove(this.a);
        this.d.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
