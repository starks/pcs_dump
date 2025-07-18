package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmn extends cml {
    private StateListAnimator G;

    public cmn(FloatingActionButton floatingActionButton, fuu fuuVar) {
        super(floatingActionButton, fuuVar);
    }

    private final Animator q(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.D, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.D, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // defpackage.cml
    public final float a() {
        return this.D.getElevation();
    }

    @Override // defpackage.cml
    public final void f(Rect rect) {
        if (this.F.k()) {
            super.f(rect);
        } else if (p()) {
            rect.set(0, 0, 0, 0);
        } else {
            int iB = (this.v - this.D.b()) / 2;
            rect.set(iB, iB, iB, iB);
        }
    }

    @Override // defpackage.cml
    public final void g(float f, float f2, float f3) {
        if (this.D.getStateListAnimator() == this.G) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, q(f, f3));
            stateListAnimator.addState(g, q(f, f2));
            stateListAnimator.addState(h, q(f, f2));
            stateListAnimator.addState(i, q(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.D, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(this.D, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, q(0.0f, 0.0f));
            this.G = stateListAnimator;
            this.D.setStateListAnimator(this.G);
        }
        if (n()) {
            k();
        }
    }

    @Override // defpackage.cml
    public final boolean m() {
        return false;
    }

    @Override // defpackage.cml
    public final boolean n() {
        return this.F.k() || !p();
    }
}
