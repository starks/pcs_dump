package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.as.oss.R;
import defpackage.ckb;
import defpackage.clq;
import defpackage.cnb;
import defpackage.cnc;
import defpackage.cnx;
import defpackage.coa;
import defpackage.cpg;
import defpackage.ff;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] A = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer B;
    private boolean C;
    private boolean D;
    private ImageView.ScaleType E;
    private Boolean F;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void C(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar
    public final void m(int i) {
        Menu menuF = f();
        boolean z = menuF instanceof ff;
        if (z) {
            ((ff) menuF).s();
        }
        super.m(i);
        if (z) {
            ((ff) menuF).r();
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cnx.c(this);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.C || this.D) {
            List listA = cnc.a(this, this.s);
            TextView textView = listA.isEmpty() ? null : (TextView) Collections.min(listA, cnc.a);
            List listA2 = cnc.a(this, this.t);
            TextView textView2 = listA2.isEmpty() ? null : (TextView) Collections.max(listA2, cnc.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.C && textView != null) {
                    C(textView, pair);
                }
                if (this.D && textView2 != null) {
                    C(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.d;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.F;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.E;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void p(Drawable drawable) {
        if (drawable != null && this.B != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.B.intValue());
        }
        super.p(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        cnx.b(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListB;
        super(cpg.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayA = cnb.a(context2, attributeSet, ckb.e, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayA.hasValue(2)) {
            this.B = Integer.valueOf(typedArrayA.getColor(2, -1));
            Drawable drawableE = e();
            if (drawableE != null) {
                p(drawableE);
            }
        }
        this.C = typedArrayA.getBoolean(4, false);
        this.D = typedArrayA.getBoolean(3, false);
        int i2 = typedArrayA.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.E = A[i2];
        }
        if (typedArrayA.hasValue(0)) {
            this.F = Boolean.valueOf(typedArrayA.getBoolean(0, false));
        }
        typedArrayA.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListB = ColorStateList.valueOf(0);
        } else {
            colorStateListB = clq.b(background);
        }
        if (colorStateListB != null) {
            coa coaVar = new coa();
            coaVar.m(colorStateListB);
            coaVar.j(context2);
            coaVar.l(getElevation());
            setBackground(coaVar);
        }
    }
}
