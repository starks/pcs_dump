package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cvl implements cyg {
    private transient Set a;
    private transient Map b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyg) {
            return j().equals(((cyg) obj).j());
        }
        return false;
    }

    public abstract Map f();

    public abstract Set g();

    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.cyg
    public Map j() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        Map mapF = f();
        this.b = mapF;
        return mapF;
    }

    public final Set k() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.a = setG;
        return setG;
    }

    public final String toString() {
        return j().toString();
    }
}
