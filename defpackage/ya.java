package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ya {
    public static final ya a = new ya(fgo.a, fgn.a);
    public final Set b;
    public final Map c;

    public ya(Set set, Map map) {
        this.b = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.c = linkedHashMap;
    }
}
