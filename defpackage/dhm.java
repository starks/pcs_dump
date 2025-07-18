package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhm {
    static {
        Duration.ofSeconds(Long.MIN_VALUE);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
        BigDecimal.valueOf(9.223372036854776E18d);
        BigDecimal.valueOf(-9.223372036854776E18d);
    }

    public static boolean a(Duration duration) {
        return (duration.isNegative() || duration.isZero()) ? false : true;
    }

    public static void b(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}
