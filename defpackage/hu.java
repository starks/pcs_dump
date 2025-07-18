package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hu {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private lc e;
    private lc f;
    private lc g;
    private lc h;
    private lc i;
    private lc j;
    private final hz k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public hu(TextView textView) {
        this.d = textView;
        this.k = new hz(textView);
    }

    public static void b(TextView textView, Typeface typeface, int i) {
        ob obVar = ht.a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            ht.a(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        ht.a(textView, fontVariationSettings);
    }

    private static lc f(Context context, gy gyVar, int i) {
        ColorStateList colorStateListA = gyVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        lc lcVar = new lc();
        lcVar.d = true;
        lcVar.a = colorStateListA;
        return lcVar;
    }

    private final void g(Drawable drawable, lc lcVar) {
        if (drawable == null || lcVar == null) {
            return;
        }
        kp.g(drawable, lcVar, this.d.getDrawableState());
    }

    private final void h(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            ht.a(this.d, str);
        }
    }

    private final boolean i(Context context, zw zwVar) {
        String strL;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = dp.a;
        this.a = zwVar.d(2, this.a);
        int iD = zwVar.d(11, -1);
        this.l = iD;
        if (iD != -1) {
            this.a &= 2;
        }
        if (zwVar.o(13)) {
            this.m = zwVar.l(13);
        }
        if (!zwVar.o(10) && !zwVar.o(12)) {
            if (!zwVar.o(1)) {
                int i = this.l;
                if (i == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = Typeface.create(typeface, i, (2 & this.a) != 0);
                return true;
            }
            this.c = false;
            int iD2 = zwVar.d(1, 1);
            if (iD2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (iD2 != 2) {
                    if (iD2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typefaceA = null;
        this.b = null;
        int i2 = true == zwVar.o(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            hs hsVar = new hs(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((TypedArray) zwVar.a).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (zwVar.c == null) {
                        zwVar.c = new TypedValue();
                    }
                    Object obj = zwVar.b;
                    Object obj2 = zwVar.c;
                    ThreadLocal threadLocal = rw.a;
                    if (!((Context) obj).isRestricted()) {
                        typefaceA = rw.a((Context) obj, resourceId, (TypedValue) obj2, i5, hsVar, true, false);
                    }
                }
                if (typefaceA != null) {
                    if (this.l != -1) {
                        this.b = Typeface.create(Typeface.create(typefaceA, 0), this.l, (this.a & 2) != 0);
                    } else {
                        this.b = typefaceA;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (strL = zwVar.l(i2)) != null) {
            if (this.l != -1) {
                this.b = Typeface.create(Typeface.create(strL, 0), this.l, (2 & this.a) != 0);
            } else {
                this.b = Typeface.create(strL, this.a);
            }
        }
        return true;
    }

    final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            g(compoundDrawables[0], this.e);
            g(compoundDrawables[1], this.f);
            g(compoundDrawables[2], this.g);
            g(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        g(compoundDrawablesRelative[0], this.i);
        g(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu.c(android.util.AttributeSet, int):void");
    }

    final void d(Context context, int i) {
        zw zwVarP = zw.p(context, i, dp.w);
        if (zwVarP.o(14)) {
            e(zwVarP.n(14, false));
        }
        if (zwVarP.o(0) && zwVarP.c(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zI = i(context, zwVarP);
        zwVarP.m();
        h(zI);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }
}
