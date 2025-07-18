package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cys extends cxo {
    private final transient cxg a;
    private final transient cxc b;

    public cys(cxg cxgVar, cxc cxcVar) {
        this.a = cxgVar;
        this.b = cxcVar;
    }

    @Override // defpackage.cwu
    public final int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.cxo, defpackage.cwu
    public final cxc d() {
        return this.b;
    }

    @Override // defpackage.cxo, defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final czc listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.cxo, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
