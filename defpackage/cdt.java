package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdt {
    private final String a;
    private final Map b;

    public cdt(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdt)) {
            return false;
        }
        cdt cdtVar = (cdt) obj;
        return fjs.c(this.a, cdtVar.a) && fjs.c(this.b, cdtVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Annotation(name=" + this.a + ", params=" + this.b + ")";
    }
}
