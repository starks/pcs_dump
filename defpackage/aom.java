package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aom {
    private final boolean a;

    public aom() {
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aom) && this.a == ((aom) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PcsCommonConfig{enableHeartBeatJob=" + this.a + "}";
    }

    public aom(boolean z) {
        this();
        this.a = z;
    }
}
