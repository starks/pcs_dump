package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eth extends evk {
    private final eui a;
    private final AtomicInteger b = new AtomicInteger(-2147483647);
    private volatile eqo c;

    public eth(eui euiVar, String str) {
        this.a = euiVar;
        str.getClass();
    }

    @Override // defpackage.evk, defpackage.etz
    public final etw a(epg epgVar, epc epcVar, elt eltVar, emb[] embVarArr) {
        return this.b.get() >= 0 ? new evg(this.c, embVarArr) : this.a.a(epgVar, epcVar, eltVar, embVarArr);
    }

    @Override // defpackage.evk
    protected final eui b() {
        return this.a;
    }

    @Override // defpackage.evk, defpackage.exw
    public final void d(eqo eqoVar) {
        eqoVar.getClass();
        synchronized (this) {
            if (this.b.get() < 0) {
                this.c = eqoVar;
                this.b.addAndGet(Integer.MAX_VALUE);
                if (this.b.get() != 0) {
                    return;
                }
                super.d(eqoVar);
            }
        }
    }
}
