package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gw {
    public boolean a;
    private final CheckedTextView b;
    private final ColorStateList c = null;
    private final PorterDuff.Mode d = null;
    private final boolean e = false;
    private final boolean f = false;

    public gw(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    final void a() {
        this.b.getCheckMarkDrawable();
    }

    final void b(AttributeSet attributeSet) {
        int iG;
        int iG2;
        zw zwVarR = zw.r(this.b.getContext(), attributeSet, dp.l, R.attr.checkedTextViewStyle, 0);
        Object obj = zwVarR.a;
        CheckedTextView checkedTextView = this.b;
        Context context = checkedTextView.getContext();
        int[] iArr = dp.l;
        int[] iArr2 = ut.a;
        ur.b(checkedTextView, context, iArr, attributeSet, (TypedArray) obj, R.attr.checkedTextViewStyle, 0);
        try {
            if (zwVarR.o(1) && (iG2 = zwVarR.g(1, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.b;
                    checkedTextView2.setCheckMarkDrawable(a.t(checkedTextView2.getContext(), iG2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (zwVarR.o(0) && (iG = zwVarR.g(0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.b;
                checkedTextView3.setCheckMarkDrawable(a.t(checkedTextView3.getContext(), iG));
            }
            if (zwVarR.o(2)) {
                this.b.setCheckMarkTintList(zwVarR.h(2));
            }
            if (zwVarR.o(3)) {
                CheckedTextView checkedTextView4 = this.b;
                int iD = zwVarR.d(3, -1);
                Rect rect = il.a;
                checkedTextView4.setCheckMarkTintMode(a.c(iD, null));
            }
        } finally {
            zwVarR.m();
        }
    }
}
