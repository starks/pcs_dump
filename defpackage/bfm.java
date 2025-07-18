package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfm {
    private final boolean a;

    public bfm() {
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof bfm) && this.a == ((bfm) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PcsSurveyConfig{enableSurvey=" + this.a + "}";
    }

    public bfm(boolean z) {
        this();
        this.a = z;
    }
}
