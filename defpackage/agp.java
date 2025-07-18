package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agp extends AnimatorListenerAdapter implements agz {
    private final View a;
    private boolean b = false;

    public agp(View view) {
        this.a = view;
    }

    @Override // defpackage.agz
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, Float.valueOf(this.a.getVisibility() == 0 ? ahq.a(this.a) : 0.0f));
    }

    @Override // defpackage.agz
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.agz
    public final /* synthetic */ void e(ahc ahcVar, boolean z) {
        us.f(this, ahcVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ahq.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        ahq.c(this.a, 1.0f);
    }

    @Override // defpackage.agz
    public final void a(ahc ahcVar) {
    }

    @Override // defpackage.agz
    public final void b(ahc ahcVar) {
    }

    @Override // defpackage.agz
    public final void f(ahc ahcVar) {
    }

    @Override // defpackage.agz
    public final void g(ahc ahcVar, boolean z) {
    }
}
