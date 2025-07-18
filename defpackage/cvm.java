package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cvm implements cyn {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyn) {
            return a().equals(((cyn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
