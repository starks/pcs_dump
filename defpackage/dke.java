package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dke extends dkb implements ScheduledExecutorService, djz {
    final ScheduledExecutorService a;

    public dke(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dkc schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        dkp dkpVarG = dkp.g(runnable, null);
        return new dkc(dkpVarG, scheduledExecutorService.schedule(dkpVarG, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final dkc schedule(Callable callable, long j, TimeUnit timeUnit) {
        dkp dkpVar = new dkp(callable);
        return new dkc(dkpVar, this.a.schedule(dkpVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dkd dkdVar = new dkd(runnable);
        return new dkc(dkdVar, this.a.scheduleAtFixedRate(dkdVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dkd dkdVar = new dkd(runnable);
        return new dkc(dkdVar, this.a.scheduleWithFixedDelay(dkdVar, j, j2, timeUnit));
    }
}
