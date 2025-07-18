package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.as.oss.R;
import defpackage.C0000do;
import defpackage.brb;
import defpackage.er;
import defpackage.fq;
import defpackage.gd;
import defpackage.ge;
import defpackage.gf;
import defpackage.gg;
import defpackage.id;
import defpackage.ll;
import defpackage.p;
import defpackage.rz;
import defpackage.tx;
import defpackage.ty;
import defpackage.tz;
import defpackage.ul;
import defpackage.un;
import defpackage.ut;
import defpackage.vs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements id, tx, ty {
    private static final vs l;
    private static final Rect m;
    private vs A;
    private vs B;
    private vs C;
    private OverScroller D;
    private final Runnable E;
    private final Runnable F;
    private final tz G;
    private final gg H;
    private ll I;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public ge h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int n;
    private ContentFrameLayout o;
    private Drawable p;
    private boolean q;
    private int r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private boolean y;
    private vs z;
    private static final Rect k = new Rect();
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    static {
        brb brbVar = new brb((char[]) null, (byte[]) null);
        brbVar.j(rz.c(0, 1, 0, 1));
        l = brbVar.i();
        m = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.p = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.D = new OverScroller(context);
    }

    private static final boolean w(View view, Rect rect, boolean z) {
        boolean z2;
        gf gfVar = (gf) view.getLayoutParams();
        if (gfVar.leftMargin != rect.left) {
            gfVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (gfVar.topMargin != rect.top) {
            gfVar.topMargin = rect.top;
            z2 = true;
        }
        if (gfVar.rightMargin != rect.right) {
            gfVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || gfVar.bottomMargin == rect.bottom) {
            return z2;
        }
        gfVar.bottomMargin = rect.bottom;
        return true;
    }

    private static final boolean x(View view, Rect rect) {
        if (view.getPaddingLeft() == rect.left && view.getPaddingTop() == rect.top && view.getPaddingRight() == rect.right) {
            return false;
        }
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
        return true;
    }

    @Override // defpackage.id
    public final void a() {
        i();
        this.I.d();
    }

    public final void b() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.id
    public final void c(int i) {
        i();
        if (i == 2) {
            ll.u();
        } else if (i == 5) {
            ll.t();
        } else {
            if (i != 109) {
                return;
            }
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gf;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.p != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.p.setBounds(0, bottom, getWidth(), this.p.getIntrinsicHeight() + bottom);
            this.p.draw(canvas);
        }
    }

    @Override // defpackage.tx
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.ty
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.tx
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gf();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gf(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.G.a();
    }

    @Override // defpackage.tx
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.o == null) {
            this.o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View viewFindViewById = findViewById(R.id.action_bar);
            if (!(viewFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(viewFindViewById.getClass().getSimpleName())));
            }
            this.I = ((Toolbar) viewFindViewById).A();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.id
    public final void l(Menu menu, fq fqVar) {
        i();
        this.I.h(menu, fqVar);
    }

    @Override // defpackage.id
    public final void m() {
        i();
        this.I.i();
    }

    @Override // defpackage.id
    public final void n(Window.Callback callback) {
        i();
        this.I.l(callback);
    }

    @Override // defpackage.id
    public final void o(CharSequence charSequence) {
        i();
        this.I.m(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zX;
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        vs vsVar = l;
        int[] iArr = ut.a;
        un.k(this.H, vsVar, this.w);
        boolean zEquals = this.w.equals(m);
        this.x = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.y = z3;
        ge geVar = this.h;
        if (geVar != null) {
            ((C0000do) geVar).j = (z2 || z3) ? false : true;
        }
        vs vsVarN = vs.n(windowInsets, this);
        this.v.set(vsVarN.b(), vsVarN.d(), vsVarN.c(), vsVarN.a());
        ActionBarContainer actionBarContainer = this.c;
        Rect rect = this.v;
        if (this.y) {
            zX = w(actionBarContainer, k, false);
            zW = x(actionBarContainer, rect);
        } else {
            zX = x(actionBarContainer, k);
            zW = w(actionBarContainer, rect, false);
        }
        boolean z4 = zW | zX;
        un.k(this, vsVarN, this.s);
        Rect rect2 = this.s;
        vs vsVarL = vsVarN.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.z = vsVarL;
        if (this.A.equals(vsVarL)) {
            z = z4;
        } else {
            this.A = this.z;
        }
        if (this.t.equals(this.s)) {
            if (z) {
            }
            return vsVarN.i().k().j().e();
        }
        this.t.set(this.s);
        requestLayout();
        return vsVarN.i().k().j().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int[] iArr = ut.a;
        ul.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                gf gfVar = (gf) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = gfVar.leftMargin + paddingLeft;
                int i7 = gfVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        gf gfVar = (gf) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + gfVar.leftMargin + gfVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + gfVar.topMargin + gfVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = ut.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.n;
            if (this.y) {
                measuredHeight += this.v.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        this.u.set(this.s);
        vs vsVar = this.z;
        this.B = vsVar;
        if (this.d || z || !this.x) {
            rz rzVarC = this.y ? rz.c(vsVar.b(), Math.max(this.B.d(), measuredHeight), this.B.c(), Math.max(this.B.a(), 0)) : rz.c(vsVar.b(), this.B.d() + measuredHeight, this.B.c(), this.B.a());
            brb brbVar = new brb(this.B);
            brbVar.j(rzVarC);
            this.B = brbVar.i();
        } else {
            if (this.y) {
                Rect rect = this.u;
                rect.top = Math.max(rect.top, measuredHeight);
                Rect rect2 = this.u;
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                this.u.top += measuredHeight;
                Rect rect3 = this.u;
                rect3.bottom = rect3.bottom;
            }
            this.B = this.B.l(0, measuredHeight, 0, 0);
        }
        w(this.o, this.u, true);
        if (!this.C.equals(this.B)) {
            vs vsVar2 = this.B;
            this.C = vsVar2;
            ut.m(this.o, vsVar2);
        }
        measureChildWithMargins(this.o, i, 0, i2, 0);
        gf gfVar2 = (gf) this.o.getLayoutParams();
        int iMax3 = Math.max(iMax, this.o.getMeasuredWidth() + gfVar2.leftMargin + gfVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.o.getMeasuredHeight() + gfVar2.topMargin + gfVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.q || !z) {
            return false;
        }
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.D.getFinalY() > this.c.getHeight()) {
            b();
            this.F.run();
        } else {
            b();
            this.E.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.r + i2;
        this.r = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0000do c0000do;
        er erVar;
        this.G.b(view, view2, i);
        ActionBarContainer actionBarContainer = this.c;
        this.r = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        ge geVar = this.h;
        if (geVar == null || (erVar = (c0000do = (C0000do) geVar).l) == null) {
            return;
        }
        erVar.a();
        c0000do.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.q || this.f) {
            return;
        }
        if (this.r <= this.c.getHeight()) {
            b();
            postDelayed(this.E, 600L);
        } else {
            b();
            postDelayed(this.F, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        ge geVar = this.h;
        if (geVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            C0000do c0000do = (C0000do) geVar;
            c0000do.j = (z || this.y) ? false : true;
            if (i3 == 0 || !z) {
                if (c0000do.k) {
                    c0000do.k = false;
                    c0000do.j(true);
                }
            } else if (!c0000do.k) {
                c0000do.k = true;
                c0000do.j(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = ut.a;
        ul.b(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        ge geVar = this.h;
        if (geVar != null) {
            ((C0000do) geVar).i = i;
        }
    }

    @Override // defpackage.id
    public final boolean p() {
        i();
        return this.I.n();
    }

    @Override // defpackage.id
    public final boolean q() {
        i();
        return this.I.p();
    }

    @Override // defpackage.id
    public final boolean r() {
        i();
        return this.I.q();
    }

    @Override // defpackage.id
    public final boolean s() {
        i();
        return this.I.r();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.tx
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.id
    public final boolean u() {
        i();
        return this.I.s();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = true;
        this.y = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.z = vs.a;
        vs vsVar = vs.a;
        this.A = vsVar;
        this.B = vsVar;
        this.C = vsVar;
        this.j = new gd(this);
        this.E = new p(this, 9, null);
        this.F = new p(this, 10, null);
        v(context);
        this.G = new tz();
        gg ggVar = new gg(context);
        this.H = ggVar;
        addView(ggVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new gf(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.tx
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
