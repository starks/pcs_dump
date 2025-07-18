package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public interface n extends Comparable {
    InterfaceC0035k A(Instant instant, ZoneId zoneId);

    String G();

    boolean L(long j);

    InterfaceC0035k N(Temporal temporal);

    o P(int i);

    InterfaceC0029e T(Temporal temporal);

    boolean equals(Object obj);

    int hashCode();

    InterfaceC0026b n(int i);

    String o();

    String toString();

    j$.time.temporal.r u(j$.time.temporal.a aVar);

    InterfaceC0026b v(TemporalAccessor temporalAccessor);
}
