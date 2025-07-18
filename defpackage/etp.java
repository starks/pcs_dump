package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etp implements Runnable, eml {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ etv f;

    public etp(etv etvVar, ems emsVar, boolean z) {
        long jB;
        this.f = etvVar;
        this.a = z;
        if (emsVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = emsVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    @Override // defpackage.eml
    public final void a(emr emrVar) {
        if (this.b && this.a && (emrVar.c() instanceof TimeoutException)) {
            this.f.i.d(b());
        } else {
            this.f.i.d(fjp.N(emrVar));
        }
    }

    final eqo b() {
        long jAbs = Math.abs(this.c) / TimeUnit.SECONDS.toNanos(1L);
        long jAbs2 = Math.abs(this.c) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (this.c < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) this.f.h.f(emb.a)) == null ? 0.0d : r0.longValue() / etv.a)));
        if (this.f.i != null) {
            ewa ewaVar = new ewa();
            this.f.i.c(ewaVar);
            sb.append(" ");
            sb.append(ewaVar);
        }
        return eqo.f.e(sb.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.f.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.i.d(b());
    }
}
