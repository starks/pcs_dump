package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.apps.aicore.aidl.AIFeature;
import defpackage.brb;
import defpackage.tq;
import defpackage.tv;
import defpackage.tw;
import defpackage.ty;
import defpackage.tz;
import defpackage.ul;
import defpackage.us;
import defpackage.ut;
import defpackage.wh;
import defpackage.wi;
import defpackage.wj;
import defpackage.wk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements ty, tv {
    private static final float g = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final wi h = new wi();
    private static final int[] i = {R.attr.fillViewport};
    private int A;
    private int B;
    private wk C;
    private final tz D;
    private final tw E;
    private float F;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    final wj d;
    tq e;
    brb f;
    private final float j;
    private long k;
    private final Rect l;
    private int m;
    private boolean n;
    private boolean o;
    private View p;
    private boolean q;
    private VelocityTracker r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private final int[] y;
    private final int[] z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final void A() {
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
    }

    private final void B(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.i(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private final void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.x) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.m = (int) motionEvent.getY(i2);
            this.x = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void D() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    private final void E(boolean z) {
        if (z) {
            q(2, 1);
        } else {
            k(1);
        }
        this.B = getScrollY();
        postInvalidateOnAnimation();
    }

    private final void F(View view) {
        view.getDrawingRect(this.l);
        offsetDescendantRectToMyCoords(view, this.l);
        int iB = b(this.l);
        if (iB != 0) {
            scrollBy(0, iB);
        }
    }

    private final boolean G(View view) {
        return !I(view, 0, getHeight());
    }

    private static boolean H(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && H((View) parent, view2);
    }

    private final boolean I(View view, int i2, int i3) {
        view.getDrawingRect(this.l);
        offsetDescendantRectToMyCoords(view, this.l);
        return this.l.bottom + i2 >= getScrollY() && this.l.top - i2 <= getScrollY() + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean J(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 2
            java.util.ArrayList r6 = r0.getFocusables(r6)
            int r7 = r6.size()
            r9 = 0
            r10 = 0
            r11 = 0
        L1d:
            r12 = 33
            r13 = 1
            if (r10 >= r7) goto L67
            java.lang.Object r14 = r6.get(r10)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r8 = r14.getBottom()
            if (r2 >= r8) goto L64
            if (r15 >= r3) goto L64
            if (r2 >= r15) goto L3b
            if (r8 >= r3) goto L3b
            r16 = r13
            goto L3d
        L3b:
            r16 = 0
        L3d:
            if (r9 != 0) goto L43
            r9 = r14
            r11 = r16
            goto L64
        L43:
            if (r1 != r12) goto L4c
            int r8 = r9.getTop()
            if (r15 < r8) goto L52
            goto L54
        L4c:
            int r12 = r9.getBottom()
            if (r8 <= r12) goto L54
        L52:
            r8 = r13
            goto L55
        L54:
            r8 = 0
        L55:
            if (r11 == 0) goto L5c
            if (r16 == 0) goto L64
            if (r8 == 0) goto L64
            goto L63
        L5c:
            if (r16 == 0) goto L61
            r11 = r13
        L5f:
            r9 = r14
            goto L64
        L61:
            if (r8 == 0) goto L64
        L63:
            goto L5f
        L64:
            int r10 = r10 + 1
            goto L1d
        L67:
            if (r9 != 0) goto L6a
            r9 = r0
        L6a:
            if (r2 < r5) goto L73
            if (r3 > r4) goto L70
            r8 = 0
            goto L7d
        L70:
            if (r1 != r12) goto L77
            goto L75
        L73:
            if (r1 != r12) goto L77
        L75:
            int r2 = r2 - r5
            goto L79
        L77:
            int r2 = r3 - r4
        L79:
            r0.M(r2)
            r8 = r13
        L7d:
            android.view.View r0 = r0.findFocus()
            if (r9 == r0) goto L86
            r9.requestFocus(r1)
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.J(int, int, int):boolean");
    }

    private final boolean K(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fA = wh.a(edgeEffect) * getHeight();
        double dLog = Math.log((Math.abs(-i2) * 0.35f) / (this.j * 0.015f));
        double d = g;
        return ((float) (((double) (this.j * 0.015f)) * Math.exp((d / ((-1.0d) + d)) * dLog))) < fA;
    }

    private final boolean L(MotionEvent motionEvent) {
        boolean z;
        if (wh.a(this.b) != 0.0f) {
            wh.b(this.b, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (wh.a(this.c) == 0.0f) {
            return z;
        }
        wh.b(this.c, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private final void M(int i2) {
        i(i2, -1, null, 0, 1, true);
    }

    private final void N(int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.a.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, AIFeature.Id.VISION);
            E(z);
        } else {
            if (!this.a.isFinished()) {
                y();
            }
            scrollBy(i2, i3);
        }
        this.k = AnimationUtils.currentAnimationTimeMillis();
    }

    private final brb O() {
        if (this.f == null) {
            this.f = new brb((View) this);
        }
        return this.f;
    }

    private static int x(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private final void y() {
        this.a.abortAnimation();
        k(1);
    }

    private final void z() {
        this.x = -1;
        this.q = false;
        D();
        k(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    public final float a() {
        float f = this.F;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.F = dimension;
        return dimension;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    protected final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || rect.bottom >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? -(i3 - rect.bottom) : -(scrollY - rect.top), -getScrollY());
    }

    public final int c() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY <= iMax ? bottom : bottom + (scrollY - iMax);
    }

    @Override // defpackage.tx
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        m(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.E.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.E.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return m(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.E.h(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.b.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.b.setSize(width, height);
            if (this.b.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.c.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(c(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.c.setSize(width2, height2);
        if (this.c.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // defpackage.tx
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        B(i5, i6, null);
    }

    @Override // defpackage.ty
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        B(i5, i6, iArr);
    }

    @Override // defpackage.tx
    public final void g(View view, View view2, int i2, int i3) {
        this.D.c(i2, i3);
        q(2, i3);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.D.a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.tx
    public final void h(View view, int i2) {
        this.D.d(i2);
        k(i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return p(0);
    }

    final int i(int i2, int i3, MotionEvent motionEvent, int i4, int i5, boolean z) {
        int i6;
        int i7;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            q(2, 1);
        }
        if (m(0, i2, this.z, this.y, i5)) {
            i6 = i2 - this.z[1];
            i7 = this.y[1];
        } else {
            i6 = i2;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int iC = c();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && c() > 0)) && !z;
        boolean z3 = s(i6, 0, scrollY, iC) && !p(i5);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            O().l(motionEvent.getDeviceId(), motionEvent.getSource(), i3, scrollY2);
        }
        int[] iArr = this.z;
        iArr[1] = 0;
        r(scrollY2, i6 - scrollY2, this.y, i5, iArr);
        int i8 = i7 + this.y[1];
        int i9 = i6 - this.z[1];
        int i10 = scrollY + i9;
        if (i10 < 0) {
            if (z2) {
                wh.b(this.b, (-i9) / getHeight(), i4 / getWidth());
                if (motionEvent != null) {
                    O().k(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                }
                if (!this.c.isFinished()) {
                    this.c.onRelease();
                }
            }
        } else if (i10 > iC && z2) {
            wh.b(this.c, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (motionEvent != null) {
                O().k(motionEvent.getDeviceId(), motionEvent.getSource(), i3, false);
            }
            if (!this.b.isFinished()) {
                this.b.onRelease();
            }
        }
        if (!this.b.isFinished() || !this.c.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z3 && i5 == 0 && (velocityTracker = this.r) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            k(1);
            this.b.onRelease();
            this.c.onRelease();
        }
        return i8;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.E.a;
    }

    public final void j(int i2) {
        if (getChildCount() > 0) {
            this.a.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            E(true);
            us.d(this, Math.abs(this.a.getCurrVelocity()));
        }
    }

    public final void k(int i2) {
        this.E.c(i2);
    }

    public final boolean l(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int height = (int) (getHeight() * 0.5f);
        if (viewFindNextFocus == null || !I(viewFindNextFocus, height, getHeight())) {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            M(height);
        } else {
            viewFindNextFocus.getDrawingRect(this.l);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.l);
            M(b(this.l));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !G(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean m(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.E.g(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(KeyEvent keyEvent) {
        this.l.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? o(33) : l(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? o(130) : l(130);
                }
                if (keyCode == 62) {
                    u(true == keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return o(33);
                }
                if (keyCode == 93) {
                    return o(130);
                }
                if (keyCode == 122) {
                    u(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                u(130);
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(int i2) {
        int childCount;
        Rect rect = this.l;
        int height = getHeight();
        rect.top = 0;
        this.l.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.l.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.l;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.l;
        return J(i2, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.q) {
            if (ul.j(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i2 = 9;
                width = (int) motionEvent.getX();
            } else if (ul.j(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i2 = 26;
                axisValue = axisValue2;
            } else {
                i2 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                i(-((int) (axisValue * a())), i2, motionEvent, width, 1, ul.j(motionEvent, 8194));
                this.e.a(motionEvent, i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.n = false;
        View view = this.p;
        if (view != null && H(view, this)) {
            F(this.p);
        }
        this.p = null;
        if (!this.o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.a);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iX = x(scrollY, paddingTop, measuredHeight);
            if (iX != scrollY) {
                scrollTo(getScrollX(), iX);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.s && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        B(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || G(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wk wkVar = (wk) parcelable;
        super.onRestoreInstanceState(wkVar.getSuperState());
        this.C = wkVar;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        wk wkVar = new wk(super.onSaveInstanceState());
        wkVar.a = getScrollY();
        return wkVar;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !I(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.l);
        offsetDescendantRectToMyCoords(viewFindFocus, this.l);
        int iB = b(this.l);
        if (iB != 0) {
            if (this.t) {
                v(iB);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i2) {
        return this.E.k(i2);
    }

    public final boolean q(int i2, int i3) {
        return this.E.m(i2, i3);
    }

    public final void r(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.E.i(0, i2, 0, i3, iArr, i4, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.n) {
            this.p = view2;
        } else {
            F(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
                return z2;
            }
            v(iB);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            D();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.n = true;
        super.requestLayout();
    }

    final boolean s(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean z2 = i3 > 0 || i3 < 0;
        int i7 = i4 + i2;
        if (i7 > i5) {
            i6 = i5;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z = false;
                if (z && !p(1)) {
                    this.a.springBack(0, i6, 0, 0, 0, c());
                }
                super.scrollTo(0, i6);
                return !z2 || z;
            }
            i6 = 0;
        }
        z = true;
        if (z) {
            this.a.springBack(0, i6, 0, 0, 0, c());
        }
        super.scrollTo(0, i6);
        if (z2) {
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iX = x(i2, width, width2);
            int iX2 = x(i3, height, height2);
            if (iX == getScrollX() && iX2 == getScrollY()) {
                return;
            }
            super.scrollTo(iX, iX2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.E.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return q(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        k(0);
    }

    @Override // defpackage.tx
    public final boolean t(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final void u(int i2) {
        int height = getHeight();
        if (i2 == 130) {
            this.l.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.l.top + height > bottom) {
                    this.l.top = bottom - height;
                }
            }
        } else {
            this.l.top = getScrollY() - height;
            if (this.l.top < 0) {
                this.l.top = 0;
            }
        }
        Rect rect = this.l;
        rect.bottom = rect.top + height;
        Rect rect2 = this.l;
        J(i2, rect2.top, rect2.bottom);
    }

    public final void v(int i2) {
        N(0, i2, false);
    }

    public final void w(int i2) {
        N(-getScrollX(), i2 - getScrollY(), true);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.as.oss.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new Rect();
        this.n = true;
        this.o = false;
        this.p = null;
        this.q = false;
        this.t = true;
        this.x = -1;
        this.y = new int[2];
        this.z = new int[2];
        wj wjVar = new wj(this, 0);
        this.d = wjVar;
        this.e = new tq(getContext(), wjVar);
        this.b = wh.c(context, attributeSet);
        this.c = wh.c(context, attributeSet);
        this.j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.u = viewConfiguration.getScaledTouchSlop();
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, i2, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z != this.s) {
            this.s = z;
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.D = new tz();
        this.E = new tw(this);
        setNestedScrollingEnabled(true);
        ut.j(this, h);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
