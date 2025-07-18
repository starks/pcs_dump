package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwd extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public cwd() {
        l(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.x(i, "Invalid size: "));
        }
        l(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int s(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objK = dcr.K(i2);
        if (i4 != 0) {
            dcr.L(objK, i3 & i5, i4 + 1);
        }
        Object objG = g();
        int[] iArrP = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int iJ = dcr.J(objG, i6);
            while (iJ != 0) {
                int i7 = iJ - 1;
                int i8 = iArrP[i7];
                int iF = dcr.F(i8, i) | i6;
                int i9 = iF & i5;
                int iJ2 = dcr.J(objK, i9);
                dcr.L(objK, i9, iJ);
                iArrP[i7] = dcr.G(iF, iJ2, i5);
                iJ = i8 & i;
            }
        }
        this.g = objK;
        t(i5);
        return i5;
    }

    private final void t(int i) {
        this.e = dcr.G(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itI = i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        k();
        Map mapJ = j();
        if (mapJ != null) {
            this.e = cnx.P(size(), 3, 1073741823);
            mapJ.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(q(), 0, this.f, (Object) null);
        Arrays.fill(r(), 0, this.f, (Object) null);
        Object objG = g();
        if (objG instanceof byte[]) {
            Arrays.fill((byte[]) objG, (byte) 0);
        } else if (objG instanceof short[]) {
            Arrays.fill((short[]) objG, (short) 0);
        } else {
            Arrays.fill((int[]) objG, 0);
        }
        Arrays.fill(p(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapJ = j();
        return mapJ != null ? mapJ.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (a.g(obj, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (o()) {
            return -1;
        }
        int iE = dcr.E(obj);
        int iC = c();
        int iJ = dcr.J(g(), iE & iC);
        if (iJ == 0) {
            return -1;
        }
        int iF = dcr.F(iE, iC);
        do {
            int i = iJ - 1;
            int i2 = p()[i];
            if (dcr.F(i2, iC) == iF && a.g(obj, e(i))) {
                return i;
            }
            iJ = i2 & iC;
        } while (iJ != 0);
        return -1;
    }

    public final Object e(int i) {
        return q()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        cvy cvyVar = new cvy(this);
        this.i = cvyVar;
        return cvyVar;
    }

    public final Object f(Object obj) {
        int iC;
        int I;
        if (o() || (I = dcr.I(obj, null, (iC = c()), g(), p(), q(), null)) == -1) {
            return a;
        }
        Object objH = h(I);
        m(I, iC);
        this.f--;
        k();
        return objH;
    }

    public final Object g() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return h(iD);
    }

    public final Object h(int i) {
        return r()[i];
    }

    final Iterator i() {
        Map mapJ = j();
        return mapJ != null ? mapJ.entrySet().iterator() : new cvw(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Map j() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void k() {
        this.e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        cwa cwaVar = new cwa(this);
        this.h = cwaVar;
        return cwaVar;
    }

    final void l(int i) {
        clq.w(true, "Expected size must be >= 0");
        this.e = cnx.P(i, 1, 1073741823);
    }

    final void m(int i, int i2) {
        Object objG = g();
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrQ[i] = null;
            objArrR[i] = null;
            iArrP[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = objArrQ[i3];
        objArrQ[i] = obj;
        objArrR[i] = objArrR[i3];
        objArrQ[i3] = null;
        objArrR[i3] = null;
        iArrP[i] = iArrP[i3];
        iArrP[i3] = 0;
        int iE = dcr.E(obj) & i2;
        int iJ = dcr.J(objG, iE);
        if (iJ == size) {
            dcr.L(objG, iE, i4);
            return;
        }
        while (true) {
            int i5 = iJ - 1;
            int i6 = iArrP[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrP[i5] = dcr.G(i6, i4, i2);
                return;
            }
            iJ = i7;
        }
    }

    public final void n(int i, Object obj) {
        r()[i] = obj;
    }

    final boolean o() {
        return this.g == null;
    }

    public final int[] p() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (o()) {
            clq.G(o(), "Arrays already allocated");
            int i2 = this.e;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.g = dcr.K(iMax2);
            t(iMax2 - 1);
            this.b = new int[i2];
            this.c = new Object[i2];
            this.d = new Object[i2];
        }
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.put(obj, obj2);
        }
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int i3 = this.f;
        int i4 = i3 + 1;
        int iE = dcr.E(obj);
        int iC = c();
        int i5 = iE & iC;
        int iJ = dcr.J(g(), i5);
        if (iJ == 0) {
            if (i4 > iC) {
                iC = s(iC, dcr.H(iC), iE, i3);
            } else {
                dcr.L(g(), i5, i4);
            }
            i = 1;
        } else {
            int iF = dcr.F(iE, iC);
            int i6 = 0;
            while (true) {
                int i7 = iJ - 1;
                int i8 = iArrP[i7];
                i = 1;
                if (dcr.F(i8, iC) == iF && a.g(obj, objArrQ[i7])) {
                    Object obj3 = objArrR[i7];
                    objArrR[i7] = obj2;
                    return obj3;
                }
                int i9 = i8 & iC;
                i6++;
                if (i9 != 0) {
                    iJ = i9;
                } else {
                    if (i6 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        int iA = a();
                        while (iA >= 0) {
                            linkedHashMap.put(e(iA), h(iA));
                            iA = b(iA);
                        }
                        this.g = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        k();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > iC) {
                        iC = s(iC, dcr.H(iC), iE, i3);
                    } else {
                        iArrP[i7] = dcr.G(i8, i4, iC);
                    }
                }
            }
        }
        int length = p().length;
        if (i4 > length) {
            int i10 = i;
            int iMin = Math.min(1073741823, (Math.max(i10, length >>> 1) + length) | i10);
            if (iMin != length) {
                this.b = Arrays.copyOf(p(), iMin);
                this.c = Arrays.copyOf(q(), iMin);
                this.d = Arrays.copyOf(r(), iMin);
            }
        }
        p()[i3] = dcr.G(iE, 0, iC);
        q()[i3] = obj;
        n(i3, obj2);
        this.f = i4;
        k();
        return null;
    }

    public final Object[] q() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] r() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        Object objF = f(obj);
        if (objF == a) {
            return null;
        }
        return objF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapJ = j();
        return mapJ != null ? mapJ.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        cwc cwcVar = new cwc(this);
        this.j = cwcVar;
        return cwcVar;
    }

    public cwd(byte[] bArr) {
        l(12);
    }
}
