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
public final class p implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final LocalTime a;
    private final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        U(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        U(localTime2, zoneOffset2);
    }

    private p(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static p U(LocalTime localTime, ZoneOffset zoneOffset) {
        return new p(localTime, zoneOffset);
    }

    static p W(ObjectInput objectInput) {
        return new p(LocalTime.i0(objectInput), ZoneOffset.h0(objectInput));
    }

    private long X() {
        return this.a.j0() - (this.b.c0() * 1000000000);
    }

    private p Y(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new p(localTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.c0() : this.a.I(nVar) : nVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.k.h() || pVar == j$.time.temporal.k.j()) {
            return this.b;
        }
        if (((pVar == j$.time.temporal.k.k()) || (pVar == j$.time.temporal.k.e())) || pVar == j$.time.temporal.k.f()) {
            return null;
        }
        return pVar == j$.time.temporal.k.g() ? this.a : pVar == j$.time.temporal.k.i() ? ChronoUnit.NANOS : pVar.a(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final p f(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? Y(this.a.f(j, temporalUnit), this.b) : (p) temporalUnit.y(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        p pVar;
        if (temporal instanceof p) {
            pVar = (p) temporal;
        } else {
            try {
                pVar = new p(LocalTime.W(temporal), ZoneOffset.b0(temporal));
            } catch (c e) {
                throw new c(f.a("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, pVar);
        }
        long jX = pVar.X() - X();
        switch (o.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jX;
            case 2:
                return jX / 1000;
            case 3:
                return jX / 1000000;
            case 4:
                return jX / 1000000000;
            case 5:
                return jX / 60000000000L;
            case 6:
                return jX / 3600000000000L;
            case 7:
                return jX / 43200000000000L;
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        boolean zEquals = this.b.equals(pVar.b);
        LocalTime localTime = this.a;
        LocalTime localTime2 = pVar.a;
        if (zEquals) {
            return localTime.compareTo(localTime2);
        }
        int iCompare = Long.compare(X(), pVar.X());
        return iCompare == 0 ? localTime.compareTo(localTime2) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (p) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        return nVar == aVar ? Y(localTime, ZoneOffset.f0(((j$.time.temporal.a) nVar).O(j))) : Y(localTime.d(j, nVar), this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).V() || nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(this.a.j0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.c0(), j$.time.temporal.a.OFFSET_SECONDS);
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
        return j$.time.temporal.k.a(this, nVar);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.n0(objectOutput);
        this.b.i0(objectOutput);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (p) AbstractC0033i.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.z(this);
        }
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) nVar).p();
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.k.d(localTime, nVar);
    }
}
