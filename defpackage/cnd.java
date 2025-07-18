package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnd implements ua {
    final /* synthetic */ cnf a;
    final /* synthetic */ ckr b;

    public cnd(ckr ckrVar, cnf cnfVar) {
        this.b = ckrVar;
        this.a = cnfVar;
    }

    @Override // defpackage.ua
    public final vs a(View view, vs vsVar) {
        this.b.a(view, vsVar, new cnf(this.a));
        return vsVar;
    }
}
