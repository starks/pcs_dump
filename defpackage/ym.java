package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class ym {
    final Map a = new HashMap();
    final Map b;

    public ym(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            yu yuVar = (yu) entry.getValue();
            List arrayList = (List) this.a.get(yuVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(yuVar, arrayList);
            }
            arrayList.add((yn) entry.getKey());
        }
    }

    public static void a(List list, yz yzVar, yu yuVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            yn ynVar = (yn) list.get(size);
            try {
                int i = ynVar.a;
                if (i == 0) {
                    ynVar.b.invoke(obj, null);
                } else if (i != 1) {
                    ynVar.b.invoke(obj, yzVar, yuVar);
                } else {
                    ynVar.b.invoke(obj, yzVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
