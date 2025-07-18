package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bak {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public bak() {
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bak) {
            bak bakVar = (bak) obj;
            if (this.a == bakVar.c() && this.b == bakVar.a() && this.c == bakVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "ProtectedDownloadConfig{enabled=" + this.a + ", enableProtectedDownloadAttestation=" + this.b + ", enableProtectedDownloadVirtualMachines=" + this.c + "}";
    }

    public bak(boolean z, boolean z2, boolean z3) {
        this();
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
