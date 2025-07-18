package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyw extends cxt {
    public static final cyw c;
    final transient cxc d;

    static {
        int i = cxc.d;
        c = new cyw(cyp.a, cyi.a);
    }

    public cyw(cxc cxcVar, Comparator comparator) {
        super(comparator);
        this.d = cxcVar;
    }

    final int A(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((cxt) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final cyw B(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return x(this.a);
        }
        cxc cxcVar = this.d;
        return new cyw(cxcVar.subList(i, i2), this.a);
    }

    @Override // defpackage.cwu
    public final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // defpackage.cwu
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.cwu
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.cxt, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iA = A(obj, true);
        if (iA == size()) {
            return null;
        }
        return this.d.get(iA);
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof cyh) {
            collection = ((cyh) collection).a();
        }
        if (!dcr.f(((cxt) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        czc czcVarListIterator = listIterator();
        Iterator it = collection.iterator();
        if (!czcVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = czcVarListIterator.next();
        while (true) {
            try {
                int iH = h(next2, next);
                if (iH >= 0) {
                    if (iH != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!czcVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = czcVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.cxo, defpackage.cwu
    public final cxc d() {
        return this.d;
    }

    @Override // defpackage.cxt, defpackage.cxo, defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final czc listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.cxo, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!dcr.f(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            czc czcVarListIterator = listIterator();
            while (czcVarListIterator.hasNext()) {
                Object next = czcVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || h(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.cwu
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.cxt, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.cxt, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZ = z(obj, true) - 1;
        if (iZ == -1) {
            return null;
        }
        return this.d.get(iZ);
    }

    @Override // defpackage.cwu
    public final Object[] g() {
        return this.d.g();
    }

    @Override // defpackage.cxt, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iA = A(obj, false);
        if (iA == size()) {
            return null;
        }
        return this.d.get(iA);
    }

    @Override // defpackage.cxt, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.cxt, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZ = z(obj, false) - 1;
        if (iZ == -1) {
            return null;
        }
        return this.d.get(iZ);
    }

    @Override // defpackage.cxt
    public final cxt q() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? x(comparatorReverseOrder) : new cyw(this.d.h(), comparatorReverseOrder);
    }

    @Override // defpackage.cxt
    public final cxt s(Object obj, boolean z) {
        return B(0, z(obj, z));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.cxt
    public final cxt u(Object obj, boolean z, Object obj2, boolean z2) {
        return w(obj, z).s(obj2, z2);
    }

    @Override // defpackage.cxt
    public final cxt w(Object obj, boolean z) {
        return B(A(obj, z), size());
    }

    @Override // defpackage.cxt, defpackage.cxo, defpackage.cwu
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.cxt, java.util.NavigableSet
    /* renamed from: y */
    public final czc descendingIterator() {
        return this.d.h().iterator();
    }

    final int z(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((cxt) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }
}
