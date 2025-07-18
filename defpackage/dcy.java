package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcy {
    public static final Comparator a = new aep(6);
    public static final dcy b = new dcy(new dcw(Collections.EMPTY_LIST));
    public final dcw c;

    public dcy(dcw dcwVar) {
        this.c = dcwVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcy) && ((dcy) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
