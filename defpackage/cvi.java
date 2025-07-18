package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvi extends cvg implements List {
    final /* synthetic */ cvj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvi(cvj cvjVar, Object obj, List list, cvg cvgVar) {
        super(cvjVar, obj, list, cvgVar);
        this.f = cvjVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        d().add(i, obj);
        this.f.b++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = d().addAll(i, collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final List d() {
        return (List) this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new cvh(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = d().remove(i);
        cvj cvjVar = this.f;
        cvjVar.b--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = d().subList(i, i2);
        cvg cvgVar = this.c;
        if (cvgVar == null) {
            cvgVar = this;
        }
        return this.f.e(this.a, listSubList, cvgVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new cvh(this, i);
    }
}
