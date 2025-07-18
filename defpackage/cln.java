package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.as.oss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cln extends gu {
    private static final int e = 2131888389;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final aih x;
    private final aic y;

    /* JADX WARN: Illegal instructions before constructor call */
    public cln(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iG;
        ColorStateList colorStateListB;
        int i2 = e;
        super(cpg.a(context, attributeSet, R.attr.checkboxStyle, i2), attributeSet);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        Context context2 = getContext();
        aih aihVar = new aih(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = rw.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(aihVar.d);
        new aig(drawable.getConstantState());
        aihVar.e = drawable;
        this.x = aihVar;
        this.y = new clk(this);
        Context context3 = getContext();
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        gx gxVar = this.a;
        if (gxVar != null) {
            gxVar.a = null;
            gxVar.c = true;
            gxVar.a();
        }
        zw zwVarB = cnb.b(context3, attributeSet, clo.a, R.attr.checkboxStyle, i2, new int[0]);
        this.q = zwVarB.i(2);
        if (this.p != null && cnx.m(context3, R.attr.isMaterial3Theme, false)) {
            int iG2 = zwVarB.g(0, 0);
            int iG3 = zwVarB.g(1, 0);
            if (iG2 == i && iG3 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = a.t(context3, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = a.t(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = (!zwVarB.o(3) || (iG = zwVarB.g(3, 0)) == 0 || (colorStateListB = rm.b(context3, iG)) == null) ? zwVarB.h(3) : colorStateListB;
        this.s = a.c(zwVarB.d(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = zwVarB.n(10, false);
        this.m = zwVarB.n(6, true);
        this.n = zwVarB.n(9, false);
        this.o = zwVarB.k(8);
        if (zwVarB.o(7)) {
            a(zwVarB.d(7, 0));
        }
        zwVarB.m();
        b();
    }

    private final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        aih aihVar;
        Animator.AnimatorListener animatorListener;
        this.p = clq.e(this.p, this.b, getButtonTintMode());
        this.q = clq.e(this.q, this.c, this.s);
        if (this.r) {
            aih aihVar2 = this.x;
            if (aihVar2 != null) {
                aic aicVar = this.y;
                if (aicVar != null) {
                    Drawable drawable = aihVar2.e;
                    if (drawable != null) {
                        ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(aicVar.a());
                    }
                    ArrayList arrayList = aihVar2.c;
                    if (arrayList != null) {
                        arrayList.remove(aicVar);
                        if (aihVar2.c.size() == 0 && (animatorListener = aihVar2.b) != null) {
                            aihVar2.a.c.removeListener(animatorListener);
                            aihVar2.b = null;
                        }
                    }
                }
                aih aihVar3 = this.x;
                aic aicVar2 = this.y;
                if (aicVar2 != null) {
                    Drawable drawable2 = aihVar3.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).registerAnimationCallback(aicVar2.a());
                    } else {
                        if (aihVar3.c == null) {
                            aihVar3.c = new ArrayList();
                        }
                        if (!aihVar3.c.contains(aicVar2)) {
                            aihVar3.c.add(aicVar2);
                            if (aihVar3.b == null) {
                                aihVar3.b = new aie(aihVar3);
                            }
                            aihVar3.a.c.addListener(aihVar3.b);
                        }
                    }
                }
            }
            Drawable drawable3 = this.p;
            if ((drawable3 instanceof AnimatedStateListDrawable) && (aihVar = this.x) != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, aihVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, this.x, false);
            }
        }
        Drawable drawable4 = this.p;
        if (drawable4 != null && (colorStateList2 = this.b) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.q;
        if (drawable5 != null && (colorStateList = this.c) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(clq.c(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void c() {
        if (this.v == null) {
            int i2 = this.t;
            super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
        }
    }

    public final void a(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((cll) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iH = clq.h(this, R.attr.colorControlActivated);
                int iH2 = clq.h(this, R.attr.colorError);
                int iH3 = clq.h(this, R.attr.colorSurface);
                int iH4 = clq.h(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{clq.i(iH3, iH2, 1.0f), clq.i(iH3, iH, 1.0f), clq.i(iH3, iH4, 0.54f), clq.i(iH3, iH4, 0.38f), clq.i(iH3, iH4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        this.d = clq.f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == cnx.p(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof clm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        clm clmVar = (clm) parcelable;
        super.onRestoreInstanceState(clmVar.getSuperState());
        a(clmVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        clm clmVar = new clm(super.onSaveInstanceState());
        clmVar.a = this.t;
        return clmVar;
    }

    @Override // defpackage.gu, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(a.t(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        gx gxVar = this.a;
        if (gxVar != null) {
            gxVar.b = mode;
            gxVar.d = true;
            gxVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.gu, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
