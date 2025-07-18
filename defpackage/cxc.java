package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cxc extends cwu implements List, RandomAccess, j$.util.List {
    private static final czd a = new czd(cyp.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static cwy j(int i) {
        dcr.O(i, "expectedSize");
        return new cwy(i);
    }

    static cxc k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    static cxc l(Object[] objArr, int i) {
        return i == 0 ? cyp.a : new cyp(objArr, i);
    }

    public static cxc m(Object... objArr) {
        dcr.m(objArr);
        return k(objArr);
    }

    public static cxc n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return cyp.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        cwy cwyVar = new cwy();
        cwyVar.h(next);
        cwyVar.k(it);
        return cwyVar.g();
    }

    public static cxc o(Collection collection) {
        if (!(collection instanceof cwu)) {
            return m(collection.toArray());
        }
        cxc cxcVarD = ((cwu) collection).d();
        return cxcVarD.f() ? k(cxcVarD.toArray()) : cxcVarD;
    }

    public static cxc p(Object[] objArr) {
        return objArr.length == 0 ? cyp.a : m((Object[]) objArr.clone());
    }

    public static cxc q(Object obj) {
        return m(obj);
    }

    public static cxc r(Object obj, Object obj2, Object obj3) {
        return m(obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static cxc s(Object obj, Object obj2, Object obj3, Object obj4) {
        return m(obj, obj2, obj3, obj4);
    }

    public static cxc t(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] objArrB = dcr.B(iterable);
        dcr.m(objArrB);
        Arrays.sort(objArrB, comparator);
        return k(objArrB);
    }

    @Override // defpackage.cwu
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.cwu
    /* renamed from: e */
    public final czc listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return dcr.v(this, obj);
    }

    public cxc h() {
        return size() <= 1 ? this : new cwz(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public cxc subList(int i, int i2) {
        clq.E(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? cyp.a : new cxb(this, i, i3);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final czd listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final czd listIterator(int i) {
        clq.L(i, size());
        return isEmpty() ? a : new czd(this, i);
    }

    @Override // defpackage.cwu
    public Object writeReplace() {
        return new cxa(toArray());
    }

    @Override // defpackage.cwu
    @Deprecated
    public final cxc d() {
        return this;
    }
}
