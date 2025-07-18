package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agm extends ahd {
    boolean a = false;
    final ViewGroup b;

    public agm(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void a(ahc ahcVar) {
        this.b.suppressLayout(false);
        this.a = true;
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void b(ahc ahcVar) {
        if (!this.a) {
            this.b.suppressLayout(false);
        }
        ahcVar.F(this);
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void c() {
        this.b.suppressLayout(false);
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void d() {
        this.b.suppressLayout(true);
    }
}
