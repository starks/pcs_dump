package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyv extends cxo {
    public static final cyv a;
    private static final Object[] e;
    final transient Object[] b;
    final transient Object[] c;
    public final transient int d;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        a = new cyv(objArr, 0, objArr, 0, 0);
    }

    public cyv(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.f = i;
        this.c = objArr2;
        this.g = i2;
        this.d = i3;
    }

    @Override // defpackage.cwu
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.d);
        return i + this.d;
    }

    @Override // defpackage.cwu
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cwu
    public final int c() {
        return 0;
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.c;
            if (objArr.length != 0) {
                int iE = dcr.E(obj);
                while (true) {
                    int i = iE & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iE = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cxo, defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final czc listIterator() {
        return d().iterator();
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cwu
    public final Object[] g() {
        return this.b;
    }

    @Override // defpackage.cxo, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f;
    }

    @Override // defpackage.cxo
    public final boolean i() {
        return true;
    }

    @Override // defpackage.cxo
    public final cxc k() {
        return cxc.l(this.b, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d;
    }

    @Override // defpackage.cxo, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
