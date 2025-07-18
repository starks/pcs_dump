package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.as.oss.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cml {
    static final TimeInterpolator a = cjl.c;
    public static final int b = R.attr.motionDurationLong2;
    public static final int c = R.attr.motionEasingEmphasizedInterpolator;
    public static final int d = R.attr.motionDurationMedium1;
    public static final int e = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public int B;
    public final FloatingActionButton D;
    public ViewTreeObserver.OnPreDrawListener E;
    final fuu F;
    private final cmy G;
    public cof l;
    public coa m;
    public Drawable n;
    public clu o;
    public Drawable p;
    public boolean q;
    public float s;
    public float t;
    public float u;
    public int v;
    public Animator w;
    public cjo x;
    public cjo y;
    public float z;
    final boolean r = true;
    public float A = 1.0f;
    public int C = 0;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();

    public cml(FloatingActionButton floatingActionButton, fuu fuuVar) {
        this.D = floatingActionButton;
        this.F = fuuVar;
        cmy cmyVar = new cmy();
        this.G = cmyVar;
        cmyVar.a(f, q(new cmh(this)));
        cmyVar.a(g, q(new cmg(this)));
        cmyVar.a(h, q(new cmg(this)));
        cmyVar.a(i, q(new cmg(this)));
        cmyVar.a(j, q(new cmj(this)));
        cmyVar.a(k, q(new cmf(this)));
        this.z = floatingActionButton.getRotation();
    }

    private static final ValueAnimator q(cmk cmkVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(cmkVar);
        valueAnimator.addUpdateListener(cmkVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float a() {
        return this.s;
    }

    public final int b() {
        if (this.q) {
            return Math.max((this.v - this.D.b()) / 2, 0);
        }
        return 0;
    }

    public final AnimatorSet c(cjo cjoVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.D, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        cjoVar.b("opacity").b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.D, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        cjoVar.b("scale").b(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.D, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        cjoVar.b("scale").b(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        e(f4, this.K);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.D, new cjm(), new cmc(this), new Matrix(this.K));
        cjoVar.b("iconScale").b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        clq.l(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet d(float f2, float f3, float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new cmd(this, this.D.getAlpha(), f2, this.D.getScaleX(), f3, this.D.getScaleY(), this.A, f4, new Matrix(this.K)));
        arrayList.add(valueAnimatorOfFloat);
        clq.l(animatorSet, arrayList);
        animatorSet.setDuration(cnx.k(this.D.getContext(), i2, this.D.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(cnx.n(this.D.getContext(), i3, cjl.b));
        return animatorSet;
    }

    public final void e(float f2, Matrix matrix) {
        matrix.reset();
        if (this.D.getDrawable() == null || this.B == 0) {
            return;
        }
        RectF rectF = this.I;
        RectF rectF2 = this.J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f3 = this.B;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.B / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public void f(Rect rect) {
        int iB = b();
        int iMax = Math.max(iB, (int) Math.ceil(a() + this.u));
        int iMax2 = Math.max(iB, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public void g(float f2, float f3, float f4) {
        throw null;
    }

    public final void h(float f2) {
        this.A = f2;
        Matrix matrix = this.K;
        e(f2, matrix);
        this.D.setImageMatrix(matrix);
    }

    public final void i(cof cofVar) {
        this.l = cofVar;
        coa coaVar = this.m;
        if (coaVar != null) {
            coaVar.d(cofVar);
        }
        clu cluVar = this.o;
        if (cluVar != null) {
            cluVar.h = cofVar;
            cluVar.invalidateSelf();
        }
    }

    public final void j() {
        h(this.A);
    }

    public final void k() {
        Rect rect = this.H;
        f(rect);
        un.z(this.p, "Didn't initialize content background");
        if (n()) {
            this.F.j(new InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.F.j(this.p);
        }
        fuu fuuVar = this.F;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        ((FloatingActionButton) fuuVar.a).c.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = (FloatingActionButton) fuuVar.a;
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public final void l(float f2) {
        coa coaVar = this.m;
        if (coaVar != null) {
            coaVar.l(f2);
        }
    }

    public boolean m() {
        throw null;
    }

    public boolean n() {
        return true;
    }

    public final boolean o() {
        return this.D.isLaidOut() && !this.D.isInEditMode();
    }

    final boolean p() {
        return !this.q || this.D.b() >= this.v;
    }
}
