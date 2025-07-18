package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afv implements Animator.AnimatorListener {
    final /* synthetic */ afw a;
    final /* synthetic */ afx b;

    public afv(afx afxVar, afw afwVar) {
        this.b = afxVar;
        this.a = afwVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.g();
        afw afwVar = this.a;
        afwVar.a();
        afwVar.d(0);
        afx afxVar = this.b;
        if (!afxVar.d) {
            afxVar.c += 1.0f;
            return;
        }
        afxVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.a.e(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
