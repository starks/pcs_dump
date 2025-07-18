package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vo extends vn {
    static final vs d = vs.m(WindowInsets.CONSUMED);

    public vo(vs vsVar, WindowInsets windowInsets) {
        super(vsVar, windowInsets);
    }

    @Override // defpackage.vn, defpackage.vj, defpackage.vp
    public rz a(int i) {
        return rz.d(this.a.getInsets(vr.a(i)));
    }
}
