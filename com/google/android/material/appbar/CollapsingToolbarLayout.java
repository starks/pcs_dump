package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import defpackage.cjl;
import defpackage.cjw;
import defpackage.cjx;
import defpackage.ckb;
import defpackage.ckd;
import defpackage.ckq;
import defpackage.clr;
import defpackage.cms;
import defpackage.cmt;
import defpackage.cnb;
import defpackage.cnx;
import defpackage.cpg;
import defpackage.fuu;
import defpackage.rm;
import defpackage.un;
import defpackage.ut;
import defpackage.vs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private fuu J;
    public final cms a;
    public final cms b;
    final clr c;
    public Drawable d;
    public int e;
    public vs f;
    private boolean g;
    private int h;
    private ViewGroup i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private final Rect q;
    private boolean r;
    private boolean s;
    private Drawable t;
    private int u;
    private boolean v;
    private ValueAnimator w;
    private long x;
    private final TimeInterpolator y;
    private final TimeInterpolator z;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public static ckd c(View view) {
        ckd ckdVar = (ckd) view.getTag(R.id.view_offset_helper);
        if (ckdVar != null) {
            return ckdVar;
        }
        ckd ckdVar2 = new ckd(view);
        view.setTag(R.id.view_offset_helper, ckdVar2);
        return ckdVar2;
    }

    private static int i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void j(AppBarLayout appBarLayout) {
        if (p()) {
            appBarLayout.f = false;
        }
    }

    private final void k() {
        View view;
        if (this.g) {
            ViewGroup viewGroup = null;
            this.i = null;
            this.j = null;
            int i = this.h;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.i = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view2 = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                        view2 = view2;
                    }
                    this.j = view2;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.i = viewGroup;
            }
            if (!this.r && (view = this.k) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.k);
                }
            }
            if (this.r && this.i != null) {
                if (this.k == null) {
                    this.k = new View(getContext());
                }
                if (this.k.getParent() == null) {
                    this.i.addView(this.k, -1, -1);
                }
            }
            this.g = false;
        }
    }

    private final void l(Drawable drawable, int i, int i2) {
        m(drawable, this.i, i, i2);
    }

    private final void m(Drawable drawable, View view, int i, int i2) {
        if (p() && view != null && this.r) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void n(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.r || (view = this.k) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.k.getVisibility() == 0;
        this.s = z2;
        if (!z2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        View view2 = this.j;
        if (view2 == null) {
            view2 = this.i;
        }
        int iA = a(view2);
        cmt.a(this, this.k, this.q);
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.n;
            titleMarginEnd = toolbar.o;
            titleMarginTop = toolbar.p;
            titleMarginBottom = toolbar.q;
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        int i5 = this.q.left + (layoutDirection == 1 ? titleMarginEnd : titleMarginStart);
        Rect rect = this.q;
        if (layoutDirection != 1) {
            titleMarginStart = titleMarginEnd;
        }
        int i6 = rect.right - titleMarginStart;
        int i7 = this.q.top + iA + titleMarginTop;
        int i8 = (this.q.bottom + iA) - titleMarginBottom;
        if (TextUtils.isEmpty(this.b.p)) {
            this.a.h(i5, i7, i6, i8);
        } else {
            this.a.h(i5, i7, i6, (int) (i8 - this.b.a()));
            this.b.h(i5, (int) (i7 + this.a.a()), i6, i8);
        }
        int i9 = z3 ? this.n : this.l;
        int i10 = this.q.top + this.m;
        int i11 = (i3 - i) - (z3 ? this.l : this.n);
        int i12 = (i4 - i2) - this.o;
        if (TextUtils.isEmpty(this.b.p)) {
            this.a.l(i9, i10, i11, i12, true);
            this.a.g(z);
        } else {
            this.a.l(i9, i10, i11, (int) ((i12 - (this.b.b() + this.G)) - this.p), false);
            this.b.l(i9, (int) (i10 + this.a.b() + this.F + this.p), i11, i12, false);
            this.a.g(z);
            this.b.g(z);
        }
    }

    private final void o() {
        ViewGroup viewGroup = this.i;
        if (viewGroup == null || !this.r) {
            return;
        }
        CharSequence subtitle = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).s : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.a.p) && !TextUtils.isEmpty(title)) {
            g(title);
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).t;
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.b.p) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        f(subtitle);
    }

    private final boolean p() {
        return this.C == 1;
    }

    public final int a(View view) {
        return ((getHeight() - c(view).a) - view.getHeight()) - ((cjx) view.getLayoutParams()).bottomMargin;
    }

    public final int b() {
        int i = this.A;
        if (i >= 0) {
            return i + this.D + this.F + this.G + this.I;
        }
        vs vsVar = this.f;
        int iD = vsVar != null ? vsVar.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min(minimumHeight + minimumHeight + iD, getHeight()) : getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cjx;
    }

    public final void d(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.t = drawableMutate;
            if (drawableMutate != null) {
                l(drawableMutate, getWidth(), getHeight());
                this.t.setCallback(this);
                this.t.setAlpha(this.u);
            }
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            super.draw(r7)
            r6.k()
            android.view.ViewGroup r0 = r6.i
            if (r0 != 0) goto L20
            android.graphics.drawable.Drawable r0 = r6.t
            if (r0 == 0) goto L20
            int r1 = r6.u
            if (r1 <= 0) goto L20
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r1 = r6.u
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = r6.t
            r0.draw(r7)
        L20:
            boolean r0 = r6.r
            if (r0 == 0) goto L6b
            boolean r0 = r6.s
            if (r0 == 0) goto L6b
            android.view.ViewGroup r0 = r6.i
            if (r0 == 0) goto L61
            android.graphics.drawable.Drawable r0 = r6.t
            if (r0 == 0) goto L61
            int r0 = r6.u
            if (r0 <= 0) goto L61
            boolean r0 = r6.p()
            if (r0 == 0) goto L61
            cms r0 = r6.a
            float r1 = r0.b
            float r0 = r0.d
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L61
            int r0 = r7.save()
            android.graphics.drawable.Drawable r1 = r6.t
            android.graphics.Rect r1 = r1.getBounds()
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r7.clipRect(r1, r2)
            cms r1 = r6.a
            r1.d(r7)
            cms r1 = r6.b
            r1.d(r7)
            r7.restoreToCount(r0)
            goto L6b
        L61:
            cms r0 = r6.a
            r0.d(r7)
            cms r0 = r6.b
            r0.d(r7)
        L6b:
            android.graphics.drawable.Drawable r0 = r6.d
            if (r0 == 0) goto L9f
            int r0 = r6.u
            if (r0 <= 0) goto L9f
            vs r0 = r6.f
            r1 = 0
            if (r0 == 0) goto L7d
            int r0 = r0.d()
            goto L7e
        L7d:
            r0 = r1
        L7e:
            if (r0 <= 0) goto L9f
            android.graphics.drawable.Drawable r2 = r6.d
            int r3 = r6.e
            int r3 = -r3
            int r4 = r6.getWidth()
            int r5 = r6.e
            int r0 = r0 - r5
            r2.setBounds(r1, r3, r4, r0)
            android.graphics.drawable.Drawable r0 = r6.d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r1 = r6.u
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r6 = r6.d
            r6.draw(r7)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.t;
        if (drawable == null || this.u <= 0 || ((view2 = this.j) == null || view2 == this ? view != this.i : view != view2)) {
            z = false;
        } else {
            m(drawable, view, getWidth(), getHeight());
            this.t.mutate().setAlpha(this.u);
            this.t.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.t;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        cms cmsVar = this.a;
        if (cmsVar != null) {
            cmsVar.q = drawableState;
            ColorStateList colorStateList2 = cmsVar.g;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cmsVar.f) != null && colorStateList.isStateful())) {
                cmsVar.f();
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i) {
        ViewGroup viewGroup;
        if (i != this.u) {
            if (this.t != null && (viewGroup = this.i) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.u = i;
            postInvalidateOnAnimation();
        }
    }

    public final void f(CharSequence charSequence) {
        this.b.t(charSequence);
    }

    public final void g(CharSequence charSequence) {
        this.a.t(charSequence);
        setContentDescription(this.r ? this.a.p : null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cjx();
    }

    public final void h() {
        if (this.t == null && this.d == null) {
            return;
        }
        int height = getHeight() + this.e;
        int iB = b();
        boolean z = height < iB;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.v != z) {
            int i = height < iB ? AIFeature.Id.ROSIE_ROBOT_TRANSLATE : 0;
            if (z2) {
                k();
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.w = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.u ? this.y : this.z);
                    this.w.addUpdateListener(new ckq(this, 1));
                } else if (valueAnimator.isRunning()) {
                    this.w.cancel();
                }
                this.w.setDuration(this.x);
                this.w.setIntValues(this.u, i);
                this.w.start();
            } else {
                e(i);
            }
            this.v = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            j(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.J == null) {
                this.J = new fuu(this, null);
            }
            fuu fuuVar = this.J;
            if (appBarLayout.d == null) {
                appBarLayout.d = new ArrayList();
            }
            if (fuuVar != null && !appBarLayout.d.contains(fuuVar)) {
                appBarLayout.d.add(fuuVar);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.e(configuration);
        if (this.B != configuration.orientation && this.H && this.a.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.b == 0) {
                    appBarLayout.b = 2;
                }
            }
        }
        this.B = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        fuu fuuVar = this.J;
        if (fuuVar != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).d) != null) {
            list.remove(fuuVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        vs vsVar = this.f;
        if (vsVar != null) {
            int iD = vsVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    int[] iArr = ut.a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            c(getChildAt(i6)).b();
        }
        n(i, i2, i3, i4, false);
        o();
        h();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            c(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        k();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        vs vsVar = this.f;
        int iD = vsVar != null ? vsVar.d() : 0;
        if ((mode == 0 || this.E) && iD > 0) {
            this.D = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        o();
        if (!this.r || TextUtils.isEmpty(this.a.p)) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.n(0, 0, getMeasuredWidth(), measuredHeight, true);
            int iB = (int) (collapsingToolbarLayout.D + collapsingToolbarLayout.m + collapsingToolbarLayout.a.b() + (TextUtils.isEmpty(collapsingToolbarLayout.b.p) ? 0.0f : collapsingToolbarLayout.p + collapsingToolbarLayout.b.b()) + collapsingToolbarLayout.o);
            if (iB > measuredHeight) {
                collapsingToolbarLayout.I = iB - measuredHeight;
            } else {
                collapsingToolbarLayout.I = 0;
            }
            if (collapsingToolbarLayout.H) {
                cms cmsVar = collapsingToolbarLayout.a;
                if (cmsVar.r > 1) {
                    int i3 = cmsVar.h;
                    if (i3 > 1) {
                        collapsingToolbarLayout.F = Math.round(cmsVar.b()) * (i3 - 1);
                    } else {
                        collapsingToolbarLayout.F = 0;
                    }
                }
                cms cmsVar2 = collapsingToolbarLayout.b;
                if (cmsVar2.r > 1) {
                    int i4 = cmsVar2.h;
                    if (i4 > 1) {
                        collapsingToolbarLayout.G = Math.round(cmsVar2.b()) * (i4 - 1);
                    } else {
                        collapsingToolbarLayout.G = 0;
                    }
                }
            }
            int i5 = collapsingToolbarLayout.I;
            int i6 = collapsingToolbarLayout.F;
            int i7 = collapsingToolbarLayout.G;
            if (i5 + i6 + i7 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight + i5 + i6 + i7, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.i;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.j;
            if (view == null || view == collapsingToolbarLayout) {
                collapsingToolbarLayout.setMinimumHeight(i(viewGroup));
            } else {
                collapsingToolbarLayout.setMinimumHeight(i(view));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.t;
        if (drawable != null) {
            l(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.d;
        boolean z = i == 0;
        if (drawable != null && drawable.isVisible() != z) {
            this.d.setVisible(z, false);
        }
        Drawable drawable2 = this.t;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.t.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t || drawable == this.d;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new cjx();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new cjx(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int iA;
        TextUtils.TruncateAt truncateAt;
        super(cpg.a(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.g = true;
        this.q = new Rect();
        this.A = -1;
        this.D = 0;
        this.F = 0;
        this.G = 0;
        this.I = 0;
        Context context2 = getContext();
        this.B = getResources().getConfiguration().orientation;
        cms cmsVar = new cms(this);
        this.a = cmsVar;
        cmsVar.u(cjl.e);
        cmsVar.v();
        clr clrVar = new clr(context2);
        this.c = clrVar;
        TypedArray typedArrayA = cnb.a(context2, attributeSet, ckb.c, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        int i2 = typedArrayA.getInt(8, 8388691);
        int i3 = typedArrayA.getInt(2, 8388627);
        cmsVar.p(i2);
        cmsVar.k(i3);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(9, 0);
        this.o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (typedArrayA.hasValue(12)) {
            this.l = typedArrayA.getDimensionPixelSize(12, 0);
        }
        if (typedArrayA.hasValue(11)) {
            this.n = typedArrayA.getDimensionPixelSize(11, 0);
        }
        if (typedArrayA.hasValue(13)) {
            this.m = typedArrayA.getDimensionPixelSize(13, 0);
        }
        if (typedArrayA.hasValue(10)) {
            this.o = typedArrayA.getDimensionPixelSize(10, 0);
        }
        if (typedArrayA.hasValue(14)) {
            this.p = typedArrayA.getDimensionPixelSize(14, 0);
        }
        this.r = typedArrayA.getBoolean(27, true);
        g(typedArrayA.getText(25));
        cmsVar.n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        cmsVar.i(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayA.hasValue(15)) {
            cmsVar.n(typedArrayA.getResourceId(15, 0));
        }
        if (typedArrayA.hasValue(3)) {
            cmsVar.i(typedArrayA.getResourceId(3, 0));
        }
        if (typedArrayA.hasValue(30)) {
            int i4 = typedArrayA.getInt(30, -1);
            if (i4 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i4 != 1) {
                truncateAt = i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
            cmsVar.o = truncateAt;
            cmsVar.f();
        }
        if (typedArrayA.hasValue(16)) {
            cmsVar.o(cnx.i(context2, typedArrayA, 16));
        }
        if (typedArrayA.hasValue(4)) {
            cmsVar.j(cnx.i(context2, typedArrayA, 4));
        }
        this.A = typedArrayA.getDimensionPixelSize(21, -1);
        if (typedArrayA.hasValue(28)) {
            cmsVar.m(typedArrayA.getInt(28, 1));
        } else if (typedArrayA.hasValue(19)) {
            cmsVar.m(typedArrayA.getInt(19, 1));
        }
        if (typedArrayA.hasValue(29)) {
            cmsVar.s(AnimationUtils.loadInterpolator(context2, typedArrayA.getResourceId(29, 0)));
        }
        cms cmsVar2 = new cms(this);
        this.b = cmsVar2;
        cmsVar2.u(cjl.e);
        cmsVar2.v();
        if (typedArrayA.hasValue(23)) {
            f(typedArrayA.getText(23));
        }
        cmsVar2.p(i2);
        cmsVar2.k(i3);
        cmsVar2.n(R.style.TextAppearance_AppCompat_Headline);
        cmsVar2.i(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayA.hasValue(6)) {
            cmsVar2.n(typedArrayA.getResourceId(6, 0));
        }
        if (typedArrayA.hasValue(0)) {
            cmsVar2.i(typedArrayA.getResourceId(0, 0));
        }
        if (typedArrayA.hasValue(7)) {
            cmsVar2.o(cnx.i(context2, typedArrayA, 7));
        }
        if (typedArrayA.hasValue(1)) {
            cmsVar2.j(cnx.i(context2, typedArrayA, 1));
        }
        if (typedArrayA.hasValue(24)) {
            cmsVar2.m(typedArrayA.getInt(24, 1));
        }
        if (typedArrayA.hasValue(29)) {
            cmsVar2.s(AnimationUtils.loadInterpolator(context2, typedArrayA.getResourceId(29, 0)));
        }
        this.x = typedArrayA.getInt(20, 600);
        this.y = cnx.n(context2, R.attr.motionEasingStandardInterpolator, cjl.c);
        this.z = cnx.n(context2, R.attr.motionEasingStandardInterpolator, cjl.d);
        d(typedArrayA.getDrawable(5));
        Drawable drawable = typedArrayA.getDrawable(22);
        Drawable drawable2 = this.d;
        ColorStateList colorStateListValueOf = null;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.d = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                this.d.setLayoutDirection(getLayoutDirection());
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.u);
            }
            postInvalidateOnAnimation();
        }
        this.C = typedArrayA.getInt(26, 0);
        boolean zP = p();
        cmsVar.c = zP;
        cmsVar2.c = zP;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            j((AppBarLayout) parent);
        }
        if (zP && this.t == null) {
            Context context3 = getContext();
            TypedValue typedValueL = cnx.l(context3, R.attr.colorSurfaceContainer);
            if (typedValueL != null) {
                if (typedValueL.resourceId != 0) {
                    colorStateListValueOf = rm.b(context3, typedValueL.resourceId);
                } else if (typedValueL.data != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(typedValueL.data);
                }
            }
            if (colorStateListValueOf != null) {
                iA = colorStateListValueOf.getDefaultColor();
            } else {
                iA = clrVar.a(clrVar.b, getResources().getDimension(R.dimen.design_appbar_elevation));
            }
            d(new ColorDrawable(iA));
        }
        this.h = typedArrayA.getResourceId(31, -1);
        this.E = typedArrayA.getBoolean(18, false);
        this.H = typedArrayA.getBoolean(17, false);
        typedArrayA.recycle();
        setWillNotDraw(false);
        cjw cjwVar = new cjw(this);
        int[] iArr = ut.a;
        un.p(this, cjwVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new cjx(layoutParams);
    }
}
