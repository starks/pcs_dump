package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.as.oss.R;
import defpackage.clp;
import defpackage.cnb;
import defpackage.cnx;
import defpackage.coa;
import defpackage.cpg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    private final coa a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.e : this.d;
        if (z) {
            width = getWidth();
            i = this.d;
        } else {
            width = getWidth();
            i = this.e;
        }
        this.a.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.a.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(cpg.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        coa coaVar = new coa();
        this.a = coaVar;
        TypedArray typedArrayA = cnb.a(context2, attributeSet, clp.a, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.b = typedArrayA.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.d = typedArrayA.getDimensionPixelOffset(2, 0);
        this.e = typedArrayA.getDimensionPixelOffset(1, 0);
        int defaultColor = cnx.i(context2, typedArrayA, 0).getDefaultColor();
        if (this.c != defaultColor) {
            this.c = defaultColor;
            coaVar.m(ColorStateList.valueOf(defaultColor));
            invalidate();
        }
        typedArrayA.recycle();
    }
}
