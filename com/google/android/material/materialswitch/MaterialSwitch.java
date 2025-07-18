package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.google.android.as.oss.R;
import defpackage.a;
import defpackage.clq;
import defpackage.cnb;
import defpackage.cnh;
import defpackage.cpg;
import defpackage.ry;
import defpackage.zw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int[] m = {R.attr.state_with_icon};
    private Drawable n;
    private Drawable o;
    private int p;
    private Drawable q;
    private Drawable r;
    private ColorStateList s;
    private ColorStateList t;
    private PorterDuff.Mode u;
    private ColorStateList v;
    private ColorStateList w;
    private PorterDuff.Mode x;
    private int[] y;
    private int[] z;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    private static void i(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            int colorForState = colorStateList.getColorForState(iArr, 0);
            int colorForState2 = colorStateList.getColorForState(iArr2, 0);
            float f2 = 1.0f - f;
            int i = ry.a;
            float fAlpha = Color.alpha(colorForState2) * f;
            float fRed = Color.red(colorForState2) * f;
            float fGreen = Color.green(colorForState2) * f;
            drawable.setTint(Color.argb((int) ((Color.alpha(colorForState) * f2) + fAlpha), (int) ((Color.red(colorForState) * f2) + fRed), (int) ((Color.green(colorForState) * f2) + fGreen), (int) ((Color.blue(colorForState) * f2) + (Color.blue(colorForState2) * f))));
        }
    }

    private final void j() {
        ColorStateList colorStateList = this.s;
        if (colorStateList == null && this.t == null && this.v == null && this.w == null) {
            return;
        }
        float f = this.j;
        if (colorStateList != null) {
            i(this.n, colorStateList, this.y, this.z, f);
        }
        ColorStateList colorStateList2 = this.t;
        if (colorStateList2 != null) {
            i(this.o, colorStateList2, this.y, this.z, f);
        }
        ColorStateList colorStateList3 = this.v;
        if (colorStateList3 != null) {
            i(this.q, colorStateList3, this.y, this.z, f);
        }
        ColorStateList colorStateList4 = this.w;
        if (colorStateList4 != null) {
            i(this.r, colorStateList4, this.y, this.z, f);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        j();
        super.invalidate();
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.o != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.y = iArr;
        this.z = clq.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        super(cpg.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.p = -1;
        Context context2 = getContext();
        this.n = this.a;
        this.s = this.b;
        this.b = null;
        this.d = true;
        super.a();
        this.q = this.e;
        this.v = this.f;
        this.f = null;
        this.h = true;
        super.b();
        zw zwVarB = cnb.b(context2, attributeSet, cnh.a, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.o = zwVarB.i(0);
        this.p = zwVarB.c(1, -1);
        this.t = zwVarB.h(2);
        this.u = a.c(zwVarB.d(3, -1), PorterDuff.Mode.SRC_IN);
        this.r = zwVarB.i(4);
        this.w = zwVarB.h(5);
        this.x = a.c(zwVarB.d(6, -1), PorterDuff.Mode.SRC_IN);
        zwVarB.m();
        this.k = false;
        invalidate();
        this.n = clq.d(this.n, this.s, this.c);
        this.o = clq.d(this.o, this.t, this.u);
        j();
        Drawable drawable2 = this.n;
        Drawable drawable3 = this.o;
        int i2 = this.p;
        Drawable drawableC = clq.c(drawable2, drawable3, i2, i2);
        Drawable drawable4 = this.a;
        if (drawable4 != null) {
            drawable4.setCallback(null);
        }
        this.a = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(this);
        }
        requestLayout();
        refreshDrawableState();
        this.q = clq.d(this.q, this.v, this.g);
        this.r = clq.d(this.r, this.w, this.x);
        j();
        Drawable layerDrawable = this.q;
        if (layerDrawable != null && (drawable = this.r) != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{layerDrawable, drawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.r;
        }
        if (layerDrawable != null) {
            this.i = layerDrawable.getIntrinsicWidth();
            requestLayout();
        }
        Drawable drawable5 = this.e;
        if (drawable5 != null) {
            drawable5.setCallback(null);
        }
        this.e = layerDrawable;
        if (layerDrawable != null) {
            layerDrawable.setCallback(this);
        }
        requestLayout();
    }
}
