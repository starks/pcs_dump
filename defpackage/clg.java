package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class clg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ clg(cli cliVar, int i) {
        this.b = i;
        this.a = cliVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            cli cliVar = (cli) this.a;
            cliVar.l.setAlpha((int) (255.0f * fFloatValue));
            cliVar.t = fFloatValue;
            return;
        }
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        ((ir) this.a).b.setAlpha(iFloatValue);
        ((ir) this.a).c.setAlpha(iFloatValue);
        ((ir) this.a).b();
    }

    public clg(ir irVar, int i) {
        this.b = i;
        this.a = irVar;
    }
}
