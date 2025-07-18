package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezw {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public ezw(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = cxo.m(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ezw)) {
            return false;
        }
        ezw ezwVar = (ezw) obj;
        return this.a == ezwVar.a && this.b == ezwVar.b && this.c == ezwVar.c && Double.compare(this.d, ezwVar.d) == 0 && a.g(this.e, ezwVar.e) && a.g(this.f, ezwVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        crt crtVarB = clq.Q(this).a("maxAttempts", this.a).b("initialBackoffNanos", this.b).b("maxBackoffNanos", this.c);
        crtVarB.f("backoffMultiplier", String.valueOf(this.d));
        crtVarB.e("perAttemptRecvTimeoutNanos", this.e);
        crtVarB.e("retryableStatusCodes", this.f);
        return crtVarB.toString();
    }
}
