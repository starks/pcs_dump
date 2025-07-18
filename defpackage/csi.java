package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csi implements csg {
    private static final csg a = new bzh(5);
    private volatile csg b;
    private Object c;
    private final fjk d = new fjk();

    public csi(csg csgVar) {
        this.b = csgVar;
    }

    @Override // defpackage.csg
    public final Object a() {
        csg csgVar = this.b;
        csg csgVar2 = a;
        if (csgVar != csgVar2) {
            synchronized (this.d) {
                if (this.b != csgVar2) {
                    Object objA = this.b.a();
                    this.c = objA;
                    this.b = csgVar2;
                    return objA;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        }
        return a.H(obj, "Suppliers.memoize(", ")");
    }
}
