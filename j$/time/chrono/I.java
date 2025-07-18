package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class I extends AbstractC0025a implements Serializable {
    public static final I d = new I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private I() {
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
        return "buddhist";
    }

    @Override // j$.time.chrono.n
    public final boolean L(long j) {
        return u.d.L(j - 543);
    }

    @Override // j$.time.chrono.n
    public final o P(int i) {
        if (i == 0) {
            return L.BEFORE_BE;
        }
        if (i == 1) {
            return L.BE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b n(int i) {
        return new K(LocalDate.i0(i - 543, 1, 1));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r u(j$.time.temporal.a aVar) {
        int i = H.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.r rVarP = j$.time.temporal.a.PROLEPTIC_MONTH.p();
            return j$.time.temporal.r.j(rVarP.e() + 6516, rVarP.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.r rVarP2 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.r.k(1L, (-(rVarP2.e() + 543)) + 1, rVarP2.d() + 543);
        }
        if (i != 3) {
            return aVar.p();
        }
        j$.time.temporal.r rVarP3 = j$.time.temporal.a.YEAR.p();
        return j$.time.temporal.r.j(rVarP3.e() + 543, rVarP3.d() + 543);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b v(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof K ? (K) temporalAccessor : new K(LocalDate.W(temporalAccessor));
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
