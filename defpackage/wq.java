package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wq implements Interpolator {
    final /* synthetic */ ws a;

    public wq(ws wsVar) {
        this.a = wsVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.e.getInterpolation(f);
    }
}
