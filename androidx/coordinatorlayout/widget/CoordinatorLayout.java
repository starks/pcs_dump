package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import defpackage.ahm;
import defpackage.ajx;
import defpackage.cme;
import defpackage.it;
import defpackage.oc;
import defpackage.qw;
import defpackage.qx;
import defpackage.qy;
import defpackage.qz;
import defpackage.ra;
import defpackage.rb;
import defpackage.rc;
import defpackage.rd;
import defpackage.tl;
import defpackage.tm;
import defpackage.tx;
import defpackage.ty;
import defpackage.tz;
import defpackage.ua;
import defpackage.ul;
import defpackage.un;
import defpackage.ur;
import defpackage.ut;
import defpackage.vs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements tx, ty {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final tl x;
    public vs e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final ahm h;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private boolean t;
    private Drawable u;
    private ua v;
    private final tz w;
    private cme y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new it(3);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        x = new tm();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final boolean A(int i2) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        t(this, view, 2, 1);
        d(view, 0, i2, this.n, 1);
        int[] iArr = this.n;
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return this.n[1] > 0;
    }

    private final boolean B(qy qyVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? qyVar.m(this, view, motionEvent) : qyVar.i(this, view, motionEvent);
    }

    private final boolean C(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventE = null;
        boolean zB = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            rb rbVar = (rb) view.getLayoutParams();
            qy qyVar = rbVar.a;
            if (!zB || actionMasked == 0) {
                if (!zB && qyVar != null && (zB = B(qyVar, view, motionEvent, i2))) {
                    this.r = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            qy qyVar2 = ((rb) view2.getLayoutParams()).a;
                            if (qyVar2 != null) {
                                if (motionEventE == null) {
                                    motionEventE = E(motionEvent);
                                }
                                B(qyVar2, view2, motionEventE, i2);
                            }
                        }
                    }
                }
                if (rbVar.a == null) {
                    rbVar.m = false;
                }
                boolean z = rbVar.m;
            } else if (qyVar != null) {
                if (motionEventE == null) {
                    motionEventE = E(motionEvent);
                }
                B(qyVar, view, motionEventE, i2);
            }
        }
        list.clear();
        if (motionEventE != null) {
            motionEventE.recycle();
        }
        return zB;
    }

    private static final void D(int i2, Rect rect, Rect rect2, rb rbVar, int i3, int i4) {
        int i5 = rbVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int iS = s(rbVar.d);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(iS, i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final MotionEvent E(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void F(View view, int i2) {
        rb rbVar = (rb) view.getLayoutParams();
        int i3 = rbVar.i;
        if (i3 != i2) {
            int[] iArr = ut.a;
            view.offsetLeftAndRight(i2 - i3);
            rbVar.i = i2;
        }
    }

    private static final void G(View view, int i2) {
        rb rbVar = (rb) view.getLayoutParams();
        int i3 = rbVar.j;
        if (i3 != i2) {
            int[] iArr = ut.a;
            view.offsetTopAndBottom(i2 - i3);
            rbVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final rb l(View view) {
        rb rbVar = (rb) view.getLayoutParams();
        if (!rbVar.b) {
            if (view instanceof qx) {
                qy qyVarA = ((qx) view).a();
                if (qyVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                rbVar.b(qyVarA);
                rbVar.b = true;
                return rbVar;
            }
            qz qzVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                qzVar = (qz) superclass.getAnnotation(qz.class);
                if (qzVar != null) {
                    break;
                }
            }
            if (qzVar != null) {
                try {
                    rbVar.b((qy) qzVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + qzVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            rbVar.b = true;
        }
        return rbVar;
    }

    private final int n() {
        return p() - getHeight();
    }

    private final int o() {
        return -p();
    }

    private final int p() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            rb rbVar = (rb) childAt.getLayoutParams();
            height += childAt.getHeight() + rbVar.topMargin + rbVar.bottomMargin;
        }
        return height;
    }

    private final int q(int i2) {
        int[] iArr = this.q;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int r() {
        return (int) (getHeight() * 0.2f);
    }

    private static int s(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) == 0 ? i2 | 48 : i2;
    }

    private static int u(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect v() {
        Rect rect = (Rect) x.a();
        return rect == null ? new Rect() : rect;
    }

    private final void w(rb rbVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + rbVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - rbVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + rbVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - rbVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void x(Rect rect) {
        rect.setEmpty();
        x.b(rect);
    }

    private final void y() {
        View view = this.r;
        if (view != null) {
            qy qyVar = ((rb) view.getLayoutParams()).a;
            if (qyVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                qyVar.m(this, this.r, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.r = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((rb) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.o = false;
    }

    private final void z() {
        int[] iArr = ut.a;
        if (!getFitsSystemWindows()) {
            un.p(this, null);
            return;
        }
        if (this.v == null) {
            this.v = new ajx(this, 1);
        }
        un.p(this, this.v);
        setSystemUiVisibility(1280);
    }

    public final List a(View view) {
        ahm ahmVar = this.h;
        int i2 = ((oc) ahmVar.c).f;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((oc) ahmVar.c).g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((oc) ahmVar.c).d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList arrayListB = this.h.b(view);
        if (arrayListB == null || arrayListB.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListB.size(); i2++) {
            View view2 = (View) arrayListB.get(i2);
            qy qyVar = ((rb) view2.getLayoutParams()).a;
            if (qyVar != null) {
                qyVar.o(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            rd.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof rb) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.tx
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        qy qyVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                rb rbVar = (rb) childAt.getLayoutParams();
                if (rbVar.d(i4) && (qyVar = rbVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    qyVar.d(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, this.l[0]) : Math.min(iMax, this.l[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, this.l[1]) : Math.min(iMax2, this.l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? A(-getHeight()) : A(-r());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? A(getHeight()) : A(r());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? A(o()) : A(n());
            }
            if (keyCode == 92) {
                return A(-getHeight());
            }
            if (keyCode == 93) {
                return A(getHeight());
            }
            if (keyCode == 122) {
                return A(o());
            }
            if (keyCode == 123) {
                return A(n());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        qy qyVar = ((rb) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.tx
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.m);
    }

    @Override // defpackage.ty
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        qy qyVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                rb rbVar = (rb) childAt.getLayoutParams();
                if (rbVar.d(i6) && (qyVar = rbVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    qyVar.e(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, this.l[0]) : Math.min(iMax, this.l[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, this.l[1]) : Math.min(iMax2, this.l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.tx
    public final void g(View view, View view2, int i2, int i3) {
        this.w.c(i2, i3);
        this.s = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            rb rbVar = (rb) getChildAt(i4).getLayoutParams();
            if (rbVar.d(i3)) {
                qy qyVar = rbVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rb();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new rb(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.w.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.tx
    public final void h(View view, int i2) {
        this.w.d(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            rb rbVar = (rb) childAt.getLayoutParams();
            if (rbVar.d(i2)) {
                qy qyVar = rbVar.a;
                if (qyVar != null) {
                    qyVar.g(this, childAt, view, i2);
                }
                rbVar.c(i2, false);
                rbVar.a();
            }
        }
        this.s = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r21) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i(int):void");
    }

    public final void j(View view, int i2) {
        Rect rectV;
        Rect rectV2;
        rb rbVar = (rb) view.getLayoutParams();
        View view2 = rbVar.k;
        if (view2 == null && rbVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectV = v();
            rectV2 = v();
            try {
                rd.a(this, view2, rectV);
                rb rbVar2 = (rb) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                D(i2, rectV, rectV2, rbVar2, measuredWidth, measuredHeight);
                w(rbVar2, rectV2, measuredWidth, measuredHeight);
                view.layout(rectV2.left, rectV2.top, rectV2.right, rectV2.bottom);
                return;
            } finally {
                x(rectV);
                x(rectV2);
            }
        }
        int i3 = rbVar.e;
        if (i3 < 0) {
            rb rbVar3 = (rb) view.getLayoutParams();
            rectV = v();
            rectV.set(getPaddingLeft() + rbVar3.leftMargin, getPaddingTop() + rbVar3.topMargin, (getWidth() - getPaddingRight()) - rbVar3.rightMargin, (getHeight() - getPaddingBottom()) - rbVar3.bottomMargin);
            if (this.e != null) {
                int[] iArr = ut.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectV.left += this.e.b();
                    rectV.top += this.e.d();
                    rectV.right -= this.e.c();
                    rectV.bottom -= this.e.a();
                }
            }
            rectV2 = v();
            Gravity.apply(s(rbVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectV, rectV2, i2);
            view.layout(rectV2.left, rectV2.top, rectV2.right, rectV2.bottom);
            return;
        }
        rb rbVar4 = (rb) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(u(rbVar4.c), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iQ = q(i3) - measuredWidth2;
        if (i4 == 1) {
            iQ += measuredWidth2 / 2;
        } else if (i4 == 5) {
            iQ += measuredWidth2;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + rbVar4.leftMargin, Math.min(iQ, ((width - getPaddingRight()) - measuredWidth2) - rbVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + rbVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - rbVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean k(View view, int i2, int i3) {
        Rect rectV = v();
        rd.a(this, view, rectV);
        try {
            return rectV.contains(i2, i3);
        } finally {
            x(rectV);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
        if (this.t) {
            if (this.y == null) {
                this.y = new cme(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.y);
        }
        if (this.e == null) {
            int[] iArr = ut.a;
            if (getFitsSystemWindows()) {
                ul.b(this);
            }
        }
        this.p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        if (this.t && this.y != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.y);
        }
        View view = this.s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.p = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.u == null) {
            return;
        }
        vs vsVar = this.e;
        int iD = vsVar != null ? vsVar.d() : 0;
        if (iD > 0) {
            this.u.setBounds(0, 0, getWidth(), iD);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y();
            actionMasked = 0;
        }
        boolean zC = C(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zC;
        }
        this.r = null;
        y();
        return zC;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        qy qyVar;
        int layoutDirection = getLayoutDirection();
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.j.get(i6);
            if (view.getVisibility() != 8 && ((qyVar = ((rb) view.getLayoutParams()).a) == null || !qyVar.j(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                rb rbVar = (rb) childAt.getLayoutParams();
                if (rbVar.n) {
                    qy qyVar = rbVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        qy qyVar;
        int childCount = getChildCount();
        boolean zR = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                rb rbVar = (rb) childAt.getLayoutParams();
                if (rbVar.n && (qyVar = rbVar.a) != null) {
                    zR |= qyVar.r(view);
                }
            }
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof rc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rc rcVar = (rc) parcelable;
        super.onRestoreInstanceState(rcVar.d);
        SparseArray sparseArray = rcVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            qy qyVar = l(childAt).a;
            if (id != -1 && qyVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                qyVar.f(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableA;
        rc rcVar = new rc(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            qy qyVar = ((rb) childAt.getLayoutParams()).a;
            if (id != -1 && qyVar != null && (parcelableA = qyVar.a(this, childAt)) != null) {
                sparseArray.append(id, parcelableA);
            }
        }
        rcVar.a = sparseArray;
        return rcVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zC;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.r;
        boolean z = false;
        if (view != null) {
            qy qyVar = ((rb) view.getLayoutParams()).a;
            zC = qyVar != null ? qyVar.m(this, this.r, motionEvent) : false;
        } else {
            zC = C(motionEvent, 1);
            if (actionMasked != 0 && zC) {
                z = true;
            }
        }
        if (this.r == null || actionMasked == 3) {
            zC |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventE = E(motionEvent);
            super.onTouchEvent(motionEventE);
            motionEventE.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zC;
        }
        this.r = null;
        y();
        return zC;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        qy qyVar = ((rb) view.getLayoutParams()).a;
        if (qyVar == null || !qyVar.k(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.o) {
            return;
        }
        if (this.r == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                qy qyVar = ((rb) childAt.getLayoutParams()).a;
                if (qyVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    qyVar.i(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        y();
        this.o = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.u;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.u.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.tx
    public final boolean t(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                rb rbVar = (rb) childAt.getLayoutParams();
                qy qyVar = rbVar.a;
                if (qyVar != null) {
                    boolean zL = qyVar.l(this, childAt, view, view2, i2, i3);
                    z |= zL;
                    rbVar.c(i3, zL);
                } else {
                    rbVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rb ? new rb((rb) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new rb((ViewGroup.MarginLayoutParams) layoutParams) : new rb(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i2);
        this.j = new ArrayList();
        this.h = new ahm(null);
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.w = new tz();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qw.a, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qw.a, i2, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i2 == 0) {
            int[] iArr = qw.a;
            int[] iArr2 = ut.a;
            coordinatorLayout = this;
            context2 = context;
            ur.b(coordinatorLayout, context2, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            int[] iArr3 = qw.a;
            int[] iArr4 = ut.a;
            ur.b(coordinatorLayout, context2, iArr3, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.q.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.q[i3] = (int) (r11[i3] * f);
            }
        }
        coordinatorLayout.u = typedArray.getDrawable(1);
        typedArray.recycle();
        coordinatorLayout.z();
        super.setOnHierarchyChangeListener(new ra(coordinatorLayout));
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }
}
