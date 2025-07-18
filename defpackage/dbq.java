package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbq {
    private static final dbm a = new dbo();
    private static final dbl b = new dbp();

    public static dbn a(Set set) {
        dbj dbjVar = new dbj(a);
        dbjVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dae daeVar = (dae) it.next();
            daeVar.getClass();
            if (daeVar.b) {
                dbl dblVar = dbj.b;
                cnx.U(true, "key must be repeating");
                dbjVar.c.remove(daeVar);
                dbjVar.d.put(daeVar, dblVar);
            } else {
                Map map = dbjVar.d;
                dbm dbmVar = dbj.a;
                map.remove(daeVar);
                dbjVar.c.put(daeVar, dbmVar);
            }
        }
        return new dbk(dbjVar);
    }
}
