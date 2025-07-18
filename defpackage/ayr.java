package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayr {
    private final aog a;
    private final String b;

    public ayr() {
    }

    public final aog a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayr) {
            ayr ayrVar = (ayr) obj;
            if (this.a.equals(ayrVar.a()) && this.b.equals(ayrVar.b())) {
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
        return "BuildIdFlag{flagNamespace=" + this.a.e + ", flagName=" + this.b + "}";
    }

    public ayr(aog aogVar, String str) {
        this();
        if (aogVar == null) {
            throw new NullPointerException("Null flagNamespace");
        }
        this.a = aogVar;
        this.b = str;
    }
}
