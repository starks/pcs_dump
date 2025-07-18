package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.cli;
import defpackage.clj;
import defpackage.clq;
import defpackage.cnb;
import defpackage.cnx;
import defpackage.cof;
import defpackage.cor;
import defpackage.cpg;
import defpackage.jt;
import defpackage.nm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialCardView extends nm implements Checkable, cor {
    private static final int[] h = {R.attr.state_checkable};
    private static final int[] i = {R.attr.state_checked};
    public boolean g;
    private final cli j;
    private boolean k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public final boolean c() {
        cli cliVar = this.j;
        return cliVar != null && cliVar.s;
    }

    @Override // defpackage.cor
    public final void d(cof cofVar) {
        RectF rectF = new RectF();
        rectF.set(this.j.e.getBounds());
        setClipToOutline(cofVar.f(rectF));
        this.j.g(cofVar);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j.h();
        cnx.d(this, this.j.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (c()) {
            mergeDrawableStates(iArrOnCreateDrawableState, h);
        }
        if (this.g) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.g);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.g);
    }

    @Override // defpackage.nm, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int iCeil;
        int iCeil2;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        cli cliVar = this.j;
        if (cliVar.q != null) {
            if (cliVar.c.a) {
                float fC = cliVar.c();
                iCeil = (int) Math.ceil(fC + fC);
                float fB = cliVar.b();
                iCeil2 = (int) Math.ceil(fB + fB);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i4 = cliVar.k() ? ((measuredWidth - cliVar.g) - cliVar.h) - iCeil2 : cliVar.g;
            int i5 = cliVar.j() ? cliVar.g : ((measuredHeight - cliVar.g) - cliVar.h) - iCeil;
            int i6 = cliVar.k() ? cliVar.g : ((measuredWidth - cliVar.g) - cliVar.h) - iCeil2;
            int i7 = cliVar.j() ? ((measuredHeight - cliVar.g) - cliVar.h) - iCeil : cliVar.g;
            int layoutDirection = cliVar.c.getLayoutDirection();
            cliVar.q.setLayerInset(2, layoutDirection != 1 ? i4 : i6, i7, layoutDirection == 1 ? i4 : i6, i5);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            if (!this.j.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.j.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.g != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        cli cliVar = this.j;
        if (cliVar != null) {
            cliVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (c() && isEnabled()) {
            this.g = !this.g;
            refreshDrawableState();
            cli cliVar = this.j;
            Drawable drawable = cliVar.p;
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                int i2 = bounds.bottom;
                cliVar.p.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
                cliVar.p.setBounds(bounds.left, bounds.top, bounds.right, i2);
            }
            this.j.f(this.g, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.as.oss.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(cpg.a(context, attributeSet, i2, com.google.android.as.oss.R.style.Widget_MaterialComponents_CardView), attributeSet, i2);
        this.g = false;
        this.k = true;
        TypedArray typedArrayA = cnb.a(getContext(), attributeSet, clj.b, i2, com.google.android.as.oss.R.style.Widget_MaterialComponents_CardView, new int[0]);
        cli cliVar = new cli(this, attributeSet, i2, com.google.android.as.oss.R.style.Widget_MaterialComponents_CardView);
        this.j = cliVar;
        cliVar.e.m(nm.f.D(this.e));
        cliVar.d.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        float fC = 0.0f;
        float fA = ((!cliVar.c.b || cliVar.i()) && !cliVar.l()) ? 0.0f : cliVar.a();
        MaterialCardView materialCardView = cliVar.c;
        if (materialCardView.b && materialCardView.a) {
            fC = (float) ((1.0d - cli.a) * nm.f.C(materialCardView.e));
        }
        float f = fA - fC;
        MaterialCardView materialCardView2 = cliVar.c;
        int i3 = (int) f;
        materialCardView2.c.set(cliVar.d.left + i3, cliVar.d.top + i3, cliVar.d.right + i3, cliVar.d.bottom + i3);
        nm.f.E(materialCardView2.e);
        cliVar.o = cnx.i(cliVar.c.getContext(), typedArrayA, 11);
        if (cliVar.o == null) {
            cliVar.o = ColorStateList.valueOf(-1);
        }
        cliVar.j = typedArrayA.getDimensionPixelSize(12, 0);
        boolean z = typedArrayA.getBoolean(0, false);
        cliVar.s = z;
        cliVar.c.setLongClickable(z);
        cliVar.n = cnx.i(cliVar.c.getContext(), typedArrayA, 6);
        Drawable drawableJ = cnx.j(cliVar.c.getContext(), typedArrayA, 2);
        if (drawableJ != null) {
            cliVar.l = drawableJ.mutate();
            cliVar.l.setTintList(cliVar.n);
            cliVar.f(cliVar.c.g, false);
        } else {
            cliVar.l = null;
        }
        LayerDrawable layerDrawable = cliVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.as.oss.R.id.mtrl_card_checked_layer_id, cliVar.l);
        }
        cliVar.h = typedArrayA.getDimensionPixelSize(5, 0);
        cliVar.g = typedArrayA.getDimensionPixelSize(4, 0);
        cliVar.i = typedArrayA.getInteger(3, 8388661);
        cliVar.m = cnx.i(cliVar.c.getContext(), typedArrayA, 7);
        if (cliVar.m == null) {
            cliVar.m = ColorStateList.valueOf(clq.h(cliVar.c, com.google.android.as.oss.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListI = cnx.i(cliVar.c.getContext(), typedArrayA, 1);
        cliVar.f.m(colorStateListI == null ? ColorStateList.valueOf(0) : colorStateListI);
        Drawable drawable = cliVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(cliVar.m);
        }
        cliVar.e.l(jt.F(cliVar.c.e));
        cliVar.f.o(cliVar.j, cliVar.o);
        super.setBackgroundDrawable(cliVar.e(cliVar.e));
        cliVar.k = cliVar.m() ? cliVar.d() : cliVar.f;
        cliVar.c.setForeground(cliVar.e(cliVar.k));
        typedArrayA.recycle();
    }
}
