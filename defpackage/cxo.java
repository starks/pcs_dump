package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cxo extends cwu implements Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient cxc a;

    static int j(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            clq.w(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static cxo l(int i, Object... objArr) {
        if (i == 0) {
            return cyv.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new cyz(obj);
        }
        int iJ = j(i);
        Object[] objArr2 = new Object[iJ];
        int i2 = iJ - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            dcr.l(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iD = dcr.D(iHashCode);
            while (true) {
                int i6 = iD & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iD++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new cyz(obj4);
        }
        if (j(i4) < iJ / 2) {
            return l(i4, objArr);
        }
        if (p(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new cyv(objArr, i3, objArr2, i2, i4);
    }

    public static cxo m(Collection collection) {
        if ((collection instanceof cxo) && !(collection instanceof SortedSet)) {
            cxo cxoVar = (cxo) collection;
            if (!cxoVar.f()) {
                return cxoVar;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static cxo n(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? l(length, (Object[]) objArr.clone()) : new cyz(objArr[0]) : cyv.a;
    }

    public static cxo o(Object obj, Object obj2) {
        return l(2, obj, obj2);
    }

    public static boolean p(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.cwu
    public cxc d() {
        cxc cxcVar = this.a;
        if (cxcVar != null) {
            return cxcVar;
        }
        cxc cxcVarK = k();
        this.a = cxcVarK;
        return cxcVarK;
    }

    @Override // defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract czc listIterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cxo) && i() && ((cxo) obj).i() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return dcr.g(this);
    }

    public boolean i() {
        return false;
    }

    public cxc k() {
        return cxc.k(toArray());
    }

    @Override // defpackage.cwu
    public Object writeReplace() {
        return new cxn(toArray());
    }
}
