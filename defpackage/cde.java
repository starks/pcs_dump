package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cde {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final double h;

    public cde() {
    }

    public final double a() {
        return this.h;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cde) {
            cde cdeVar = (cde) obj;
            if (this.a == cdeVar.b() && this.b == cdeVar.c() && this.c == cdeVar.d() && this.d == cdeVar.e() && this.e == cdeVar.f() && this.f == cdeVar.g() && this.g == cdeVar.h() && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(cdeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        long jDoubleToLongBits = (Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h);
        int i = true != this.f ? 1237 : 1231;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.d;
        int i6 = this.e;
        return ((int) jDoubleToLongBits) ^ ((((i ^ ((((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        return "HttpConfig{connectTimeoutMs=" + this.a + ", readTimeoutMs=" + this.b + ", requestBodyChunkSizeBytes=" + this.c + ", responseBodyChunkSizeBytes=" + this.d + ", responseBodyGzipBufferSizeBytes=" + this.e + ", callDisconnectWhenCancelled=" + this.f + ", supportAcceptEncodingHeader=" + this.g + ", estimatedHttp2HeaderCompressionRatio=" + this.h + "}";
    }

    public cde(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, double d) {
        this();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
        this.h = d;
    }
}
