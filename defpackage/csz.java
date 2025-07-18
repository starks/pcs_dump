package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csz {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public csz() {
        clq.v(true);
        clq.v(true);
        clq.v(true);
        clq.v(true);
        clq.v(true);
        clq.v(true);
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof csz)) {
            return false;
        }
        csz cszVar = (csz) obj;
        long j = cszVar.a;
        long j2 = cszVar.b;
        long j3 = cszVar.c;
        long j4 = cszVar.d;
        long j5 = cszVar.e;
        long j6 = cszVar.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        return clq.Q(this).b("hitCount", 0L).b("missCount", 0L).b("loadSuccessCount", 0L).b("loadExceptionCount", 0L).b("totalLoadTime", 0L).b("evictionCount", 0L).toString();
    }
}
