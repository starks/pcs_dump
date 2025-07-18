package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jy {
    public int A;
    public int B;
    public int C;
    public int D;
    public final ayo E;
    public final ayo F;
    private final ln a;
    private final ln b;
    ic r;
    public RecyclerView s;
    public ki t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public jy() {
        jw jwVar = new jw(this, 1);
        this.a = jwVar;
        jw jwVar2 = new jw(this, 0);
        this.b = jwVar2;
        this.E = new ayo(jwVar);
        this.F = new ayo(jwVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static boolean aZ(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static int al(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int an(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy.an(int, int, int, int, boolean):int");
    }

    public static jx aw(Context context, AttributeSet attributeSet, int i, int i2) {
        jx jxVar = new jx();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dr.a, i, i2);
        jxVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        jxVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        jxVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        jxVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return jxVar;
    }

    public static final int be(View view) {
        return view.getBottom() + ((jz) view.getLayoutParams()).d.bottom;
    }

    public static final int bf(View view) {
        return view.getLeft() - ((jz) view.getLayoutParams()).d.left;
    }

    public static final int bg(View view) {
        Rect rect = ((jz) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bh(View view) {
        Rect rect = ((jz) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bi(View view) {
        return view.getRight() + ((jz) view.getLayoutParams()).d.right;
    }

    public static final int bj(View view) {
        return view.getTop() - ((jz) view.getLayoutParams()).d.top;
    }

    public static final int bk(View view) {
        return ((jz) view.getLayoutParams()).a();
    }

    public static final void bm(View view, int i, int i2, int i3, int i4) {
        jz jzVar = (jz) view.getLayoutParams();
        Rect rect = jzVar.d;
        view.layout(i + rect.left + jzVar.leftMargin, i2 + rect.top + jzVar.topMargin, (i3 - rect.right) - jzVar.rightMargin, (i4 - rect.bottom) - jzVar.bottomMargin);
    }

    private final void c(View view, int i, boolean z) {
        km kmVarG = RecyclerView.g(view);
        if (z || kmVarG.v()) {
            this.s.U.e(kmVarG);
        } else {
            this.s.U.h(kmVarG);
        }
        jz jzVar = (jz) view.getLayoutParams();
        if (kmVarG.B() || kmVarG.w()) {
            if (kmVarG.w()) {
                kmVarG.p();
            } else {
                kmVarG.i();
            }
            this.r.h(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.s) {
            int iD = this.r.d(view);
            if (i == -1) {
                i = this.r.a();
            }
            if (iD == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.j());
            }
            if (iD != i) {
                jy jyVar = this.s.n;
                View viewAy = jyVar.ay(iD);
                if (viewAy == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iD + jyVar.s.toString());
                }
                jyVar.aG(iD);
                jz jzVar2 = (jz) viewAy.getLayoutParams();
                km kmVarG2 = RecyclerView.g(viewAy);
                if (kmVarG2.v()) {
                    jyVar.s.U.e(kmVarG2);
                } else {
                    jyVar.s.U.h(kmVarG2);
                }
                jyVar.r.h(viewAy, i, jzVar2, kmVarG2.v());
            }
        } else {
            this.r.g(view, i, false);
            jzVar.e = true;
            ki kiVar = this.t;
            if (kiVar != null && kiVar.e && ki.g(view) == kiVar.a) {
                kiVar.f = view;
            }
        }
        if (jzVar.f) {
            kmVarG.a.invalidate();
            jzVar.f = false;
        }
    }

    public int B(kj kjVar) {
        throw null;
    }

    public int C(kj kjVar) {
        throw null;
    }

    public int D(kj kjVar) {
        throw null;
    }

    public int E(kj kjVar) {
        throw null;
    }

    public int F(kj kjVar) {
        throw null;
    }

    public int G(kj kjVar) {
        throw null;
    }

    public Parcelable L() {
        throw null;
    }

    public View N(int i) {
        int iAm = am();
        for (int i2 = 0; i2 < iAm; i2++) {
            View viewAy = ay(i2);
            km kmVarG = RecyclerView.g(viewAy);
            if (kmVarG != null && kmVarG.c() == i && !kmVarG.A() && (this.s.K.g || !kmVarG.v())) {
                return viewAy;
            }
        }
        return null;
    }

    public void O(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.q(str);
        }
    }

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        kc kcVar = recyclerView.f;
        kj kjVar = recyclerView.K;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        jr jrVar = this.s.m;
        if (jrVar != null) {
            accessibilityEvent.setItemCount(jrVar.a());
        }
    }

    public void S(Parcelable parcelable) {
        throw null;
    }

    public void T(int i) {
        throw null;
    }

    public boolean W() {
        throw null;
    }

    public boolean X() {
        throw null;
    }

    public boolean Y() {
        throw null;
    }

    public int a(kc kcVar, kj kjVar) {
        jr jrVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (jrVar = recyclerView.m) == null || !W()) {
            return 1;
        }
        return jrVar.a();
    }

    public final void aA(View view) {
        aB(view, -1);
    }

    public final void aB(View view, int i) {
        c(view, i, true);
    }

    public final void aC(View view) {
        aD(view, -1);
    }

    public final void aD(View view, int i) {
        c(view, i, false);
    }

    public final void aE(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.d(view));
        }
    }

    public final void aF(kc kcVar) {
        int iAm = am();
        while (true) {
            iAm--;
            if (iAm < 0) {
                return;
            }
            View viewAy = ay(iAm);
            km kmVarG = RecyclerView.g(viewAy);
            if (!kmVarG.A()) {
                if (!kmVarG.t() || kmVarG.v() || this.s.m.c) {
                    aG(iAm);
                    kcVar.l(viewAy);
                    this.s.U.h(kmVarG);
                } else {
                    aQ(iAm);
                    kcVar.k(kmVarG);
                }
            }
        }
    }

    public final void aG(int i) {
        ay(i);
        this.r.i(i);
    }

    public final void aH(RecyclerView recyclerView, kc kcVar) {
        this.v = false;
        ai(recyclerView);
    }

    public void aI(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.i.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.i.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aJ(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.i.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.i.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aK(View view, vw vwVar) {
        km kmVarG = RecyclerView.g(view);
        if (kmVarG == null || kmVarG.v() || this.r.k(kmVarG.a)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        n(recyclerView.f, recyclerView.K, view, vwVar);
    }

    public final void aM(kc kcVar) {
        int iAm = am();
        while (true) {
            iAm--;
            if (iAm < 0) {
                return;
            }
            if (!RecyclerView.g(ay(iAm)).A()) {
                aP(iAm, kcVar);
            }
        }
    }

    public final void aN(kc kcVar) {
        int size = kcVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((km) kcVar.a.get(i)).a;
            km kmVarG = RecyclerView.g(view);
            if (!kmVarG.A()) {
                kmVarG.n(false);
                if (kmVarG.x()) {
                    this.s.removeDetachedView(view, false);
                }
                jv jvVar = this.s.E;
                if (jvVar != null) {
                    jvVar.d(kmVarG);
                }
                kmVarG.n(true);
                kcVar.g(view);
            }
        }
        kcVar.a.clear();
        ArrayList arrayList = kcVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aO(View view, kc kcVar) {
        ic icVar = this.r;
        int i = icVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            icVar.c = 1;
            icVar.d = view;
            int iH = icVar.e.H(view);
            if (iH >= 0) {
                if (icVar.a.g(iH)) {
                    icVar.l(view);
                }
                icVar.e.K(iH);
            }
            icVar.c = 0;
            icVar.d = null;
            kcVar.j(view);
        } catch (Throwable th) {
            icVar.c = 0;
            icVar.d = null;
            throw th;
        }
    }

    public final void aP(int i, kc kcVar) {
        View viewAy = ay(i);
        aQ(i);
        kcVar.j(viewAy);
    }

    public final void aQ(int i) {
        if (ay(i) != null) {
            ic icVar = this.r;
            int i2 = icVar.c;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iB = icVar.b(i);
                View viewI = icVar.e.I(iB);
                if (viewI == null) {
                    return;
                }
                icVar.c = 1;
                icVar.d = viewI;
                if (icVar.a.g(iB)) {
                    icVar.l(viewI);
                }
                icVar.e.K(iB);
            } finally {
                icVar.c = 0;
                icVar.d = null;
            }
        }
    }

    public final void aR() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aS() {
        this.u = true;
    }

    public final void aT(RecyclerView recyclerView) {
        aU(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aU(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.b) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || RecyclerView.b) {
            return;
        }
        this.D = 0;
    }

    public final void aV(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public final void aW(int i, int i2) {
        int iAm = am();
        if (iAm == 0) {
            this.s.v(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAm; i7++) {
            View viewAy = ay(i7);
            Rect rect = this.s.k;
            RecyclerView.E(viewAy, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.s.k.set(i4, i5, i3, i6);
        q(this.s.k, i, i2);
    }

    public final void aX(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.i;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void aY(ki kiVar) {
        ki kiVar2 = this.t;
        if (kiVar2 != null && kiVar != kiVar2 && kiVar2.e) {
            kiVar2.c();
        }
        this.t = kiVar;
        RecyclerView recyclerView = this.s;
        recyclerView.H.d();
        if (kiVar.g) {
            Log.w("RecyclerView", "An instance of " + kiVar.getClass().getSimpleName() + " was started more than once. Each instance of" + kiVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        kiVar.b = recyclerView;
        kiVar.c = this;
        int i = kiVar.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = kiVar.b;
        recyclerView2.K.a = i;
        kiVar.e = true;
        kiVar.d = true;
        kiVar.f = recyclerView2.n.N(kiVar.a);
        kiVar.b.H.b();
        kiVar.g = true;
    }

    public boolean aa() {
        throw null;
    }

    public boolean ac() {
        return false;
    }

    public void ad(int i, int i2, kj kjVar, iu iuVar) {
        throw null;
    }

    public void ak(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int am() {
        ic icVar = this.r;
        if (icVar != null) {
            return icVar.a();
        }
        return 0;
    }

    public final int ao() {
        RecyclerView recyclerView = this.s;
        jr jrVar = recyclerView != null ? recyclerView.m : null;
        if (jrVar != null) {
            return jrVar.a();
        }
        return 0;
    }

    public final int ap() {
        return this.s.getLayoutDirection();
    }

    public final int aq() {
        RecyclerView recyclerView = this.s;
        int[] iArr = ut.a;
        return recyclerView.getMinimumHeight();
    }

    public final int ar() {
        RecyclerView recyclerView = this.s;
        int[] iArr = ut.a;
        return recyclerView.getMinimumWidth();
    }

    public final int as() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int at() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int au() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int av() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View ax(View view) {
        View viewI;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewI = recyclerView.i(view)) == null || this.r.k(viewI)) {
            return null;
        }
        return viewI;
    }

    public final View ay(int i) {
        ic icVar = this.r;
        if (icVar != null) {
            return icVar.e(i);
        }
        return null;
    }

    public final View az() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int b(kc kcVar, kj kjVar) {
        jr jrVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (jrVar = recyclerView.m) == null || !X()) {
            return 1;
        }
        return jrVar.a();
    }

    public final boolean ba() {
        ki kiVar = this.t;
        return kiVar != null && kiVar.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r10 != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bb(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.at()
            int r1 = r8.av()
            int r2 = r8.C
            int r3 = r8.au()
            int r2 = r2 - r3
            int r3 = r8.D
            int r4 = r8.as()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.ap()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lac
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7b
            goto Lb1
        L7b:
            int r1 = r8.at()
            int r2 = r8.av()
            int r3 = r8.C
            int r4 = r8.au()
            int r3 = r3 - r4
            int r4 = r8.D
            int r5 = r8.as()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r8 = r8.s
            android.graphics.Rect r8 = r8.k
            android.support.v7.widget.RecyclerView.E(r13, r8)
            int r13 = r8.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb1
            int r13 = r8.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb1
            int r13 = r8.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb1
            int r8 = r8.bottom
            int r8 = r8 - r10
            if (r8 <= r2) goto Lb1
        Lac:
            if (r11 != 0) goto Lb2
            if (r10 == 0) goto Lb1
            goto Lb3
        Lb1:
            return r0
        Lb2:
            r0 = r11
        Lb3:
            if (r12 == 0) goto Lb9
            r9.scrollBy(r0, r10)
            goto Lbc
        Lb9:
            r9.al(r0, r10)
        Lbc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy.bb(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean bc(View view, int i, int i2, jz jzVar) {
        return (!view.isLayoutRequested() && this.w && aZ(view.getWidth(), i, jzVar.width) && aZ(view.getHeight(), i2, jzVar.height)) ? false : true;
    }

    public final void bd() {
        this.v = true;
    }

    public final void bl(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((jz) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void bo(int i, int i2) {
        this.s.v(i, i2);
    }

    public final void bp(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public int d(int i, kc kcVar, kj kjVar) {
        throw null;
    }

    public int e(int i, kc kcVar, kj kjVar) {
        throw null;
    }

    public abstract jz f();

    public jz g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jz ? new jz((jz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new jz((ViewGroup.MarginLayoutParams) layoutParams) : new jz(layoutParams);
    }

    public jz h(Context context, AttributeSet attributeSet) {
        return new jz(context, attributeSet);
    }

    public View j(View view, int i, kc kcVar, kj kjVar) {
        throw null;
    }

    public void m(kc kcVar, kj kjVar, vw vwVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            vwVar.c(8192);
            vwVar.i();
            vwVar.h();
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            vwVar.c(4096);
            vwVar.i();
            vwVar.h();
        }
        vwVar.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) new brb(AccessibilityNodeInfo.CollectionInfo.obtain(b(kcVar, kjVar), a(kcVar, kjVar), false, 0)).a);
    }

    public void n(kc kcVar, kj kjVar, View view, vw vwVar) {
        vwVar.g(brb.m(X() ? bk(view) : 0, 1, W() ? bk(view) : 0, 1));
    }

    public void o(kc kcVar, kj kjVar) {
        throw null;
    }

    public void q(Rect rect, int i, int i2) {
        aV(al(i, rect.width() + at() + au(), ar()), al(i2, rect.height() + av() + as(), aq()));
    }

    public boolean s(jz jzVar) {
        return jzVar != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[PHI: r0
  0x008c: PHI (r0v7 int) = (r0v4 int), (r0v16 int) binds: [B:26:0x007f, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean t(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy.t(int, android.os.Bundle):boolean");
    }

    public boolean u() {
        throw null;
    }

    public void bn() {
    }

    public void x() {
    }

    public void aL(int i) {
    }

    public void ai(RecyclerView recyclerView) {
    }

    public void p(kj kjVar) {
    }

    public void A(int i, int i2) {
    }

    public void ae(int i, iu iuVar) {
    }

    public void w(int i, int i2) {
    }

    public void y(int i, int i2) {
    }

    public void z(int i, int i2) {
    }
}
