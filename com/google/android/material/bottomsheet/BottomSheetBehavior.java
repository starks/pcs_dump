package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.as.oss.R;
import defpackage.a;
import defpackage.bdq;
import defpackage.ckq;
import defpackage.cks;
import defpackage.ckt;
import defpackage.cku;
import defpackage.ckw;
import defpackage.ckx;
import defpackage.ckz;
import defpackage.cnx;
import defpackage.coa;
import defpackage.cof;
import defpackage.qy;
import defpackage.rb;
import defpackage.ut;
import defpackage.vv;
import defpackage.wr;
import defpackage.ws;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomSheetBehavior extends qy {
    public WeakReference A;
    public WeakReference B;
    public int C;
    public boolean D;
    final SparseIntArray E;
    private int F;
    private float G;
    private boolean H;
    private int I;
    private int J;
    private ColorStateList K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private cof Q;
    private boolean R;
    private final ckx S;
    private ValueAnimator T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private boolean Y;
    private final float Z;
    public boolean a;
    private int aa;
    private final ArrayList ab;
    private VelocityTracker ac;
    private int ad;
    private Map ae;
    private final wr af;
    public int b;
    public int c;
    public coa d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    int n;
    public int o;
    public int p;
    float q;
    public int r;
    float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public ws x;
    int y;
    public int z;

    public BottomSheetBehavior() {
        this.F = 0;
        this.a = true;
        this.L = -1;
        this.M = -1;
        this.S = new ckx(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.U = true;
        this.w = 4;
        this.Z = 0.1f;
        this.ab = new ArrayList();
        this.ad = -1;
        this.E = new SparseIntArray();
        this.af = new cks(this);
    }

    private final float O() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.d == null || (weakReference = this.A) == null || weakReference.get() == null) {
            return 0.0f;
        }
        View view = (View) this.A.get();
        if (!Y() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(aa(this.d.c(), rootWindowInsets.getRoundedCorner(0)), aa(this.d.e(), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int P() {
        int iMin;
        int i;
        int i2;
        if (this.H) {
            iMin = Math.min(Math.max(this.I, this.z - ((this.y * 9) / 16)), this.aa);
            i = this.l;
        } else {
            if (!this.N && !this.f && (i2 = this.e) > 0) {
                return Math.max(this.c, i2 + this.J);
            }
            iMin = this.c;
            i = this.l;
        }
        return iMin + i;
    }

    private final int Q(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.p : this.z : this.r : D();
    }

    private final void R() {
        int iP = P();
        if (this.a) {
            this.r = Math.max(this.z - iP, this.o);
        } else {
            this.r = this.z - iP;
        }
    }

    private final void S() {
        this.p = (int) (this.z * (1.0f - this.q));
    }

    private final void T(View view, vv vvVar, int i) {
        ut.n(view, vvVar, new ckt(this, i));
    }

    private final void U() {
        this.C = -1;
        this.ad = -1;
        VelocityTracker velocityTracker = this.ac;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ac = null;
        }
    }

    private final void V() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.A;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ut.i(view, 524288);
        ut.i(view, 262144);
        ut.i(view, 1048576);
        int i = this.E.get(0, -1);
        if (i != -1) {
            ut.i(view, i);
            this.E.delete(0);
        }
        if (!this.a && this.w != 6) {
            SparseIntArray sparseIntArray = this.E;
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            ckt cktVar = new ckt(this, 6);
            List listD = ut.d(view);
            int i2 = 0;
            while (true) {
                if (i2 >= listD.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        i3 = ut.a[i4];
                        boolean z = true;
                        for (int i5 = 0; i5 < listD.size(); i5++) {
                            z &= ((vv) listD.get(i5)).a() != i3;
                        }
                        if (true != z) {
                            i3 = -1;
                        }
                    }
                    iA = i3;
                } else {
                    if (TextUtils.equals(string, ((vv) listD.get(i2)).b())) {
                        iA = ((vv) listD.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                ut.e(view, new vv(null, iA, string, cktVar, null));
            }
            sparseIntArray.put(0, iA);
        }
        if (this.t && this.w != 5) {
            T(view, vv.e, 5);
        }
        int i6 = this.w;
        if (i6 == 3) {
            T(view, vv.d, true == this.a ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            T(view, vv.c, true == this.a ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            T(view, vv.d, 4);
            T(view, vv.c, 3);
        }
    }

    private final void W(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.w == 3 && (this.P || Y());
        if (this.R == z2 || this.d == null) {
            return;
        }
        this.R = z2;
        if (!z || (valueAnimator = this.T) == null) {
            ValueAnimator valueAnimator2 = this.T;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.T.cancel();
            }
            this.d.n(this.R ? O() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.T.reverse();
        } else {
            this.T.setFloatValues(this.d.a.k, z2 ? O() : 1.0f);
            this.T.start();
        }
    }

    private final void X(boolean z) {
        WeakReference weakReference = this.A;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ae != null) {
                    return;
                } else {
                    this.ae = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.A.get() && z) {
                    this.ae.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ae = null;
        }
    }

    private final boolean Y() {
        WeakReference weakReference = this.A;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.A.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean Z() {
        if (this.x != null) {
            return this.v || this.w == 1;
        }
        return false;
    }

    private static final float aa(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private static final int ab(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int D() {
        if (this.a) {
            return this.o;
        }
        return Math.max(this.n, this.O ? 0 : this.m);
    }

    final View E(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewE = E(viewGroup.getChildAt(i));
                if (viewE != null) {
                    return viewE;
                }
            }
        }
        return null;
    }

    public final void F(int i) {
        if (((View) this.A.get()) == null || this.ab.isEmpty()) {
            return;
        }
        int i2 = this.r;
        if (i <= i2 && i2 != D()) {
            D();
        }
        for (int i3 = 0; i3 < this.ab.size(); i3++) {
            ((cku) this.ab.get(i3)).a();
        }
    }

    public final void G(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.n = i;
        W(this.w, true);
    }

    public final void H(int i) {
        if (i == -1) {
            if (this.H) {
                return;
            } else {
                this.H = true;
            }
        } else {
            if (!this.H && this.c == i) {
                return;
            }
            this.H = false;
            this.c = Math.max(0, i);
        }
        N();
    }

    public final void I(int i) {
        if (!this.t && i == 5) {
            Log.w("BottomSheetBehavior", a.x(5, "Cannot set state: "));
            return;
        }
        int i2 = (i == 6 && this.a && Q(6) <= this.o) ? 3 : i;
        WeakReference weakReference = this.A;
        if (weakReference == null || weakReference.get() == null) {
            J(i);
            return;
        }
        View view = (View) this.A.get();
        bdq bdqVar = new bdq(this, view, i2, 2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(bdqVar);
        } else {
            bdqVar.run();
        }
    }

    public final void J(int i) {
        if (this.w == i) {
            return;
        }
        this.w = i;
        if (i != 4 && i != 3 && i != 6 && this.t && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.A;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            X(true);
        } else if (i == 6 || i == 5 || i == 4) {
            X(false);
        }
        W(i, true);
        for (int i2 = 0; i2 < this.ab.size(); i2++) {
            ((cku) this.ab.get(i2)).b();
        }
        V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.i(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.Q(r4)
            ws r1 = r2.x
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3f
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3f
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3f
            r3 = 0
            r1.d = r3
            goto L3f
        L31:
            r3 = 2
            r2.J(r3)
            r3 = 1
            r2.W(r4, r3)
            ckx r2 = r2.S
            r2.a(r4)
            return
        L3f:
            r2.J(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(android.view.View, int, boolean):void");
    }

    public final boolean L() {
        return this.t;
    }

    public final boolean M(View view, float f) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.Z)) - ((float) this.r)) / ((float) P()) > 0.5f;
    }

    public final void N() {
        View view;
        if (this.A != null) {
            R();
            if (this.w != 4 || (view = (View) this.A.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.qy
    public final Parcelable a(CoordinatorLayout coordinatorLayout, View view) {
        return new ckw(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.qy
    public final void b(rb rbVar) {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.qy
    public final void c() {
        this.A = null;
        this.x = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r1 == false) goto L36;
     */
    @Override // defpackage.qy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6, int r7, int r8, int[] r9, int r10) {
        /*
            r3 = this;
            r4 = 1
            if (r10 != r4) goto L5
            goto La4
        L5:
            java.lang.ref.WeakReference r7 = r3.B
            if (r7 == 0) goto L10
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L11
        L10:
            r7 = 0
        L11:
            if (r6 != r7) goto La4
            int r10 = r5.getTop()
            int r0 = r10 - r8
            if (r8 <= 0) goto L53
            boolean r1 = r3.Y
            if (r1 != 0) goto L2b
            boolean r1 = r3.U
            if (r1 != 0) goto L2b
            if (r6 != r7) goto L2b
            boolean r6 = r6.canScrollVertically(r4)
            if (r6 != 0) goto L67
        L2b:
            int r6 = r3.D()
            if (r0 >= r6) goto L43
            int r6 = r3.D()
            int r10 = r10 - r6
            r9[r4] = r10
            int[] r6 = defpackage.ut.a
            int r6 = -r10
            r5.offsetTopAndBottom(r6)
            r6 = 3
            r3.J(r6)
            goto L96
        L43:
            boolean r6 = r3.v
            if (r6 == 0) goto La4
            r9[r4] = r8
            int r6 = -r8
            int[] r7 = defpackage.ut.a
            r5.offsetTopAndBottom(r6)
            r3.J(r4)
            goto L96
        L53:
            if (r8 >= 0) goto L96
            r1 = -1
            boolean r1 = r6.canScrollVertically(r1)
            boolean r2 = r3.Y
            if (r2 != 0) goto L6a
            boolean r2 = r3.U
            if (r2 != 0) goto L6a
            if (r6 != r7) goto L6a
            if (r1 != 0) goto L67
            goto L6c
        L67:
            r3.V = r4
            return
        L6a:
            if (r1 != 0) goto L96
        L6c:
            int r6 = r3.r
            if (r0 <= r6) goto L87
            boolean r6 = r3.L()
            if (r6 == 0) goto L77
            goto L87
        L77:
            int r6 = r3.r
            int r10 = r10 - r6
            r9[r4] = r10
            int[] r6 = defpackage.ut.a
            int r6 = -r10
            r5.offsetTopAndBottom(r6)
            r6 = 4
            r3.J(r6)
            goto L96
        L87:
            boolean r6 = r3.v
            if (r6 == 0) goto La4
            r9[r4] = r8
            int r6 = -r8
            int[] r7 = defpackage.ut.a
            r5.offsetTopAndBottom(r6)
            r3.J(r4)
        L96:
            int r5 = r5.getTop()
            r3.F(r5)
            r3.X = r8
            r3.Y = r4
            r4 = 0
            r3.V = r4
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    @Override // defpackage.qy
    public final void f(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        ckw ckwVar = (ckw) parcelable;
        int i = this.F;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = ckwVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = ckwVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.t = ckwVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.u = ckwVar.g;
            }
        }
        int i3 = ckwVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.w = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // defpackage.qy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.J(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.B
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.Y
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.X
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.p
            if (r3 <= r6) goto Lb0
        L32:
            r0 = r5
            goto Lb0
        L35:
            boolean r3 = r2.t
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.ac
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.G
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ac
            int r6 = r2.C
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.M(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.X
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.o
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.p
            if (r3 >= r1) goto L84
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = r6
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.p
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.K(r4, r0, r3)
            r2.Y = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.qy
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        ws wsVar;
        if (!view.isShown() || !this.v) {
            this.W = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            U();
            actionMasked = 0;
        }
        if (this.ac == null) {
            this.ac = VelocityTracker.obtain();
        }
        this.ac.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.ad = (int) motionEvent.getY();
            if (this.w != 2) {
                WeakReference weakReference = this.B;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.k(view2, x, this.ad)) {
                    this.C = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.D = true;
                }
            }
            this.W = this.C == -1 && !coordinatorLayout.k(view, x, this.ad);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
            this.C = -1;
            if (this.W) {
                this.W = false;
                return false;
            }
        }
        if (!this.W && (wsVar = this.x) != null && wsVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.B;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.W && this.w != 1 && !coordinatorLayout.k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.x != null && (i = this.ad) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.x.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    @Override // defpackage.qy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.qy
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.X = 0;
        this.Y = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.qy
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.w == 1 && actionMasked == 0) {
            return true;
        }
        if (Z()) {
            this.x.e(motionEvent);
        }
        if (actionMasked == 0) {
            U();
        }
        if (this.ac == null) {
            this.ac = VelocityTracker.obtain();
        }
        this.ac.addMovement(motionEvent);
        if (Z() && actionMasked == 2 && !this.W) {
            float fAbs = Math.abs(this.ad - motionEvent.getY());
            ws wsVar = this.x;
            if (fAbs > wsVar.b) {
                wsVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.W;
    }

    @Override // defpackage.qy
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ab(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.L, marginLayoutParams.width), ab(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.M, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.qy
    public final boolean r(View view) {
        WeakReference weakReference = this.B;
        return (weakReference == null || view != weakReference.get() || this.w == 3 || this.V) ? false : true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.F = 0;
        this.a = true;
        this.L = -1;
        this.M = -1;
        this.S = new ckx(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.U = true;
        this.w = 4;
        this.Z = 0.1f;
        this.ab = new ArrayList();
        this.ad = -1;
        this.E = new SparseIntArray();
        this.af = new cks(this);
        this.J = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ckz.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.K = cnx.i(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.Q = new cof(cof.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.Q != null) {
            coa coaVar = new coa(this.Q);
            this.d = coaVar;
            coaVar.j(context);
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                this.d.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.d.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(O(), 1.0f);
        this.T = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.T.addUpdateListener(new ckq(this, 0));
        this.s = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            H(typedValuePeekValue.data);
        } else {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.t != z) {
            this.t = z;
            if (!z && this.w == 5) {
                I(4);
            }
            V();
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.a != z2) {
            this.a = z2;
            if (this.A != null) {
                R();
            }
            J((this.a && this.w == 6) ? 3 : this.w);
            W(this.w, true);
            V();
        }
        this.u = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.U = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.F = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.q = f;
            if (this.A != null) {
                S();
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                G(typedValuePeekValue2.data);
            } else {
                G(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.g = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.h = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.O = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.i = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.j = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.k = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.P = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.qy
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }
}
