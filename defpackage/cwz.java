package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwz extends cxc {
    private final transient cxc a;

    public cwz(cxc cxcVar) {
        this.a = cxcVar;
    }

    private final int w(int i) {
        return (size() - 1) - i;
    }

    private final int x(int i) {
        return size() - i;
    }

    @Override // defpackage.cxc, defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return this.a.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        clq.K(i, size());
        return this.a.get(w(i));
    }

    @Override // defpackage.cxc
    public final cxc h() {
        return this.a;
    }

    @Override // defpackage.cxc
    /* renamed from: i */
    public final cxc subList(int i, int i2) {
        clq.E(i, i2, size());
        return this.a.subList(x(i2), x(i)).h();
    }

    @Override // defpackage.cxc, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return w(iLastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.cxc, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return w(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.cxc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.cxc, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
