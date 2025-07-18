package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdp {
    private final boolean a;
    private final int b;

    public cdp(int i, boolean z) {
        if (i == 0) {
            throw null;
        }
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdp)) {
            return false;
        }
        cdp cdpVar = (cdp) obj;
        return this.b == cdpVar.b && this.a == cdpVar.a;
    }

    public final int hashCode() {
        return (cdr.b(this.b) * 31) + a.d(this.a);
    }

    public final String toString() {
        return "PolicyRetention(medium=" + ((Object) cdr.a(this.b)) + ", encryptionRequired=" + this.a + ")";
    }
}
