package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekn implements ekr, ejg {
    private static final Object a = new Object();
    private volatile ekr b;
    private volatile Object c = a;

    public ekn(ekr ekrVar) {
        this.b = ekrVar;
    }

    public static ekr a(ekr ekrVar) {
        ekrVar.getClass();
        return ekrVar instanceof ekn ? ekrVar : new ekn(ekrVar);
    }

    private final synchronized Object c() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objB = this.b.b();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objB) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objB + ". This is likely due to a circular dependency.");
        }
        this.c = objB;
        this.b = null;
        return objB;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final Object b() {
        Object obj = this.c;
        return obj == a ? c() : obj;
    }
}
