package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blf extends bky {
    final /* synthetic */ blg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blf(blg blgVar, int i, Bundle bundle) {
        super(blgVar, i, bundle);
        this.g = blgVar;
    }

    @Override // defpackage.bky
    protected final void a(bho bhoVar) {
        this.g.g.a(bhoVar);
        blg.F(bhoVar);
    }

    @Override // defpackage.bky
    protected final boolean c() {
        this.g.g.a(bho.a);
        return true;
    }
}
