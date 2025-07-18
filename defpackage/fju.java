package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fju implements fjm {
    private final Class a;

    public fju(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.fjm
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fju) && fjs.c(this.a, ((fju) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
