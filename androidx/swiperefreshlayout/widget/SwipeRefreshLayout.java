package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.google.android.apps.aicore.aidl.AIFeature;
import defpackage.aft;
import defpackage.afw;
import defpackage.afx;
import defpackage.afy;
import defpackage.afz;
import defpackage.aga;
import defpackage.agb;
import defpackage.agc;
import defpackage.agd;
import defpackage.age;
import defpackage.awz;
import defpackage.ls;
import defpackage.tv;
import defpackage.tw;
import defpackage.tx;
import defpackage.ty;
import defpackage.tz;
import defpackage.ut;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements ty, tx, tv {
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l = {R.attr.enabled};
    private int A;
    private final DecelerateInterpolator B;
    private int C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private int H;
    private Animation.AnimationListener I;
    private final Animation J;
    private final Animation K;
    public boolean a;
    public int b;
    public aft c;
    public int d;
    public int e;
    public int f;
    public afx g;
    public boolean h;
    public boolean i;
    public awz j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final tz q;
    private final tw r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private final Animation m(int i, int i2) {
        aga agaVar = new aga(this, i, i2);
        agaVar.setDuration(300L);
        aft aftVar = this.c;
        aftVar.a = null;
        aftVar.clearAnimation();
        this.c.startAnimation(agaVar);
        return agaVar;
    }

    private final void n() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.c)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void o(float f) {
        if (f > this.o) {
            r(true, true);
            return;
        }
        this.a = false;
        this.g.d(0.0f);
        agb agbVar = new agb(this, 0);
        this.d = this.b;
        this.K.reset();
        this.K.setDuration(200L);
        this.K.setInterpolator(this.B);
        aft aftVar = this.c;
        aftVar.a = agbVar;
        aftVar.clearAnimation();
        this.c.startAnimation(this.K);
        this.g.b(false);
    }

    private final void p(float f) {
        this.g.b(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.o));
        float fMax = (float) Math.max(fMin - 0.4d, 0.0d);
        float fAbs = Math.abs(f) - this.o;
        float f2 = this.f;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 + f2) / f2) / 4.0f;
        float f3 = fMin * f2;
        float fPow = (float) (dMax - Math.pow(dMax, 2.0d));
        float f4 = fPow + fPow;
        float f5 = f2 * f4;
        int i = this.e + ((int) (f3 + f5 + f5));
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        if (f < this.o) {
            if (this.g.getAlpha() > 76 && !v(this.F)) {
                this.F = m(this.g.getAlpha(), 76);
            }
        } else if (this.g.getAlpha() < 255 && !v(this.G)) {
            this.G = m(this.g.getAlpha(), AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        }
        float f6 = (fMax * 5.0f) / 3.0f;
        this.g.d(Math.min(0.8f, f6 * 0.8f));
        this.g.c(Math.min(1.0f, f6));
        afx afxVar = this.g;
        afxVar.a.g = (((f6 * 0.4f) - 0.25f) + f4 + f4) * 0.5f;
        afxVar.invalidateSelf();
        j(i - this.b);
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            this.A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void r(boolean z, boolean z2) {
        if (this.a != z) {
            this.h = z2;
            n();
            this.a = z;
            if (!z) {
                k(this.I);
                return;
            }
            int i = this.b;
            Animation.AnimationListener animationListener = this.I;
            this.d = i;
            this.J.reset();
            this.J.setDuration(200L);
            this.J.setInterpolator(this.B);
            if (animationListener != null) {
                this.c.a = animationListener;
            }
            this.c.clearAnimation();
            this.c.startAnimation(this.J);
        }
    }

    private final void s(boolean z, boolean z2) {
        if (z) {
            if (!this.a) {
                this.a = true;
                j((this.f + this.e) - this.b);
                this.h = z2;
                Animation.AnimationListener animationListener = this.I;
                this.c.setVisibility(0);
                this.g.setAlpha(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
                afy afyVar = new afy(this);
                this.D = afyVar;
                afyVar.setDuration(this.w);
                if (animationListener != null) {
                    this.c.a = animationListener;
                }
                this.c.clearAnimation();
                this.c.startAnimation(this.D);
                return;
            }
            z = true;
        }
        r(z, false);
    }

    private final void u(float f) {
        float f2 = this.y;
        float f3 = f - f2;
        float f4 = this.n;
        if (f3 <= f4 || this.z) {
            return;
        }
        this.x = f2 + f4;
        this.z = true;
        this.g.setAlpha(76);
    }

    private static final boolean v(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void a(float f) {
        j((this.d + ((int) ((this.e - r0) * f))) - this.c.getTop());
    }

    public final void b() {
        this.c.clearAnimation();
        this.g.stop();
        this.c.setVisibility(8);
        this.c.getBackground().setAlpha(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        this.g.setAlpha(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        j(this.e - this.b);
        this.b = this.c.getTop();
    }

    public final void c(float f) {
        this.c.setScaleX(f);
        this.c.setScaleY(f);
    }

    @Override // defpackage.tx
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        s(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r.f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r.h(i, i2, i3, i4, iArr);
    }

    @Override // defpackage.tx
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.u);
    }

    @Override // defpackage.ty
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        this.r.i(i, i2, i3, i4, this.t, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = i4 + this.t[1];
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || l()) {
            return;
        }
        float fAbs = this.p + Math.abs(i8);
        this.p = fAbs;
        p(fAbs);
        iArr[1] = iArr[1] + i6;
    }

    @Override // defpackage.tx
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.C;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.q.a();
    }

    @Override // defpackage.tx
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.r.j();
    }

    public final void i(boolean z) {
        s(z, false);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    public final void j(int i) {
        this.c.bringToFront();
        aft aftVar = this.c;
        int[] iArr = ut.a;
        aftVar.offsetTopAndBottom(i);
        this.b = this.c.getTop();
    }

    public final void k(Animation.AnimationListener animationListener) {
        afz afzVar = new afz(this);
        this.E = afzVar;
        afzVar.setDuration(150L);
        aft aftVar = this.c;
        aftVar.a = animationListener;
        aftVar.clearAnimation();
        this.c.startAnimation(this.E);
    }

    public final boolean l() {
        View view = this.m;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.n()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.isEnabled()
            r2 = 0
            if (r1 == 0) goto L73
            boolean r1 = r4.l()
            if (r1 != 0) goto L73
            boolean r1 = r4.a
            if (r1 != 0) goto L73
            boolean r1 = r4.v
            if (r1 == 0) goto L1d
            goto L73
        L1d:
            if (r0 == 0) goto L50
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 3
            if (r0 == r1) goto L4b
            r1 = 6
            if (r0 == r1) goto L2d
            goto L70
        L2d:
            r4.q(r5)
            goto L70
        L31:
            int r0 = r4.A
            if (r0 != r3) goto L3d
            java.lang.String r4 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.k
            java.lang.String r5 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r4, r5)
            return r2
        L3d:
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L73
            float r5 = r5.getY(r0)
            r4.u(r5)
            goto L70
        L4b:
            r4.z = r2
            r4.A = r3
            goto L70
        L50:
            int r0 = r4.e
            aft r1 = r4.c
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.j(r0)
            int r0 = r5.getPointerId(r2)
            r4.A = r0
            r4.z = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L73
            float r5 = r5.getY(r0)
            r4.y = r5
        L70:
            boolean r4 = r4.z
            return r4
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            n();
        }
        View view = this.m;
        if (view != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.c.getMeasuredWidth();
            int measuredHeight2 = this.c.getMeasuredHeight();
            aft aftVar = this.c;
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.b;
            int i8 = i5 + i6;
            aftVar.layout(i5 - i6, i7, i8, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            n();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(this.H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.C = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.c) {
                this.C = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                p(f2);
            }
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.u);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.b(view, view2, i);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.v = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        age ageVar = (age) parcelable;
        super.onRestoreInstanceState(ageVar.getSuperState());
        i(ageVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new age(super.onSaveInstanceState(), this.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.a || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.q.d(0);
        this.v = false;
        float f = this.p;
        if (f > 0.0f) {
            o(f);
            this.p = 0.0f;
        } else {
            post(new ls(this, 13));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || l() || this.a || this.v) {
            return false;
        }
        if (actionMasked == 0) {
            this.A = motionEvent.getPointerId(0);
            this.z = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex < 0) {
                    Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.z) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.x) * 0.5f;
                    this.z = false;
                    o(y);
                }
                this.A = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex2 < 0) {
                    Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                u(y2);
                if (this.z) {
                    float f = (y2 - this.x) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.A = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.r.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.r.l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.r.b();
    }

    @Override // defpackage.tx
    public final boolean t(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.C = -1;
        this.I = new agb(this, 1);
        this.J = new agc(this);
        this.K = new agd(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H = (int) (displayMetrics.density * 40.0f);
        this.c = new aft(getContext());
        afx afxVar = new afx(getContext());
        this.g = afxVar;
        afw afwVar = afxVar.a;
        float f = afxVar.b.getDisplayMetrics().density;
        afwVar.f(2.5f * f);
        afwVar.q = 7.5f * f;
        afwVar.d(0);
        afwVar.r = (int) (10.0f * f);
        afwVar.s = (int) (f * 5.0f);
        afxVar.invalidateSelf();
        this.c.setImageDrawable(this.g);
        this.c.setVisibility(8);
        addView(this.c);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f = i;
        this.o = i;
        this.q = new tz();
        this.r = new tw(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.H;
        this.b = i2;
        this.e = i2;
        a(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
