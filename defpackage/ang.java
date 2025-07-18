package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ang {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final long e;
    private final long f;
    private final boolean g;

    public ang() {
    }

    public final long a() {
        return this.f;
    }

    public final long b() {
        return this.e;
    }

    public final long c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ang) {
            ang angVar = (ang) obj;
            if (this.a == angVar.d() && this.b == angVar.g() && this.c == angVar.f() && this.d == angVar.c() && this.e == angVar.b() && this.f == angVar.a() && this.g == angVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean g() {
        return this.b;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = (((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        long j = this.d;
        int i3 = (i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f;
        return ((i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "PcsAttestationMeasurementConfig{enableAttestationMeasurement=" + this.a + ", scheduleAttestationJob=" + this.b + ", enableRandomJitter=" + this.c + ", minDelaySeconds=" + this.d + ", maxDelaySeconds=" + this.e + ", delaySeconds=" + this.f + ", enableContentBindingAsChallenge=" + this.g + "}";
    }

    public ang(boolean z, boolean z2, boolean z3, long j, long j2, long j3, boolean z4) {
        this();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z4;
    }
}
