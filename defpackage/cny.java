package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cny extends Drawable.ConstantState {
    public cof a;
    clr b;
    ColorFilter c;
    public ColorStateList d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    PorterDuff.Mode h;
    Rect i;
    float j;
    public float k;
    float l;
    int m;
    float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    Paint.Style v;
    err w;

    public cny(cny cnyVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = cnyVar.a;
        this.w = cnyVar.w;
        this.b = cnyVar.b;
        this.l = cnyVar.l;
        this.c = cnyVar.c;
        this.d = cnyVar.d;
        this.e = cnyVar.e;
        this.h = cnyVar.h;
        this.g = cnyVar.g;
        this.m = cnyVar.m;
        this.j = cnyVar.j;
        this.s = cnyVar.s;
        int i = cnyVar.q;
        this.q = 0;
        boolean z = cnyVar.u;
        this.u = false;
        this.k = cnyVar.k;
        this.n = cnyVar.n;
        this.o = cnyVar.o;
        float f = cnyVar.p;
        this.p = 0.0f;
        this.r = cnyVar.r;
        this.t = cnyVar.t;
        ColorStateList colorStateList = cnyVar.f;
        this.f = null;
        this.v = cnyVar.v;
        Rect rect = cnyVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        coa coaVar = new coa(this);
        coaVar.e = true;
        coaVar.f = true;
        return coaVar;
    }

    public cny(cof cofVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = cofVar;
        this.b = null;
    }
}
