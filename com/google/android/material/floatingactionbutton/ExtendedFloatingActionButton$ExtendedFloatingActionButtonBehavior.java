package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.clz;
import defpackage.cmo;
import defpackage.cmt;
import defpackage.qy;
import defpackage.rb;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends qy {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private static boolean F(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof rb) {
            return ((rb) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean G(View view, clz clzVar) {
        return (this.b || this.c) && ((rb) clzVar.getLayoutParams()).f == view.getId();
    }

    private final boolean H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, clz clzVar) {
        if (!G(appBarLayout, clzVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        cmt.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.d()) {
            E(clzVar);
            return true;
        }
        D(clzVar);
        return true;
    }

    private final boolean I(View view, clz clzVar) {
        if (!G(view, clzVar)) {
            return false;
        }
        if (view.getTop() < (clzVar.getHeight() / 2) + ((rb) clzVar.getLayoutParams()).topMargin) {
            E(clzVar);
            return true;
        }
        D(clzVar);
        return true;
    }

    protected final void D(clz clzVar) {
        clz.h();
    }

    protected final void E(clz clzVar) {
        clz.h();
    }

    @Override // defpackage.qy
    public final void b(rb rbVar) {
        if (rbVar.h == 0) {
            rbVar.h = 80;
        }
    }

    @Override // defpackage.qy
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    @Override // defpackage.qy
    public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        clz clzVar = (clz) view;
        List listA = coordinatorLayout.a(clzVar);
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listA.get(i2);
            if (!(view2 instanceof AppBarLayout)) {
                if (F(view2) && I(view2, clzVar)) {
                    break;
                }
            } else {
                if (H(coordinatorLayout, (AppBarLayout) view2, clzVar)) {
                    break;
                }
            }
        }
        coordinatorLayout.j(clzVar, i);
        return true;
    }

    @Override // defpackage.qy
    public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2) {
        clz clzVar = (clz) view;
        if (view2 instanceof AppBarLayout) {
            H(coordinatorLayout, (AppBarLayout) view2, clzVar);
        } else if (F(view2)) {
            I(view2, clzVar);
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cmo.a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
