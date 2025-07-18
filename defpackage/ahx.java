package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahx extends AnimatorListenerAdapter implements agz {
    final /* synthetic */ ahz a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public ahx(ahz ahzVar, ViewGroup viewGroup, View view, View view2) {
        this.a = ahzVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.agz
    public final void a(ahc ahcVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.agz
    public final void b(ahc ahcVar) {
        ahcVar.F(this);
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
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.c.getParent() == null) {
            ut.f(this.b, this.c);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            this.d.setTag(R.id.save_overlay_view, this.c);
            ut.f(this.b, this.c);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.agz
    public final void c() {
    }

    @Override // defpackage.agz
    public final void d() {
    }

    @Override // defpackage.agz
    public final void f(ahc ahcVar) {
    }
}
