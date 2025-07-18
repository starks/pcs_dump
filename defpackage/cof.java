package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cof {
    public static final cnv a = new coc(0.5f);
    public cnv b;
    cnv c;
    public cnv d;
    public cnv e;
    cnx f;
    cnx g;
    cnx h;
    cnx i;
    public cnx j;
    public cnx k;
    public cnx l;
    public cnx m;

    public cof() {
        this.j = new cod();
        this.k = new cod();
        this.l = new cod();
        this.m = new cod();
        this.b = new cns(0.0f);
        this.c = new cns(0.0f);
        this.d = new cns(0.0f);
        this.e = new cns(0.0f);
        this.f = new cnx();
        this.g = new cnx();
        this.h = new cnx();
        this.i = new cnx();
    }

    public static cnv a(TypedArray typedArray, int i, cnv cnvVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new cns(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new coc(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cnvVar;
    }

    public static coe b(Context context, int i, int i2, cnv cnvVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(cob.b);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            cnv cnvVarA = a(typedArrayObtainStyledAttributes, 5, cnvVar);
            cnv cnvVarA2 = a(typedArrayObtainStyledAttributes, 8, cnvVarA);
            cnv cnvVarA3 = a(typedArrayObtainStyledAttributes, 9, cnvVarA);
            cnv cnvVarA4 = a(typedArrayObtainStyledAttributes, 7, cnvVarA);
            cnv cnvVarA5 = a(typedArrayObtainStyledAttributes, 6, cnvVarA);
            coe coeVar = new coe();
            coeVar.h(cnx.f(i4));
            coeVar.a = cnvVarA2;
            coeVar.i(cnx.f(i5));
            coeVar.b = cnvVarA3;
            coeVar.g(cnx.f(i6));
            coeVar.c = cnvVarA4;
            coeVar.f(cnx.f(i7));
            coeVar.d = cnvVarA5;
            return coeVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static coe c(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new cns(0.0f));
    }

    public static coe d(Context context, AttributeSet attributeSet, int i, int i2, cnv cnvVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cob.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, cnvVar);
    }

    public final boolean e() {
        return (this.k instanceof cod) && (this.j instanceof cod) && (this.l instanceof cod) && (this.m instanceof cod);
    }

    public final boolean f(RectF rectF) {
        boolean z = this.i.getClass().equals(cnx.class) && this.g.getClass().equals(cnx.class) && this.f.getClass().equals(cnx.class) && this.h.getClass().equals(cnx.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final String toString() {
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(this.c) + ", " + String.valueOf(this.d) + ", " + String.valueOf(this.e) + "]";
    }

    public cof(coe coeVar) {
        this.j = coeVar.i;
        this.k = coeVar.j;
        this.l = coeVar.k;
        this.m = coeVar.l;
        this.b = coeVar.a;
        this.c = coeVar.b;
        this.d = coeVar.c;
        this.e = coeVar.d;
        this.f = coeVar.e;
        this.g = coeVar.f;
        this.h = coeVar.g;
        this.i = coeVar.h;
    }
}
