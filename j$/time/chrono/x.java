package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class x extends AbstractC0025a implements Serializable {
    public static final x d = new x();
    private static final long serialVersionUID = 459996390165777884L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0035k A(Instant instant, ZoneId zoneId) {
        return m.V(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final String G() {
        return "japanese";
    }

    @Override // j$.time.chrono.n
    public final boolean L(long j) {
        return u.d.L(j);
    }

    @Override // j$.time.chrono.n
    public final o P(int i) {
        return A.q(i);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b n(int i) {
        return new z(LocalDate.i0(i, 1, 1));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "Japanese";
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r u(j$.time.temporal.a aVar) {
        switch (w.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(aVar)));
            case 5:
                return j$.time.temporal.r.k(1L, A.v(), 999999999 - A.l().n().d0());
            case 6:
                return j$.time.temporal.r.k(1L, A.u(), j$.time.temporal.a.DAY_OF_YEAR.p().d());
            case 7:
                return j$.time.temporal.r.j(z.d.d0(), 999999999L);
            case 8:
                return j$.time.temporal.r.j(A.d.getValue(), A.l().getValue());
            default:
                return aVar.p();
        }
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b v(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof z ? (z) temporalAccessor : new z(LocalDate.W(temporalAccessor));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
