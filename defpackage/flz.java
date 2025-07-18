package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flz extends fhf {
    public static final fhl b = new fhl();
    public final String a;

    public flz() {
        super(b);
        this.a = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flz) && fjs.c(this.a, ((flz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ")";
    }
}
