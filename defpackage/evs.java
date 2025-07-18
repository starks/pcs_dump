package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evs implements eot {
    private final /* synthetic */ int a;

    public evs(int i) {
        this.a = i;
    }

    @Override // defpackage.eot
    public final /* synthetic */ Object a(String str) throws NumberFormatException {
        if (this.a != 0) {
            return str;
        }
        clq.w(str.length() > 0, "empty timeout");
        clq.w(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
    }

    @Override // defpackage.eot
    public final /* synthetic */ String b(Object obj) {
        if (this.a != 0) {
            return (String) obj;
        }
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l.longValue() < 100000000) {
            Objects.toString(l);
            return l.toString().concat("n");
        }
        if (l.longValue() < 100000000000L) {
            return timeUnit.toMicros(l.longValue()) + "u";
        }
        if (l.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l.longValue()) + "m";
        }
        if (l.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l.longValue()) + "S";
        }
        if (l.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l.longValue()) + "M";
        }
        return timeUnit.toHours(l.longValue()) + "H";
    }
}
