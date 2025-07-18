package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ems implements Comparable {
    public static final fjp c = new fjp(null, null, null);
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final fjp b;
    private volatile boolean g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private ems(fjp fjpVar, long j, long j2) {
        this.b = fjpVar;
        long jMin = Math.min(d, Math.max(e, j2));
        this.a = j + jMin;
        this.g = jMin <= 0;
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static ems g(long j, TimeUnit timeUnit, fjp fjpVar) {
        f(timeUnit, "units");
        return new ems(fjpVar, fjp.M(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ems emsVar) {
        c(emsVar);
        long j = this.a - emsVar.a;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final long b(TimeUnit timeUnit) {
        long jM = fjp.M();
        if (!this.g && this.a - jM <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - jM, TimeUnit.NANOSECONDS);
    }

    public final void c(ems emsVar) {
        fjp fjpVar = this.b;
        if (fjpVar == emsVar.b) {
            return;
        }
        throw new AssertionError("Tickers (" + fjpVar.toString() + " and " + emsVar.b.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean d(ems emsVar) {
        c(emsVar);
        return this.a - emsVar.a < 0;
    }

    public final boolean e() {
        if (!this.g) {
            if (this.a - fjp.M() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ems)) {
            return false;
        }
        ems emsVar = (ems) obj;
        return this.b == emsVar.b && this.a == emsVar.a;
    }

    public final int hashCode() {
        return Arrays.asList(this.b, Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jB) % j;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        fjp fjpVar = this.b;
        if (fjpVar != c) {
            sb.append(a.G(fjpVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
