package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czy {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected czy() {
    }

    protected abstract Object a();

    public final Object b(czx czxVar, dbg dbgVar) {
        Object obj = this.a.get(czxVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = this.a.putIfAbsent(czxVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((czs) dbgVar).b;
        cfz cfzVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (czr.f.equals(dbgVar.c(i2))) {
                Object objE = dbgVar.e(i2);
                if (objE instanceof dac) {
                    if (cfzVar == null) {
                        cfzVar = new cfz((Object) this, (Object) czxVar, 5, (byte[]) null);
                    }
                    ((dac) objE).a();
                }
            }
        }
        return objA;
    }
}
