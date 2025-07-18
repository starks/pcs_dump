package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import defpackage.cjl;
import defpackage.ckh;
import defpackage.cki;
import defpackage.ckj;
import defpackage.ckk;
import defpackage.ckl;
import defpackage.ckm;
import defpackage.cnx;
import defpackage.qy;
import defpackage.rb;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior extends qy {
    public ViewPropertyAnimator a;
    private ckm b;
    private final LinkedHashSet c;
    private int d;
    private int e;
    private TimeInterpolator f;
    private TimeInterpolator g;
    private int h;
    private int i;

    public HideViewOnScrollBehavior() {
        this.c = new LinkedHashSet();
        this.h = 0;
        this.i = 2;
    }

    private final void E(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = this.b.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ckk(this));
    }

    private final void F(View view, int i) {
        this.i = i;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ckl) it.next()).a();
        }
    }

    public final void D(int i) {
        ckm ckmVar = this.b;
        if (ckmVar == null || ckmVar.b() != i) {
            this.b = i != 0 ? i != 1 ? new cki() : new ckh() : new ckj();
        }
    }

    @Override // defpackage.qy
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.i == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            F(view, 1);
            E(view, this.h, this.e, this.g);
            return;
        }
        if (i2 >= 0 || this.i == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        F(view, 2);
        this.b.d();
        E(view, 0, this.d, this.f);
    }

    @Override // defpackage.qy
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((rb) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            D(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            int i3 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            }
            D(i3);
        }
        this.h = this.b.a(view, marginLayoutParams);
        this.d = cnx.k(view.getContext(), R.attr.motionDurationLong2, AIFeature.Id.AIAI_ZERO_STATE_4);
        this.e = cnx.k(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f = cnx.n(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, cjl.d);
        this.g = cnx.n(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, cjl.c);
        return false;
    }

    @Override // defpackage.qy
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new LinkedHashSet();
        this.h = 0;
        this.i = 2;
    }
}
