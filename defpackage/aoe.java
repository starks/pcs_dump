package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoe extends vr {
    public final String a;
    public final Long b;

    public aoe() {
        super(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoe) {
            aoe aoeVar = (aoe) obj;
            if (this.a.equals(aoeVar.i()) && this.b.equals(aoeVar.h())) {
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
        return "LongFlag{name=" + this.a + ", defaultValue=" + this.b + "}";
    }

    public aoe(String str, Long l) {
        this();
        this.a = str;
        this.b = l;
    }
}
