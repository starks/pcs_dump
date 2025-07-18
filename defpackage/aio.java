package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aio extends Drawable.ConstantState {
    int a;
    ain b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public aio() {
        this.c = null;
        this.d = aiq.a;
        this.b = new ain();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        ain ainVar = this.b;
        ainVar.a(ainVar.d, ain.a, canvas, i, i2);
    }

    public final boolean b() {
        ain ainVar = this.b;
        if (ainVar.k == null) {
            ainVar.k = Boolean.valueOf(ainVar.d.k());
        }
        return ainVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new aiq(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new aiq(this);
    }

    public aio(aio aioVar) {
        this.c = null;
        this.d = aiq.a;
        if (aioVar != null) {
            this.a = aioVar.a;
            this.b = new ain(aioVar.b);
            Paint paint = aioVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = aioVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = aioVar.c;
            this.d = aioVar.d;
            this.e = aioVar.e;
        }
    }
}
