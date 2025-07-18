package j$.time.zone;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.u;
import j$.time.k;
import j$.time.temporal.l;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final k a;
    private final byte b;
    private final j$.time.d c;
    private final LocalTime d;
    private final boolean e;
    private final c f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    d(k kVar, int i, j$.time.d dVar, LocalTime localTime, boolean z, c cVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = kVar;
        this.b = (byte) i;
        this.c = dVar;
        this.d = localTime;
        this.e = z;
        this.f = cVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    static d b(ObjectInput objectInput) {
        int i = objectInput.readInt();
        k kVarX = k.X(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        j$.time.d dVarU = i3 == 0 ? null : j$.time.d.U(i3);
        int i4 = (507904 & i) >>> 14;
        c cVar = c.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        LocalTime localTimeC0 = i4 == 31 ? LocalTime.c0(objectInput.readInt()) : LocalTime.a0(i4 % 24);
        ZoneOffset zoneOffsetF0 = ZoneOffset.f0(i5 == 255 ? objectInput.readInt() : (i5 - 128) * 900);
        ZoneOffset zoneOffsetF02 = ZoneOffset.f0(i6 == 3 ? objectInput.readInt() : (i6 * 1800) + zoneOffsetF0.c0());
        ZoneOffset zoneOffsetF03 = i7 == 3 ? ZoneOffset.f0(objectInput.readInt()) : ZoneOffset.f0((i7 * 1800) + zoneOffsetF0.c0());
        boolean z = i4 == 24;
        Objects.a(kVarX, "month");
        Objects.a(localTimeC0, "time");
        Objects.a(cVar, "timeDefnition");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTimeC0.equals(LocalTime.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeC0.Z() == 0) {
            return new d(kVarX, i2, dVarU, localTimeC0, z, cVar, zoneOffsetF0, zoneOffsetF02, zoneOffsetF03);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i) {
        LocalDate localDateJ0;
        k kVar = this.a;
        j$.time.d dVar = this.c;
        byte b = this.b;
        if (b < 0) {
            localDateJ0 = LocalDate.j0(i, kVar, kVar.V(u.d.L(i)) + 1 + b);
            if (dVar != null) {
                final int value = dVar.getValue();
                final int i2 = 1;
                localDateJ0 = (LocalDate) new l() { // from class: j$.time.temporal.m
                    @Override // j$.time.temporal.l
                    public final Temporal g(Temporal temporal) {
                        switch (i2) {
                            case 0:
                                int iT = temporal.t(a.DAY_OF_WEEK);
                                int i3 = value;
                                if (iT == i3) {
                                    return temporal;
                                }
                                return temporal.f(iT - i3 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                            default:
                                int iT2 = temporal.t(a.DAY_OF_WEEK);
                                int i4 = value;
                                if (iT2 == i4) {
                                    return temporal;
                                }
                                return temporal.p(i4 - iT2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                        }
                    }
                }.g(localDateJ0);
            }
        } else {
            localDateJ0 = LocalDate.j0(i, kVar, b);
            if (dVar != null) {
                final int value2 = dVar.getValue();
                final int i3 = 0;
                localDateJ0 = (LocalDate) new l() { // from class: j$.time.temporal.m
                    @Override // j$.time.temporal.l
                    public final Temporal g(Temporal temporal) {
                        switch (i3) {
                            case 0:
                                int iT = temporal.t(a.DAY_OF_WEEK);
                                int i32 = value2;
                                if (iT == i32) {
                                    return temporal;
                                }
                                return temporal.f(iT - i32 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                            default:
                                int iT2 = temporal.t(a.DAY_OF_WEEK);
                                int i4 = value2;
                                if (iT2 == i4) {
                                    return temporal;
                                }
                                return temporal.p(i4 - iT2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                        }
                    }
                }.g(localDateJ0);
            }
        }
        if (this.e) {
            localDateJ0 = localDateJ0.m0(1L);
        }
        LocalDateTime localDateTimeG0 = LocalDateTime.g0(localDateJ0, this.d);
        int iOrdinal = this.f.ordinal();
        ZoneOffset zoneOffset = this.h;
        if (iOrdinal == 0) {
            localDateTimeG0 = localDateTimeG0.j0(zoneOffset.c0() - ZoneOffset.UTC.c0());
        } else if (iOrdinal == 2) {
            localDateTimeG0 = localDateTimeG0.j0(zoneOffset.c0() - this.g.c0());
        }
        return new b(localDateTimeG0, zoneOffset, this.i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iK0 = ((this.d.k0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.d dVar = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (iK0 + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        k kVar = this.a;
        byte b = this.b;
        j$.time.d dVar = this.c;
        if (dVar == null) {
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dVar.name());
            sb.append(" on or before last day of ");
            sb.append(kVar.name());
        } else if (b < 0) {
            sb.append(dVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(kVar.name());
        } else {
            sb.append(dVar.name());
            sb.append(" on or after ");
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        LocalTime localTime = this.d;
        boolean z = this.e;
        int iK0 = z ? 86400 : localTime.k0();
        int iC0 = this.g.c0();
        ZoneOffset zoneOffset = this.h;
        int iC02 = zoneOffset.c0() - iC0;
        ZoneOffset zoneOffset2 = this.i;
        int iC03 = zoneOffset2.c0() - iC0;
        int iY = iK0 % 3600 == 0 ? z ? 24 : localTime.Y() : 31;
        int i = iC0 % 900 == 0 ? (iC0 / 900) + 128 : AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
        int i2 = (iC02 == 0 || iC02 == 1800 || iC02 == 3600) ? iC02 / 1800 : 3;
        int i3 = (iC03 == 0 || iC03 == 1800 || iC03 == 3600) ? iC03 / 1800 : 3;
        j$.time.d dVar = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (iY << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (iY == 31) {
            objectOutput.writeInt(iK0);
        }
        if (i == 255) {
            objectOutput.writeInt(iC0);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.c0());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.c0());
        }
    }
}
