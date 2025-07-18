package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nd extends nk {
    public final HashMap a = new HashMap();

    @Override // defpackage.nk
    public final ng a(Object obj) {
        return (ng) this.a.get(obj);
    }

    @Override // defpackage.nk
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
