package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ekm implements eko {
    public final Map a;

    public ekm(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}
