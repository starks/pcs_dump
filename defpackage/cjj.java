package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjj extends cjk {
    public final egi a;
    private final een b;

    public cjj(egi egiVar, een eenVar) {
        if (egiVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = egiVar;
        if (eenVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = eenVar;
    }

    @Override // defpackage.cjk
    public final een a() {
        return this.b;
    }

    @Override // defpackage.cjk
    public final egi b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjk) {
            cjk cjkVar = (cjk) obj;
            if (this.a.equals(cjkVar.b()) && this.b.equals(cjkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        een eenVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + eenVar.toString() + "}";
    }
}
