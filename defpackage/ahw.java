package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahw extends AnimatorListenerAdapter implements agz {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public ahw(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            ahq.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        viewGroup.suppressLayout(z);
    }

    @Override // defpackage.agz
    public final void b(ahc ahcVar) {
        ahcVar.F(this);
    }

    @Override // defpackage.agz
    public final void c() {
        i(false);
        if (this.a) {
            return;
        }
        ahq.d(this.b, this.c);
    }

    @Override // defpackage.agz
    public final void d() {
        i(true);
        if (this.a) {
            return;
        }
        ahq.d(this.b, 0);
    }

    @Override // defpackage.agz
    public final /* synthetic */ void e(ahc ahcVar, boolean z) {
        us.f(this, ahcVar);
    }

    @Override // defpackage.agz
    public final /* synthetic */ void g(ahc ahcVar, boolean z) {
        us.g(this, ahcVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            ahq.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.agz
    public final void a(ahc ahcVar) {
    }

    @Override // defpackage.agz
    public final void f(ahc ahcVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
