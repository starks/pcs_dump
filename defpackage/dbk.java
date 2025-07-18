package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbk extends dbn {
    private final Map a;
    private final Map b;
    private final dbm c;
    private final dbl d;

    public dbk(dbj dbjVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(dbjVar.c);
        map2.putAll(dbjVar.d);
        this.c = dbjVar.e;
        this.d = dbjVar.f;
    }

    @Override // defpackage.dbn
    protected final void a(dae daeVar, Object obj, Object obj2) {
        dbm dbmVar = (dbm) this.a.get(daeVar);
        if (dbmVar != null) {
            dbmVar.a(daeVar, obj, obj2);
        } else {
            this.c.a(daeVar, obj, obj2);
        }
    }

    @Override // defpackage.dbn
    protected final void b(dae daeVar, Iterator it, Object obj) {
        dbl dblVar = (dbl) this.b.get(daeVar);
        if (dblVar != null) {
            dblVar.a(daeVar, it, obj);
        } else if (this.d != null && !this.a.containsKey(daeVar)) {
            this.d.a(daeVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(daeVar, it.next(), obj);
            }
        }
    }
}
