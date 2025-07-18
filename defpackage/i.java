package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class i extends bt {
    public final j a;

    public i(j jVar) {
        jVar.getClass();
        this.a = jVar;
    }

    @Override // defpackage.bt
    public final void a(ViewGroup viewGroup) {
        bw bwVar = this.a.a;
        View view = bwVar.a.O;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        this.a.a.f(this);
        if (ax.X(2)) {
            Objects.toString(bwVar);
        }
    }

    @Override // defpackage.bt
    public final void b(ViewGroup viewGroup) {
        Object obj;
        if (this.a.b()) {
            this.a.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        j jVar = this.a;
        bw bwVar = jVar.a;
        View view = bwVar.a.O;
        context.getClass();
        bnz bnzVarA = jVar.a(context);
        if (bnzVarA == null || (obj = bnzVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (bwVar.h != 1) {
            view.startAnimation((Animation) obj);
            this.a.a.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        af afVar = new af((Animation) obj, viewGroup, view);
        afVar.setAnimationListener(new h(bwVar, viewGroup, view, this));
        view.startAnimation(afVar);
        if (ax.X(2)) {
            Objects.toString(bwVar);
        }
    }
}
