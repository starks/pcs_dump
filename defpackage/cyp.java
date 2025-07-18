package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyp extends cxc {
    public static final cxc a = new cyp(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public cyp(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.cxc, defpackage.cwu
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.cwu
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cwu
    public final int c() {
        return 0;
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cwu
    public final Object[] g() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        clq.K(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.cxc, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
