package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agc extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public agc(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.i;
        int iAbs = swipeRefreshLayout.f - Math.abs(swipeRefreshLayout.e);
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        this.a.j((swipeRefreshLayout2.d + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout2.c.getTop());
        this.a.g.c(1.0f - f);
    }
}
