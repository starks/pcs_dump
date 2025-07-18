package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amk {
    private final boolean a;
    private final long b;

    public amk() {
    }

    public final long a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amk) {
            amk amkVar = (amk) obj;
            if (this.a == amkVar.b() && this.b == amkVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PcsAiConfig{genAiInferenceServiceEnabled=" + this.a + ", genAiServiceConnectionTimeoutMs=" + this.b + "}";
    }

    public amk(boolean z, long j) {
        this();
        this.a = z;
        this.b = j;
    }
}
