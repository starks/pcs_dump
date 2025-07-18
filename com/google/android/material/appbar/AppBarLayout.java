package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.as.oss.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.afu;
import defpackage.ajx;
import defpackage.cjl;
import defpackage.cjr;
import defpackage.cjs;
import defpackage.cjt;
import defpackage.cju;
import defpackage.cjz;
import defpackage.cka;
import defpackage.ckb;
import defpackage.cke;
import defpackage.clq;
import defpackage.cnb;
import defpackage.cnx;
import defpackage.coa;
import defpackage.cpg;
import defpackage.fuu;
import defpackage.qx;
import defpackage.qy;
import defpackage.rb;
import defpackage.tv;
import defpackage.un;
import defpackage.ur;
import defpackage.ut;
import defpackage.vs;
import defpackage.wo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements qx {
    public boolean a;
    public int b;
    public vs c;
    public List d;
    public boolean e;
    public boolean f;
    public final List g;
    public Drawable h;
    public Integer i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private WeakReference p;
    private final boolean q;
    private ValueAnimator r;
    private ValueAnimator.AnimatorUpdateListener s;
    private final long t;
    private final TimeInterpolator u;
    private int[] v;
    private final float w;
    private Behavior x;

    /* compiled from: PG */
    public class BaseBehavior extends cjz {
        public int a;
        public clq b;
        private int d;
        private ValueAnimator e;
        private cjt f;
        private WeakReference g;

        public BaseBehavior() {
        }

        public static final View M(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((rb) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int[] iArr = ut.a;
            if (ur.a(coordinatorLayout) != null) {
                return;
            }
            ut.j(coordinatorLayout, new cjs(this, appBarLayout, coordinatorLayout));
        }

        private final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iE = appBarLayout.e() + appBarLayout.getPaddingTop();
            int iF = F() - iE;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                cju cjuVar = (cju) childAt.getLayoutParams();
                if (ab(cjuVar.a, 32)) {
                    top -= cjuVar.topMargin;
                    bottom += cjuVar.bottomMargin;
                }
                int i2 = -iF;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                cju cjuVar2 = (cju) childAt2.getLayoutParams();
                int i3 = cjuVar2.a;
                if ((i3 & 17) == 17) {
                    int iE2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iE2 -= appBarLayout.e();
                    }
                    if (ab(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (ab(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iF < minimumHeight2) {
                            iE2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (ab(i3, 32)) {
                        iE2 += cjuVar2.topMargin;
                        minimumHeight -= cjuVar2.bottomMargin;
                    }
                    if (iF < (minimumHeight + iE2) / 2) {
                        iE2 = minimumHeight;
                    }
                    ac(coordinatorLayout, appBarLayout, un.F(iE2 + iE, -appBarLayout.f(), 0));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void aa(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r6 = java.lang.Math.abs(r9)
                int r0 = r8.getChildCount()
                r1 = 0
                r2 = r1
            La:
                r3 = 0
                if (r2 >= r0) goto L21
                android.view.View r4 = r8.getChildAt(r2)
                int r5 = r4.getTop()
                if (r6 < r5) goto L1e
                int r5 = r4.getBottom()
                if (r6 > r5) goto L1e
                goto L22
            L1e:
                int r2 = r2 + 1
                goto La
            L21:
                r4 = r3
            L22:
                if (r4 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
                cju r6 = (defpackage.cju) r6
                int r6 = r6.a
                r0 = r6 & 1
                if (r0 == 0) goto L5b
                int r0 = r4.getMinimumHeight()
                r2 = 1
                if (r10 <= 0) goto L49
                r10 = r6 & 12
                if (r10 == 0) goto L49
                int r6 = -r9
                int r9 = r4.getBottom()
                int r9 = r9 - r0
                int r10 = r8.e()
                int r9 = r9 - r10
                if (r6 < r9) goto L5b
                goto L5c
            L49:
                r6 = r6 & 2
                if (r6 == 0) goto L5b
                int r6 = -r9
                int r9 = r4.getBottom()
                int r9 = r9 - r0
                int r10 = r8.e()
                int r9 = r9 - r10
                if (r6 < r9) goto L5b
                goto L5c
            L5b:
                r2 = r1
            L5c:
                boolean r6 = r8.f
                if (r6 == 0) goto L68
                android.view.View r6 = ad(r7)
                boolean r2 = r8.m(r6)
            L68:
                boolean r6 = r8.l(r2)
                if (r11 != 0) goto La4
                if (r6 == 0) goto Lcb
                ahm r6 = r7.h
                java.util.ArrayList r6 = r6.b(r8)
                if (r6 != 0) goto L79
                goto L7e
            L79:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r6)
            L7e:
                if (r3 != 0) goto L82
                java.util.List r3 = java.util.Collections.EMPTY_LIST
            L82:
                int r6 = r3.size()
            L86:
                if (r1 >= r6) goto Lcb
                java.lang.Object r7 = r3.get(r1)
                android.view.View r7 = (android.view.View) r7
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                rb r7 = (defpackage.rb) r7
                qy r7 = r7.a
                boolean r9 = r7 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r9 == 0) goto La1
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r7 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r7
                int r6 = r7.d
                if (r6 == 0) goto Lcb
                goto La4
            La1:
                int r1 = r1 + 1
                goto L86
            La4:
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                if (r6 == 0) goto Lb1
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                r6.jumpToCurrentState()
            Lb1:
                android.graphics.drawable.Drawable r6 = r8.getForeground()
                if (r6 == 0) goto Lbe
                android.graphics.drawable.Drawable r6 = r8.getForeground()
                r6.jumpToCurrentState()
            Lbe:
                android.animation.StateListAnimator r6 = r8.getStateListAnimator()
                if (r6 == 0) goto Lcb
                android.animation.StateListAnimator r6 = r8.getStateListAnimator()
                r6.jumpToCurrentState()
            Lcb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.aa(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        private static boolean ab(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void ac(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float fAbs = Math.abs(F() - i);
            float fAbs2 = Math.abs(0.0f);
            int iRound = fAbs2 > 0.0f ? Math.round((fAbs / fAbs2) * 1000.0f) * 3 : (int) (((fAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iF = F();
            if (iF == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.e.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.e = valueAnimator3;
                valueAnimator3.setInterpolator(cjl.e);
                this.e.addUpdateListener(new cjr(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration(Math.min(iRound, 600));
            this.e.setIntValues(iF, i);
            this.e.start();
        }

        private static final View ad(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof tv) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // defpackage.cjz
        public final /* bridge */ /* synthetic */ int D(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.cjz
        public final /* synthetic */ int E(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.cjz
        public final int F() {
            return W() + this.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
        @Override // defpackage.cjz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ int G(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        final cjt H(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = W();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = wo.c;
                    }
                    cjt cjtVar = new cjt(parcelable);
                    boolean z = iW == 0;
                    cjtVar.b = z;
                    cjtVar.a = !z && (-iW) >= appBarLayout.f();
                    cjtVar.e = i;
                    cjtVar.g = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    cjtVar.f = bottom / childAt.getHeight();
                    return cjtVar;
                }
            }
            return null;
        }

        @Override // defpackage.cjz
        public final /* bridge */ /* synthetic */ void I(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Z(coordinatorLayout, appBarLayout);
            if (appBarLayout.f) {
                appBarLayout.l(appBarLayout.m(ad(coordinatorLayout)));
            }
        }

        @Override // defpackage.qy
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final void g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.d == 0 || i == 1) {
                Z(coordinatorLayout, appBarLayout);
                if (appBarLayout.f) {
                    appBarLayout.l(appBarLayout.m(view));
                }
            }
            this.g = new WeakReference(view);
        }

        final void K(cjt cjtVar, boolean z) {
            if (this.f == null || z) {
                this.f = cjtVar;
            }
        }

        @Override // defpackage.cjz
        public final /* bridge */ /* synthetic */ boolean L(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.b != null) {
                return appBarLayout.getResources().getConfiguration().orientation == 2;
            }
            WeakReference weakReference = this.g;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            super.j(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            cjt cjtVar = this.f;
            if (cjtVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            ac(coordinatorLayout, appBarLayout, i4);
                        } else {
                            V(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            ac(coordinatorLayout, appBarLayout, 0);
                        } else {
                            V(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cjtVar.a) {
                V(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else if (cjtVar.b) {
                V(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(cjtVar.e);
                V(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f.g ? childAt.getMinimumHeight() + appBarLayout.e() : Math.round(childAt.getHeight() * this.f.f)));
            }
            appBarLayout.b = 0;
            this.f = null;
            X(un.F(W(), -appBarLayout.f(), 0));
            aa(coordinatorLayout, appBarLayout, W(), 0, true);
            appBarLayout.h(W());
            Y(coordinatorLayout, appBarLayout);
        }

        @Override // defpackage.qy
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            if (((rb) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void P(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L25
                if (r12 >= 0) goto Lf
                int r0 = r10.f()
                int r0 = -r0
                int r1 = r10.b()
                int r1 = r1 + r0
                goto L15
            Lf:
                int r0 = r10.f()
                int r0 = -r0
                r1 = 0
            L15:
                r6 = r0
                r7 = r1
                if (r6 == r7) goto L25
                r0 = 1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r12
                int r8 = r2.U(r3, r4, r5, r6, r7)
                r13[r0] = r8
                goto L26
            L25:
                r4 = r10
            L26:
                boolean r8 = r4.f
                if (r8 == 0) goto L31
                boolean r8 = r4.m(r11)
                r4.l(r8)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.P(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final void Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            BaseBehavior baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i2;
            if (i < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i2 = i;
                iArr[1] = baseBehavior.U(coordinatorLayout2, appBarLayout2, i2, -appBarLayout.c(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i2 = i;
            }
            if (i2 == 0) {
                baseBehavior.Y(coordinatorLayout2, appBarLayout2);
            }
        }

        public final void R(Parcelable parcelable) {
            if (!(parcelable instanceof cjt)) {
                this.f = null;
            } else {
                K((cjt) parcelable, true);
                Parcelable parcelable2 = this.f.d;
            }
        }

        public final Parcelable S(AppBarLayout appBarLayout) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            cjt cjtVarH = H(absSavedState, appBarLayout);
            return cjtVarH == null ? absSavedState : cjtVarH;
        }

        public final boolean T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.f || appBarLayout.e || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.e) != null) {
                valueAnimator.cancel();
            }
            this.g = null;
            this.d = i2;
            return z;
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ Parcelable a(CoordinatorLayout coordinatorLayout, View view) {
            return S((AppBarLayout) view);
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            P(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            Q(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ void f(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            R(parcelable);
        }

        @Override // defpackage.ckc, defpackage.qy
        public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
            N(coordinatorLayout, (AppBarLayout) view, i);
            return true;
        }

        @Override // defpackage.qy
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return T(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            super.N(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: O */
        public final /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            return super.q(coordinatorLayout, appBarLayout, i, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends cka {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout G(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.cka
        public final float D(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iF = appBarLayout.f();
            int iB = appBarLayout.b();
            qy qyVar = ((rb) appBarLayout.getLayoutParams()).a;
            int iF2 = qyVar instanceof BaseBehavior ? ((BaseBehavior) qyVar).F() : 0;
            if ((iB == 0 || iF + iF2 > iB) && (i = iF - iB) != 0) {
                return (iF2 / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.cka
        public final int E(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.cka
        public final /* bridge */ /* synthetic */ View F(List list) {
            return G(list);
        }

        @Override // defpackage.ckc, defpackage.qy
        public /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.j(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.qy
        public final boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutG = G(coordinatorLayout.a(view));
            if (appBarLayoutG != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutG.j(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.qy
        public final boolean n(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.qy
        public void o(CoordinatorLayout coordinatorLayout, View view, View view2) {
            qy qyVar = ((rb) view2.getLayoutParams()).a;
            if (qyVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) qyVar).a) + this.c) - H(view2);
                int[] iArr = ut.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f) {
                    appBarLayout.l(appBarLayout.m(view));
                }
            }
        }

        @Override // defpackage.qy
        public final void p(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ut.j(coordinatorLayout, null);
            }
        }

        @Override // defpackage.qy
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            vs vsVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewF = F(coordinatorLayout.a(view));
            if (viewF == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (viewF.getFitsSystemWindows() && (vsVar = coordinatorLayout.e) != null) {
                size += vsVar.d() + vsVar.a();
            }
            int iE = size + E(viewF);
            int measuredHeight = viewF.getMeasuredHeight();
            if (J()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iE -= measuredHeight;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(iE, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ckb.f);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    protected static final cju n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new cju((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new cju((ViewGroup.MarginLayoutParams) layoutParams) : new cju(layoutParams);
    }

    private final void o() {
        Behavior behavior = this.x;
        cjt cjtVarH = null;
        if (behavior != null && this.k != -1 && this.b == 0) {
            cjtVarH = behavior.H(wo.c, this);
        }
        this.k = -1;
        this.l = -1;
        this.m = -1;
        if (cjtVarH != null) {
            this.x.K(cjtVarH, false);
        }
    }

    private final void p(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    private final void q(float f, float f2) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.t);
        this.r.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.s;
        if (animatorUpdateListener != null) {
            this.r.addUpdateListener(animatorUpdateListener);
        }
        this.r.start();
    }

    private final boolean r() {
        return this.h != null && e() > 0;
    }

    private final boolean s() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qx
    public final qy a() {
        Behavior behavior = new Behavior();
        this.x = behavior;
        return behavior;
    }

    public final int b() {
        int iMin;
        int minimumHeight;
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                cju cjuVar = (cju) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = cjuVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = cjuVar.topMargin + cjuVar.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - e());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - e());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.l = iMax;
        return iMax;
    }

    final int c() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                cju cjuVar = (cju) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + cjuVar.topMargin + cjuVar.bottomMargin;
                int i3 = cjuVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.m = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cju;
    }

    public final int d() {
        int iE = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return minimumHeight + minimumHeight + iE;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.j);
            this.h.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.h;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        vs vsVar = this.c;
        if (vsVar != null) {
            return vsVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                cju cjuVar = (cju) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = cjuVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + cjuVar.topMargin + cjuVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= e();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.k = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final cju generateLayoutParams(AttributeSet attributeSet) {
        return new cju(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cju();
    }

    final void h(int i) {
        this.j = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                fuu fuuVar = (fuu) this.d.get(i2);
                if (fuuVar != null) {
                    fuuVar.l(i);
                }
            }
        }
    }

    public final void i(boolean z) {
        j(z, isLaidOut());
    }

    public final void j(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public final void k() {
        setWillNotDraw(!r());
    }

    final boolean l(boolean z) {
        if (this.e == z) {
            return false;
        }
        this.e = z;
        refreshDrawableState();
        if (getBackground() instanceof coa) {
            if (this.q) {
                q(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
                return true;
            }
            if (this.f) {
                q(z ? 0.0f : this.w, z ? this.w : 0.0f);
            }
        }
        return true;
    }

    final boolean m(View view) {
        int i;
        if (this.p == null && (i = this.o) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.o);
            }
            if (viewFindViewById != null) {
                this.p = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.p;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cnx.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z = this.n;
        iArr[0] = true != z ? -2130969837 : R.attr.state_liftable;
        int i2 = -2130969838;
        if (z && this.e) {
            i2 = R.attr.state_lifted;
        }
        iArr[1] = i2;
        iArr[2] = z ? R.attr.state_collapsible : -2130969833;
        int i3 = -2130969832;
        if (z && this.e) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && s()) {
            int iE = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int[] iArr = ut.a;
                childAt.offsetTopAndBottom(iE);
            }
        }
        o();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((cju) getChildAt(i5).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (this.f) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((cju) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = un.F(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        cnx.b(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new cju();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        final AppBarLayout appBarLayout;
        super(cpg.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.b = 0;
        this.g = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = cke.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = cke.a;
        Context context3 = getContext();
        TypedArray typedArrayA = cnb.a(context3, attributeSet, cke.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
            }
            typedArrayA.recycle();
            TypedArray typedArrayA2 = cnb.a(context2, attributeSet, ckb.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            setBackground(typedArrayA2.getDrawable(0));
            final ColorStateList colorStateListI = cnx.i(context2, typedArrayA2, 6);
            this.q = colorStateListI != null;
            final ColorStateList colorStateListB = clq.b(getBackground());
            int i2 = 2;
            if (colorStateListB != null) {
                final coa coaVar = new coa();
                coaVar.m(colorStateListB);
                if (colorStateListI != null) {
                    final Integer numJ = clq.j(getContext(), R.attr.colorSurface);
                    appBarLayout = this;
                    appBarLayout.s = new ValueAnimator.AnimatorUpdateListener() { // from class: cjq
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num;
                            int i3 = clq.i(colorStateListB.getDefaultColor(), colorStateListI.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
                            coa coaVar2 = coaVar;
                            coaVar2.m(colorStateListValueOf);
                            AppBarLayout appBarLayout2 = this.a;
                            if (appBarLayout2.h != null && (num = appBarLayout2.i) != null && num.equals(numJ)) {
                                appBarLayout2.h.setTint(i3);
                            }
                            if (appBarLayout2.g.isEmpty()) {
                                return;
                            }
                            for (cjv cjvVar : appBarLayout2.g) {
                                if (coaVar2.a.d != null) {
                                    cjvVar.a();
                                }
                            }
                        }
                    };
                    appBarLayout.setBackground(coaVar);
                } else {
                    appBarLayout = this;
                    coaVar.j(context2);
                    appBarLayout.s = new afu(appBarLayout, coaVar, i2);
                    appBarLayout.setBackground(coaVar);
                }
            } else {
                appBarLayout = this;
            }
            appBarLayout.t = cnx.k(context2, R.attr.motionDurationMedium2, appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            appBarLayout.u = cnx.n(context2, R.attr.motionEasingStandardInterpolator, cjl.a);
            if (typedArrayA2.hasValue(4)) {
                appBarLayout.p(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                cke.a(appBarLayout, typedArrayA2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayA2.hasValue(2)) {
                appBarLayout.setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
            }
            if (typedArrayA2.hasValue(1)) {
                appBarLayout.setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
            }
            appBarLayout.w = appBarLayout.getResources().getDimension(R.dimen.design_appbar_elevation);
            appBarLayout.f = typedArrayA2.getBoolean(5, false);
            appBarLayout.o = typedArrayA2.getResourceId(7, -1);
            Drawable drawable = typedArrayA2.getDrawable(8);
            Drawable drawable2 = appBarLayout.h;
            if (drawable2 != drawable) {
                Integer numValueOf = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                appBarLayout.h = drawableMutate;
                if (drawableMutate instanceof coa) {
                    numValueOf = Integer.valueOf(((coa) drawableMutate).g);
                } else {
                    ColorStateList colorStateListB2 = clq.b(drawableMutate);
                    if (colorStateListB2 != null) {
                        numValueOf = Integer.valueOf(colorStateListB2.getDefaultColor());
                    }
                }
                appBarLayout.i = numValueOf;
                Drawable drawable3 = appBarLayout.h;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        appBarLayout.h.setState(appBarLayout.getDrawableState());
                    }
                    appBarLayout.h.setLayoutDirection(appBarLayout.getLayoutDirection());
                    appBarLayout.h.setVisible(appBarLayout.getVisibility() == 0, false);
                    appBarLayout.h.setCallback(appBarLayout);
                }
                appBarLayout.k();
                appBarLayout.postInvalidateOnAnimation();
            }
            typedArrayA2.recycle();
            ajx ajxVar = new ajx(appBarLayout, 2);
            int[] iArr3 = ut.a;
            un.p(appBarLayout, ajxVar);
        } catch (Throwable th) {
            typedArrayA.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }
}
