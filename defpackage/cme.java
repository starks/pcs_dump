package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cme implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cme(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.b != 0) {
            ((CoordinatorLayout) this.a).i(0);
            return true;
        }
        cml cmlVar = (cml) this.a;
        float rotation = cmlVar.D.getRotation();
        if (cmlVar.z != rotation) {
            cmlVar.z = rotation;
        }
        return true;
    }
}
