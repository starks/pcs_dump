package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gx {
    public ColorStateList a = null;
    public PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    private final CompoundButton e;
    private boolean f;

    public gx(CompoundButton compoundButton) {
        this.e = compoundButton;
    }

    public final void a() {
        Drawable buttonDrawable = this.e.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList(null);
                }
                if (this.d) {
                    drawableMutate.setTintMode(this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.e.getDrawableState());
                }
                this.e.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        int iG;
        int iG2;
        zw zwVarR = zw.r(this.e.getContext(), attributeSet, dp.m, i, 0);
        Object obj = zwVarR.a;
        CompoundButton compoundButton = this.e;
        Context context = compoundButton.getContext();
        int[] iArr = dp.m;
        int[] iArr2 = ut.a;
        ur.b(compoundButton, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        try {
            if (zwVarR.o(1) && (iG2 = zwVarR.g(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.e;
                    compoundButton2.setButtonDrawable(a.t(compoundButton2.getContext(), iG2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (zwVarR.o(0) && (iG = zwVarR.g(0, 0)) != 0) {
                CompoundButton compoundButton3 = this.e;
                compoundButton3.setButtonDrawable(a.t(compoundButton3.getContext(), iG));
            }
            if (zwVarR.o(2)) {
                this.e.setButtonTintList(zwVarR.h(2));
            }
            if (zwVarR.o(3)) {
                CompoundButton compoundButton4 = this.e;
                int iD = zwVarR.d(3, -1);
                Rect rect = il.a;
                compoundButton4.setButtonTintMode(a.c(iD, null));
            }
        } finally {
            zwVarR.m();
        }
    }

    final void c() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }
}
