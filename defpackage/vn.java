package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class vn extends vm {
    static {
        vs.m(WindowInsets.CONSUMED);
    }

    public vn(vs vsVar, WindowInsets windowInsets) {
        super(vsVar, windowInsets);
    }

    @Override // defpackage.vj, defpackage.vp
    public rz a(int i) {
        return rz.d(this.a.getInsets(vq.a(i)));
    }

    @Override // defpackage.vj, defpackage.vp
    public final void e(View view) {
    }
}
