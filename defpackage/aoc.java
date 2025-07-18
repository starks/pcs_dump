package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoc extends vr {
    public final String a;
    public final Boolean b;

    public aoc() {
        super(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoc) {
            aoc aocVar = (aoc) obj;
            if (this.a.equals(aocVar.i()) && this.b.equals(aocVar.h())) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String i() {
        return this.a;
    }

    public final String toString() {
        return "BooleanFlag{name=" + this.a + ", defaultValue=" + this.b + "}";
    }

    public aoc(String str, Boolean bool) {
        this();
        this.a = str;
        this.b = bool;
    }
}
