package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csf {
    private final csm a;
    private boolean b;
    private long c;

    public csf() {
        this.a = csm.a;
    }

    public static csf b(csm csmVar) {
        csf csfVar = new csf(csmVar);
        csfVar.d();
        return csfVar;
    }

    private final long e() {
        if (this.b) {
            return this.a.a() - this.c;
        }
        return 0L;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public final void c() {
        this.b = false;
    }

    public final void d() {
        clq.G(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.c = this.a.a();
    }

    public final String toString() {
        String str;
        long jE = e();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(jE, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(jE, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(jE, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(jE, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(jE, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(jE, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jE / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (cse.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }

    public csf(csm csmVar) {
        csmVar.getClass();
        this.a = csmVar;
    }
}
