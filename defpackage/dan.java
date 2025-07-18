package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dan implements czx {
    private final czx a;
    private final Object b;

    public dan(czx czxVar, Object obj) {
        czxVar.getClass();
        this.a = czxVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dan)) {
            return false;
        }
        dan danVar = (dan) obj;
        return this.a.equals(danVar.a) && this.b.equals(danVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
