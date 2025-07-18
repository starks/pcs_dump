package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewb implements fbl {
    private Method b;
    private Method c;
    private Method d;

    public ewb(Class cls) {
        try {
            this.b = cls.getMethod("now", null);
            this.c = cls.getMethod("getNano", null);
            this.d = cls.getMethod("getEpochSecond", null);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.fbl
    public final long a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.b.invoke(null, null);
            int iIntValue = ((Integer) this.c.invoke(objInvoke, null)).intValue();
            long nanos = TimeUnit.SECONDS.toNanos(((Long) this.d.invoke(objInvoke, null)).longValue());
            long j = iIntValue;
            long j2 = nanos + j;
            return (((nanos ^ j2) > 0L ? 1 : ((nanos ^ j2) == 0L ? 0 : -1)) >= 0) | ((j ^ nanos) < 0) ? j2 : ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
