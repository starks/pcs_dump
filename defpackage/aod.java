package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aod extends vr {
    public final String a;
    public final Integer b;

    public aod() {
        super(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aod) {
            aod aodVar = (aod) obj;
            if (this.a.equals(aodVar.i()) && this.b.equals(aodVar.h())) {
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
        return "IntegerFlag{name=" + this.a + ", defaultValue=" + this.b + "}";
    }

    public aod(String str, Integer num) {
        this();
        this.a = str;
        this.b = num;
    }
}
