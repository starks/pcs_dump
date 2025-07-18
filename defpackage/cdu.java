package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdu extends uq {
    private final boolean a;

    public cdu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdu) && this.a == ((cdu) obj).a;
    }

    public final int hashCode() {
        return a.d(this.a);
    }

    public final String toString() {
        return "Bool(value=" + this.a + ")";
    }
}
