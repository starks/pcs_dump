package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akt {
    private final boolean a;
    private final boolean b;
    private final long c;
    private final int d;
    private final boolean e;
    private final long f;
    private final long g;
    private final int h;

    public akt() {
    }

    public final int a() {
        return this.h;
    }

    public final int b() {
        return this.d;
    }

    public final long c() {
        return this.f;
    }

    public final long d() {
        return this.g;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akt) {
            akt aktVar = (akt) obj;
            if (this.a == aktVar.h() && this.b == aktVar.f() && this.c == aktVar.e() && this.d == aktVar.b() && this.e == aktVar.g() && this.f == aktVar.c() && this.g == aktVar.d() && this.h == aktVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = true != this.b ? 1237 : 1231;
        int i3 = i ^ 1000003;
        long j = this.c;
        int i4 = ((((((((i3 * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003;
        long j2 = this.f;
        int i5 = (i4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        return this.h ^ ((i5 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "InternalStatsLogConfig{enabled=" + this.a + ", activeUsersLoggerEnabled=" + this.b + ", activeUsersLoggingTimeoutSeconds=" + this.c + ", activeUsersLoggingMaxDelayHours=" + this.d + ", activeUsersLoggerNonPersistent=" + this.e + ", activeUsersLoggerNonPersistentInitialDelay=" + this.f + ", activeUsersLoggerNonPersistentPeriod=" + this.g + ", activeUsersLoggerRescheduleLimit=" + this.h + "}";
    }

    public akt(boolean z, boolean z2, long j, int i, boolean z3, long j2, long j3, int i2) {
        this();
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = i;
        this.e = z3;
        this.f = j2;
        this.g = j3;
        this.h = i2;
    }
}
