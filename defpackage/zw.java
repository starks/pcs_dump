package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zw {
    public final Object a;
    public final Object b;
    public Object c;

    public zw() {
        this.b = new fui(null, null, null);
        this.a = new fui(null, null, null);
        this.c = new pb[32];
    }

    public static zw p(Context context, int i, int[] iArr) {
        return new zw(context, context.obtainStyledAttributes(i, iArr));
    }

    public static zw q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new zw(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static zw r(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new zw(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final void a(yu yuVar) {
        Object obj = this.c;
        if (obj != null) {
            ((zv) obj).run();
        }
        zv zvVar = new zv((za) this.a, yuVar);
        this.c = zvVar;
        ((Handler) this.b).postAtFrontOfQueue(zvVar);
    }

    public final int b(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelOffset(i, i2);
    }

    public final int c(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelSize(i, i2);
    }

    public final int d(int i, int i2) {
        return ((TypedArray) this.a).getInt(i, i2);
    }

    public final int e(int i, int i2) {
        return ((TypedArray) this.a).getInteger(i, i2);
    }

    public final int f(int i, int i2) {
        return ((TypedArray) this.a).getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return ((TypedArray) this.a).getResourceId(i, i2);
    }

    public final ColorStateList h(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0 || (colorStateListB = rm.b((Context) this.b, resourceId)) == null) ? ((TypedArray) this.a).getColorStateList(i) : colorStateListB;
    }

    public final Drawable i(int i) {
        int resourceId;
        return (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0) ? ((TypedArray) this.a).getDrawable(i) : a.t((Context) this.b, resourceId);
    }

    public final Drawable j(int i) {
        int resourceId;
        if (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0) {
            return null;
        }
        return gy.d().g((Context) this.b, resourceId);
    }

    public final CharSequence k(int i) {
        return ((TypedArray) this.a).getText(i);
    }

    public final String l(int i) {
        return ((TypedArray) this.a).getString(i);
    }

    public final void m() {
        ((TypedArray) this.a).recycle();
    }

    public final boolean n(int i, boolean z) {
        return ((TypedArray) this.a).getBoolean(i, z);
    }

    public final boolean o(int i) {
        return ((TypedArray) this.a).hasValue(i);
    }

    private zw(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public zw(yz yzVar) {
        this.a = new za(yzVar);
        this.b = new Handler();
    }
}
