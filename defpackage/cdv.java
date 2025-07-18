package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdv extends uq {
    private final int a;

    public cdv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdv) && this.a == ((cdv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Num(value=" + this.a + ")";
    }
}
