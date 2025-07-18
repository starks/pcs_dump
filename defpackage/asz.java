package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asz {
    public static final /* synthetic */ int a = 0;
    private static final Duration b = Duration.ofSeconds(60);
    private static final Duration c = Duration.ofSeconds(60);
    private static final Duration d = Duration.ofSeconds(60);

    public static fqu a() {
        fqt fqtVar = new fqt();
        Duration duration = b;
        duration.getClass();
        long millis = duration.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        fqtVar.p = frh.B(millis, timeUnit);
        Duration duration2 = c;
        duration2.getClass();
        long millis2 = duration2.toMillis();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        timeUnit2.getClass();
        fqtVar.q = frh.B(millis2, timeUnit2);
        Duration duration3 = d;
        duration3.getClass();
        long millis3 = duration3.toMillis();
        TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
        timeUnit3.getClass();
        fqtVar.r = frh.B(millis3, timeUnit3);
        fqtVar.d = true;
        return new fqu(fqtVar);
    }
}
