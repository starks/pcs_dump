package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration c = new Duration(0, 0);
    private static final BigInteger d = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.b(temporal2, ChronoUnit.NANOS));
        } catch (c | ArithmeticException unused) {
            long jB = temporal.b(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jI = temporal2.I(aVar) - temporal.I(aVar);
                if (jB > 0 && jI < 0) {
                    jB++;
                } else if (jB < 0 && jI > 0) {
                    jB--;
                }
                j = jI;
            } catch (c unused2) {
            }
            return ofSeconds(jB, j);
        }
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = c;
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.y(b.b(j, 86400), 0L);
        }
        if (temporalUnit.g()) {
            throw new j$.time.temporal.q("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = e.a[((ChronoUnit) temporalUnit).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? duration.y(b.b(temporalUnit.p().a, j), 0L) : duration.y(j, 0L) : duration.y(j / 1000, (j % 1000) * 1000000) : duration.y((j / 1000000000) * 1000, 0L).y(0L, (j % 1000000000) * 1000) : duration.y(0L, j);
        }
        Duration durationP = temporalUnit.p();
        durationP.getClass();
        if (j == 0) {
            durationP = duration;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(durationP.a).add(BigDecimal.valueOf(durationP.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(d);
            if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
            }
            durationP = ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        return duration.y(durationP.getSeconds(), 0L).y(0L, durationP.getNano());
    }

    public static Duration ofDays(long j) {
        return t(b.b(j, 86400), 0);
    }

    public static Duration ofHours(long j) {
        return t(b.b(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return t(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return t(b.b(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return t(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return t(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static Duration t(long j, int i) {
        return (((long) i) | j) == 0 ? c : new Duration(j, i);
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    private Duration y(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(b.a(b.a(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal g(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.f(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? instant.f(i, ChronoUnit.NANOS) : instant;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public boolean isZero() {
        return (((long) this.b) | this.a) == 0;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Instant instant) {
        long j = this.a;
        Temporal temporalP = instant;
        if (j != 0) {
            temporalP = instant.p(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return temporalP;
        }
        return ((Instant) temporalP).p(i, ChronoUnit.NANOS);
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return b.a(b.b(j2, 1000), j / 1000000);
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }

    public final long z() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return b.a(b.b(j2, 1000000000L), j);
    }

    public static Duration ofSeconds(long j, long j2) {
        return t(b.a(j, j$.nio.file.attribute.p.f(j2, 1000000000L)), (int) j$.nio.file.attribute.p.g(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }
}
