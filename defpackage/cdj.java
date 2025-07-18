package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdj implements csg {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private final csg b;

    public cdj(csg csgVar) {
        this.b = csgVar;
    }

    @Override // defpackage.csg
    public final Object a() {
        return this.b.a();
    }
}
