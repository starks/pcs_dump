package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    long b(Temporal temporal, TemporalUnit temporalUnit);

    Temporal d(long j, n nVar);

    Temporal f(long j, TemporalUnit temporalUnit);

    Temporal p(long j, ChronoUnit chronoUnit);

    Temporal y(LocalDate localDate);
}
