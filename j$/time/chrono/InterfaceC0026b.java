package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0026b extends Temporal, j$.time.temporal.l, Comparable {
    /* renamed from: B */
    InterfaceC0026b p(long j, TemporalUnit temporalUnit);

    int D();

    /* renamed from: H */
    int compareTo(InterfaceC0026b interfaceC0026b);

    long J();

    InterfaceC0029e M(LocalTime localTime);

    n a();

    @Override // j$.time.temporal.Temporal
    long b(Temporal temporal, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    InterfaceC0026b d(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0026b f(long j, TemporalUnit temporalUnit);

    int hashCode();

    boolean s();

    String toString();
}
