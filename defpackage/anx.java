package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anx implements aoa {
    private final aoh a = new aoh();

    protected anx() {
    }

    protected abstract Object a();

    @Override // defpackage.aoa
    public final synchronized Object b() {
        return this.a.a(new fuu(this));
    }

    public final void c() {
        Object obj;
        aoh aohVar = this.a;
        Object objA = a();
        synchronized (aohVar) {
            obj = aohVar.b;
            aohVar.b = objA;
        }
        if (obj == null || objA.equals(obj)) {
            return;
        }
        Iterator it = aohVar.a.iterator();
        while (it.hasNext()) {
            ((aoi) it.next()).a();
        }
    }
}
