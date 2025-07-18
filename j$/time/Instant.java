package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;
    public static final Instant c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant d = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant U(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant V(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.I(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.t(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c(f.a("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    private Instant Y(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(b.a(b.a(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private long a0(Instant instant) {
        long jC = b.c(instant.a, this.a);
        long j = instant.b - this.b;
        return (jC <= 0 || j >= 0) ? (jC >= 0 || j <= 0) ? jC : jC + 1 : jC - 1;
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return U(j$.nio.file.attribute.p.f(j, j2), ((int) j$.nio.file.attribute.p.g(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return U(b.a(j, j$.nio.file.attribute.p.f(j2, 1000000000L)), (int) j$.nio.file.attribute.p.g(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i2 = g.a[((j$.time.temporal.a) nVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.k.i()) {
            return ChronoUnit.NANOS;
        }
        if (pVar == j$.time.temporal.k.e() || pVar == j$.time.temporal.k.k() || pVar == j$.time.temporal.k.j() || pVar == j$.time.temporal.k.h() || pVar == j$.time.temporal.k.f() || pVar == j$.time.temporal.k.g()) {
            return null;
        }
        return pVar.a(this);
    }

    public final long W() {
        return this.a;
    }

    public final int X() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final Instant f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.y(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Y(0L, j);
            case 2:
                return Y(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return Y(j / 1000, (j % 1000) * 1000000);
            case 4:
                return Y(j, 0L);
            case 5:
                return Y(b.b(j, 60), 0L);
            case 6:
                return Y(b.b(j, 3600), 0L);
            case 7:
                return Y(b.b(j, 43200), 0L);
            case 8:
                return Y(b.b(j, 86400), 0L);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.V(this, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantV = V(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, instantV);
        }
        int i = g.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return b.a(b.b(b.c(instantV.a, j), 1000000000L), instantV.b - i2);
            case 2:
                return b.a(b.b(b.c(instantV.a, j), 1000000000L), instantV.b - i2) / 1000;
            case 3:
                return b.c(instantV.toEpochMilli(), toEpochMilli());
            case 4:
                return a0(instantV);
            case 5:
                return a0(instantV) / 60;
            case 6:
                return a0(instantV) / 3600;
            case 7:
                return a0(instantV) / 43200;
            case 8:
                return a0(instantV) / 86400;
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    final void b0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.U(j);
        int i = g.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return U(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return U(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
                }
                if (j != j2) {
                    return U(j, i2);
                }
            }
        } else if (j != i2) {
            return U(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND : nVar != null && nVar.t(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        if (iCompare == 0) {
            iCompare = this.b - instant.b;
        }
        return iCompare > 0;
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.p(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.k.d(this, nVar).a(nVar.g(this), nVar);
        }
        int i = g.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.O(this.a);
        }
        throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? b.a(b.b(j, 1000), i / 1000000) : b.a(b.b(j + 1, 1000), (i / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.g.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration durationP = temporalUnit.p();
        if (durationP.getSeconds() > 86400) {
            throw new j$.time.temporal.q("Unit is too large to be used for truncation");
        }
        long jZ = durationP.z();
        if (86400000000000L % jZ != 0) {
            throw new j$.time.temporal.q("Unit must divide into a standard day without remainder");
        }
        long j = ((this.a % 86400) * 1000000000) + this.b;
        return Y(0L, (j$.nio.file.attribute.p.f(j, jZ) * jZ) - j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (Instant) AbstractC0033i.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return j$.time.temporal.k.d(this, nVar);
    }
}
