package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.chrono.InterfaceC0026b;
import j$.time.chrono.InterfaceC0029e;
import j$.time.chrono.InterfaceC0035k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0035k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime U(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId zoneIdU = ZoneId.U(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return temporal.e(aVar) ? g(temporal.I(aVar), temporal.t(j$.time.temporal.a.NANO_OF_SECOND), zoneIdU) : W(LocalDateTime.g0(LocalDate.W(temporal), LocalTime.W(temporal)), zoneIdU, null);
        } catch (c e) {
            throw new c(f.a("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static ZonedDateTime V(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return g(instant.W(), instant.X(), zoneId);
    }

    public static ZonedDateTime W(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.e eVarV = zoneId.V();
        List listG = eVarV.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = eVarV.f(localDateTime);
            localDateTime = localDateTime.j0(bVarF.t().getSeconds());
            zoneOffset = bVarF.y();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    static ZonedDateTime Y(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        LocalDateTime localDateTimeG0 = LocalDateTime.g0(LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.i0(objectInput));
        ZoneOffset zoneOffsetH0 = ZoneOffset.h0(objectInput);
        ZoneId zoneId = (ZoneId) r.a(objectInput);
        Objects.a(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffsetH0.equals(zoneId)) {
            return new ZonedDateTime(localDateTimeG0, zoneId, zoneOffsetH0);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private static ZonedDateTime g(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.V().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.h0(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final ZoneId F() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.I(nVar) : this.b.c0() : AbstractC0033i.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.f() ? this.a.c() : AbstractC0033i.l(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final /* synthetic */ long R() {
        return AbstractC0033i.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.y(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return W(localDateTime.f(j, temporalUnit), zoneId, zoneOffset);
        }
        LocalDateTime localDateTimeF = localDateTime.f(j, temporalUnit);
        Objects.a(localDateTimeF, "localDateTime");
        Objects.a(zoneOffset, "offset");
        Objects.a(zoneId, "zone");
        return zoneId.V().g(localDateTimeF).contains(zoneOffset) ? new ZonedDateTime(localDateTimeF, zoneId, zoneOffset) : g(AbstractC0033i.n(localDateTimeF, zoneOffset), localDateTimeF.a0(), zoneId);
    }

    public final LocalDateTime Z() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final j$.time.chrono.n a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC0035k
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return g(AbstractC0033i.n(localDateTime, this.b), localDateTime.a0(), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeU = U(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, zonedDateTimeU);
        }
        ZonedDateTime zonedDateTimeI = zonedDateTimeU.i(this.c);
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime = this.a;
        LocalDateTime localDateTime2 = zonedDateTimeI.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? OffsetDateTime.U(localDateTime, this.b).b(OffsetDateTime.U(localDateTime2, zonedDateTimeI.b), temporalUnit) : localDateTime.b(localDateTime2, temporalUnit);
    }

    final void b0(DataOutput dataOutput) {
        this.a.o0(dataOutput);
        this.b.i0(dataOutput);
        this.c.Z((ObjectOutput) dataOutput);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0026b c() {
        return this.a.c();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0033i.d(this, (InterfaceC0035k) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = x.a[aVar.ordinal()];
        LocalDateTime localDateTime = this.a;
        ZoneId zoneId = this.c;
        if (i == 1) {
            return g(j, localDateTime.a0(), zoneId);
        }
        ZoneOffset zoneOffset = this.b;
        if (i != 2) {
            return W(localDateTime.d(j, nVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetF0 = ZoneOffset.f0(aVar.O(j));
        return (zoneOffsetF0.equals(zoneOffset) || !zoneId.V().g(localDateTime).contains(zoneOffsetF0)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetF0);
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
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0035k j(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : W(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0029e r() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return AbstractC0033i.e(this, nVar);
        }
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.t(nVar) : this.b.c0();
        }
        throw new j$.time.temporal.q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return W(LocalDateTime.g0(localDate, this.a.toLocalTime()), this.c, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).p() : this.a.z(nVar) : nVar.z(this);
    }
}
