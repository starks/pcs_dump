package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        Long lE = vVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = vVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.e(aVar) ? Long.valueOf(vVar.d().I(aVar)) : null;
        int i = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iO = aVar.O(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jF = j$.nio.file.attribute.p.f(j, 315569520000L) + 1;
            LocalDateTime localDateTimeH0 = LocalDateTime.h0(j$.nio.file.attribute.p.g(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jF > 0) {
                sb.append('+');
                sb.append(jF);
            }
            sb.append(localDateTimeH0);
            if (localDateTimeH0.b0() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeH02 = LocalDateTime.h0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeH02);
            if (localDateTimeH02.b0() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeH02.c0() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iO > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iO <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iO / i2;
                sb.append((char) (i3 + 48));
                iO -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
