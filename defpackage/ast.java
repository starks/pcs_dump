package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ast {
    private final boolean a;
    private final int b;
    private final boolean c;

    public ast() {
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ast) {
            ast astVar = (ast) obj;
            if (this.a == astVar.b() && this.b == astVar.a() && this.c == astVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "PcsHttpConfig{onReadyHandlerEnabled=" + this.a + ", ipcStreamingThrottleMs=" + this.b + ", writeToPfd=" + this.c + "}";
    }

    public ast(boolean z, int i, boolean z2) {
        this();
        this.a = z;
        this.b = i;
        this.c = z2;
    }
}
