package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.as.oss.R;
import defpackage.dp;
import defpackage.ei;
import defpackage.ff;
import defpackage.ga;
import defpackage.gc;
import defpackage.gl;
import defpackage.jt;
import defpackage.ut;
import defpackage.zw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContextView extends ga {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private int r;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private final void o() {
        if (this.m == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = linearLayout;
            this.n = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.o = (TextView) this.m.findViewById(R.id.action_bar_subtitle);
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
        }
        this.n.setText(this.g);
        this.o.setText(this.h);
        boolean zIsEmpty = TextUtils.isEmpty(this.g);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.h);
        this.o.setVisibility(true != zIsEmpty2 ? 0 : 8);
        this.m.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.m.getParent() == null) {
            addView(this.m);
        }
    }

    @Override // defpackage.ga
    public final void c(int i) {
        this.e = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(ei eiVar) {
        View view = this.i;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.r, (ViewGroup) this, false);
            this.i = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        View viewFindViewById = this.i.findViewById(R.id.action_mode_close_button);
        this.k = viewFindViewById;
        viewFindViewById.setOnClickListener(new gc(eiVar, 0));
        Menu menuA = eiVar.a();
        gl glVar = this.d;
        if (glVar != null) {
            glVar.s();
        }
        this.d = new gl(getContext());
        this.d.u();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((ff) menuA).h(this.d, this.b);
        this.c = (ActionMenuView) this.d.m(this);
        this.c.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void i() {
        removeAllViews();
        this.l = null;
        this.c = null;
        this.d = null;
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(View view) {
        LinearLayout linearLayout;
        View view2 = this.l;
        if (view2 != null) {
            removeView(view2);
        }
        this.l = view;
        if (view != null && (linearLayout = this.m) != null) {
            removeView(linearLayout);
            this.m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void k(CharSequence charSequence) {
        this.h = charSequence;
        o();
    }

    public final void l(CharSequence charSequence) {
        this.g = charSequence;
        o();
        ut.k(this, charSequence);
    }

    public final void m(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final void n() {
        gl glVar = this.d;
        if (glVar != null) {
            glVar.r();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl glVar = this.d;
        if (glVar != null) {
            glVar.o();
            this.d.p();
        }
    }

    @Override // defpackage.ga, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zQ = jt.q(this);
        int paddingRight = zQ ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i5 = zQ ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zQ ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = a(paddingRight, i5, zQ);
            paddingRight = a(iA + f(this.i, iA, paddingTop, paddingTop2, zQ), i6, zQ);
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null && this.l == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.m, paddingRight, paddingTop, paddingTop2, zQ);
        }
        View view2 = this.l;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, zQ);
        }
        int paddingLeft = zQ ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zQ);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.i;
        if (view != null) {
            int iE = e(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            paddingLeft = iE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null && this.l == null) {
            if (this.j) {
                this.m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.m.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.m.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i4 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = Math.min(layoutParams.height, iMin);
            }
            this.l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(iMin, i4));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            int measuredHeight = getChildAt(i6).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i5) {
                i5 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i5);
    }

    @Override // defpackage.ga, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zw zwVarR = zw.r(context, attributeSet, dp.d, i, 0);
        setBackground(zwVarR.i(0));
        this.p = zwVarR.g(5, 0);
        this.q = zwVarR.g(4, 0);
        this.e = zwVarR.f(3, 0);
        this.r = zwVarR.g(2, R.layout.abc_action_mode_close_item_material);
        zwVarR.m();
    }
}
