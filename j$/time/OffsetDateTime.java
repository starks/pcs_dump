package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        U(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        U(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime U(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    static OffsetDateTime W(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        return new OffsetDateTime(LocalDateTime.g0(LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.i0(objectInput)), ZoneOffset.h0(objectInput));
    }

    private OffsetDateTime Y(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.V().d(instant);
        return new OffsetDateTime(LocalDateTime.h0(instant.W(), instant.X(), zoneOffsetD), zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = n.a[((j$.time.temporal.a) nVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.I(nVar) : zoneOffset.c0();
        }
        localDateTime.getClass();
        return AbstractC0033i.n(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.k.h() || pVar == j$.time.temporal.k.j()) {
            return this.b;
        }
        if (pVar == j$.time.temporal.k.k()) {
            return null;
        }
        return pVar == j$.time.temporal.k.f() ? toLocalDate() : pVar == j$.time.temporal.k.g() ? this.a.toLocalTime() : pVar == j$.time.temporal.k.e() ? j$.time.chrono.u.d : pVar == j$.time.temporal.k.i() ? ChronoUnit.NANOS : pVar.a(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime f(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? Y(this.a.f(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.y(this, j);
    }

    public final LocalDateTime X() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetB0 = ZoneOffset.b0(temporal);
                LocalDate localDate = (LocalDate) temporal.O(j$.time.temporal.k.f());
                LocalTime localTime = (LocalTime) temporal.O(j$.time.temporal.k.g());
                temporal = (localDate == null || localTime == null) ? ofInstant(Instant.V(temporal), zoneOffsetB0) : new OffsetDateTime(LocalDateTime.g0(localDate, localTime), zoneOffsetB0);
            } catch (c e) {
                throw new c(f.a("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        OffsetDateTime offsetDateTime = temporal;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = new OffsetDateTime(temporal.a.j0(zoneOffset2.c0() - zoneOffset.c0()), zoneOffset2);
        }
        return this.a.b(offsetDateTime.a, temporalUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        LocalDateTime localDateTime = offsetDateTime2.a;
        LocalDateTime localDateTime2 = this.a;
        if (zEquals) {
            iCompare = localDateTime2.compareTo(localDateTime);
        } else {
            localDateTime2.getClass();
            long jN = AbstractC0033i.n(localDateTime2, zoneOffset2);
            localDateTime.getClass();
            iCompare = Long.compare(jN, AbstractC0033i.n(localDateTime, offsetDateTime2.b));
            if (iCompare == 0) {
                iCompare = localDateTime2.toLocalTime().Z() - localDateTime.toLocalTime().Z();
            }
        }
        return iCompare == 0 ? localDateTime2.compareTo(localDateTime) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = n.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? Y(localDateTime.d(j, nVar), zoneOffset) : Y(localDateTime, ZoneOffset.f0(aVar.O(j))) : ofInstant(Instant.ofEpochSecond(j, localDateTime.a0()), zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(toLocalDate().J(), j$.time.temporal.a.EPOCH_DAY).d(this.a.toLocalTime().j0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.c0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.k.a(this, nVar);
        }
        int i = n.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.t(nVar) : this.b.c0();
        }
        throw new j$.time.temporal.q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public LocalDate toLocalDate() {
        return this.a.c();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.o0(objectOutput);
        this.b.i0(objectOutput);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return Y(this.a.m0(localDate), this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).p() : this.a.z(nVar) : nVar.z(this);
    }
}
