package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hk extends is {
    final /* synthetic */ ho a;
    final /* synthetic */ hr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(hr hrVar, View view, ho hoVar) {
        super(view);
        this.b = hrVar;
        this.a = hoVar;
    }

    @Override // defpackage.is
    public final fv a() {
        return this.a;
    }

    @Override // defpackage.is
    public final boolean b() {
        if (this.b.b.u()) {
            return true;
        }
        this.b.b();
        return true;
    }
}
