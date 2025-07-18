package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hb {
    private final ImageView a;
    private int b = 0;

    public hb(ImageView imageView) {
        this.a = imageView;
    }

    final void a() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.b);
        }
    }

    final void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            il.b(drawable);
        }
    }

    public final void c(AttributeSet attributeSet, int i) {
        int iG;
        zw zwVarR = zw.r(this.a.getContext(), attributeSet, dp.f, i, 0);
        Object obj = zwVarR.a;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = dp.f;
        int[] iArr2 = ut.a;
        ur.b(imageView, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iG = zwVarR.g(1, -1)) != -1 && (drawable = a.t(this.a.getContext(), iG)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                il.b(drawable);
            }
            if (zwVarR.o(2)) {
                this.a.setImageTintList(zwVarR.h(2));
            }
            if (zwVarR.o(3)) {
                ImageView imageView2 = this.a;
                int iD = zwVarR.d(3, -1);
                Rect rect = il.a;
                imageView2.setImageTintMode(a.c(iD, null));
            }
        } finally {
            zwVarR.m();
        }
    }

    final void d(Drawable drawable) {
        this.b = drawable.getLevel();
    }

    public final void e(int i) {
        if (i != 0) {
            Drawable drawableT = a.t(this.a.getContext(), i);
            if (drawableT != null) {
                il.b(drawableT);
            }
            this.a.setImageDrawable(drawableT);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    final boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }
}
