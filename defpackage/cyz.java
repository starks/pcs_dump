package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyz extends cxo {
    final transient Object a;

    public cyz(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.cwu
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.cxo, defpackage.cwu
    public final cxc d() {
        return cxc.q(this.a);
    }

    @Override // defpackage.cxo, defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final czc listIterator() {
        return new cxw(this.a);
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cxo, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.cxo, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
