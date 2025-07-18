package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ard {
    private final boolean a;
    private final boolean b;

    public ard() {
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ard) {
            ard ardVar = (ard) obj;
            if (this.a == ardVar.b() && this.b == ardVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "StatsdConfig{enablePlatformLogging=" + this.a + ", enableMetricWisePopulations=" + this.b + "}";
    }

    public ard(boolean z, boolean z2) {
        this();
        this.a = z;
        this.b = z2;
    }
}
