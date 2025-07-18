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
public final class v implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        j$.time.format.t tVar = new j$.time.format.t();
        tVar.q(j$.time.temporal.a.YEAR, 4, 10, B.EXCEEDS_PAD);
        tVar.e('-');
        tVar.p(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        tVar.z(Locale.getDefault());
    }

    private v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private long U() {
        return ((this.a * 12) + this.b) - 1;
    }

    public static v V(int i, int i2) {
        j$.time.temporal.a.YEAR.U(i);
        j$.time.temporal.a.MONTH_OF_YEAR.U(i2);
        return new v(i, i2);
    }

    private v Z(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new v(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = u.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return U();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.e() ? j$.time.chrono.u.d : pVar == j$.time.temporal.k.i() ? ChronoUnit.MONTHS : j$.time.temporal.k.c(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final v f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (v) temporalUnit.y(this, j);
        }
        switch (u.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return Y(j);
            case 3:
                return Y(b.b(j, 10));
            case 4:
                return Y(b.b(j, 100));
            case 5:
                return Y(b.b(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(b.a(I(aVar), j), aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final v X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return Z(j$.time.temporal.a.YEAR.O(j$.nio.file.attribute.p.f(j2, j3)), ((int) j$.nio.file.attribute.p.g(j2, j3)) + 1);
    }

    public final v Y(long j) {
        return j == 0 ? this : Z(j$.time.temporal.a.YEAR.O(this.a + j), this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final v d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (v) nVar.y(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.U(j);
        int i = u.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.U(i3);
            return Z(i2, i3);
        }
        if (i == 2) {
            return X(j - U());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.U(i5);
            return Z(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.U(i6);
            return Z(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        if (I(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.U(i7);
        return Z(i7, i4);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        v vVarV;
        if (temporal instanceof v) {
            vVarV = (v) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.d.equals(AbstractC0033i.p(temporal))) {
                    temporal = LocalDate.W(temporal);
                }
                vVarV = V(temporal.t(j$.time.temporal.a.YEAR), temporal.t(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e) {
                throw new c(f.a("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.t(this, vVarV);
        }
        long jU = vVarV.U() - U();
        switch (u.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jU;
            case 2:
                return jU / 12;
            case 3:
                return jU / 120;
            case 4:
                return jU / 1200;
            case 5:
                return jU / 12000;
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return vVarV.I(aVar) - I(aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    final void b0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i = this.a - vVar.a;
        return i == 0 ? this.b - vVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.PROLEPTIC_MONTH || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA : nVar != null && nVar.t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.a == vVar.a && this.b == vVar.b) {
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
        return temporal.d(U(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
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
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (v) AbstractC0033i.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.r.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.k.d(this, nVar);
    }
}
