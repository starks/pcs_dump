package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public r() {
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.i0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.g0(LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.i0(objectInput));
            case 6:
                return ZonedDateTime.Y(objectInput);
            case 7:
                int i = w.d;
                return ZoneId.W(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.h0(objectInput);
            case 9:
                return p.W(objectInput);
            case 10:
                return OffsetDateTime.W(objectInput);
            case 11:
                int i2 = t.b;
                return t.U(objectInput.readInt());
            case 12:
                int i3 = v.c;
                return v.V(objectInput.readInt(), objectInput.readByte());
            case 13:
                return m.U(objectInput);
            case 14:
                return q.a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).b0(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).t0(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).n0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).o0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).b0(objectOutput);
                return;
            case 7:
                ((w) obj).b0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).i0(objectOutput);
                return;
            case 9:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((t) obj).Y(objectOutput);
                return;
            case 12:
                ((v) obj).b0(objectOutput);
                return;
            case 13:
                ((m) obj).V(objectOutput);
                return;
            case 14:
                ((q) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
