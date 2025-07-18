package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cvj extends cvl implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected cvj(Map map) {
        clq.v(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override // defpackage.cyg
    public Collection b(Object obj) {
        throw null;
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    final List e(Object obj, List list, cvg cvgVar) {
        return list instanceof RandomAccess ? new cve(this, obj, list, cvgVar) : new cvi(this, obj, list, cvgVar);
    }

    @Override // defpackage.cvl
    public final Map f() {
        return new cvb(this, this.a);
    }

    @Override // defpackage.cvl
    public final Set g() {
        return new cvd(this, this.a);
    }

    public final void h() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    @Override // defpackage.cyg
    public final boolean i(Object obj) {
        return this.a.containsKey(obj);
    }
}
