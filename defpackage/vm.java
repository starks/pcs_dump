package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class vm extends vl {
    private rz d;
    private rz g;
    private rz h;

    public vm(vs vsVar, WindowInsets windowInsets) {
        super(vsVar, windowInsets);
        this.d = null;
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.vj, defpackage.vp
    public vs d(int i, int i2, int i3, int i4) {
        return vs.m(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.vp
    public rz r() {
        if (this.g == null) {
            this.g = rz.d(this.a.getMandatorySystemGestureInsets());
        }
        return this.g;
    }

    @Override // defpackage.vp
    public rz s() {
        if (this.d == null) {
            this.d = rz.d(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override // defpackage.vp
    public rz t() {
        if (this.h == null) {
            this.h = rz.d(this.a.getTappableElementInsets());
        }
        return this.h;
    }
}
