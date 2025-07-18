package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkm extends djf {
    public djy a;
    public ScheduledFuture b;

    public dkm(djy djyVar) {
        djyVar.getClass();
        this.a = djyVar;
    }

    @Override // defpackage.dif
    protected final String a() {
        djy djyVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (djyVar == null) {
            return null;
        }
        String strG = a.G(djyVar, "inputFuture=[", "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strG + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strG;
    }

    @Override // defpackage.dif
    protected final void b() {
        o(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
