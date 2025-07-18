package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agq extends ahz {
    public agq() {
    }

    private static float O(ahl ahlVar, float f) {
        Float f2;
        return (ahlVar == null || (f2 = (Float) ahlVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator P(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ahq.c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ahq.b, f2);
        agp agpVar = new agp(view);
        objectAnimatorOfFloat.addListener(agpVar);
        j().D(agpVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.ahz, defpackage.ahc
    public final void c(ahl ahlVar) {
        ahz.N(ahlVar);
        Float fValueOf = (Float) ahlVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = ahlVar.b.getVisibility() == 0 ? Float.valueOf(ahq.a(ahlVar.b)) : Float.valueOf(0.0f);
        }
        ahlVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.ahc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ahz
    public final Animator f(View view, ahl ahlVar) {
        ahr ahrVar = ahq.a;
        return P(view, O(ahlVar, 0.0f), 1.0f);
    }

    @Override // defpackage.ahz
    public final Animator g(View view, ahl ahlVar, ahl ahlVar2) {
        ahr ahrVar = ahq.a;
        Animator animatorP = P(view, O(ahlVar, 1.0f), 0.0f);
        if (animatorP == null) {
            ahq.c(view, O(ahlVar2, 1.0f));
        }
        return animatorP;
    }

    public agq(int i) {
        this.u = i;
    }
}
