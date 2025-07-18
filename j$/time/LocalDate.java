package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.chrono.InterfaceC0026b;
import j$.time.chrono.InterfaceC0029e;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.l, InterfaceC0026b, Serializable {
    public static final LocalDate d = i0(-999999999, 1, 1);
    public static final LocalDate e = i0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    static {
        i0(1970, 1, 1);
    }

    private LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static LocalDate V(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.u.d.L(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + k.X(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate W(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.O(j$.time.temporal.k.f());
        if (localDate != null) {
            return localDate;
        }
        throw new c(f.a("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
    }

    private int X(j$.time.temporal.n nVar) {
        int i;
        int i2 = h.a[((j$.time.temporal.a) nVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return a0();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return Z().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((a0() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.q("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((a0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.q("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return i + 1;
    }

    private long c0() {
        return ((this.a * 12) + this.b) - 1;
    }

    private long h0(LocalDate localDate) {
        return (((localDate.c0() * 32) + localDate.c) - ((c0() * 32) + this.c)) / 32;
    }

    public static LocalDate i0(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.U(i);
        j$.time.temporal.a.MONTH_OF_YEAR.U(i2);
        j$.time.temporal.a.DAY_OF_MONTH.U(i3);
        return V(i, i2, i3);
    }

    public static LocalDate j0(int i, k kVar, int i2) {
        j$.time.temporal.a.YEAR.U(i);
        j$.time.temporal.a.DAY_OF_MONTH.U(i2);
        return V(i, kVar.getValue(), i2);
    }

    public static LocalDate k0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.U(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(j$.time.temporal.a.YEAR.O(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private static LocalDate p0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.u.d.L((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final int D() {
        return s() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0026b interfaceC0026b) {
        return interfaceC0026b instanceof LocalDate ? U((LocalDate) interfaceC0026b) : AbstractC0033i.b(this, interfaceC0026b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.EPOCH_DAY ? J() : nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? c0() : X(nVar) : nVar.g(this);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final long J() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !s() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final InterfaceC0029e M(LocalTime localTime) {
        return LocalDateTime.g0(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.f() ? this : AbstractC0033i.j(this, pVar);
    }

    final int U(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final int Y() {
        return this.c;
    }

    public final d Z() {
        return d.U(((int) j$.nio.file.attribute.p.g(J() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final j$.time.chrono.n a() {
        return j$.time.chrono.u.d;
    }

    public final int a0() {
        return (k.X(this.b).U(s()) + this.c) - 1;
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.g0(this, LocalTime.g);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateW = W(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, localDateW);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateW.J() - J();
            case 2:
                return (localDateW.J() - J()) / 7;
            case 3:
                return h0(localDateW);
            case 4:
                return h0(localDateW) / 12;
            case 5:
                return h0(localDateW) / 120;
            case 6:
                return h0(localDateW) / 1200;
            case 7:
                return h0(localDateW) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateW.I(aVar) - I(aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final int b0() {
        return this.b;
    }

    public final int d0() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return AbstractC0033i.h(this, nVar);
    }

    public final boolean e0(InterfaceC0026b interfaceC0026b) {
        return interfaceC0026b instanceof LocalDate ? U((LocalDate) interfaceC0026b) < 0 : J() < interfaceC0026b.J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && U((LocalDate) obj) == 0;
    }

    public final int f0() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : s() ? 29 : 28;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return AbstractC0033i.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDate f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.y(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m0(j);
            case 2:
                return m0(b.b(j, 7));
            case 3:
                return n0(j);
            case 4:
                return o0(j);
            case 5:
                return o0(b.b(j, 10));
            case 6:
                return o0(b.b(j, 100));
            case 7:
                return o0(b.b(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(b.a(I(aVar), j), aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalDate m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jF0 = f0();
                if (j2 <= jF0) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jF0));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.U(i2);
                return new LocalDate(i2, 1, (int) (j2 - jF0));
            }
        }
        return k0(b.a(J(), j));
    }

    public final LocalDate n0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return p0(j$.time.temporal.a.YEAR.O(j$.nio.file.attribute.p.f(j2, j3)), ((int) j$.nio.file.attribute.p.g(j2, j3)) + 1, this.c);
    }

    public final LocalDate o0(long j) {
        return j == 0 ? this : p0(j$.time.temporal.a.YEAR.O(this.a + j), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDate) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.U(j);
        int i = h.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return i0(i2, s2, i3);
                }
                return this;
            case 2:
                return r0((int) j);
            case 3:
                return m0(b.b(j - I(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return s0((int) j);
            case 5:
                return m0(j - Z().getValue());
            case 6:
                return m0(j - I(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m0(j - I(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return k0(j);
            case 9:
                return m0(b.b(j - I(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.U(i4);
                    return p0(i2, i4, s);
                }
                return this;
            case 11:
                return n0(j - c0());
            case 12:
                return s0((int) j);
            case 13:
                if (I(j$.time.temporal.a.ERA) != j) {
                    return s0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    public final LocalDate r0(int i) {
        if (a0() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.U(j);
        j$.time.temporal.a.DAY_OF_YEAR.U(i);
        boolean zL = j$.time.chrono.u.d.L(j);
        if (i == 366 && !zL) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        k kVarX = k.X(((i - 1) / 31) + 1);
        if (i > (kVarX.V(zL) + kVarX.U(zL)) - 1) {
            kVarX = kVarX.Y();
        }
        return new LocalDate(i2, kVarX.getValue(), (i - kVarX.U(zL)) + 1);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final boolean s() {
        return j$.time.chrono.u.d.L(this.a);
    }

    public final LocalDate s0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.U(i);
        return p0(i, this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? X(nVar) : j$.time.temporal.k.a(this, nVar);
    }

    final void t0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.z(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (!aVar.I()) {
            throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        int i = h.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.r.j(1L, f0());
        }
        if (i == 2) {
            return j$.time.temporal.r.j(1L, D());
        }
        if (i != 3) {
            return i != 4 ? ((j$.time.temporal.a) nVar).p() : this.a <= 0 ? j$.time.temporal.r.j(1L, 1000000000L) : j$.time.temporal.r.j(1L, 999999999L);
        }
        return j$.time.temporal.r.j(1L, (k.X(this.b) != k.FEBRUARY || s()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return localDate;
    }
}
