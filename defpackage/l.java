package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class l extends bt {
    public final j a;
    private AnimatorSet b;

    public l(j jVar) {
        jVar.getClass();
        this.a = jVar;
    }

    @Override // defpackage.bt
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        bw bwVar = this.a.a;
        if (bwVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (ax.X(2)) {
            Objects.toString(bwVar);
            boolean z = bwVar.d;
        }
    }

    @Override // defpackage.bt
    public final void b(ViewGroup viewGroup) {
        bw bwVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            bwVar.f(this);
            return;
        }
        animatorSet.start();
        if (ax.X(2)) {
            Objects.toString(bwVar);
        }
    }

    @Override // defpackage.bt
    public final void c(ViewGroup viewGroup) {
        l lVar;
        if (this.a.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        j jVar = this.a;
        context.getClass();
        bnz bnzVarA = jVar.a(context);
        this.b = (AnimatorSet) (bnzVarA != null ? bnzVarA.b : null);
        bw bwVar = this.a.a;
        boolean z = bwVar.h == 3;
        View view = bwVar.a.O;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            lVar = this;
            animatorSet.addListener(new k(viewGroup, view, z, bwVar, lVar));
        } else {
            lVar = this;
        }
        AnimatorSet animatorSet2 = lVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.bt
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bt
    public final void e(lq lqVar) {
        bw bwVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            bwVar.f(this);
            return;
        }
        if (bwVar.a.r) {
            if (ax.X(2)) {
                Objects.toString(bwVar);
            }
            long totalDuration = animatorSet.getTotalDuration();
            long j = (long) (lqVar.a * totalDuration);
            if (j == 0) {
                j = 1;
            }
            if (j == totalDuration) {
                j = (-1) + totalDuration;
            }
            if (ax.X(2)) {
                Objects.toString(animatorSet);
                Objects.toString(bwVar);
            }
            animatorSet.setCurrentPlayTime(j);
        }
    }
}
