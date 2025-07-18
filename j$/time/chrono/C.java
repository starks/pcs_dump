package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class C extends AbstractC0025a implements Serializable {
    public static final C d = new C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C() {
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
        return "roc";
    }

    @Override // j$.time.chrono.n
    public final boolean L(long j) {
        return u.d.L(j + 1911);
    }

    @Override // j$.time.chrono.n
    public final o P(int i) {
        if (i == 0) {
            return F.BEFORE_ROC;
        }
        if (i == 1) {
            return F.ROC;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b n(int i) {
        return new E(LocalDate.i0(i + 1911, 1, 1));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "Minguo";
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r u(j$.time.temporal.a aVar) {
        int i = B.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.r rVarP = j$.time.temporal.a.PROLEPTIC_MONTH.p();
            return j$.time.temporal.r.j(rVarP.e() - 22932, rVarP.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.r rVarP2 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.r.k(1L, rVarP2.d() - 1911, (-rVarP2.e()) + 1912);
        }
        if (i != 3) {
            return aVar.p();
        }
        j$.time.temporal.r rVarP3 = j$.time.temporal.a.YEAR.p();
        return j$.time.temporal.r.j(rVarP3.e() - 1911, rVarP3.d() - 1911);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b v(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof E ? (E) temporalAccessor : new E(LocalDate.W(temporalAccessor));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
