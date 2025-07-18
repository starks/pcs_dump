package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aop {
    private final boolean a;

    public aop() {
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aop) && this.a == ((aop) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PolicyConfig{enableConsentCheckInPcs=" + this.a + "}";
    }

    public aop(boolean z) {
        this();
        this.a = z;
    }
}
