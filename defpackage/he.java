package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class he extends PopupWindow {
    public he(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        zw zwVarR = zw.r(context, attributeSet, dp.s, i, 0);
        if (zwVarR.o(2)) {
            setOverlapAnchor(zwVarR.n(2, false));
        }
        setBackgroundDrawable(zwVarR.i(0));
        zwVarR.m();
    }
}
