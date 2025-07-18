package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dri {
    public static final dri a;
    public final Map b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    static {
        ekb ekbVar = new ekb();
        if (ekbVar.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        dri driVar = new dri(DesugarCollections.unmodifiableMap(ekbVar.a));
        ekbVar.a = null;
        a = driVar;
    }

    public dri(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dri) {
            return this.b.equals(((dri) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
