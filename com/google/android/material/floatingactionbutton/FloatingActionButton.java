package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.as.oss.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a;
import defpackage.cjo;
import defpackage.cls;
import defpackage.clu;
import defpackage.cma;
import defpackage.cmb;
import defpackage.cml;
import defpackage.cmm;
import defpackage.cmn;
import defpackage.cmo;
import defpackage.cmt;
import defpackage.cnb;
import defpackage.cng;
import defpackage.cnp;
import defpackage.cnx;
import defpackage.coa;
import defpackage.cof;
import defpackage.cor;
import defpackage.coz;
import defpackage.cpg;
import defpackage.fuu;
import defpackage.hb;
import defpackage.oc;
import defpackage.qx;
import defpackage.qy;
import defpackage.rb;
import defpackage.un;
import defpackage.ut;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatingActionButton extends cng implements cor, qx {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final hb m;
    private final cls n;
    private cml o;

    /* compiled from: PG */
    public class BaseBehavior extends qy {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof rb) {
                return ((rb) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean H(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((rb) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private final boolean I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!H(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            cmt.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private final boolean J(View view, FloatingActionButton floatingActionButton) {
            if (!H(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((rb) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public void D(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
        }

        @Override // defpackage.qy
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void o(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                I(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (G(view)) {
                J(view, floatingActionButton);
            }
        }

        public void F(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) listA.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && J(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (I(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            rb rbVar = (rb) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - rbVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= rbVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - rbVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= rbVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = ut.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 != 0) {
                int[] iArr2 = ut.a;
                floatingActionButton.offsetLeftAndRight(i4);
            }
        }

        @Override // defpackage.qy
        public final void b(rb rbVar) {
            if (rbVar.h == 0) {
                rbVar.h = 80;
            }
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            D(coordinatorLayout, (FloatingActionButton) view, rect);
            return true;
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
            F(coordinatorLayout, (FloatingActionButton) view, i);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cmo.c);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ void D(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            super.D(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            super.o(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ void F(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            super.F(coordinatorLayout, floatingActionButton, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    private final cml i() {
        if (this.o == null) {
            this.o = new cmn(this, new fuu(this, null));
        }
        return this.o;
    }

    private final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // defpackage.qx
    public final qy a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    @Override // defpackage.cor
    public final void d(cof cofVar) {
        i().i(cofVar);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        i();
        getDrawableState();
    }

    final void e() {
        cml cmlVarI = i();
        if (cmlVarI.D.getVisibility() == 0) {
            if (cmlVarI.C == 1) {
                return;
            }
        } else if (cmlVarI.C != 2) {
            return;
        }
        Animator animator = cmlVarI.w;
        if (animator != null) {
            animator.cancel();
        }
        if (!cmlVarI.o()) {
            cmlVarI.D.g(4, false);
            return;
        }
        cjo cjoVar = cmlVarI.y;
        AnimatorSet animatorSetC = cjoVar != null ? cmlVarI.c(cjoVar, 0.0f, 0.0f, 0.0f) : cmlVarI.d(0.0f, 0.4f, 0.4f, cml.d, cml.e);
        animatorSetC.addListener(new cma(cmlVarI, null));
        animatorSetC.start();
    }

    final void f() {
        cml cmlVarI = i();
        if (cmlVarI.D.getVisibility() != 0) {
            if (cmlVarI.C == 2) {
                return;
            }
        } else if (cmlVarI.C != 1) {
            return;
        }
        Animator animator = cmlVarI.w;
        if (animator != null) {
            animator.cancel();
        }
        cjo cjoVar = cmlVarI.x;
        if (!cmlVarI.o()) {
            cmlVarI.D.g(0, false);
            cmlVarI.D.setAlpha(1.0f);
            cmlVarI.D.setScaleY(1.0f);
            cmlVarI.D.setScaleX(1.0f);
            cmlVarI.h(1.0f);
            return;
        }
        if (cmlVarI.D.getVisibility() != 0) {
            cmlVarI.D.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = cmlVarI.D;
            float f = cjoVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            cmlVarI.D.setScaleX(f);
            cmlVarI.h(f);
        }
        cjo cjoVar2 = cmlVarI.x;
        AnimatorSet animatorSetC = cjoVar2 != null ? cmlVarI.c(cjoVar2, 1.0f, 1.0f, 1.0f) : cmlVarI.d(1.0f, 1.0f, 1.0f, cml.b, cml.c);
        animatorSetC.addListener(new cmb(cmlVarI, null));
        animatorSetC.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cml cmlVarI = i();
        coa coaVar = cmlVarI.m;
        if (coaVar != null) {
            cnx.d(cmlVarI.D, coaVar);
        }
        cmlVarI.m();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cml cmlVarI = i();
        ViewTreeObserver viewTreeObserver = cmlVarI.D.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = cmlVarI.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            cmlVarI.E = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        i().k();
        int iMin = Math.min(View.resolveSize(iB, i), View.resolveSize(iB, i2));
        setMeasuredDimension(this.c.left + iMin + this.c.right, iMin + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof coz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        coz cozVar = (coz) parcelable;
        super.onRestoreInstanceState(cozVar.d);
        cls clsVar = this.n;
        Bundle bundle = (Bundle) cozVar.a.get("expandableWidgetHelper");
        un.y(bundle);
        clsVar.b = bundle.getBoolean("expanded", false);
        clsVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (clsVar.b) {
            ViewParent parent = clsVar.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(clsVar.a);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        coz cozVar = new coz(parcelableOnSaveInstanceState);
        oc ocVar = cozVar.a;
        cls clsVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", clsVar.b);
        bundle.putInt("expandedComponentIdHint", clsVar.c);
        ocVar.put("expandableWidgetHelper", bundle);
        return cozVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            rect.left += this.c.left;
            rect.top += this.c.top;
            rect.right -= this.c.right;
            rect.bottom -= this.c.bottom;
            int i = -this.o.b();
            rect.inset(i, i);
            if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            cml cmlVarI = i();
            coa coaVar = cmlVarI.m;
            if (coaVar != null) {
                coaVar.setTintList(colorStateList);
            }
            clu cluVar = cmlVarI.o;
            if (cluVar != null) {
                cluVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            coa coaVar = i().m;
            if (coaVar != null) {
                coaVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        i().l(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.e(i);
        j();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(cpg.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = cnb.a(context2, attributeSet, cmo.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = cnx.i(context2, typedArrayA, 1);
        this.f = a.c(typedArrayA.getInt(2, -1), null);
        this.g = cnx.i(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        cml cmlVarI = i();
        if (cmlVarI.B != dimensionPixelSize2) {
            cmlVarI.B = dimensionPixelSize2;
            cmlVarI.j();
        }
        cjo cjoVarA = cjo.a(context2, typedArrayA, 15);
        cjo cjoVarA2 = cjo.a(context2, typedArrayA, 8);
        cof cofVar = new cof(cof.d(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, cof.a));
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        hb hbVar = new hb(this);
        this.m = hbVar;
        hbVar.c(attributeSet, i);
        this.n = new cls(this);
        i().i(cofVar);
        cml cmlVarI2 = i();
        ColorStateList colorStateList2 = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList3 = this.g;
        int i2 = this.h;
        cmn cmnVar = (cmn) cmlVarI2;
        cof cofVar2 = cmnVar.l;
        un.y(cofVar2);
        cmnVar.m = new cmm(cofVar2);
        cmnVar.m.setTintList(colorStateList2);
        if (mode != null) {
            cmnVar.m.setTintMode(mode);
        }
        cmnVar.m.j(cmnVar.D.getContext());
        if (i2 > 0) {
            Context context3 = cmnVar.D.getContext();
            cof cofVar3 = cmnVar.l;
            un.y(cofVar3);
            clu cluVar = new clu(cofVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            cluVar.c = color;
            cluVar.d = color2;
            cluVar.e = color3;
            cluVar.f = color4;
            float f = i2;
            if (cluVar.b != f) {
                cluVar.b = f;
                cluVar.a.setStrokeWidth(f * 1.3333f);
                cluVar.g = true;
                cluVar.invalidateSelf();
            }
            cluVar.b(colorStateList2);
            cmnVar.o = cluVar;
            clu cluVar2 = cmnVar.o;
            un.y(cluVar2);
            coa coaVar = cmnVar.m;
            un.y(coaVar);
            layerDrawable = new LayerDrawable(new Drawable[]{cluVar2, coaVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            cmnVar.o = null;
            layerDrawable = cmnVar.m;
        }
        cmnVar.n = new RippleDrawable(cnp.a(colorStateList), layerDrawable, drawable);
        cmnVar.p = cmnVar.n;
        i().v = dimensionPixelSize;
        cml cmlVarI3 = i();
        if (cmlVarI3.s != dimension) {
            cmlVarI3.s = dimension;
            cmlVarI3.g(dimension, cmlVarI3.t, cmlVarI3.u);
        }
        cml cmlVarI4 = i();
        if (cmlVarI4.t != dimension2) {
            cmlVarI4.t = dimension2;
            cmlVarI4.g(cmlVarI4.s, dimension2, cmlVarI4.u);
        }
        cml cmlVarI5 = i();
        if (cmlVarI5.u != dimension3) {
            cmlVarI5.u = dimension3;
            cmlVarI5.g(cmlVarI5.s, cmlVarI5.t, dimension3);
        }
        i().x = cjoVarA;
        i().y = cjoVarA2;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
