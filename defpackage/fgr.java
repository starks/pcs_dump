package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgr extends fgh implements List, RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final fgt d;
    private final fgr e;

    public fgr(Object[] objArr, int i, int i2, fgr fgrVar, fgt fgtVar) {
        objArr.getClass();
        fgtVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = fgrVar;
        this.d = fgtVar;
        this.modCount = fgtVar.modCount;
    }

    private final int d(int i, int i2, Collection collection, boolean z) {
        int iD;
        fgr fgrVar = this.e;
        if (fgrVar != null) {
            iD = fgrVar.d(i, i2, collection, z);
        } else {
            fgt fgtVar = this.d;
            fgt fgtVar2 = fgt.a;
            iD = fgtVar.d(i, i2, collection, z);
        }
        if (iD > 0) {
            j();
        }
        this.c -= iD;
        return iD;
    }

    private final Object e(int i) {
        Object objE;
        j();
        fgr fgrVar = this.e;
        if (fgrVar != null) {
            objE = fgrVar.e(i);
        } else {
            fgt fgtVar = this.d;
            fgt fgtVar2 = fgt.a;
            objE = fgtVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        fgr fgrVar = this.e;
        if (fgrVar != null) {
            fgrVar.f(i, collection, i2);
        } else {
            fgt fgtVar = this.d;
            fgt fgtVar2 = fgt.a;
            fgtVar.f(i, collection, i2);
        }
        fgt fgtVar3 = this.d;
        fgt fgtVar4 = fgt.a;
        this.a = fgtVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        fgr fgrVar = this.e;
        if (fgrVar != null) {
            fgrVar.g(i, obj);
        } else {
            fgt fgtVar = this.d;
            fgt fgtVar2 = fgt.a;
            fgtVar.g(i, obj);
        }
        fgt fgtVar3 = this.d;
        fgt fgtVar4 = fgt.a;
        this.a = fgtVar3.b;
        this.c++;
    }

    private final void h() {
        fgt fgtVar = fgt.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        fgr fgrVar = this.e;
        if (fgrVar != null) {
            fgrVar.k(i, i2);
        } else {
            fgt fgtVar = this.d;
            fgt fgtVar2 = fgt.a;
            fgtVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        fgt fgtVar = fgt.a;
        return this.d.d;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (l()) {
            return new fhb(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.fgh
    public final int a() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        ffh.aq(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        ffh.aq(i, this.c);
        int i2 = this.b + i;
        int size = collection.size();
        f(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.fgh
    public final Object b(int i) {
        i();
        h();
        ffh.ap(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ffh.m(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        ffh.ap(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return ffh.i(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (fjs.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (fjs.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return d(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return d(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        ffh.ap(i, this.c);
        int i2 = this.b;
        Object[] objArr = this.a;
        int i3 = i2 + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ffh.ar(i, i2, this.c);
        return new fgr(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return ffh.Y(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return ffh.j(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        ffh.aq(i, this.c);
        return new fgs(this, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        Object[] objArr3 = this.a;
        int i3 = this.b;
        ffh.ag(objArr3, objArr, 0, i3, i + i3);
        ffh.T(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}
