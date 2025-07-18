package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebc {
    private final ebi a;

    public ebc() {
    }

    public final ebi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebc) {
            return this.a.equals(((ebc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a().toString();
    }

    public ebc(ebi ebiVar) {
        this();
        this.a = ebiVar;
    }
}
