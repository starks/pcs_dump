package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdw extends uq {
    private final String a;

    public cdw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdw) && fjs.c(this.a, ((cdw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Str(value=" + this.a + ")";
    }
}
