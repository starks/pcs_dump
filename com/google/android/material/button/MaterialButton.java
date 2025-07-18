package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.a;
import defpackage.cla;
import defpackage.clb;
import defpackage.cld;
import defpackage.cle;
import defpackage.cnx;
import defpackage.cof;
import defpackage.cor;
import defpackage.gs;
import defpackage.gt;
import defpackage.lc;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialButton extends gt implements Checkable, cor {
    private static final int[] f = {R.attr.state_checkable};
    private static final int[] g = {R.attr.state_checked};
    public float b;
    public int c;
    public int d;
    int e;
    private final cld h;
    private final LinkedHashSet i;
    private PorterDuff.Mode j;
    private ColorStateList k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int a() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final void h() {
        if (l()) {
            setCompoundDrawablesRelative(this.l, null, null, null);
        } else if (k()) {
            setCompoundDrawablesRelative(null, null, this.l, null);
        } else if (m()) {
            setCompoundDrawablesRelative(null, this.l, null, null);
        }
    }

    private final void i(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.l = drawableMutate;
            drawableMutate.setTintList(this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.l.setTintMode(mode);
            }
            int intrinsicWidth = this.m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i = this.n;
            int i2 = this.o;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.l.setVisible(true, z);
        }
        if (z) {
            h();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!l() || drawable3 == this.l) && ((!k() || drawable5 == this.l) && (!m() || drawable4 == this.l))) {
            return;
        }
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.j(int, int):void");
    }

    private final boolean k() {
        int i = this.s;
        return i == 3 || i == 4;
    }

    private final boolean l() {
        int i = this.s;
        return i == 1 || i == 2;
    }

    private final boolean m() {
        int i = this.s;
        return i == 16 || i == 32;
    }

    private final boolean n() {
        cld cldVar = this.h;
        return (cldVar == null || cldVar.o) ? false : true;
    }

    final String b() {
        if (TextUtils.isEmpty(null)) {
            return (true != g() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    public final void c(Drawable drawable) {
        if (this.l != drawable) {
            this.l = drawable;
            i(true);
            j(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // defpackage.cor
    public final void d(cof cofVar) {
        if (!n()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.h.c(cofVar);
    }

    public final void e(ColorStateList colorStateList) {
        if (n()) {
            cld cldVar = this.h;
            if (cldVar.k != colorStateList) {
                cldVar.k = colorStateList;
                if (cldVar.a() != null) {
                    cldVar.a().setTintList(cldVar.k);
                    return;
                }
                return;
            }
            return;
        }
        gs gsVar = this.a;
        if (gsVar != null) {
            if (gsVar.a == null) {
                gsVar.a = new lc();
            }
            lc lcVar = gsVar.a;
            lcVar.a = colorStateList;
            lcVar.d = true;
            gsVar.a();
        }
    }

    public final void f(PorterDuff.Mode mode) {
        if (n()) {
            cld cldVar = this.h;
            if (cldVar.j != mode) {
                cldVar.j = mode;
                if (cldVar.a() == null || cldVar.j == null) {
                    return;
                }
                cldVar.a().setTintMode(cldVar.j);
                return;
            }
            return;
        }
        gs gsVar = this.a;
        if (gsVar != null) {
            if (gsVar.a == null) {
                gsVar.a = new lc();
            }
            lc lcVar = gsVar.a;
            lcVar.b = mode;
            lcVar.c = true;
            gsVar.a();
        }
    }

    public final boolean g() {
        cld cldVar = this.h;
        return cldVar != null && cldVar.p;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        lc lcVar;
        if (n()) {
            return this.h.k;
        }
        gs gsVar = this.a;
        if (gsVar == null || (lcVar = gsVar.a) == null) {
            return null;
        }
        return lcVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        lc lcVar;
        if (n()) {
            return this.h.j;
        }
        gs gsVar = this.a;
        if (gsVar == null || (lcVar = gsVar.a) == null) {
            return null;
        }
        return lcVar.b;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (n()) {
            cnx.d(this, this.h.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (g()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.q) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.gt, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(b());
        accessibilityEvent.setChecked(this.q);
    }

    @Override // defpackage.gt, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(b());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(this.q);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.gt, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        j(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.b = -1.0f;
        }
        if (this.b == -1.0f) {
            this.b = i3 - i;
        }
        if (this.e == -1) {
            Drawable drawable = this.l;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.p;
                int intrinsicWidth = this.m;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.e = (getMeasuredWidth() - a()) - i5;
        }
        if (this.c == -1) {
            this.c = getPaddingStart();
        }
        if (this.d == -1) {
            this.d = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof clb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        clb clbVar = (clb) parcelable;
        super.onRestoreInstanceState(clbVar.d);
        setChecked(clbVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        clb clbVar = new clb(super.onSaveInstanceState());
        clbVar.a = this.q;
        return clbVar;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.h.q) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.l != null) {
            if (this.l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!n()) {
            super.setBackgroundColor(i);
            return;
        }
        cld cldVar = this.h;
        if (cldVar.a() != null) {
            cldVar.a().setTint(i);
        }
    }

    @Override // defpackage.gt, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!n()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.h.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.gt, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.t(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        e(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        f(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!g() || this.q == z) {
            return;
        }
        this.q = z;
        refreshDrawableState();
        if (getParent() instanceof cle) {
            throw null;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((cla) it.next()).a();
        }
        this.r = false;
    }

    @Override // android.view.View
    public final void setElevation(float f2) {
        super.setElevation(f2);
        if (n()) {
            this.h.a().l(f2);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.b = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.as.oss.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r24, android.util.AttributeSet r25, int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
