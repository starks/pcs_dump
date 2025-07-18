package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enj {
    public final String a;
    public final eni b;
    public final long c;
    public final enu d;
    public final enu e;

    public enj(String str, eni eniVar, long j, enu enuVar) {
        this.a = str;
        eniVar.getClass();
        this.b = eniVar;
        this.c = j;
        this.d = null;
        this.e = enuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enj) {
            enj enjVar = (enj) obj;
            if (a.g(this.a, enjVar.a) && a.g(this.b, enjVar.b) && this.c == enjVar.c) {
                enu enuVar = enjVar.d;
                if (a.g(null, null) && a.g(this.e, enjVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("description", this.a);
        crtVarQ.e("severity", this.b);
        crt crtVarB = crtVarQ.b("timestampNanos", this.c);
        crtVarB.e("channelRef", null);
        crtVarB.e("subchannelRef", this.e);
        return crtVarB.toString();
    }
}
