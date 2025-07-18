package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsm {
    private final Class a;
    private final Class b;

    public dsm(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dsm)) {
            return false;
        }
        dsm dsmVar = (dsm) obj;
        return dsmVar.a.equals(this.a) && dsmVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
