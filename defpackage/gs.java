package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gs {
    public lc a;
    private final View b;
    private lc e;
    private lc f;
    private int d = -1;
    private final gy c = gy.d();

    public gs(View view) {
        this.b = view;
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new lc();
                }
                lc lcVar = this.f;
                lcVar.a();
                View view = this.b;
                int[] iArr = ut.a;
                ColorStateList colorStateListI = un.i(view);
                if (colorStateListI != null) {
                    lcVar.d = true;
                    lcVar.a = colorStateListI;
                }
                PorterDuff.Mode modeJ = un.j(this.b);
                if (modeJ != null) {
                    lcVar.c = true;
                    lcVar.b = modeJ;
                }
                if (lcVar.d || lcVar.c) {
                    kp.g(background, lcVar, this.b.getDrawableState());
                    return;
                }
            }
            lc lcVar2 = this.a;
            if (lcVar2 != null) {
                kp.g(background, lcVar2, this.b.getDrawableState());
                return;
            }
            lc lcVar3 = this.e;
            if (lcVar3 != null) {
                kp.g(background, lcVar3, this.b.getDrawableState());
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        zw zwVarR = zw.r(this.b.getContext(), attributeSet, dp.z, i, 0);
        Object obj = zwVarR.a;
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = dp.z;
        int[] iArr2 = ut.a;
        ur.b(view, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        try {
            if (zwVarR.o(0)) {
                this.d = zwVarR.g(0, -1);
                ColorStateList colorStateListA = this.c.a(this.b.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (zwVarR.o(1)) {
                un.m(this.b, zwVarR.h(1));
            }
            if (zwVarR.o(2)) {
                View view2 = this.b;
                int iD = zwVarR.d(2, -1);
                Rect rect = il.a;
                un.n(view2, a.c(iD, null));
            }
        } finally {
            zwVarR.m();
        }
    }

    final void c(int i) {
        this.d = i;
        gy gyVar = this.c;
        d(gyVar != null ? gyVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new lc();
            }
            lc lcVar = this.e;
            lcVar.a = colorStateList;
            lcVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
