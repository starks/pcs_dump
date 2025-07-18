package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0028d implements InterfaceC0026b, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC0028d() {
    }

    static InterfaceC0026b U(n nVar, Temporal temporal) {
        InterfaceC0026b interfaceC0026b = (InterfaceC0026b) temporal;
        if (nVar.equals(interfaceC0026b.a())) {
            return interfaceC0026b;
        }
        throw new ClassCastException(j$.time.f.a("Chronology mismatch, expected: ", nVar.o(), ", actual: ", interfaceC0026b.a().o()));
    }

    private long W(InterfaceC0026b interfaceC0026b) {
        if (a().u(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jI = I(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC0026b.I(aVar) * 32) + interfaceC0026b.t(aVar2)) - (jI + j$.time.temporal.k.a(this, aVar2))) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public InterfaceC0026b p(long j, TemporalUnit temporalUnit) {
        return U(a(), j$.time.temporal.k.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public int D() {
        return s() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: H */
    public final /* synthetic */ int compareTo(InterfaceC0026b interfaceC0026b) {
        return AbstractC0033i.b(this, interfaceC0026b);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public long J() {
        return I(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public InterfaceC0029e M(LocalTime localTime) {
        return C0031g.V(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object O(j$.time.temporal.p pVar) {
        return AbstractC0033i.j(this, pVar);
    }

    public o V() {
        return a().P(j$.time.temporal.k.a(this, j$.time.temporal.a.ERA));
    }

    abstract InterfaceC0026b X(long j);

    abstract InterfaceC0026b Y(long j);

    abstract InterfaceC0026b Z(long j);

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0026b y(j$.time.temporal.l lVar) {
        return U(a(), lVar.g(this));
    }

    @Override // j$.time.chrono.InterfaceC0026b, j$.time.temporal.Temporal
    public long b(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0026b interfaceC0026bV = a().v(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.t(this, interfaceC0026bV);
        }
        switch (AbstractC0027c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC0026bV.J() - J();
            case 2:
                return (interfaceC0026bV.J() - J()) / 7;
            case 3:
                return W(interfaceC0026bV);
            case 4:
                return W(interfaceC0026bV) / 12;
            case 5:
                return W(interfaceC0026bV) / 120;
            case 6:
                return W(interfaceC0026bV) / 1200;
            case 7:
                return W(interfaceC0026bV) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return interfaceC0026bV.I(aVar) - I(aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.InterfaceC0026b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(j$.time.temporal.n nVar) {
        return AbstractC0033i.h(this, nVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0026b) && AbstractC0033i.b(this, (InterfaceC0026b) obj) == 0;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Temporal g(Temporal temporal) {
        return AbstractC0033i.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public int hashCode() {
        long J = J();
        return a().hashCode() ^ ((int) (J ^ (J >>> 32)));
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public boolean s() {
        return a().L(I(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int t(j$.time.temporal.n nVar) {
        return j$.time.temporal.k.a(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public String toString() {
        long jI = I(j$.time.temporal.a.YEAR_OF_ERA);
        long jI2 = I(j$.time.temporal.a.MONTH_OF_YEAR);
        long jI3 = I(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(V());
        sb.append(" ");
        sb.append(jI);
        sb.append(jI2 < 10 ? "-0" : "-");
        sb.append(jI2);
        sb.append(jI3 < 10 ? "-0" : "-");
        sb.append(jI3);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return j$.time.temporal.k.d(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0026b d(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return U(a(), nVar.y(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0026b f(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
            return U(a(), temporalUnit.y(this, j));
        }
        switch (AbstractC0027c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return X(j$.time.b.b(j, 7));
            case 3:
                return Y(j);
            case 4:
                return Z(j);
            case 5:
                return Z(j$.time.b.b(j, 10));
            case 6:
                return Z(j$.time.b.b(j, 100));
            case 7:
                return Z(j$.time.b.b(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.time.b.a(I(aVar), j), (j$.time.temporal.n) aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
