package j$.time;

import j$.time.chrono.AbstractC0033i;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class m implements TemporalAccessor, j$.time.temporal.l, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        j$.time.format.t tVar = new j$.time.format.t();
        tVar.f("--");
        tVar.p(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        tVar.e('-');
        tVar.p(j$.time.temporal.a.DAY_OF_MONTH, 2);
        tVar.z(Locale.getDefault());
    }

    private m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    static m U(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        byte b2 = objectInput.readByte();
        k kVarX = k.X(b);
        Objects.a(kVarX, "month");
        j$.time.temporal.a.DAY_OF_MONTH.U(b2);
        if (b2 <= kVarX.W()) {
            return new m(kVarX.getValue(), b2);
        }
        throw new c("Illegal value for DayOfMonth field, value " + ((int) b2) + " is not valid for month " + kVarX.name());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i2 = l.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.e() ? j$.time.chrono.u.d : j$.time.temporal.k.c(this, pVar);
    }

    final void V(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.a - mVar.a;
        return i == 0 ? this.b - mVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.DAY_OF_MONTH : nVar != null && nVar.t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b) {
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
        Temporal temporalD = temporal.d(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalD.d(Math.min(temporalD.z(aVar).d(), this.b), aVar);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        return z(nVar).a(I(nVar), nVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return nVar.p();
        }
        if (nVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.k.d(this, nVar);
        }
        int iOrdinal = k.X(this.a).ordinal();
        return j$.time.temporal.r.k(1L, iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : 28, k.X(r8).W());
    }
}
