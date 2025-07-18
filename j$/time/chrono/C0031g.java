package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0031g implements InterfaceC0029e, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient InterfaceC0026b a;
    private final transient LocalTime b;

    private C0031g(InterfaceC0026b interfaceC0026b, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = interfaceC0026b;
        this.b = localTime;
    }

    static C0031g U(n nVar, Temporal temporal) {
        C0031g c0031g = (C0031g) temporal;
        if (nVar.equals(c0031g.a.a())) {
            return c0031g;
        }
        throw new ClassCastException(j$.time.f.a("Chronology mismatch, required: ", nVar.o(), ", actual: ", c0031g.a.a().o()));
    }

    static C0031g V(InterfaceC0026b interfaceC0026b, LocalTime localTime) {
        return new C0031g(interfaceC0026b, localTime);
    }

    private C0031g Y(InterfaceC0026b interfaceC0026b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeB0 = this.b;
        if (j5 == 0) {
            return b0(interfaceC0026b, localTimeB0);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jJ0 = localTimeB0.j0();
        long j10 = j9 + jJ0;
        long jF = j$.nio.file.attribute.p.f(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jG = j$.nio.file.attribute.p.g(j10, 86400000000000L);
        if (jG != jJ0) {
            localTimeB0 = LocalTime.b0(jG);
        }
        return b0(interfaceC0026b.f(jF, (TemporalUnit) ChronoUnit.DAYS), localTimeB0);
    }

    private C0031g b0(Temporal temporal, LocalTime localTime) {
        InterfaceC0026b interfaceC0026b = this.a;
        return (interfaceC0026b == temporal && this.b == localTime) ? this : new C0031g(AbstractC0028d.U(interfaceC0026b.a(), temporal), localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final InterfaceC0035k C(ZoneOffset zoneOffset) {
        return m.U(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).V() ? this.b.I(nVar) : this.a.I(nVar) : nVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object O(j$.time.temporal.p pVar) {
        return AbstractC0033i.k(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C0031g f(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0026b interfaceC0026b = this.a;
        if (!z) {
            return U(interfaceC0026b.a(), temporalUnit.y(this, j));
        }
        int i = AbstractC0030f.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        switch (i) {
            case 1:
                return Y(this.a, 0L, 0L, 0L, j);
            case 2:
                C0031g c0031gB0 = b0(interfaceC0026b.f(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0031gB0.Y(c0031gB0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0031g c0031gB02 = b0(interfaceC0026b.f(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0031gB02.Y(c0031gB02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return X(j);
            case 5:
                return Y(this.a, 0L, j, 0L, 0L);
            case 6:
                return Y(this.a, j, 0L, 0L, 0L);
            case 7:
                C0031g c0031gB03 = b0(interfaceC0026b.f(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0031gB03.Y(c0031gB03.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return b0(interfaceC0026b.f(j, temporalUnit), localTime);
        }
    }

    final C0031g X(long j) {
        return Y(this.a, 0L, 0L, j, 0L);
    }

    public final Instant Z(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(AbstractC0033i.n(this, zoneOffset), this.b.Z());
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final n a() {
        return this.a.a();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C0031g d(long j, j$.time.temporal.n nVar) {
        boolean z = nVar instanceof j$.time.temporal.a;
        InterfaceC0026b interfaceC0026b = this.a;
        if (!z) {
            return U(interfaceC0026b.a(), nVar.y(this, j));
        }
        boolean zV = ((j$.time.temporal.a) nVar).V();
        LocalTime localTime = this.b;
        return zV ? b0(interfaceC0026b, localTime.d(j, nVar)) : b0(interfaceC0026b.d(j, nVar), localTime);
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0026b interfaceC0026b = this.a;
        InterfaceC0029e interfaceC0029eT = interfaceC0026b.a().T(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.t(this, interfaceC0029eT);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        LocalTime localTime = this.b;
        if (!z) {
            InterfaceC0026b interfaceC0026bC = interfaceC0029eT.c();
            if (interfaceC0029eT.toLocalTime().compareTo(localTime) < 0) {
                interfaceC0026bC = interfaceC0026bC.p(1L, chronoUnit);
            }
            return interfaceC0026b.b(interfaceC0026bC, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jI = interfaceC0029eT.I(aVar) - interfaceC0026b.I(aVar);
        switch (AbstractC0030f.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jI = j$.time.b.b(jI, 86400000000000L);
                break;
            case 2:
                jI = j$.time.b.b(jI, 86400000000L);
                break;
            case 3:
                jI = j$.time.b.b(jI, 86400000L);
                break;
            case 4:
                jI = j$.time.b.b(jI, 86400);
                break;
            case 5:
                jI = j$.time.b.b(jI, 1440);
                break;
            case 6:
                jI = j$.time.b.b(jI, 24);
                break;
            case 7:
                jI = j$.time.b.b(jI, 2);
                break;
        }
        return j$.time.b.a(jI, localTime.b(interfaceC0029eT.toLocalTime(), temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final InterfaceC0026b c() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.I() || aVar.V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0029e) && AbstractC0033i.c(this, (InterfaceC0029e) obj) == 0;
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(c().J(), j$.time.temporal.a.EPOCH_DAY).d(toLocalTime().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: m */
    public final /* synthetic */ int compareTo(InterfaceC0029e interfaceC0029e) {
        return AbstractC0033i.c(this, interfaceC0029e);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return U(this.a.a(), j$.time.temporal.k.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int t(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).V() ? this.b.t(nVar) : this.a.t(nVar) : z(nVar).a(I(nVar), nVar);
    }

    @Override // j$.time.chrono.InterfaceC0029e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return b0(localDate, this.b);
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
