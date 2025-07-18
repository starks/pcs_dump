package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkk {
    private final Object a;
    private final String b;

    public bkk(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkk)) {
            return false;
        }
        bkk bkkVar = (bkk) obj;
        return this.a == bkkVar.a && this.b.equals(bkkVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
