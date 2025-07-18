package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fev extends eoa {
    @Override // defpackage.eoa
    public final eof b(enx enxVar) {
        return g().b(enxVar);
    }

    @Override // defpackage.eoa
    public final equ c() {
        return g().c();
    }

    @Override // defpackage.eoa
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.eoa
    public final void e() {
        g().e();
    }

    @Override // defpackage.eoa
    public void f(emh emhVar, eog eogVar) {
        throw null;
    }

    protected abstract eoa g();

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", g());
        return crtVarQ.toString();
    }
}
