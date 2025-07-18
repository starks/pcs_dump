package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.chrono.InterfaceC0029e;
import j$.time.chrono.InterfaceC0035k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, InterfaceC0029e, Serializable {
    public static final LocalDateTime c = g0(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = g0(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final LocalTime b;

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    private int U(LocalDateTime localDateTime) {
        int iU = this.a.U(localDateTime.c());
        return iU == 0 ? this.b.compareTo(localDateTime.b) : iU;
    }

    public static LocalDateTime V(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).Z();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).X();
        }
        try {
            return new LocalDateTime(LocalDate.W(temporal), LocalTime.W(temporal));
        } catch (c e) {
            throw new c(f.a("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static LocalDateTime f0(int i) {
        return new LocalDateTime(LocalDate.i0(i, 12, 31), LocalTime.a0(0));
    }

    public static LocalDateTime g0(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime h0(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.U(j2);
        return new LocalDateTime(LocalDate.k0(j$.nio.file.attribute.p.f(j + zoneOffset.c0(), 86400)), LocalTime.b0((((int) j$.nio.file.attribute.p.g(r5, r7)) * 1000000000) + j2));
    }

    private LocalDateTime k0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeB0 = this.b;
        if (j5 == 0) {
            return n0(localDate, localTimeB0);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jJ0 = localTimeB0.j0();
        long j10 = (j9 * j8) + jJ0;
        long jF = j$.nio.file.attribute.p.f(j10, 86400000000000L) + (j7 * j8);
        long jG = j$.nio.file.attribute.p.g(j10, 86400000000000L);
        if (jG != jJ0) {
            localTimeB0 = LocalTime.b0(jG);
        }
        return n0(localDate.m0(jF), localTimeB0);
    }

    private LocalDateTime n0(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final InterfaceC0035k C(ZoneOffset zoneOffset) {
        return ZonedDateTime.W(this, zoneOffset, null);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).V() ? this.b.I(nVar) : this.a.I(nVar) : nVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.f() ? this.a : AbstractC0033i.k(this, pVar);
    }

    public final int W() {
        return this.a.Y();
    }

    public final int X() {
        return this.b.Y();
    }

    public final int Y() {
        return this.b.getMinute();
    }

    public final int Z() {
        return this.a.b0();
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final j$.time.chrono.n a() {
        return ((LocalDate) c()).a();
    }

    public final int a0() {
        return this.b.Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(j$.time.temporal.Temporal r11, j$.time.temporal.TemporalUnit r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.b(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
    }

    public final int b0() {
        return this.b.getSecond();
    }

    public final int c0() {
        return this.a.d0();
    }

    public final boolean d0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return U(localDateTime) > 0;
        }
        long J = c().J();
        long J2 = localDateTime.c().J();
        if (J <= J2) {
            return J == J2 && this.b.j0() > localDateTime.b.j0();
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.I() || aVar.V();
    }

    public final boolean e0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return U(localDateTime) < 0;
        }
        long J = c().J();
        long J2 = localDateTime.c().J();
        if (J >= J2) {
            return J == J2 && this.b.j0() < localDateTime.b.j0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(((LocalDate) c()).J(), j$.time.temporal.a.EPOCH_DAY).d(toLocalTime().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.y(this, j);
        }
        int i = i.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 1:
                return k0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeN0 = n0(localDate.m0(j / 86400000000L), localTime);
                return localDateTimeN0.k0(localDateTimeN0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeN02 = n0(localDate.m0(j / 86400000), localTime);
                return localDateTimeN02.k0(localDateTimeN02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return j0(j);
            case 5:
                return k0(this.a, 0L, j, 0L, 0L);
            case 6:
                return k0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeN03 = n0(localDate.m0(j / 256), localTime);
                return localDateTimeN03.k0(localDateTimeN03.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return n0(localDate.f(j, temporalUnit), localTime);
        }
    }

    public final LocalDateTime j0(long j) {
        return k0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) nVar.y(this, j);
        }
        boolean zV = ((j$.time.temporal.a) nVar).V();
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        return zV ? n0(localDate, localTime.d(j, nVar)) : n0(localDate.d(j, nVar), localTime);
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0029e interfaceC0029e) {
        return interfaceC0029e instanceof LocalDateTime ? U((LocalDateTime) interfaceC0029e) : AbstractC0033i.c(this, interfaceC0029e);
    }

    public final LocalDateTime m0(LocalDate localDate) {
        return n0(localDate, this.b);
    }

    final void o0(DataOutput dataOutput) {
        this.a.t0(dataOutput);
        this.b.n0(dataOutput);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).V() ? this.b.t(nVar) : this.a.t(nVar) : j$.time.temporal.k.a(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0029e
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate c() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return n0(localDate, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.z(this);
        }
        if (!((j$.time.temporal.a) nVar).V()) {
            return this.a.z(nVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.k.d(localTime, nVar);
    }
}
