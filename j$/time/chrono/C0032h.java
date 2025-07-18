package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0032h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final n a;
    final int b;
    final int c;
    final int d;

    static {
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C0032h(n nVar, int i, int i2, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private long a() {
        j$.time.temporal.r rVarU = this.a.u(j$.time.temporal.a.MONTH_OF_YEAR);
        if (rVarU.g() && rVarU.h()) {
            return (rVarU.d() - rVarU.e()) + 1;
        }
        return -1L;
    }

    private void b(Temporal temporal) {
        n nVar = (n) temporal.O(j$.time.temporal.k.e());
        if (nVar != null) {
            n nVar2 = this.a;
            if (!nVar2.equals(nVar)) {
                throw new j$.time.c(j$.time.f.a("Chronology mismatch, expected: ", nVar2.o(), ", actual: ", nVar.o()));
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0032h) {
            C0032h c0032h = (C0032h) obj;
            if (this.b == c0032h.b && this.c == c0032h.c && this.d == c0032h.d && this.a.equals(c0032h.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal g(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                instant = instant.f((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.f(i, ChronoUnit.YEARS);
                }
                instant = instant.f(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.f(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.f(i3, ChronoUnit.DAYS) : instant;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporalP = instant;
        if (i2 != 0) {
            long jA = a();
            Temporal temporalP2 = instant;
            if (jA > 0) {
                temporalP = instant.p((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporalP2 = instant.p(i, ChronoUnit.YEARS);
                }
                temporalP = ((Instant) temporalP2).p(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalP = instant.p(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporalP.p(i3, ChronoUnit.DAYS) : temporalP;
    }

    public final String toString() {
        n nVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return nVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.o());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }
}
