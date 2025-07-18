package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u extends AbstractC0025a implements Serializable {
    public static final u d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0035k A(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.V(instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final String G() {
        return "iso8601";
    }

    @Override // j$.time.chrono.n
    public final boolean L(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0025a, j$.time.chrono.n
    public final InterfaceC0035k N(Temporal temporal) {
        return ZonedDateTime.U(temporal);
    }

    @Override // j$.time.chrono.n
    public final o P(int i) {
        if (i == 0) {
            return v.BCE;
        }
        if (i == 1) {
            return v.CE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC0025a, j$.time.chrono.n
    public final InterfaceC0029e T(Temporal temporal) {
        return LocalDateTime.V(temporal);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b n(int i) {
        return LocalDate.i0(i, 1, 1);
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "ISO";
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r u(j$.time.temporal.a aVar) {
        return aVar.p();
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0026b v(TemporalAccessor temporalAccessor) {
        return LocalDate.W(temporalAccessor);
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
