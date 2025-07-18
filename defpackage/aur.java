package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aur {
    private final boolean a;
    private final boolean b;

    public aur() {
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aur) {
            aur aurVar = (aur) obj;
            if (this.a == aurVar.a() && this.b == aurVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "NetworkUsageLogConfig{networkUsageLogEnabled=" + this.a + ", rejectUnknownRequests=" + this.b + "}";
    }

    public aur(boolean z, boolean z2) {
        this();
        this.a = z;
        this.b = z2;
    }
}
