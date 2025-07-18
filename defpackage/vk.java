package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class vk extends vj {
    private rz d;

    public vk(vs vsVar, WindowInsets windowInsets) {
        super(vsVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.vp
    public final rz l() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = rz.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.vp
    public vs m() {
        return vs.m(this.a.consumeStableInsets());
    }

    @Override // defpackage.vp
    public vs n() {
        return vs.m(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.vp
    public boolean o() {
        return this.a.isConsumed();
    }
}
