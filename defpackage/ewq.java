package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewq {
    public static final long a = TimeUnit.SECONDS.toNanos(10);
    public final ScheduledExecutorService b;
    public final csf c;
    public ScheduledFuture d;
    public ScheduledFuture e;
    public final Runnable f;
    public final Runnable g;
    public final long h;
    public final long i;
    public int j;
    public final fsc k;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public ewq(fsc fscVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        csf csfVar = new csf();
        this.j = 1;
        this.f = new ewr(new ewf(this, 5));
        this.g = new ewr(new ewf(this, 6));
        this.k = fscVar;
        scheduledExecutorService.getClass();
        this.b = scheduledExecutorService;
        this.c = csfVar;
        this.h = j;
        this.i = j2;
        csfVar.c();
        csfVar.d();
    }

    public final synchronized void a() {
        csf csfVar = this.c;
        csfVar.c();
        csfVar.d();
        int i = this.j;
        if (i == 2) {
            this.j = 3;
            return;
        }
        if (i == 4 || i == 5) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.j == 5) {
                this.j = 1;
                return;
            }
            this.j = 2;
            clq.G(this.e == null, "There should be no outstanding pingFuture");
            this.e = this.b.schedule(this.g, this.h, TimeUnit.NANOSECONDS);
        }
    }

    public final synchronized void b() {
        int i = this.j;
        if (i == 1) {
            this.j = 2;
            if (this.e == null) {
                this.e = this.b.schedule(this.g, this.h - this.c.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.j = 4;
        }
    }

    public final synchronized void c() {
        int i = this.j;
        if (i != 2 && i != 3) {
            if (i == 4) {
                this.j = 5;
                return;
            }
            return;
        }
        this.j = 1;
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
        if (this.j != 6) {
            this.j = 6;
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = this.e;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.e = null;
            }
        }
    }
}
