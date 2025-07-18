package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class o implements p {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.p
    public final Object a(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                return (ZoneId) temporalAccessor.O(k.a);
            case 1:
                return (j$.time.chrono.n) temporalAccessor.O(k.b);
            case 2:
                return (TemporalUnit) temporalAccessor.O(k.c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.e(aVar)) {
                    return ZoneOffset.f0(temporalAccessor.t(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) temporalAccessor.O(k.a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.O(k.d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.e(aVar2)) {
                    return LocalDate.k0(temporalAccessor.I(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.e(aVar3)) {
                    return LocalTime.b0(temporalAccessor.I(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
