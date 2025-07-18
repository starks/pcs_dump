package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axf {
    public final int a;
    public final long b;
    public final long c;

    public axf() {
    }

    public final int a() {
        return this.a;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axf) {
            axf axfVar = (axf) obj;
            if (this.a == axfVar.a() && this.b == axfVar.c() && this.c == axfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        int i = this.a;
        long j2 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "NetworkUsageSummary{updatesCount=" + this.a + ", totalUpload=" + this.b + ", totalDownload=" + this.c + "}";
    }

    public axf(int i, long j, long j2) {
        this();
        this.a = i;
        this.b = j;
        this.c = j2;
    }
}
