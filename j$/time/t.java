package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.format.B;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class t implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        j$.time.format.t tVar = new j$.time.format.t();
        tVar.q(j$.time.temporal.a.YEAR, 4, 10, B.EXCEEDS_PAD);
        tVar.z(Locale.getDefault());
    }

    private t(int i) {
        this.a = i;
    }

    public static t U(int i) {
        j$.time.temporal.a.YEAR.U(i);
        return new t(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = s.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.e() ? j$.time.chrono.u.d : pVar == j$.time.temporal.k.i() ? ChronoUnit.YEARS : j$.time.temporal.k.c(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final t f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (t) temporalUnit.y(this, j);
        }
        int i = s.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return W(j);
        }
        if (i == 2) {
            return W(b.b(j, 10));
        }
        if (i == 3) {
            return W(b.b(j, 100));
        }
        if (i == 4) {
            return W(b.b(j, 1000));
        }
        if (i != 5) {
            throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return d(b.a(I(aVar), j), aVar);
    }

    public final t W(long j) {
        return j == 0 ? this : U(j$.time.temporal.a.YEAR.O(this.a + j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final t d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (t) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.U(j);
        int i = s.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return U((int) j);
        }
        if (i == 2) {
            return U((int) j);
        }
        if (i == 3) {
            return I(j$.time.temporal.a.ERA) == j ? this : U(1 - i2);
        }
        throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    final void Y(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        t tVarU;
        if (temporal instanceof t) {
            tVarU = (t) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.d.equals(AbstractC0033i.p(temporal))) {
                    temporal = LocalDate.W(temporal);
                }
                tVarU = U(temporal.t(j$.time.temporal.a.YEAR));
            } catch (c e) {
                throw new c(f.a("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, tVarU);
        }
        long j = tVarU.a - this.a;
        int i = s.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i != 5) {
            throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return tVarU.I(aVar) - I(aVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((t) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA : nVar != null && nVar.t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            if (this.a == ((t) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        if (!AbstractC0033i.p(temporal).equals(j$.time.chrono.u.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(this.a, j$.time.temporal.a.YEAR);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        return z(nVar).a(I(nVar), nVar);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (t) AbstractC0033i.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.r.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.k.d(this, nVar);
    }
}
