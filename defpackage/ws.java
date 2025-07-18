package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ws {
    private static final Interpolator f = new wp(0);
    public int a;
    public int b;
    public View d;
    public Interpolator e;
    private float[] g;
    private float[] h;
    private float[] i;
    private float[] j;
    private int[] k;
    private int[] l;
    private int[] m;
    private int n;
    private VelocityTracker o;
    private final float p;
    private float q;
    private int r;
    private final int s;
    private final OverScroller t;
    private final wr u;
    private boolean v;
    private final ViewGroup w;
    public int c = -1;
    private final Runnable x = new ls(this, 6, null);

    private ws(Context context, ViewGroup viewGroup, wr wrVar) {
        if (wrVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.w = viewGroup;
        this.u = wrVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.s = i;
        this.r = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e = f;
        this.t = new OverScroller(context, new wq(this));
    }

    public static ws b(ViewGroup viewGroup, wr wrVar) {
        return new ws(viewGroup.getContext(), viewGroup, wrVar);
    }

    private final int m(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.w.getWidth() / 2;
        float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            float f2 = width;
            iAbs = Math.round(Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    private final void n(int i) {
        float[] fArr = this.g;
        if (fArr == null || !h(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0.0f;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m[i] = 0;
        this.n = (~(1 << i)) & this.n;
    }

    private final void o(float f2, float f3) {
        this.v = true;
        this.u.d(this.d, f2, f3);
        this.v = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void p() {
        this.o.computeCurrentVelocity(1000, this.p);
        o(w(this.o.getXVelocity(this.c), this.q, this.p), w(this.o.getYVelocity(this.c), this.q, this.p));
    }

    private final void q(float f2, float f3, int i) {
        v(f2, f3, i);
        v(f3, f2, i);
        v(f2, f3, i);
        v(f3, f2, i);
    }

    private final void r(float f2, float f3, int i) {
        float[] fArr = this.g;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.h;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.i;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.j;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.k;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.l;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.m;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.g = fArr2;
            this.h = fArr3;
            this.i = fArr4;
            this.j = fArr5;
            this.k = iArr;
            this.l = iArr2;
            this.m = iArr3;
        }
        float[] fArr9 = this.g;
        this.i[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.h;
        this.j[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.k;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = i3 < this.w.getLeft() + this.r ? 1 : 0;
        if (i4 < this.w.getTop() + this.r) {
            i5 |= 4;
        }
        if (i3 > this.w.getRight() - this.r) {
            i5 |= 2;
        }
        if (i4 > this.w.getBottom() - this.r) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.n |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (u(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.i[pointerId] = x;
                this.j[pointerId] = y;
            }
        }
    }

    private final boolean t(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.u.a(view) > 0;
        boolean z2 = this.u.h() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        int i = this.b;
        return (f2 * f2) + (f3 * f3) > ((float) (i * i));
    }

    private final boolean u(int i) {
        return h(i);
    }

    private final boolean v(float f2, float f3, int i) {
        Math.abs(f2);
        Math.abs(f3);
        int i2 = this.k[i];
        return false;
    }

    private static final float w(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private static final int x(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final View a(int i, int i2) {
        int childCount = this.w.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.w.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.c = -1;
        float[] fArr = this.g;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0.0f);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            Arrays.fill(this.m, 0);
            this.n = 0;
        }
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    public final void d(View view, int i) {
        if (view.getParent() != this.w) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.w + ")");
        }
        this.d = view;
        this.c = i;
        this.u.b(view, i);
        f(1);
    }

    public final void e(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewA = a((int) x, (int) y);
            r(x, y, pointerId);
            k(viewA, pointerId);
            int i2 = this.k[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                p();
            }
            c();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    o(0.0f, 0.0f);
                }
                c();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                int i3 = (int) x2;
                float y2 = motionEvent.getY(actionIndex);
                int i4 = (int) y2;
                r(x2, y2, pointerId2);
                if (this.a == 0) {
                    k(a(i3, i4), pointerId2);
                    int i5 = this.k[pointerId2];
                    return;
                }
                View view = this.d;
                if (view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom()) {
                    k(this.d, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.c) {
                        View viewA2 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.d;
                        if (viewA2 == view2 && k(view2, pointerId4)) {
                            if (this.c == -1) {
                                break;
                            }
                        }
                    }
                    i++;
                }
                p();
            }
            n(pointerId3);
            return;
        }
        if (this.a == 1) {
            int i6 = this.c;
            if (!u(i6) || (iFindPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.i;
            int i7 = this.c;
            float f2 = x3 - fArr[i7];
            float f3 = y3 - this.j[i7];
            int i8 = (int) f2;
            int left = this.d.getLeft() + i8;
            int i9 = (int) f3;
            int top = this.d.getTop() + i9;
            int left2 = this.d.getLeft();
            int top2 = this.d.getTop();
            if (i8 != 0) {
                left = this.u.f(this.d, left);
                int[] iArr = ut.a;
                this.d.offsetLeftAndRight(left - left2);
            }
            if (i9 != 0) {
                top = this.u.g(this.d, top);
                int[] iArr2 = ut.a;
                this.d.offsetTopAndBottom(top - top2);
            }
            if (i8 != 0 || i9 != 0) {
                this.u.i(this.d, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (u(pointerId5)) {
                    float x4 = motionEvent.getX(i);
                    float y4 = motionEvent.getY(i);
                    float f4 = x4 - this.g[pointerId5];
                    float f5 = y4 - this.h[pointerId5];
                    q(f4, f5, pointerId5);
                    if (this.a == 1) {
                        break;
                    }
                    View viewA3 = a((int) x4, (int) y4);
                    if (t(viewA3, f4, f5) && k(viewA3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
        }
        s(motionEvent);
    }

    public final void f(int i) {
        this.w.removeCallbacks(this.x);
        if (this.a != i) {
            this.a = i;
            this.u.c(i);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }

    public final boolean g(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        int left = this.d.getLeft();
        int top = this.d.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.t.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        View view = this.d;
        int iX = x(i3, (int) this.q, (int) this.p);
        int iX2 = x(i4, (int) this.q, (int) this.p);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iX);
        int iAbs4 = Math.abs(iX2);
        int i8 = iAbs3 + iAbs4;
        int i9 = iAbs + iAbs2;
        if (iX != 0) {
            f2 = iAbs3 / i8;
        } else {
            f2 = iAbs / i9;
        }
        if (iX2 != 0) {
            f3 = i8;
            f4 = iAbs4;
        } else {
            f3 = i9;
            f4 = iAbs2;
        }
        float fM = m(i7, iX, this.u.a(view)) * f2;
        float fM2 = m(i6, iX2, this.u.h());
        this.e = f;
        this.t.startScroll(left, top, i7, i6, (int) (fM + (fM2 * (f4 / f3))));
        f(2);
        return true;
    }

    public final boolean h(int i) {
        return (this.n & (1 << i)) != 0;
    }

    public final boolean i(int i, int i2) {
        if (this.v) {
            return g(i, i2, (int) this.o.getXVelocity(this.c), (int) this.o.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.j(android.view.MotionEvent):boolean");
    }

    final boolean k(View view, int i) {
        if (view == this.d && this.c == i) {
            return true;
        }
        if (view == null || !this.u.e(view, i)) {
            return false;
        }
        this.c = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            OverScroller overScroller = this.t;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.d.getLeft();
            int top = currY - this.d.getTop();
            if (left != 0) {
                View view = this.d;
                int[] iArr = ut.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.d;
                int[] iArr2 = ut.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.u.i(this.d, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.w.post(this.x);
            } else if (currX == this.t.getFinalX() && currY == this.t.getFinalY()) {
                this.t.abortAnimation();
                this.w.post(this.x);
            }
        }
        return this.a == 2;
    }
}
