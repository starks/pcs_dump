package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import defpackage.ca;
import defpackage.dp;
import defpackage.ep;
import defpackage.fcy;
import defpackage.ff;
import defpackage.fh;
import defpackage.fuu;
import defpackage.gl;
import defpackage.ha;
import defpackage.hc;
import defpackage.hy;
import defpackage.jt;
import defpackage.kr;
import defpackage.le;
import defpackage.lf;
import defpackage.lg;
import defpackage.li;
import defpackage.ll;
import defpackage.ls;
import defpackage.p;
import defpackage.tu;
import defpackage.ur;
import defpackage.ut;
import defpackage.zw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements tu {
    private ImageButton A;
    private int B;
    private int C;
    private int D;
    private int E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;
    private final ArrayList J;
    private final int[] K;
    private ll L;
    private final Runnable M;
    private final fuu N;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public kr r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public ArrayList v;
    public gl w;
    public lf x;
    public boolean y;
    public final fcy z;

    public Toolbar(Context context) {
        this(context, null);
    }

    protected static final lg B(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof lg ? new lg((lg) layoutParams) : layoutParams instanceof ca ? new lg((ca) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new lg((ViewGroup.MarginLayoutParams) layoutParams) : new lg(layoutParams);
    }

    private final int C(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int D(View view, int i) {
        lg lgVar = (lg) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = lgVar.a & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.E & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - lgVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < lgVar.topMargin) {
            iMax = lgVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < lgVar.bottomMargin) {
                iMax = Math.max(0, iMax - (lgVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int E(View view, int i, int[] iArr, int i2) {
        lg lgVar = (lg) view.getLayoutParams();
        int i3 = lgVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iD = D(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iD, iMax + measuredWidth, view.getMeasuredHeight() + iD);
        return iMax + measuredWidth + lgVar.rightMargin;
    }

    private final int F(View view, int i, int[] iArr, int i2) {
        lg lgVar = (lg) view.getLayoutParams();
        int i3 = lgVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iD = D(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iD, iMax, view.getMeasuredHeight() + iD);
        return iMax - (measuredWidth + lgVar.leftMargin);
    }

    private final int G(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void H(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                lg lgVar = (lg) childAt.getLayoutParams();
                if (lgVar.b == 0 && M(childAt) && C(lgVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            lg lgVar2 = (lg) childAt2.getLayoutParams();
            if (lgVar2.b == 0 && M(childAt2) && C(lgVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void I(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        lg lgVar = layoutParams == null ? new lg() : !checkLayoutParams(layoutParams) ? B(layoutParams) : (lg) layoutParams;
        lgVar.b = 1;
        if (!z || this.h == null) {
            addView(view, lgVar);
        } else {
            view.setLayoutParams(lgVar);
            this.u.add(view);
        }
    }

    private final void J() {
        if (this.d == null) {
            this.d = new hc(getContext(), null);
        }
    }

    private final void K() {
        if (this.A == null) {
            this.A = new ha(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            lg lgVar = new lg();
            lgVar.a = (this.m & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) | 8388611;
            this.A.setLayoutParams(lgVar);
        }
    }

    private final boolean L(View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int N(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int O(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void P(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final ll A() {
        if (this.L == null) {
            this.L = new ll(this);
        }
        return this.L;
    }

    public final int a() {
        kr krVar = this.r;
        if (krVar != null) {
            return krVar.g ? krVar.a : krVar.b;
        }
        return 0;
    }

    public final int b() {
        kr krVar = this.r;
        if (krVar != null) {
            return krVar.g ? krVar.b : krVar.a;
        }
        return 0;
    }

    public final int c() {
        ff ffVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ffVar = actionMenuView.a) == null || !ffVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.D, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof lg);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.C, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.A;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuH = actionMenuView.h();
            if (this.x == null) {
                this.x = new lf(this);
            }
            this.a.c.t();
            ((ff) menuH).h(this.x, this.i);
            w();
        }
        return this.a.h();
    }

    public final MenuInflater g() {
        return new ep(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new lg();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new lg(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.A;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        lf lfVar = this.x;
        fh fhVar = lfVar == null ? null : lfVar.b;
        if (fhVar != null) {
            fhVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.r == null) {
            this.r = new kr();
        }
    }

    public final void l() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.N;
            actionMenuView2.d = new le(this, 0);
            lg lgVar = new lg();
            lgVar.a = (this.m & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) | 8388613;
            this.a.setLayoutParams(lgVar);
            I(this.a, false);
        }
    }

    public void m(int i) {
        g().inflate(i, f());
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            J();
            if (!L(this.d)) {
                I(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && L(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            K();
        }
        ImageButton imageButton = this.A;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.A.setTooltipText(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
            actionMasked = 9;
        }
        if (!this.I) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02c0 A[LOOP:0: B:113:0x02be->B:114:0x02c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02de A[LOOP:1: B:116:0x02dc->B:117:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0305 A[LOOP:2: B:119:0x0303->B:120:0x0305, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0355 A[LOOP:3: B:128:0x0353->B:129:0x0355, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        boolean zQ = jt.q(this);
        int i3 = !zQ ? 1 : 0;
        int iMax2 = 0;
        if (M(this.A)) {
            P(this.A, i, 0, i2, this.B);
            measuredWidth = this.A.getMeasuredWidth() + N(this.A);
            iMax = Math.max(0, this.A.getMeasuredHeight() + O(this.A));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.A.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.g)) {
            P(this.g, i, 0, i2, this.B);
            measuredWidth = this.g.getMeasuredWidth() + N(this.g);
            iMax = Math.max(iMax, this.g.getMeasuredHeight() + O(this.g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int[] iArr = this.K;
        int iD = d();
        int iMax3 = Math.max(iD, measuredWidth);
        iArr[zQ ? 1 : 0] = Math.max(0, iD - measuredWidth);
        if (M(this.a)) {
            P(this.a, i, iMax3, i2, this.B);
            measuredWidth2 = this.a.getMeasuredWidth() + N(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + O(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, measuredWidth2);
        iArr[i3] = Math.max(0, iC - measuredWidth2);
        if (M(this.h)) {
            iMax4 += G(this.h, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + O(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        if (M(this.d)) {
            iMax4 += G(this.d, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.d.getMeasuredHeight() + O(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((lg) childAt.getLayoutParams()).b == 0 && M(childAt)) {
                iMax4 += G(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + O(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.p + this.q;
        int i7 = this.n + this.o;
        if (M(this.b)) {
            G(this.b, i, i5 + i7, i2, i6, iArr);
            iMax2 = this.b.getMeasuredWidth() + N(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + O(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (M(this.c)) {
            iMax2 = Math.max(iMax2, G(this.c, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.c.getMeasuredHeight() + O(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof li)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        li liVar = (li) parcelable;
        super.onRestoreInstanceState(liVar.d);
        ActionMenuView actionMenuView = this.a;
        ff ffVar = actionMenuView != null ? actionMenuView.a : null;
        int i = liVar.a;
        if (i != 0 && this.x != null && ffVar != null && (menuItemFindItem = ffVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (liVar.b) {
            removeCallbacks(this.M);
            post(this.M);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        kr krVar = this.r;
        boolean z = krVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        krVar.g = z2;
        if (!krVar.h) {
            krVar.a = krVar.e;
            krVar.b = krVar.f;
            return;
        }
        if (z2) {
            int i2 = krVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = krVar.e;
            }
            krVar.a = i2;
            int i3 = krVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = krVar.f;
            }
            krVar.b = i3;
            return;
        }
        int i4 = krVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = krVar.e;
        }
        krVar.a = i4;
        int i5 = krVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = krVar.f;
        }
        krVar.b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        fh fhVar;
        li liVar = new li(super.onSaveInstanceState());
        lf lfVar = this.x;
        if (lfVar != null && (fhVar = lfVar.b) != null) {
            liVar.a = fhVar.a;
        }
        liVar.b = y();
        return liVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
            actionMasked = 0;
        }
        if (!this.H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public void p(Drawable drawable) {
        if (drawable != null) {
            K();
            if (!L(this.A)) {
                I(this.A, true);
            }
        } else {
            ImageButton imageButton = this.A;
            if (imageButton != null && L(imageButton)) {
                removeView(this.A);
                this.u.remove(this.A);
            }
        }
        ImageButton imageButton2 = this.A;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void q(View.OnClickListener onClickListener) {
        K();
        this.A.setOnClickListener(onClickListener);
    }

    @Override // defpackage.tu
    public final void r(fuu fuuVar) {
        throw null;
    }

    @Override // defpackage.tu
    public final void s(fuu fuuVar) {
        throw null;
    }

    public final void t(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void u(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && L(textView)) {
                removeView(this.c);
                this.u.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                hy hyVar = new hy(context);
                this.c = hyVar;
                hyVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!L(this.c)) {
                I(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void v(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && L(textView)) {
                removeView(this.b);
                this.u.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                hy hyVar = new hy(context);
                this.b = hyVar;
                hyVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!L(this.b)) {
                I(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
        if (!x() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        isAttachedToWindow();
    }

    public final boolean x() {
        lf lfVar = this.x;
        return (lfVar == null || lfVar.b == null) ? false : true;
    }

    public final boolean y() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final boolean z() {
        gl glVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (glVar = actionMenuView.c) == null || !glVar.r()) ? false : true;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return B(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = 8388627;
        this.J = new ArrayList();
        this.u = new ArrayList();
        this.K = new int[2];
        this.z = new fcy(new p(this, 20));
        this.v = new ArrayList();
        this.N = new fuu(this, null);
        this.M = new ls(this, 1, null);
        zw zwVarR = zw.r(getContext(), attributeSet, dp.x, i, 0);
        int[] iArr = dp.x;
        Object obj = zwVarR.a;
        int[] iArr2 = ut.a;
        ur.b(this, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        this.k = zwVarR.g(28, 0);
        this.l = zwVarR.g(19, 0);
        this.E = zwVarR.e(0, this.E);
        this.m = zwVarR.e(2, 48);
        int iB = zwVarR.b(22, 0);
        iB = zwVarR.o(27) ? zwVarR.b(27, iB) : iB;
        this.q = iB;
        this.p = iB;
        this.o = iB;
        this.n = iB;
        int iB2 = zwVarR.b(25, -1);
        if (iB2 >= 0) {
            this.n = iB2;
        }
        int iB3 = zwVarR.b(24, -1);
        if (iB3 >= 0) {
            this.o = iB3;
        }
        int iB4 = zwVarR.b(26, -1);
        if (iB4 >= 0) {
            this.p = iB4;
        }
        int iB5 = zwVarR.b(23, -1);
        if (iB5 >= 0) {
            this.q = iB5;
        }
        this.B = zwVarR.c(13, -1);
        int iB6 = zwVarR.b(9, Integer.MIN_VALUE);
        int iB7 = zwVarR.b(5, Integer.MIN_VALUE);
        int iC = zwVarR.c(7, 0);
        int iC2 = zwVarR.c(8, 0);
        k();
        kr krVar = this.r;
        krVar.h = false;
        if (iC != Integer.MIN_VALUE) {
            krVar.e = iC;
            krVar.a = iC;
        }
        if (iC2 != Integer.MIN_VALUE) {
            krVar.f = iC2;
            krVar.b = iC2;
        }
        if (iB6 != Integer.MIN_VALUE || iB7 != Integer.MIN_VALUE) {
            krVar.a(iB6, iB7);
        }
        this.C = zwVarR.b(10, Integer.MIN_VALUE);
        this.D = zwVarR.b(6, Integer.MIN_VALUE);
        this.e = zwVarR.i(4);
        this.f = zwVarR.k(3);
        CharSequence charSequenceK = zwVarR.k(21);
        if (!TextUtils.isEmpty(charSequenceK)) {
            v(charSequenceK);
        }
        CharSequence charSequenceK2 = zwVarR.k(18);
        if (!TextUtils.isEmpty(charSequenceK2)) {
            u(charSequenceK2);
        }
        this.i = getContext();
        t(zwVarR.g(17, 0));
        Drawable drawableI = zwVarR.i(16);
        if (drawableI != null) {
            p(drawableI);
        }
        CharSequence charSequenceK3 = zwVarR.k(15);
        if (!TextUtils.isEmpty(charSequenceK3)) {
            o(charSequenceK3);
        }
        Drawable drawableI2 = zwVarR.i(11);
        if (drawableI2 != null) {
            n(drawableI2);
        }
        CharSequence charSequenceK4 = zwVarR.k(12);
        if (!TextUtils.isEmpty(charSequenceK4)) {
            if (!TextUtils.isEmpty(charSequenceK4)) {
                J();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceK4);
            }
        }
        if (zwVarR.o(29)) {
            ColorStateList colorStateListH = zwVarR.h(29);
            this.F = colorStateListH;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListH);
            }
        }
        if (zwVarR.o(20)) {
            ColorStateList colorStateListH2 = zwVarR.h(20);
            this.G = colorStateListH2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListH2);
            }
        }
        if (zwVarR.o(14)) {
            m(zwVarR.g(14, 0));
        }
        zwVarR.m();
    }
}
