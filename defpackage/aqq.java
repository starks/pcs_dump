package defpackage;

import j$.time.Duration;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqq implements bpv {
    private static final Duration e = Duration.ofMinutes(10);
    public final aoa a;
    public final Random b;
    public final anj c;
    public final api d;
    private final Executor f;

    public aqq(anj anjVar, Executor executor, api apiVar, aoa aoaVar, Random random) {
        this.c = anjVar;
        this.f = executor;
        this.d = apiVar;
        this.a = aoaVar;
        this.b = random;
    }

    @Override // defpackage.bpv
    public final void a(ccy ccyVar) {
        euw euwVar = new euw(null, null, null, null, null);
        euwVar.p(e);
        and andVarO = euwVar.o();
        dkp dkpVarG = dkp.g(new ls(this, 15), null);
        this.f.execute(dkpVarG);
        cnx.J(dij.j(djr.q(dkpVarG), new aqf(this, andVarO, 2, null), this.f), new aqp(this, ccyVar, 0), this.f);
    }
}
