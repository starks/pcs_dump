package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class q implements TemporalAmount, Serializable {
    public static final q d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private q(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    static q a(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        int i2 = objectInput.readInt();
        int i3 = objectInput.readInt();
        return ((i | i2) | i3) == 0 ? d : new q(i, i2, i3);
    }

    private static void b(Temporal temporal) {
        j$.time.chrono.n nVar = (j$.time.chrono.n) temporal.O(j$.time.temporal.k.e());
        if (nVar == null || j$.time.chrono.u.d.equals(nVar)) {
            return;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + nVar.o());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a == qVar.a && this.b == qVar.b && this.c == qVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal g(Instant instant) {
        b(instant);
        int i = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            if (j != 0) {
                instant = instant.f(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.f(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? instant.f(i3, ChronoUnit.DAYS) : instant;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Instant instant) {
        b(instant);
        int i = this.a;
        int i2 = this.b;
        Temporal temporalP = instant;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            temporalP = instant;
            if (j != 0) {
                temporalP = instant.p(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalP = instant.p(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        if (i3 == 0) {
            return temporalP;
        }
        return ((Instant) temporalP).p(i3, ChronoUnit.DAYS);
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
    }
}
