package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cli {
    public static final double a = Math.cos(Math.toRadians(45.0d));
    public static final Drawable b = null;
    public final MaterialCardView c;
    public final coa e;
    public final coa f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Drawable k;
    public Drawable l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public boolean s;
    private cof u;
    private coa v;
    private ValueAnimator w;
    private final TimeInterpolator x;
    private final int y;
    private final int z;
    public final Rect d = new Rect();
    public boolean r = false;
    public float t = 0.0f;

    public cli(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.c = materialCardView;
        coa coaVar = new coa(new cof(cof.c(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView)));
        this.e = coaVar;
        coaVar.j(materialCardView.getContext());
        coaVar.t();
        coe coeVar = new coe(coaVar.i());
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, clj.a, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            coeVar.a(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f = new coa();
        g(new cof(coeVar));
        this.x = cnx.n(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, cjl.a);
        this.y = cnx.k(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.z = cnx.k(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static final float n(cnx cnxVar, float f) {
        if (cnxVar instanceof cod) {
            return (float) ((1.0d - a) * f);
        }
        if (cnxVar instanceof cnw) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float fMax = Math.max(n(this.u.j, this.e.c()), n(this.u.k, this.e.e()));
        cnx cnxVar = this.u.l;
        coa coaVar = this.e;
        float[] fArr = coaVar.j;
        float fN = n(cnxVar, fArr != null ? fArr[1] : coaVar.a.a.d.a(coaVar.h()));
        cnx cnxVar2 = this.u.m;
        coa coaVar2 = this.e;
        float[] fArr2 = coaVar2.j;
        return Math.max(fMax, Math.max(fN, n(cnxVar2, fArr2 != null ? fArr2[2] : coaVar2.a.a.e.a(coaVar2.h()))));
    }

    public final float b() {
        return this.c.a() + (l() ? a() : 0.0f);
    }

    public final float c() {
        return (this.c.a() * 1.5f) + (l() ? a() : 0.0f);
    }

    public final Drawable d() {
        if (this.p == null) {
            this.v = new coa(this.u);
            this.p = new RippleDrawable(this.m, null, this.v);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.f, this.l});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable e(Drawable drawable) {
        int iCeil;
        int i;
        if (this.c.a) {
            int iCeil2 = (int) Math.ceil(c());
            iCeil = (int) Math.ceil(b());
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new clh(drawable, iCeil, i, iCeil, i);
    }

    public final void f(boolean z, boolean z2) {
        float f;
        Drawable drawable = this.l;
        if (drawable != null) {
            if (!z2) {
                f = true == z ? 1.0f : 0.0f;
                drawable.setAlpha(true == z ? AIFeature.Id.ROSIE_ROBOT_TRANSLATE : 0);
                this.t = f;
                return;
            }
            f = true == z ? 1.0f : 0.0f;
            float f2 = z ? 1.0f - this.t : this.t;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.t, f);
            this.w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new clg(this, 0));
            this.w.setInterpolator(this.x);
            this.w.setDuration((long) ((z ? this.y : this.z) * f2));
            this.w.start();
        }
    }

    public final void g(cof cofVar) {
        this.u = cofVar;
        this.e.d(cofVar);
        this.e.h = !r0.s();
        this.f.d(cofVar);
        coa coaVar = this.v;
        if (coaVar != null) {
            coaVar.d(cofVar);
        }
    }

    public final void h() {
        Drawable drawable = this.k;
        Drawable drawableD = m() ? d() : this.f;
        this.k = drawableD;
        if (drawable != drawableD) {
            if (this.c.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) this.c.getForeground()).setDrawable(drawableD);
            } else {
                this.c.setForeground(e(drawableD));
            }
        }
    }

    public final boolean i() {
        return this.e.s();
    }

    public final boolean j() {
        return (this.i & 80) == 80;
    }

    public final boolean k() {
        return (this.i & 8388613) == 8388613;
    }

    public final boolean l() {
        return this.c.b && i() && this.c.a;
    }

    public final boolean m() {
        if (this.c.isClickable()) {
            return true;
        }
        View view = this.c;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
