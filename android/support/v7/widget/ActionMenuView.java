package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.fd;
import defpackage.fe;
import defpackage.ff;
import defpackage.fh;
import defpackage.ft;
import defpackage.fuu;
import defpackage.gl;
import defpackage.gm;
import defpackage.gn;
import defpackage.go;
import defpackage.jb;
import defpackage.jc;
import defpackage.jt;
import defpackage.le;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends jc implements fe, ft {
    public ff a;
    public boolean b;
    public gl c;
    public fd d;
    public fuu e;
    private Context i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final go n() {
        go goVar = new go();
        goVar.gravity = 16;
        return goVar;
    }

    @Override // defpackage.ft
    public final void a(ff ffVar) {
        this.a = ffVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jc
    /* renamed from: aW */
    public final /* bridge */ /* synthetic */ jb generateDefaultLayoutParams() {
        return n();
    }

    @Override // defpackage.fe
    public final boolean b(fh fhVar) {
        return this.a.z(fhVar, 0);
    }

    @Override // defpackage.jc, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final go generateLayoutParams(AttributeSet attributeSet) {
        return new go(getContext(), attributeSet);
    }

    @Override // defpackage.jc, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof go;
    }

    @Override // defpackage.jc, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final go generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return n();
        }
        go goVar = layoutParams instanceof go ? new go((go) layoutParams) : new go(layoutParams);
        if (goVar.gravity <= 0) {
            goVar.gravity = 16;
        }
        return goVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.jc, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final Menu h() {
        if (this.a == null) {
            Context context = getContext();
            ff ffVar = new ff(context);
            this.a = ffVar;
            ffVar.p(new le(this, 1));
            gl glVar = new gl(context);
            this.c = glVar;
            glVar.u();
            this.c.e = new gn();
            this.a.h(this.c, this.i);
            this.c.n(this);
        }
        return this.a;
    }

    public final void i() {
        gl glVar = this.c;
        if (glVar != null) {
            glVar.s();
        }
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(gl glVar) {
        this.c = glVar;
        glVar.n(this);
    }

    protected final boolean l(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof gm)) {
            zC = ((gm) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof gm)) ? zC : ((gm) childAt2).d() | zC;
    }

    public final boolean m() {
        gl glVar = this.c;
        return glVar != null && glVar.q();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gl glVar = this.c;
        if (glVar != null) {
            glVar.l();
            if (this.c.q()) {
                this.c.o();
                this.c.r();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // defpackage.jc, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.k) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zQ = jt.q(this);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                go goVar = (go) childAt.getLayoutParams();
                if (goVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zQ) {
                        paddingLeft = getPaddingLeft() + goVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - goVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + goVar.leftMargin) + goVar.rightMargin;
                    l(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i5 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zQ) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                go goVar2 = (go) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !goVar2.a) {
                    int i17 = width2 - goVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + goVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            go goVar3 = (go) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !goVar3.a) {
                int i20 = paddingLeft2 + goVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + goVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // defpackage.jc, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s();
        float f = context.getResources().getDisplayMetrics().density;
        this.m = (int) (56.0f * f);
        this.n = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }
}
