package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmy {
    private final ArrayList b = new ArrayList();
    public ValueAnimator a = null;
    private final Animator.AnimatorListener c = new cmx(this);

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        cnx cnxVar = new cnx();
        valueAnimator.addListener(this.c);
        this.b.add(cnxVar);
    }
}
