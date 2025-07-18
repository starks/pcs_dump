package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cs extends va {
    final /* synthetic */ de a;

    public cs(de deVar) {
        this.a = deVar;
    }

    @Override // defpackage.va, defpackage.uz
    public final void a() {
        this.a.o.setAlpha(1.0f);
        this.a.H.an(null);
        this.a.H = null;
    }

    @Override // defpackage.va, defpackage.uz
    public final void b() {
        this.a.o.setVisibility(0);
        if (this.a.o.getParent() instanceof View) {
            View view = (View) this.a.o.getParent();
            int[] iArr = ut.a;
            ul.b(view);
        }
    }
}
