package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdq {
    public final List a;
    private final String b;
    private final long c;
    private final List d;
    private final List e;

    public cdq(String str, long j, List list, List list2, List list3) {
        this.b = str;
        this.c = j;
        this.d = list;
        this.a = list2;
        this.e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdq)) {
            return false;
        }
        cdq cdqVar = (cdq) obj;
        return fjs.c(this.b, cdqVar.b) && this.c == cdqVar.c && fjs.c(this.d, cdqVar.d) && fjs.c(this.a, cdqVar.a) && fjs.c(this.e, cdqVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return ((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PolicyTarget(schemaName=" + this.b + ", maxAgeMs=" + this.c + ", retentions=" + this.d + ", fields=" + this.a + ", annotations=" + this.e + ")";
    }
}
