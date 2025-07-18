package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekq extends ekm {
    public static final /* synthetic */ int b = 0;

    static {
        ekp.a(Collections.EMPTY_MAP);
    }

    public ekq(Map map) {
        super(map);
    }

    @Override // defpackage.ffk, defpackage.ffj
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        LinkedHashMap linkedHashMapT = ebq.t(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            linkedHashMapT.put(entry.getKey(), ((ekr) entry.getValue()).b());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapT);
    }
}
