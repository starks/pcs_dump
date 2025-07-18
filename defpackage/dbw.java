package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbw extends dbx {
    private final Map a;

    public dbw(dbg dbgVar, dbg dbgVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, dbgVar);
        d(linkedHashMap, dbgVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((dae) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, dbg dbgVar) {
        for (int i = 0; i < dbgVar.b(); i++) {
            dae daeVarC = dbgVar.c(i);
            Object obj = map.get(daeVarC);
            if (daeVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(daeVarC, arrayList);
                }
                arrayList.add(daeVarC.c(dbgVar.e(i)));
            } else {
                map.put(daeVarC, daeVarC.c(dbgVar.e(i)));
            }
        }
    }

    @Override // defpackage.dbx
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.dbx
    public final Set b() {
        return this.a.keySet();
    }

    @Override // defpackage.dbx
    public final void c(dbn dbnVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            dae daeVar = (dae) entry.getKey();
            Object value = entry.getValue();
            if (daeVar.b) {
                dbnVar.b(daeVar, ((List) value).iterator(), obj);
            } else {
                dbnVar.a(daeVar, value, obj);
            }
        }
    }
}
