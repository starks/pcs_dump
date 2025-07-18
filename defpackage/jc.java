package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jc extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public jc(Context context) {
        this(context, null);
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: aW, reason: merged with bridge method [inline-methods] */
    public jb generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new jb(-2);
        }
        if (i == 1) {
            return new jb(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: aX, reason: merged with bridge method [inline-methods] */
    public jb generateLayoutParams(AttributeSet attributeSet) {
        return new jb(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public jb generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jb ? new jb((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new jb((ViewGroup.MarginLayoutParams) layoutParams) : new jb(layoutParams);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.f & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return bottom + ((jb) childAt.getLayoutParams()).topMargin + baseline;
    }

    final void o(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.g == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && r(i2)) {
                    o(canvas, (childAt.getTop() - ((jb) childAt.getLayoutParams()).topMargin) - this.m);
                }
                i2++;
            }
            if (r(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                o(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.m : childAt2.getBottom() + ((jb) childAt2.getLayoutParams()).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zQ = jt.q(this);
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && r(i2)) {
                jb jbVar = (jb) childAt3.getLayoutParams();
                p(canvas, zQ ? childAt3.getRight() + jbVar.rightMargin : (childAt3.getLeft() - jbVar.leftMargin) - this.h);
            }
            i2++;
        }
        if (r(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                jb jbVar2 = (jb) childAt4.getLayoutParams();
                if (zQ) {
                    left = childAt4.getLeft() - jbVar2.leftMargin;
                    i = this.h;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + jbVar2.rightMargin;
                }
            } else if (zQ) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.h;
                right = left - i;
            }
            p(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:427:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.onMeasure(int, int):void");
    }

    final void p(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void q(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    protected final boolean r(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    public final void s() {
        this.a = false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public jc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        zw zwVarR = zw.r(context, attributeSet, dp.n, i, 0);
        int[] iArr = dp.n;
        Object obj = zwVarR.a;
        int[] iArr2 = ut.a;
        ur.b(this, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        int iD = zwVarR.d(1, -1);
        if (iD >= 0) {
            q(iD);
        }
        int iD2 = zwVarR.d(0, -1);
        if (iD2 >= 0 && this.f != iD2) {
            iD2 = (8388615 & iD2) == 0 ? iD2 | 8388611 : iD2;
            this.f = (iD2 & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) == 0 ? iD2 | 48 : iD2;
            requestLayout();
        }
        if (!zwVarR.n(2, true)) {
            s();
        }
        this.i = ((TypedArray) zwVarR.a).getFloat(4, -1.0f);
        this.b = zwVarR.d(3, -1);
        this.j = zwVarR.n(7, false);
        Drawable drawableI = zwVarR.i(5);
        if (drawableI != this.g) {
            this.g = drawableI;
            if (drawableI != null) {
                this.h = drawableI.getIntrinsicWidth();
                this.m = drawableI.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(drawableI == null);
            requestLayout();
        }
        this.n = zwVarR.d(8, 0);
        this.o = zwVarR.c(6, 0);
        zwVarR.m();
    }
}
