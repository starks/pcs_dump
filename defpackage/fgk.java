package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgk extends fgh {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d = b;

    private final int c(int i) {
        return i == 0 ? ffh.Z(this.d) : i - 1;
    }

    private final int d(int i) {
        if (i == ffh.Z(this.d)) {
            return 0;
        }
        return i + 1;
    }

    private final int e(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int f(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            this.d = new Object[fjs.i(i, 10)];
            return;
        }
        Object[] objArr2 = new Object[ffh.as(length, i)];
        ffh.ag(objArr, objArr2, 0, this.c, length);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i2 = this.c;
        ffh.ag(objArr3, objArr2, length2 - i2, 0, i2);
        this.c = 0;
        this.d = objArr2;
    }

    private final void i(int i, int i2) {
        if (i < i2) {
            ffh.X(this.d, null, i, i2);
            return;
        }
        Object[] objArr = this.d;
        ffh.X(objArr, null, i, objArr.length);
        ffh.X(this.d, null, 0, i2);
    }

    private final void j() {
        this.modCount++;
    }

    @Override // defpackage.fgh
    public final int a() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ffh.aq(i, this.a);
        if (i == this.a) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        h(this.a + 1);
        int iF = f(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int iC = c(iF);
            int iC2 = c(this.c);
            int i3 = this.c;
            if (iC >= i3) {
                Object[] objArr = this.d;
                objArr[iC2] = objArr[i3];
                ffh.ag(objArr, objArr, i3, i3 + 1, iC + 1);
            } else {
                Object[] objArr2 = this.d;
                ffh.ag(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.d;
                objArr3[objArr3.length - 1] = objArr3[0];
                ffh.ag(objArr3, objArr3, 0, 1, iC + 1);
            }
            this.d[iC] = obj;
            this.c = iC2;
        } else {
            int iF2 = f(this.c + i2);
            if (iF < iF2) {
                Object[] objArr4 = this.d;
                ffh.ag(objArr4, objArr4, iF + 1, iF, iF2);
            } else {
                Object[] objArr5 = this.d;
                ffh.ag(objArr5, objArr5, 1, 0, iF2);
                Object[] objArr6 = this.d;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                ffh.ag(objArr6, objArr6, iF + 1, iF, length);
            }
            this.d[iF] = obj;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        ffh.aq(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        j();
        h(this.a + collection.size());
        int iF = f(this.c + this.a);
        int iF2 = f(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (iF2 < i2) {
                Object[] objArr = this.d;
                ffh.ag(objArr, objArr, i3, i2, objArr.length);
                if (size >= iF2) {
                    Object[] objArr2 = this.d;
                    ffh.ag(objArr2, objArr2, objArr2.length - size, 0, iF2);
                } else {
                    Object[] objArr3 = this.d;
                    ffh.ag(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.d;
                    ffh.ag(objArr4, objArr4, 0, size, iF2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.d;
                ffh.ag(objArr5, objArr5, i3, i2, iF2);
            } else {
                Object[] objArr6 = this.d;
                int length = objArr6.length;
                i3 += length;
                int i4 = length - i3;
                if (i4 >= iF2 - i2) {
                    ffh.ag(objArr6, objArr6, i3, i2, iF2);
                } else {
                    ffh.ag(objArr6, objArr6, i3, i2, i2 + i4);
                    Object[] objArr7 = this.d;
                    ffh.ag(objArr7, objArr7, 0, this.c + i4, iF2);
                }
            }
            this.c = i3;
            g(e(iF2 - size), collection);
        } else {
            int i5 = iF2 + size;
            if (iF2 < iF) {
                int i6 = size + iF;
                Object[] objArr8 = this.d;
                int length2 = objArr8.length;
                if (i6 <= length2) {
                    ffh.ag(objArr8, objArr8, i5, iF2, iF);
                } else if (i5 >= length2) {
                    ffh.ag(objArr8, objArr8, i5 - length2, iF2, iF);
                } else {
                    int i7 = iF - (i6 - length2);
                    ffh.ag(objArr8, objArr8, 0, i7, iF);
                    Object[] objArr9 = this.d;
                    ffh.ag(objArr9, objArr9, i5, iF2, i7);
                }
            } else {
                Object[] objArr10 = this.d;
                ffh.ag(objArr10, objArr10, size, 0, iF);
                Object[] objArr11 = this.d;
                int length3 = objArr11.length;
                if (i5 >= length3) {
                    ffh.ag(objArr11, objArr11, i5 - length3, iF2, length3);
                } else {
                    ffh.ag(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.d;
                    ffh.ag(objArr12, objArr12, i5, iF2, objArr12.length - size);
                }
            }
            g(iF2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        h(this.a + 1);
        int iC = c(this.c);
        this.c = iC;
        this.d[iC] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        j();
        h(this.a + 1);
        this.d[f(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.fgh
    public final Object b(int i) {
        ffh.ap(i, this.a);
        if (i == ffh.A(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int iF = f(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[iF];
        if (i < (this.a >> 1)) {
            int i2 = this.c;
            if (iF >= i2) {
                ffh.ag(objArr, objArr, i2 + 1, i2, iF);
            } else {
                ffh.ag(objArr, objArr, 1, 0, iF);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.c;
                ffh.ag(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.d;
            int i4 = this.c;
            objArr3[i4] = null;
            this.c = d(i4);
        } else {
            int iF2 = f(this.c + ffh.A(this));
            if (iF <= iF2) {
                Object[] objArr4 = this.d;
                ffh.ag(objArr4, objArr4, iF, iF + 1, iF2 + 1);
            } else {
                Object[] objArr5 = this.d;
                ffh.ag(objArr5, objArr5, iF, iF + 1, objArr5.length);
                Object[] objArr6 = this.d;
                objArr6[objArr6.length - 1] = objArr6[0];
                ffh.ag(objArr6, objArr6, 0, 1, iF2 + 1);
            }
            this.d[iF2] = null;
        }
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            i(this.c, f(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ffh.ap(i, this.a);
        return this.d[f(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iF = f(this.c + this.a);
        int length = this.c;
        if (length < iF) {
            while (length < iF) {
                if (!fjs.c(obj, this.d[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iF) {
            return -1;
        }
        int length2 = this.d.length;
        while (length < length2) {
            if (!fjs.c(obj, this.d[length])) {
                length++;
            }
        }
        for (int i2 = 0; i2 < iF; i2++) {
            if (fjs.c(obj, this.d[i2])) {
                length = i2 + this.d.length;
                i = this.c;
                return length - i;
            }
        }
        return -1;
        i = this.c;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iZ;
        int i;
        int iF = f(this.c + this.a);
        int i2 = this.c;
        if (i2 < iF) {
            iZ = iF - 1;
            if (i2 <= iZ) {
                while (!fjs.c(obj, this.d[iZ])) {
                    if (iZ != i2) {
                        iZ--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (i2 > iF) {
            for (int i3 = iF - 1; i3 >= 0; i3--) {
                if (fjs.c(obj, this.d[i3])) {
                    iZ = i3 + this.d.length;
                    i = this.c;
                    break;
                }
            }
            iZ = ffh.Z(this.d);
            int i4 = this.c;
            if (i4 <= iZ) {
                while (!fjs.c(obj, this.d[iZ])) {
                    if (iZ != i4) {
                        iZ--;
                    }
                }
                i = this.c;
            }
        }
        return -1;
        return iZ - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iF;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iF2 = f(this.c + this.a);
        int i = this.c;
        if (i < iF2) {
            iF = i;
            while (i < iF2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[iF] = obj;
                    iF++;
                }
                i++;
            }
            ffh.X(this.d, null, iF, iF2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iF = f(i2);
            for (int i3 = 0; i3 < iF2; i3++) {
                Object[] objArr2 = this.d;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[iF] = obj3;
                    iF = d(iF);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        j();
        this.a = e(iF - this.c);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = d(i);
        this.a--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int iF = f(this.c + ffh.A(this));
        Object[] objArr = this.d;
        Object obj = objArr[iF];
        objArr[iF] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ffh.ar(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                b(i);
                return;
            }
            j();
            if (i < this.a - i2) {
                int iF = f(this.c + (i - 1));
                int iF2 = f(this.c + (i2 - 1));
                while (i > 0) {
                    int i4 = iF + 1;
                    int iMin = Math.min(i, Math.min(i4, iF2 + 1));
                    Object[] objArr = this.d;
                    int i5 = iF2 - iMin;
                    int i6 = iF - iMin;
                    ffh.ag(objArr, objArr, i5 + 1, i6 + 1, i4);
                    iF = e(i6);
                    iF2 = e(i5);
                    i -= iMin;
                }
                int iF3 = f(this.c + i3);
                i(this.c, iF3);
                this.c = iF3;
            } else {
                int iF4 = f(this.c + i2);
                int iF5 = f(this.c + i);
                int i7 = this.a;
                while (true) {
                    i7 -= i2;
                    if (i7 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = Math.min(i7, Math.min(length - iF4, length - iF5));
                    Object[] objArr2 = this.d;
                    int i8 = iF4 + i2;
                    ffh.ag(objArr2, objArr2, iF5, iF4, i8);
                    iF4 = f(i8);
                    iF5 = f(iF5 + i2);
                }
                int iF6 = f(this.c + this.a);
                i(e(iF6 - i3), iF6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iF;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iF2 = f(this.c + this.a);
        int i = this.c;
        if (i < iF2) {
            iF = i;
            while (i < iF2) {
                Object obj = this.d[i];
                if (collection.contains(obj)) {
                    this.d[iF] = obj;
                    iF++;
                } else {
                    z = true;
                }
                i++;
            }
            ffh.X(this.d, null, iF, iF2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iF = f(i2);
            for (int i3 = 0; i3 < iF2; i3++) {
                Object[] objArr2 = this.d;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[iF] = obj3;
                    iF = d(iF);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        j();
        this.a = e(iF - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ffh.ap(i, this.a);
        int iF = f(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[iF];
        objArr[iF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        objArr.getClass();
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iF = f(this.c + this.a);
        int i2 = this.c;
        if (i2 < iF) {
            ffh.aj(this.d, objArr, i2, iF, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            ffh.ag(objArr2, objArr, 0, this.c, objArr2.length);
            Object[] objArr3 = this.d;
            ffh.ag(objArr3, objArr, objArr3.length - this.c, 0, iF);
        }
        ffh.T(this.a, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        j();
        h(this.a + collection.size());
        g(f(this.c + this.a), collection);
        return true;
    }
}
