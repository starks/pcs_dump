package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgv {
    public static final bgv a;
    public static final bgv b;
    private final double c;
    private final int d;

    static {
        b(1, Double.valueOf(0.0d));
        a = a(3);
        a(4);
        b = a(5);
    }

    public bgv() {
    }

    static bgv a(int i) {
        clq.v(true);
        clq.v(true);
        return b(i, null);
    }

    static bgv b(int i, Double d) {
        if (d == null) {
            d = Double.valueOf(0.0d);
        }
        return new bgv(i, d.doubleValue());
    }

    public final double c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgv) {
            bgv bgvVar = (bgv) obj;
            if (this.d == bgvVar.d() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(bgvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = a.b(this.d) ^ 1000003;
        return ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c))) ^ (iB * 1000003);
    }

    public final String toString() {
        int i = this.d;
        return "LogSamplerResult{samplingDecision=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", overallEffectiveSamplingRate=" + this.c + "}";
    }

    public bgv(int i, double d) {
        this();
        this.d = i;
        this.c = d;
    }
}
