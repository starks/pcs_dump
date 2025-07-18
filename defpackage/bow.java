package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bow {
    public final bnu a;
    public final exo b;

    public bow() {
    }

    public final bnu a() {
        return this.a;
    }

    public final exo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        exo exoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bow) {
            bow bowVar = (bow) obj;
            if (this.a.equals(bowVar.a()) && ((exoVar = this.b) != null ? exoVar.equals(bowVar.b()) : bowVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        exo exoVar = this.b;
        return (exoVar == null ? 0 : exoVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        exo exoVar = this.b;
        return "InitializedHandle{handle=" + this.a.toString() + ", appSideVmProcess=" + String.valueOf(exoVar) + "}";
    }

    public bow(bnu bnuVar, exo exoVar) {
        this();
        if (bnuVar == null) {
            throw new NullPointerException("Null handle");
        }
        this.a = bnuVar;
        this.b = exoVar;
    }
}
