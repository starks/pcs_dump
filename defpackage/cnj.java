package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnj extends hg {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public cnj(Context context, AttributeSet attributeSet) {
        super(cpg.a(context, attributeSet, com.google.android.as.oss.R.attr.radioButtonStyle, com.google.android.as.oss.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA = cnb.a(context2, attributeSet, cnk.a, com.google.android.as.oss.R.attr.radioButtonStyle, com.google.android.as.oss.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(cnx.i(context2, typedArrayA, 0));
        }
        this.c = typedArrayA.getBoolean(1, false);
        typedArrayA.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int iH = clq.h(this, com.google.android.as.oss.R.attr.colorControlActivated);
                int iH2 = clq.h(this, com.google.android.as.oss.R.attr.colorOnSurface);
                int iH3 = clq.h(this, com.google.android.as.oss.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{clq.i(iH3, iH, 1.0f), clq.i(iH3, iH2, 0.54f), clq.i(iH3, iH2, 0.38f), clq.i(iH3, iH2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
