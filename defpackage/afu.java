package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public afu(afx afxVar, afw afwVar, int i) {
        this.c = i;
        this.b = afxVar;
        this.a = afwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            afx.e(fFloatValue, (afw) this.a);
            ((afx) this.b).a(fFloatValue, (afw) this.a, false);
            ((afx) this.b).invalidateSelf();
            return;
        }
        if (i == 1) {
            ((View) ((C0000do) ((fuu) this.a).a).c.getParent()).invalidate();
            return;
        }
        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((coa) this.b).l(fFloatValue2);
        AppBarLayout appBarLayout = (AppBarLayout) this.a;
        Drawable drawable = appBarLayout.h;
        if (drawable instanceof coa) {
            ((coa) drawable).l(fFloatValue2);
        }
        Iterator it = appBarLayout.g.iterator();
        while (it.hasNext()) {
            ((cjv) it.next()).a();
        }
    }

    public /* synthetic */ afu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
