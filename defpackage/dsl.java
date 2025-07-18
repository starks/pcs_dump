package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsl {
    private final Class a;
    private final dwt b;

    public dsl(Class cls, dwt dwtVar) {
        this.a = cls;
        this.b = dwtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dsl)) {
            return false;
        }
        dsl dslVar = (dsl) obj;
        return dslVar.a.equals(this.a) && dslVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        dwt dwtVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(dwtVar);
    }
}
