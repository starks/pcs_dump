package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class z extends AbstractC0028d {
    static final LocalDate d = LocalDate.i0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient LocalDate a;
    private transient A b;
    private transient int c;

    z(LocalDate localDate) {
        if (localDate.e0(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        A aK = A.k(localDate);
        this.b = aK;
        this.c = (localDate.d0() - aK.n().d0()) + 1;
        this.a = localDate;
    }

    private z c0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new z(localDate);
    }

    private z d0(A a, int i) {
        x.d.getClass();
        if (!(a instanceof A)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int iD0 = (a.n().d0() + i) - 1;
        if (i != 1 && (iD0 < -999999999 || iD0 > 999999999 || iD0 < a.n().d0() || a != A.k(LocalDate.i0(iD0, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return c0(this.a.s0(iD0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    /* renamed from: B */
    public final InterfaceC0026b p(long j, TemporalUnit temporalUnit) {
        return (z) super.p(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final int D() {
        A a = this.b;
        A aO = a.o();
        LocalDate localDate = this.a;
        int iD = (aO == null || aO.n().d0() != localDate.d0()) ? localDate.D() : aO.n().a0() - 1;
        return this.c == 1 ? iD - (a.n().a0() - 1) : iD;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = y.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        A a = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.a0() - a.n().a0()) + 1 : localDate.a0();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
            case 8:
                return a.getValue();
            default:
                return localDate.I(nVar);
        }
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final long J() {
        return this.a.J();
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final InterfaceC0029e M(LocalTime localTime) {
        return C0031g.V(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0028d
    public final o V() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b X(long j) {
        return c0(this.a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b Y(long j) {
        return c0(this.a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC0028d
    final InterfaceC0026b Z(long j) {
        return c0(this.a.o0(j));
    }

    @Override // j$.time.chrono.InterfaceC0026b
    public final n a() {
        return x.d;
    }

    @Override // j$.time.chrono.AbstractC0028d
    /* renamed from: a0 */
    public final InterfaceC0026b y(j$.time.temporal.l lVar) {
        return (z) super.y(lVar);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final z d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (z) super.d(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (I(aVar) == j) {
            return this;
        }
        int[] iArr = y.a;
        int i = iArr[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            int iA = x.d.u(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return d0(this.b, iA);
            }
            if (i2 == 8) {
                return d0(A.q(iA), this.c);
            }
            if (i2 == 9) {
                return c0(localDate.s0(iA));
            }
        }
        return c0(localDate.d(j, nVar));
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b, j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).I() : nVar != null && nVar.t(this);
    }

    @Override // j$.time.chrono.AbstractC0028d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b, j$.time.temporal.Temporal
    public final InterfaceC0026b f(long j, TemporalUnit temporalUnit) {
        return (z) super.f(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.chrono.InterfaceC0026b
    public final int hashCode() {
        x.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return (z) super.p(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return (z) super.y(localDate);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.z(this);
        }
        if (!e(nVar)) {
            throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = y.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.r.j(1L, this.a.f0());
        }
        if (i == 2) {
            return j$.time.temporal.r.j(1L, D());
        }
        if (i != 3) {
            return x.d.u(aVar);
        }
        A a = this.b;
        int iD0 = a.n().d0();
        return a.o() != null ? j$.time.temporal.r.j(1L, (r6.n().d0() - iD0) + 1) : j$.time.temporal.r.j(1L, 999999999 - iD0);
    }

    @Override // j$.time.chrono.AbstractC0028d, j$.time.temporal.Temporal
    public final Temporal f(long j, TemporalUnit temporalUnit) {
        return (z) super.f(j, temporalUnit);
    }
}
