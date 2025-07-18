package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brp implements brm {
    private final Context a;
    private final Executor b;
    private final String c;
    private final dxs d;
    private final dzi e;
    private final bws f;
    private final bqm g;
    private final csm h;
    private final bba i;

    public brp(Context context, Executor executor, String str, dxs dxsVar, dzi dziVar, bws bwsVar, bba bbaVar, bqm bqmVar, csm csmVar) {
        this.a = context;
        this.b = executor;
        this.c = str;
        this.d = dxsVar;
        this.e = dziVar;
        this.f = bwsVar;
        this.i = bbaVar;
        this.g = bqmVar;
        this.h = csmVar;
    }

    @Override // defpackage.brm
    public final bug a(bug bugVar) {
        this.g.k(ccj.fX);
        brn brnVar = new brn(bugVar);
        dzf dzfVar = this.e.c;
        if (dzfVar == null) {
            dzfVar = dzf.a;
        }
        int iA = dze.a(dzfVar.f);
        if (iA == 0) {
            iA = dze.c;
        }
        int i = iA;
        dzf dzfVar2 = this.e.c;
        if (dzfVar2 == null) {
            dzfVar2 = dzf.a;
        }
        dyy dyyVar = (dzfVar2.b == 4 ? (dyv) dzfVar2.c : dyv.a).e;
        if (dyyVar == null) {
            dyyVar = dyy.a;
        }
        dxs dxsVar = this.d;
        return new bty(new dxx(this.a, this.b, dxsVar, brnVar, i, dyyVar, this.c, this.e), this.h);
    }

    @Override // defpackage.brm
    public final boolean b() {
        return true;
    }
}
