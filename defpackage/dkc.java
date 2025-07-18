package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkc extends dji implements ScheduledFuture, djy {
    private final ScheduledFuture a;

    public dkc(djy djyVar, ScheduledFuture scheduledFuture) {
        super(djyVar);
        this.a = scheduledFuture;
    }

    @Override // defpackage.djh, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = b().cancel(z);
        if (zCancel) {
            this.a.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
