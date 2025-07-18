package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalTime implements Temporal, j$.time.temporal.l, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    private static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static LocalTime V(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime W(Temporal temporal) {
        Objects.a(temporal, "temporal");
        LocalTime localTime = (LocalTime) temporal.O(j$.time.temporal.k.g());
        if (localTime != null) {
            return localTime;
        }
        throw new c(f.a("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
    }

    private int X(j$.time.temporal.n nVar) {
        int i = j.a[((j$.time.temporal.a) nVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.q("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.q("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (j0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return k0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    public static LocalTime a0(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.U(i);
        return h[i];
    }

    public static LocalTime b0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.U(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return V(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static LocalTime c0(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.U(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return V(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    static LocalTime i0(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        byte b = 0;
        if (i3 >= 0) {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                ?? r6 = ~b2;
                i = 0;
                b = r6;
                i2 = 0;
            } else {
                byte b3 = objectInput.readByte();
                if (b3 < 0) {
                    i2 = ~b3;
                    b = b2;
                } else {
                    i = objectInput.readInt();
                    b = b2;
                    i2 = b3;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.U(i3);
            j$.time.temporal.a.MINUTE_OF_HOUR.U(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.U(i2);
            j$.time.temporal.a.NANO_OF_SECOND.U(i);
            return V(i3, b, i2, i);
        }
        i3 = ~i3;
        i2 = 0;
        i = 0;
        j$.time.temporal.a.HOUR_OF_DAY.U(i3);
        j$.time.temporal.a.MINUTE_OF_HOUR.U(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.U(i2);
        j$.time.temporal.a.NANO_OF_SECOND.U(i);
        return V(i3, b, i2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.NANO_OF_DAY ? j0() : nVar == j$.time.temporal.a.MICRO_OF_DAY ? j0() / 1000 : X(nVar) : nVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.k.e() || pVar == j$.time.temporal.k.k() || pVar == j$.time.temporal.k.j() || pVar == j$.time.temporal.k.h()) {
            return null;
        }
        if (pVar == j$.time.temporal.k.g()) {
            return this;
        }
        if (pVar == j$.time.temporal.k.f()) {
            return null;
        }
        return pVar == j$.time.temporal.k.i() ? ChronoUnit.NANOS : pVar.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public final int Y() {
        return this.a;
    }

    public final int Z() {
        return this.d;
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeW = W(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, localTimeW);
        }
        long jJ0 = localTimeW.j0() - j0();
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jJ0;
            case 2:
                return jJ0 / 1000;
            case 3:
                return jJ0 / 1000000;
            case 4:
                return jJ0 / 1000000000;
            case 5:
                return jJ0 / 60000000000L;
            case 6:
                return jJ0 / 3600000000000L;
            case 7:
                return jJ0 / 43200000000000L;
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalTime f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.y(this, j);
        }
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return g0(j);
            case 2:
                return g0((j % 86400000000L) * 1000);
            case 3:
                return g0((j % 86400000) * 1000000);
            case 4:
                return h0(j);
            case 5:
                return f0(j);
            case 6:
                return e0(j);
            case 7:
                return e0((j % 2) * 12);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).V() : nVar != null && nVar.t(this);
    }

    public final LocalTime e0(long j) {
        if (j == 0) {
            return this;
        }
        return V(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    public final LocalTime f0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return V(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final LocalTime g0(long j) {
        if (j != 0) {
            long jJ0 = j0();
            long j2 = (((j % 86400000000000L) + jJ0) + 86400000000000L) % 86400000000000L;
            if (jJ0 != j2) {
                return V((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public int getMinute() {
        return this.b;
    }

    public int getSecond() {
        return this.c;
    }

    public final LocalTime h0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return V(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final int hashCode() {
        long jJ0 = j0();
        return (int) (jJ0 ^ (jJ0 >>> 32));
    }

    public final long j0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int k0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalTime) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.U(j);
        int i = j.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return m0((int) j);
            case 2:
                return b0(j);
            case 3:
                return m0(((int) j) * 1000);
            case 4:
                return b0(j * 1000);
            case 5:
                return m0(((int) j) * 1000000);
            case 6:
                return b0(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.U(i3);
                    return V(b3, b, i3, i2);
                }
                return this;
            case 8:
                return h0(j - k0());
            case 9:
                int i4 = (int) j;
                if (b != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.U(i4);
                    return V(b3, i4, b2, i2);
                }
                return this;
            case 10:
                return f0(j - ((b3 * 60) + b));
            case 11:
                return e0(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return e0(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.U(i5);
                    return V(i5, b, b2, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.U(i6);
                    return V(i6, b, b2, i2);
                }
                return this;
            case 15:
                return e0((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    public final LocalTime m0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.U(i);
        return V(this.a, this.b, this.c, i);
    }

    final void n0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? X(nVar) : j$.time.temporal.k.a(this, nVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (LocalTime) AbstractC0033i.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return j$.time.temporal.k.d(this, nVar);
    }
}
