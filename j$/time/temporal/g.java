package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    private final String a;
    private final Duration b;

    g(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean g() {
        return true;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration p() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long t(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.b(temporal2, this);
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            n nVar = h.c;
            return j$.time.b.c(temporal2.I(nVar), temporal.I(nVar));
        }
        if (iOrdinal == 1) {
            return temporal.b(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal y(Temporal temporal, long j) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return temporal.d(j$.time.b.a(temporal.t(r0), j), h.c);
        }
        if (iOrdinal == 1) {
            return temporal.f(j / 4, ChronoUnit.YEARS).f((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }
}
