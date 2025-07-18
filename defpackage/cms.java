package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.text.LineBreakConfig;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cms {
    private final RectF A;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private Typeface L;
    private CharSequence M;
    private boolean N;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private int U;
    private int V;
    private boolean W;
    private final TextPaint X;
    private final TextPaint Y;
    private TimeInterpolator Z;
    public final View a;
    private TimeInterpolator aa;
    private float ab;
    private float ac;
    private float ad;
    private ColorStateList ae;
    private float af;
    private float ag;
    private float ah;
    private ColorStateList ai;
    private float aj;
    private float ak;
    private float al;
    private StaticLayout am;
    private float an;
    private float ao;
    private float ap;
    private CharSequence aq;
    private boolean as;
    public float b;
    public boolean c;
    public float d;
    public int e;
    public ColorStateList f;
    public ColorStateList g;
    public int h;
    public Typeface i;
    public Typeface j;
    public Typeface k;
    public Typeface l;
    public Typeface m;
    public Typeface n;
    public CharSequence p;
    public int[] q;
    public ceg u;
    public ceg v;
    public vr w;
    private float x;
    private final Rect y;
    private final Rect z;
    private int B = 16;
    private int C = 16;
    private float D = 15.0f;
    private float E = 15.0f;
    public TextUtils.TruncateAt o = TextUtils.TruncateAt.END;
    private boolean O = true;
    public int r = 1;
    private final int ar = 1;
    public float s = 1.0f;
    public int t = 1;

    public cms(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.X = textPaint;
        this.Y = new TextPaint(textPaint);
        this.z = new Rect();
        this.y = new Rect();
        this.A = new RectF();
        this.d = w();
        e(view.getContext().getResources().getConfiguration());
    }

    private final void A() {
        float f;
        float f2 = this.b;
        if (this.c) {
            this.A.set(f2 < this.d ? this.y : this.z);
        } else {
            this.A.left = x(this.y.left, this.z.left, f2, this.Z);
            this.A.top = x(this.F, this.G, f2, this.Z);
            this.A.right = x(this.y.right, this.z.right, f2, this.Z);
            this.A.bottom = x(this.y.bottom, this.z.bottom, f2, this.Z);
        }
        if (!this.c) {
            this.J = x(this.H, this.I, f2, this.Z);
            this.K = x(this.F, this.G, f2, this.Z);
            C(f2);
            f = f2;
        } else if (f2 < this.d) {
            this.J = this.H;
            this.K = this.F;
            C(0.0f);
            f = 0.0f;
        } else {
            this.J = this.I;
            this.K = this.G - Math.max(0, this.e);
            C(1.0f);
            f = 1.0f;
        }
        this.ao = 1.0f - x(0.0f, 1.0f, 1.0f - f2, cjl.b);
        this.a.postInvalidateOnAnimation();
        this.ap = x(1.0f, 0.0f, f2, cjl.b);
        this.a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.g;
        ColorStateList colorStateList2 = this.f;
        if (colorStateList != colorStateList2) {
            this.X.setColor(y(z(colorStateList2), c(), f));
        } else {
            this.X.setColor(c());
        }
        float f3 = this.aj;
        float f4 = this.ak;
        if (f3 != f4) {
            this.X.setLetterSpacing(x(f4, f3, f2, cjl.b));
        } else {
            this.X.setLetterSpacing(f3);
        }
        this.R = x(this.af, this.ab, f2, null);
        this.S = x(this.ag, this.ac, f2, null);
        this.T = x(this.ah, this.ad, f2, null);
        int iY = y(z(this.ai), z(this.ae), f2);
        this.U = iY;
        this.X.setShadowLayer(this.R, this.S, this.T, iY);
        if (this.c) {
            int alpha = this.X.getAlpha();
            float f5 = this.d;
            this.X.setAlpha((int) ((f2 <= f5 ? cjl.a(1.0f, 0.0f, this.x, f5, f2) : cjl.a(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
            TextPaint textPaint = this.X;
            textPaint.setShadowLayer(this.R, this.S, this.T, clq.g(this.U, textPaint.getAlpha()));
        }
        this.a.postInvalidateOnAnimation();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    private final void B(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        boolean z2;
        StaticLayout staticLayoutBuild;
        Layout.Alignment alignment;
        int i;
        Layout.Alignment alignment2;
        if (this.p == null) {
            return;
        }
        float fWidth = this.z.width();
        float fWidth2 = this.y.width();
        if (D(f, 1.0f)) {
            f2 = G() ? this.E : this.D;
            f3 = G() ? this.aj : this.ak;
            this.P = G() ? 1.0f : x(this.D, this.E, f, this.aa) / this.D;
            if (true != G()) {
                fWidth = fWidth2;
            }
            typeface = this.i;
            fWidth2 = fWidth;
        } else {
            float f4 = this.D;
            float f5 = this.ak;
            typeface = this.l;
            if (D(f, 0.0f)) {
                this.P = 1.0f;
            } else {
                this.P = x(this.D, this.E, f, this.aa) / this.D;
            }
            float f6 = this.E / this.D;
            float f7 = fWidth2 * f6;
            if (!z && !this.c && f7 > fWidth && G()) {
                fWidth2 = Math.min(fWidth / f6, fWidth2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i2 = f < 0.5f ? this.r : 1;
        if (fWidth2 > 0.0f) {
            float f8 = this.Q;
            float f9 = this.al;
            Typeface typeface2 = this.L;
            StaticLayout staticLayout = this.am;
            z2 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.V == i2 && !this.W) ? false : true;
            this.Q = f2;
            this.al = f3;
            this.L = typeface;
            this.W = false;
            this.V = i2;
            this.X.setLinearText(this.P != 1.0f);
        } else {
            z2 = false;
        }
        if (this.M == null || z2) {
            this.X.setTextSize(this.Q);
            this.X.setTypeface(this.L);
            this.X.setLetterSpacing(this.al);
            CharSequence charSequence = this.p;
            boolean z3 = this.a.getLayoutDirection() == 1;
            ?? A = z3;
            if (this.O) {
                td tdVar = z3 ? ti.b : ti.a;
                int length = charSequence.length();
                if (charSequence == null || length < 0 || charSequence.length() - length < 0) {
                    throw new IllegalArgumentException();
                }
                tg tgVar = (tg) tdVar;
                int iA = tgVar.a.a(charSequence, length);
                A = iA != 0 ? iA != 1 ? tgVar.a() : 0 : 1;
            }
            this.N = A;
            if (true != F()) {
                i2 = 1;
            }
            TextPaint textPaint = this.X;
            CharSequence charSequence2 = this.p;
            float f10 = fWidth2 * (G() ? 1.0f : this.P);
            try {
                if (i2 == 1) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    i = 1;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.B, A) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        alignment = this.N ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        if (this.N) {
                        }
                    }
                    Layout.Alignment alignment3 = alignment;
                    i = i2;
                    alignment2 = alignment3;
                }
                cna cnaVar = new cna(charSequence2, textPaint, (int) f10);
                cnaVar.k = this.o;
                cnaVar.j = A;
                cnaVar.e = alignment2;
                cnaVar.i = false;
                cnaVar.f = i;
                cnaVar.g = this.s;
                cnaVar.h = this.t;
                cnaVar.l = this.w;
                if (cnaVar.a == null) {
                    cnaVar.a = "";
                }
                int iMax = Math.max(0, cnaVar.c);
                CharSequence charSequenceEllipsize = cnaVar.a;
                if (cnaVar.f == 1) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, cnaVar.b, iMax, cnaVar.k);
                }
                cnaVar.d = Math.min(charSequenceEllipsize.length(), cnaVar.d);
                if (cnaVar.j && cnaVar.f == 1) {
                    cnaVar.e = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, cnaVar.d, cnaVar.b, iMax);
                builderObtain.setAlignment(cnaVar.e);
                builderObtain.setIncludePad(cnaVar.i);
                builderObtain.setTextDirection(cnaVar.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                TextUtils.TruncateAt truncateAt = cnaVar.k;
                if (truncateAt != null) {
                    builderObtain.setEllipsize(truncateAt);
                }
                builderObtain.setMaxLines(cnaVar.f);
                float f11 = cnaVar.g;
                if (f11 != 1.0f) {
                    builderObtain.setLineSpacing(0.0f, f11);
                }
                if (cnaVar.f > 1) {
                    builderObtain.setHyphenationFrequency(cnaVar.h);
                }
                if (cnaVar.l != null) {
                    builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakWordStyle(1).build());
                }
                staticLayoutBuild = builderObtain.build();
            } catch (cmz e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutBuild = null;
            }
            un.y(staticLayoutBuild);
            this.am = staticLayoutBuild;
            this.M = staticLayoutBuild.getText();
        }
    }

    private final void C(float f) {
        B(f, false);
        this.a.postInvalidateOnAnimation();
    }

    private static boolean D(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private static boolean E(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean F() {
        if (this.r <= 1) {
            return false;
        }
        return !this.N || this.c;
    }

    private final boolean G() {
        return true;
    }

    private static final float H(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private final float w() {
        float f = this.x;
        return f + ((1.0f - f) * 0.5f);
    }

    private static float x(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = cjl.a;
        return f + (f3 * (f2 - f));
    }

    private static int y(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int z(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.q;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float a() {
        TextPaint textPaint = this.Y;
        textPaint.setTextSize(this.E);
        textPaint.setTypeface(this.i);
        textPaint.setLetterSpacing(this.aj);
        return (-this.Y.ascent()) + this.Y.descent();
    }

    public final float b() {
        TextPaint textPaint = this.Y;
        textPaint.setTextSize(this.D);
        textPaint.setTypeface(this.l);
        textPaint.setLetterSpacing(this.ak);
        return (-this.Y.ascent()) + this.Y.descent();
    }

    public final int c() {
        return z(this.g);
    }

    public final void d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.M == null || this.A.width() <= 0.0f || this.A.height() <= 0.0f) {
            return;
        }
        this.X.setTextSize(this.Q);
        float f = this.J;
        float f2 = this.K;
        float f3 = this.P;
        if (f3 != 1.0f && !this.c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (F() && G() && (!this.c || this.b > this.d)) {
            float lineStart = this.J - this.am.getLineStart(0);
            int alpha = this.X.getAlpha();
            canvas.translate(lineStart, f2);
            if (!this.c) {
                this.X.setAlpha((int) (this.ap * alpha));
                TextPaint textPaint = this.X;
                textPaint.setShadowLayer(this.R, this.S, this.T, clq.g(this.U, textPaint.getAlpha()));
                this.am.draw(canvas);
            }
            if (!this.c) {
                this.X.setAlpha((int) (this.ao * alpha));
            }
            TextPaint textPaint2 = this.X;
            textPaint2.setShadowLayer(this.R, this.S, this.T, clq.g(this.U, textPaint2.getAlpha()));
            int lineBaseline = this.am.getLineBaseline(0);
            CharSequence charSequence = this.aq;
            float f4 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.X);
            this.X.setShadowLayer(this.R, this.S, this.T, this.U);
            if (!this.c) {
                String strTrim = this.aq.toString().trim();
                if (strTrim.endsWith("…")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                this.X.setAlpha(alpha);
                canvas.drawText(strTrim, 0, Math.min(this.am.getLineEnd(0), strTrim.length()), 0.0f, f4, (Paint) this.X);
            }
        } else {
            canvas.translate(f, f2);
            this.am.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public final void e(Configuration configuration) {
        Typeface typeface = this.k;
        if (typeface != null) {
            this.j = cnx.e(configuration, typeface);
        }
        Typeface typeface2 = this.n;
        if (typeface2 != null) {
            this.m = cnx.e(configuration, typeface2);
        }
        Typeface typeface3 = this.j;
        if (typeface3 == null) {
            typeface3 = this.k;
        }
        this.i = typeface3;
        Typeface typeface4 = this.m;
        if (typeface4 == null) {
            typeface4 = this.n;
        }
        this.l = typeface4;
        g(true);
    }

    public final void f() {
        g(false);
    }

    public final void g(boolean z) {
        float fH;
        StaticLayout staticLayout;
        if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        B(1.0f, z);
        CharSequence charSequenceEllipsize = this.M;
        if (charSequenceEllipsize != null && (staticLayout = this.am) != null) {
            if (G()) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.X, staticLayout.getWidth(), this.o);
            }
            this.aq = charSequenceEllipsize;
        }
        CharSequence charSequence = this.aq;
        if (charSequence != null) {
            this.an = H(this.X, charSequence);
        } else {
            this.an = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.C, this.N ? 1 : 0);
        int i = absoluteGravity & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        if (i == 48) {
            this.G = this.z.top;
        } else if (i != 80) {
            TextPaint textPaint = this.X;
            this.G = this.z.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.G = this.z.bottom + this.X.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.I = this.z.centerX() - (this.an / 2.0f);
        } else if (i2 != 5) {
            this.I = this.z.left;
        } else {
            this.I = this.z.right - this.an;
        }
        B(0.0f, z);
        float height = this.am != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.am;
        if (staticLayout2 == null || this.r <= 1) {
            CharSequence charSequence2 = this.M;
            fH = charSequence2 != null ? H(this.X, charSequence2) : 0.0f;
        } else {
            fH = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.am;
        this.h = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.B, this.N ? 1 : 0);
        int i3 = absoluteGravity2 & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM;
        if (i3 == 48) {
            this.F = this.y.top;
        } else if (i3 != 80) {
            this.F = this.y.centerY() - (height / 2.0f);
        } else {
            this.F = (this.y.bottom - height) + (this.as ? this.X.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.H = this.y.centerX() - (fH / 2.0f);
        } else if (i4 != 5) {
            this.H = this.y.left;
        } else {
            this.H = this.y.right - fH;
        }
        C(this.b);
        A();
    }

    public final void h(int i, int i2, int i3, int i4) {
        if (E(this.z, i, i2, i3, i4)) {
            return;
        }
        this.z.set(i, i2, i3, i4);
        this.W = true;
    }

    public final void i(int i) {
        cno cnoVar = new cno(this.a.getContext(), i);
        ColorStateList colorStateList = cnoVar.i;
        if (colorStateList != null) {
            this.g = colorStateList;
        }
        float f = cnoVar.j;
        if (f != 0.0f) {
            this.E = f;
        }
        ColorStateList colorStateList2 = cnoVar.a;
        if (colorStateList2 != null) {
            this.ae = colorStateList2;
        }
        this.ac = cnoVar.e;
        this.ad = cnoVar.f;
        this.ab = cnoVar.g;
        this.aj = cnoVar.h;
        ceg cegVar = this.v;
        if (cegVar != null) {
            cegVar.d();
        }
        this.v = new ceg(new cmr(this, 1), cnoVar.a());
        cnoVar.c(this.a.getContext(), this.v);
        f();
    }

    public final void j(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            f();
        }
    }

    public final void k(int i) {
        if (this.C != i) {
            this.C = i;
            f();
        }
    }

    public final void l(int i, int i2, int i3, int i4, boolean z) {
        if (E(this.y, i, i2, i3, i4) && z == this.as) {
            return;
        }
        this.y.set(i, i2, i3, i4);
        this.W = true;
        this.as = z;
    }

    public final void m(int i) {
        if (i != this.r) {
            this.r = i;
            f();
        }
    }

    public final void n(int i) {
        cno cnoVar = new cno(this.a.getContext(), i);
        ColorStateList colorStateList = cnoVar.i;
        if (colorStateList != null) {
            this.f = colorStateList;
        }
        float f = cnoVar.j;
        if (f != 0.0f) {
            this.D = f;
        }
        ColorStateList colorStateList2 = cnoVar.a;
        if (colorStateList2 != null) {
            this.ai = colorStateList2;
        }
        this.ag = cnoVar.e;
        this.ah = cnoVar.f;
        this.af = cnoVar.g;
        this.ak = cnoVar.h;
        ceg cegVar = this.u;
        if (cegVar != null) {
            cegVar.d();
        }
        this.u = new ceg(new cmr(this, 0), cnoVar.a());
        cnoVar.c(this.a.getContext(), this.u);
        f();
    }

    public final void o(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            f();
        }
    }

    public final void p(int i) {
        if (this.B != i) {
            this.B = i;
            f();
        }
    }

    public final void q(float f) {
        float fG = un.G(f, 1.0f);
        if (fG != this.b) {
            this.b = fG;
            A();
        }
    }

    public final void r(float f) {
        this.x = f;
        this.d = w();
    }

    public final void s(TimeInterpolator timeInterpolator) {
        this.Z = timeInterpolator;
        f();
    }

    public final void t(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.p, charSequence)) {
            this.p = charSequence;
            this.M = null;
            f();
        }
    }

    public final void u(TimeInterpolator timeInterpolator) {
        this.aa = timeInterpolator;
        f();
    }

    public final void v() {
        this.O = false;
    }
}
