package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.StateSet;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class coa extends Drawable implements cor {
    public static final /* synthetic */ int k = 0;
    private static final String l = "coa";
    private static final Paint m;
    private static final cnz[] n;
    private PorterDuffColorFilter A;
    private final RectF B;
    private boolean C;
    private cof D;
    private xl E;
    private float[] F;
    private final fuu G;
    private final fuu H;
    public cny a;
    public final cop[] b;
    public final cop[] c;
    public final BitSet d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    xk[] i;
    public float[] j;
    private final Matrix o;
    private final Path p;
    private final Path q;
    private final RectF r;
    private final RectF s;
    private final Region t;
    private final Region u;
    private final Paint v;
    private final Paint w;
    private final cnr x;
    private final coi y;
    private PorterDuffColorFilter z;

    static {
        coe coeVar = new coe();
        int i = 0;
        cnx cnxVarF = cnx.f(0);
        coeVar.h(cnxVarF);
        coeVar.i(cnxVarF);
        coeVar.g(cnxVarF);
        coeVar.f(cnxVarF);
        coeVar.a(0.0f);
        Paint paint = new Paint(1);
        m = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        n = new cnz[4];
        while (true) {
            cnz[] cnzVarArr = n;
            int length = cnzVarArr.length;
            if (i >= 4) {
                return;
            }
            cnzVarArr[i] = new cnz(i);
            i++;
        }
    }

    public coa() {
        this(new cof());
    }

    private final void A(int[] iArr, boolean z) {
        boolean z2;
        RectF rectFH = h();
        if (this.a.w == null || rectFH.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.E == null);
        if (this.j == null) {
            this.j = new float[4];
        }
        err errVar = this.a.w;
        int iA = errVar.a(iArr);
        if (iA < 0) {
            iA = errVar.a(StateSet.WILD_CARD);
        }
        cof cofVar = ((cof[]) errVar.b)[iA];
        for (int i = 0; i < 4; i++) {
            float fA = coi.a(i, cofVar).a(rectFH);
            if (z3) {
                this.j[i] = fA;
                z2 = true;
            } else {
                z2 = false;
            }
            xk xkVar = this.i[i];
            if (xkVar != null) {
                xkVar.d(fA);
                if (z2) {
                    xk xkVar2 = this.i[i];
                    if (xkVar2.r.b <= 0.0d) {
                        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
                    }
                    if (!wx.a().b()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (xkVar2.l) {
                        xkVar2.s = true;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    private final boolean B() {
        return (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.STROKE) && this.w.getStrokeWidth() > 0.0f;
    }

    private final boolean C(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.d != null && color2 != (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.v.getColor())))) {
            this.v.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.w.getColor())))) {
            return z;
        }
        this.w.setColor(colorForState);
        return true;
    }

    private final boolean D() {
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        cny cnyVar = this.a;
        this.z = w(cnyVar.g, cnyVar.h, this.v, true);
        cny cnyVar2 = this.a;
        ColorStateList colorStateList = cnyVar2.f;
        this.A = w(null, cnyVar2.h, this.w, false);
        boolean z = this.a.u;
        return (Objects.equals(porterDuffColorFilter, this.z) && Objects.equals(porterDuffColorFilter2, this.A)) ? false : true;
    }

    private static final float E(RectF rectF, cof cofVar, float[] fArr) {
        if (fArr == null) {
            if (cofVar.f(rectF)) {
                return cofVar.b.a(rectF);
            }
            return -1.0f;
        }
        if (cnx.o(fArr) && cofVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private static int v(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter w(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = g(colorForState);
            }
            this.g = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int iG = g(color);
            this.g = iG;
            if (iG != color) {
                return new PorterDuffColorFilter(iG, PorterDuff.Mode.SRC_IN);
            }
        }
        return null;
    }

    private final RectF x() {
        this.s.set(h());
        RectF rectF = this.s;
        float fB = b();
        rectF.inset(fB, fB);
        return this.s;
    }

    private final void y(RectF rectF, Path path) {
        cny cnyVar = this.a;
        this.y.b(cnyVar.a, this.j, cnyVar.k, rectF, this.G, path);
        if (this.a.j != 1.0f) {
            this.o.reset();
            Matrix matrix = this.o;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.o);
        }
        path.computeBounds(this.B, true);
    }

    private final void z(Canvas canvas, Paint paint, Path path, cof cofVar, float[] fArr, RectF rectF) {
        float fE = E(rectF, cofVar, fArr);
        if (fE < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fE * this.a.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final float a() {
        return this.a.o;
    }

    public final float b() {
        if (B()) {
            return this.w.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        float[] fArr = this.j;
        return fArr != null ? fArr[3] : this.a.a.b.a(h());
    }

    @Override // defpackage.cor
    public final void d(cof cofVar) {
        cny cnyVar = this.a;
        cnyVar.a = cofVar;
        cnyVar.w = null;
        this.j = null;
        this.F = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.v.setColorFilter(this.z);
        int alpha = this.v.getAlpha();
        this.v.setAlpha(v(alpha, this.a.m));
        this.w.setColorFilter(this.A);
        this.w.setStrokeWidth(this.a.l);
        int alpha2 = this.w.getAlpha();
        this.w.setAlpha(v(alpha2, this.a.m));
        if (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.FILL) {
            if (this.e) {
                y(h(), this.p);
                this.e = false;
            }
            cny cnyVar = this.a;
            int i = cnyVar.q;
            if (cnyVar.r > 0 && !s()) {
                this.p.isConvex();
            }
            z(canvas, this.v, this.p, this.a.a, this.j, h());
        }
        if (B()) {
            if (this.f) {
                cof cofVarI = i();
                fuu fuuVar = this.H;
                coe coeVar = new coe(cofVarI);
                coeVar.a = fuuVar.i(cofVarI.b);
                coeVar.b = fuuVar.i(cofVarI.c);
                coeVar.d = fuuVar.i(cofVarI.e);
                coeVar.c = fuuVar.i(cofVarI.d);
                this.D = new cof(coeVar);
                if (this.j != null) {
                    if (this.F == null) {
                        this.F = new float[4];
                    }
                    float fB = b();
                    int i2 = 0;
                    while (true) {
                        float[] fArr = this.j;
                        int length = fArr.length;
                        if (i2 >= 4) {
                            break;
                        }
                        this.F[i2] = Math.max(0.0f, fArr[i2] - fB);
                        i2++;
                    }
                } else {
                    this.F = null;
                }
                this.y.b(this.D, this.F, this.a.k, x(), null, this.q);
                this.f = false;
            }
            z(canvas, this.w, this.q, this.D, this.F, x());
        }
        this.v.setAlpha(alpha);
        this.w.setAlpha(alpha2);
    }

    public final float e() {
        float[] fArr = this.j;
        return fArr != null ? fArr[0] : this.a.a.c.a(h());
    }

    public final float f() {
        float fA = a();
        float f = this.a.p;
        return fA + 0.0f;
    }

    protected final int g(int i) {
        float f = f();
        cny cnyVar = this.a;
        float f2 = f + cnyVar.n;
        clr clrVar = cnyVar.b;
        return clrVar != null ? clrVar.a(i, f2) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i = this.a.q;
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fE = E(rectFH, this.a.a, this.j);
        if (fE >= 0.0f) {
            outline.setRoundRect(getBounds(), fE * this.a.k);
            return;
        }
        if (this.e) {
            y(rectFH, this.p);
            this.e = false;
        }
        clq.a(outline, this.p);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.t.set(getBounds());
        y(h(), this.p);
        this.u.setPath(this.p, this.t);
        this.t.op(this.u, Region.Op.DIFFERENCE);
        return this.t;
    }

    public final RectF h() {
        this.r.set(getBounds());
        return this.r;
    }

    public final cof i() {
        return this.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        this.f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        cny cnyVar = this.a;
        ColorStateList colorStateList2 = cnyVar.f;
        ColorStateList colorStateList3 = cnyVar.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.a.d;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        err errVar = this.a.w;
        return errVar != null && errVar.a > 1;
    }

    public final void j(Context context) {
        this.a.b = new clr(context);
        r();
    }

    public final void k(xl xlVar) {
        if (this.E == xlVar) {
            return;
        }
        this.E = xlVar;
        int i = 0;
        while (true) {
            xk[] xkVarArr = this.i;
            int length = xkVarArr.length;
            if (i >= 4) {
                A(getState(), true);
                invalidateSelf();
                return;
            }
            if (xkVarArr[i] == null) {
                xkVarArr[i] = new xk(this, n[i]);
            }
            xk xkVar = this.i[i];
            xl xlVar2 = new xl();
            xlVar2.c((float) xlVar.b);
            double d = xlVar.a;
            xlVar2.e((float) (d * d));
            xkVar.r = xlVar2;
            i++;
        }
    }

    public final void l(float f) {
        cny cnyVar = this.a;
        if (cnyVar.o != f) {
            cnyVar.o = f;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        cny cnyVar = this.a;
        if (cnyVar.d != colorStateList) {
            cnyVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new cny(this.a);
        return this;
    }

    public final void n(float f) {
        cny cnyVar = this.a;
        if (cnyVar.k != f) {
            cnyVar.k = f;
            this.e = true;
            this.f = true;
            invalidateSelf();
        }
    }

    public final void o(float f, ColorStateList colorStateList) {
        q(f);
        p(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        this.f = true;
        super.onBoundsChange(rect);
        if (this.a.w != null && !rect.isEmpty()) {
            A(getState(), this.C);
        }
        this.C = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.a.w != null) {
            A(iArr, false);
        }
        boolean z = C(iArr) || D();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(ColorStateList colorStateList) {
        cny cnyVar = this.a;
        if (cnyVar.e != colorStateList) {
            cnyVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void q(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final void r() {
        float f = f();
        this.a.r = (int) Math.ceil(0.75f * f);
        this.a.s = (int) Math.ceil(f * 0.25f);
        D();
        super.invalidateSelf();
    }

    public final boolean s() {
        if (this.a.a.f(h())) {
            return true;
        }
        float[] fArr = this.j;
        return fArr != null && cnx.o(fArr) && this.a.a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        cny cnyVar = this.a;
        if (cnyVar.m != i) {
            cnyVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        cny cnyVar = this.a;
        if (cnyVar.h != mode) {
            cnyVar.h = mode;
            D();
            super.invalidateSelf();
        }
    }

    public final void t() {
        this.x.a(-12303292);
        this.a.u = false;
        super.invalidateSelf();
    }

    public final void u(err errVar) {
        cny cnyVar = this.a;
        if (cnyVar.w != errVar) {
            cnyVar.w = errVar;
            A(getState(), true);
            invalidateSelf();
        }
    }

    protected coa(cny cnyVar) {
        this.H = new fuu(this, null);
        this.b = new cop[4];
        this.c = new cop[4];
        this.d = new BitSet(8);
        this.o = new Matrix();
        this.p = new Path();
        this.q = new Path();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new Region();
        this.u = new Region();
        Paint paint = new Paint(1);
        this.v = paint;
        Paint paint2 = new Paint(1);
        this.w = paint2;
        this.x = new cnr();
        this.y = Looper.getMainLooper().getThread() == Thread.currentThread() ? cog.a : new coi();
        this.B = new RectF();
        this.h = true;
        this.C = true;
        this.i = new xk[4];
        this.a = cnyVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        D();
        C(getState());
        this.G = new fuu(this, null);
    }

    public coa(cof cofVar) {
        this(new cny(cofVar));
    }
}
