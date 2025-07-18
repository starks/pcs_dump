package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jz extends ViewGroup.MarginLayoutParams {
    public km c;
    public final Rect d;
    public boolean e;
    boolean f;

    public jz(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int a() {
        return this.c.c();
    }

    public final boolean b() {
        return this.c.y();
    }

    public final boolean c() {
        return this.c.v();
    }

    public jz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public jz(jz jzVar) {
        super((ViewGroup.LayoutParams) jzVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public jz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public jz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
