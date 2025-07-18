package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import defpackage.cjl;
import defpackage.ckf;
import defpackage.ckg;
import defpackage.cnx;
import defpackage.qy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends qy {
    public ViewPropertyAnimator a;
    private final LinkedHashSet b;
    private int c;
    private int d;
    private TimeInterpolator e;
    private TimeInterpolator f;
    private int g;
    private int h;

    public HideBottomViewOnScrollBehavior() {
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }

    private final void D(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ckf(this));
    }

    private final void E(View view, int i) {
        this.h = i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ckg) it.next()).a();
        }
    }

    @Override // defpackage.qy
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.h == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            E(view, 1);
            D(view, this.g, this.d, this.f);
            return;
        }
        if (i2 >= 0 || this.h == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        E(view, 2);
        D(view, 0, this.c, this.e);
    }

    @Override // defpackage.qy
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.c = cnx.k(view.getContext(), R.attr.motionDurationLong2, AIFeature.Id.AIAI_ZERO_STATE_4);
        this.d = cnx.k(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.e = cnx.n(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, cjl.d);
        this.f = cnx.n(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, cjl.c);
        return false;
    }

    @Override // defpackage.qy
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }
}
