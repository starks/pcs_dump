package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class m implements InterfaceC0035k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C0031g a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private m(ZoneId zoneId, ZoneOffset zoneOffset, C0031g c0031g) {
        Objects.a(c0031g, "dateTime");
        this.a = c0031g;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    static InterfaceC0035k U(ZoneId zoneId, ZoneOffset zoneOffset, C0031g c0031g) {
        Objects.a(c0031g, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new m(zoneId, (ZoneOffset) zoneId, c0031g);
        }
        j$.time.zone.e eVarV = zoneId.V();
        LocalDateTime localDateTimeV = LocalDateTime.V(c0031g);
        List listG = eVarV.g(localDateTimeV);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = eVarV.f(localDateTimeV);
            c0031g = c0031g.X(bVarF.t().getSeconds());
            zoneOffset = bVarF.y();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.a(zoneOffset, "offset");
        return new m(zoneId, zoneOffset, c0031g);
    }

    static m V(n nVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.V().d(instant);
        Objects.a(zoneOffsetD, "offset");
        return new m(zoneId, zoneOffsetD, (C0031g) nVar.T(LocalDateTime.h0(instant.W(), instant.X(), zoneOffsetD)));
    }

    static m g(n nVar, Temporal temporal) {
        m mVar = (m) temporal;
        if (nVar.equals(mVar.a())) {
            return mVar;
        }
        throw new ClassCastException(j$.time.f.a("Chronology mismatch, required: ", nVar.o(), ", actual: ", mVar.a().o()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final ZoneId F() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        int i = AbstractC0034j.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? ((C0031g) r()).I(nVar) : h().c0() : R();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object O(j$.time.temporal.p pVar) {
        return AbstractC0033i.l(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final /* synthetic */ long R() {
        return AbstractC0033i.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0035k f(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return g(a(), temporalUnit.y(this, j));
        }
        return g(a(), this.a.f(j, temporalUnit).g(this));
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final n a() {
        return c().a();
    }

    @Override // j$.time.temporal.Temporal
    public final long b(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0035k interfaceC0035kN = a().N(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.b(interfaceC0035kN.i(this.b).r(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.t(this, interfaceC0035kN);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0026b c() {
        return ((C0031g) r()).c();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0033i.d(this, (InterfaceC0035k) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return g(a(), nVar.y(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = AbstractC0036l.a[aVar.ordinal()];
        if (i == 1) {
            return f(j - AbstractC0033i.o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0031g c0031g = this.a;
        if (i != 2) {
            return U(zoneId, this.b, c0031g.d(j, nVar));
        }
        return V(a(), c0031g.Z(ZoneOffset.f0(aVar.O(j))), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0035k) && AbstractC0033i.d(this, (InterfaceC0035k) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0035k i(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return V(a(), this.a.Z(this.b), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0035k j(ZoneId zoneId) {
        return U(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return g(a(), j$.time.temporal.k.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final InterfaceC0029e r() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int t(j$.time.temporal.n nVar) {
        return AbstractC0033i.e(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0035k
    public final LocalTime toLocalTime() {
        return ((C0031g) r()).toLocalTime();
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(LocalDate localDate) {
        return g(a(), localDate.g(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).p() : ((C0031g) r()).z(nVar) : nVar.z(this);
    }
}
