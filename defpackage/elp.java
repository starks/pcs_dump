package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elp {
    public static final elp a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new elp(identityHashMap);
    }

    public elp(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(elo eloVar) {
        return this.b.get(eloVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        elp elpVar = (elp) obj;
        if (this.b.size() != elpVar.b.size()) {
            return false;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            if (!elpVar.b.containsKey(entry.getKey()) || !a.g(entry.getValue(), elpVar.b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
