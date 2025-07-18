package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvg extends AbstractCollection {
    final Object a;
    Collection b;
    final cvg c;
    final Collection d;
    final /* synthetic */ cvj e;

    public cvg(cvj cvjVar, Object obj, Collection collection, cvg cvgVar) {
        this.e = cvjVar;
        this.a = obj;
        this.b = collection;
        this.c = cvgVar;
        this.d = cvgVar == null ? null : cvgVar.b;
    }

    final void a() {
        cvg cvgVar = this.c;
        if (cvgVar != null) {
            cvgVar.a();
            return;
        }
        cvj cvjVar = this.e;
        cvjVar.a.put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.e.b++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final void b() {
        cvg cvgVar = this.c;
        if (cvgVar != null) {
            cvgVar.b();
            cvg cvgVar2 = this.c;
            if (cvgVar2.b != this.d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.b.isEmpty()) {
            cvj cvjVar = this.e;
            Collection collection = (Collection) cvjVar.a.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    final void c() {
        cvg cvgVar = this.c;
        if (cvgVar != null) {
            cvgVar.c();
        } else if (this.b.isEmpty()) {
            cvj cvjVar = this.e;
            cvjVar.a.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.b -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new cvf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            cvj cvjVar = this.e;
            cvjVar.b--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}
