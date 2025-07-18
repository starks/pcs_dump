package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffh {
    public static int A(List list) {
        return list.size() - 1;
    }

    public static List B(Object... objArr) {
        objArr.getClass();
        return objArr.length > 0 ? W(objArr) : fgm.a;
    }

    public static List C(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : B(list.get(0)) : fgm.a;
    }

    public static void D() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void E(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static Object F(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object G(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(A(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(Collection collection, Iterable iterable) {
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List I(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List J(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return L(iterable);
        }
        Object[] array = iterable.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return W(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List K(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return L(iterable);
        }
        Object[] array = iterable.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return W(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List L(Iterable iterable) {
        iterable.getClass();
        int size = iterable.size();
        if (size == 0) {
            return fgm.a;
        }
        if (size != 1) {
            return M(iterable);
        }
        return B(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List M(Collection collection) {
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set N(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return fgo.a;
        }
        if (size == 1) {
            return q(iterable.get(0));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(r(iterable.size()));
        U(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean O(Iterable iterable, Object obj) {
        return iterable.contains(obj);
    }

    public static void P(Collection collection, Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static int Q(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static void R(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, fiy fiyVar) throws IOException {
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            fjz.d(appendable, next, fiyVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String S(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, fiy fiyVar, int i) throws IOException {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        R(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : fiyVar);
        return sb.toString();
    }

    public static final void T(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void U(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void V(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static List W(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void X(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static Object[] Y(Object[] objArr, int i, int i2) {
        objArr.getClass();
        V(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static int Z(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            fih.a.i(th, th2);
        }
    }

    public static Object aa(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List ab(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ac(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? ad(objArr) : B(objArr[0]) : fgm.a;
    }

    public static List ad(Object[] objArr) {
        return new ArrayList(new fgj(objArr));
    }

    public static void ae(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void af(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void ag(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void aj(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        ag(objArr, objArr2, 0, i, i2);
    }

    public static byte[] ak(byte[] bArr, int i) {
        bArr.getClass();
        V(i, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static /* synthetic */ boolean am() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean an() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void ao() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void ap(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a.D(i2, i, "index: ", ", size: "));
        }
    }

    public static final void aq(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a.D(i2, i, "index: ", ", size: "));
        }
    }

    public static final void ar(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(a.D(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final int as(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return (-2147483639) + i3 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public static final Object b(Throwable th) {
        th.getClass();
        return new fft(th);
    }

    public static final void c(Object obj) throws Throwable {
        if (obj instanceof fft) {
            throw ((fft) obj).a;
        }
    }

    public static final ffo d(int i, fin finVar) {
        if (i == 0) {
            throw null;
        }
        int i2 = ffp.a;
        int i3 = i - 1;
        return i3 != 0 ? i3 != 1 ? new fga(finVar) : new ffv(finVar) : new ffw(finVar);
    }

    public static final fcm e(int i) {
        return new fcm(new fvk(), Math.min(1048576, ((i + 8191) / 8192) * 8192));
    }

    public static final int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final int g(int i) {
        return Integer.highestOneBit(fjs.i(i, 1) * 3);
    }

    public static final int h(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    public static final int i(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String j(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void k(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static final void l(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            k(objArr, i);
            i++;
        }
    }

    public static final boolean m(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!fjs.c(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final Object[] n(int i) {
        return new Object[i];
    }

    public static final Object[] o(Object[] objArr, int i) {
        objArr.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static final Set p(Set set) {
        ((fhd) set).b.e();
        return ((fgi) set).a() > 0 ? set : fhd.a;
    }

    public static Set q(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return fgo.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(r(length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static int r(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static Map s(Map map) {
        return ((fgy) map).e();
    }

    public static Map t(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Object u(Map map, Object obj) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(a.y(obj, "Key ", " is missing in the map."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map v(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return fgn.a;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(r(iterable.size()));
            x(linkedHashMap, iterable);
            return linkedHashMap;
        }
        ffs[] ffsVarArr = {(ffs) iterable.get(0)};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r(1));
        ffs ffsVar = ffsVarArr[0];
        linkedHashMap2.put(ffsVar.a, ffsVar.b);
        return linkedHashMap2;
    }

    public static Map w(Map map) {
        int size = map.size();
        return size != 0 ? size != 1 ? new LinkedHashMap(map) : t(map) : fgn.a;
    }

    public static void x(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ffs ffsVar = (ffs) it.next();
            map.put(ffsVar.a, ffsVar.b);
        }
    }

    public static final List y(List list) {
        fgt fgtVar = (fgt) list;
        fgtVar.h();
        fgtVar.d = true;
        return fgtVar.c > 0 ? list : fgt.a;
    }

    public static final List z(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }
}
