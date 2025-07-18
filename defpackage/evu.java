package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evu {
    final int a;
    final long b;
    final Set c;

    public evu(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = cxo.m(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            evu evuVar = (evu) obj;
            if (this.a == evuVar.a && this.b == evuVar.b && a.g(this.c, evuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        crt crtVarB = clq.Q(this).a("maxAttempts", this.a).b("hedgingDelayNanos", this.b);
        crtVarB.e("nonFatalStatusCodes", this.c);
        return crtVarB.toString();
    }
}
