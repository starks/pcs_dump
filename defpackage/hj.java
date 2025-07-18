package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hj extends hf {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public hj(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.hf
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        zw zwVarR = zw.r(this.b.getContext(), attributeSet, dp.g, R.attr.seekBarStyle, 0);
        Object obj = zwVarR.a;
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = dp.g;
        int[] iArr2 = ut.a;
        ur.b(seekBar, context, iArr, attributeSet, (TypedArray) obj, R.attr.seekBarStyle, 0);
        Drawable drawableJ = zwVarR.j(0);
        if (drawableJ != null) {
            this.b.setThumb(drawableJ);
        }
        Drawable drawableI = zwVarR.i(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableI;
        if (drawableI != null) {
            drawableI.setCallback(this.b);
            drawableI.setLayoutDirection(this.b.getLayoutDirection());
            if (drawableI.isStateful()) {
                drawableI.setState(this.b.getDrawableState());
            }
            c();
        }
        this.b.invalidate();
        if (zwVarR.o(3)) {
            int iD = zwVarR.d(3, -1);
            PorterDuff.Mode mode = this.e;
            Rect rect = il.a;
            this.e = a.c(iD, mode);
            this.g = true;
        }
        if (zwVarR.o(2)) {
            this.d = zwVarR.h(2);
            this.f = true;
        }
        zwVarR.m();
        c();
    }
}
