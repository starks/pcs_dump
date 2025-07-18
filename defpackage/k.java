package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bw d;
    final /* synthetic */ l e;

    public k(ViewGroup viewGroup, View view, boolean z, bw bwVar, l lVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = bwVar;
        this.e = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(this.b);
        if (this.c) {
            bw bwVar = this.d;
            View view = this.b;
            int i = bwVar.h;
            view.getClass();
            bv.b(i, view, this.a);
        }
        l lVar = this.e;
        lVar.a.a.f(lVar);
        if (ax.X(2)) {
            Objects.toString(this.d);
        }
    }
}
