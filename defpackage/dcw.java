package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcw extends AbstractMap {
    public static final Comparator a = new aep(7);
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dcw, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dcw] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public dcw(dcw dcwVar, dcw dcwVar2) {
        int i;
        Object objC;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.d = new dcv(abstractMap, -1);
        abstractMap.e = null;
        abstractMap.f = null;
        int size = dcwVar.size() + dcwVar2.size();
        int iB = dcwVar.b() + dcwVar2.b();
        int i2 = size + 1;
        Object[] objArr2 = new Object[iB];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = dcwVar.c(0);
        Map.Entry entryC2 = dcwVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        Map.Entry entryC3 = entryC;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (entryC3 == null && entryC2 == null) {
                break;
            }
            int i8 = i6 + 1;
            if (entryC3 != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC3.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i9 = i4 + 1;
                        int i10 = i5 + 1;
                        objArr2[i6] = abstractMap.d((String) entryC3.getKey(), i6);
                        dcv dcvVar = (dcv) entryC3.getValue();
                        dcv dcvVar2 = (dcv) entryC2.getValue();
                        int i11 = 0;
                        int i12 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i11 >= dcvVar.size() && i12 >= dcvVar2.size()) {
                                break;
                            }
                            int iCompare = i11 == dcvVar.size() ? i7 : i12 == dcvVar2.size() ? -1 : 0;
                            iCompare = iCompare == 0 ? dcy.a.compare(dcvVar.c(i11), dcvVar2.c(i12)) : iCompare;
                            if (iCompare < 0) {
                                i = i11 + 1;
                                objC = dcvVar.c(i11);
                            } else {
                                int i13 = i12 + 1;
                                Object objC2 = dcvVar2.c(i12);
                                i12 = i13;
                                i = iCompare == 0 ? i11 + 1 : i11;
                                objC = objC2;
                            }
                            objArr2[iA] = objC;
                            i11 = i;
                            iA++;
                            i7 = 1;
                            abstractMap = this;
                        }
                        iArr[i8] = iA;
                        entryC3 = dcwVar.c(i10);
                        entryC2 = dcwVar2.c(i9);
                        i5 = i10;
                        i4 = i9;
                        i6 = i8;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i6 = i8;
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iA = a(entryC3, i6, iA, objArr2, iArr);
                entryC3 = dcwVar.c(i5);
                i6 = i8;
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC3;
            i4++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = dcwVar2.c(i4);
            iA = iA2;
            entryC3 = entry;
            i6 = i8;
            i3 = 0;
            abstractMap = this;
        }
        int i14 = iArr[i3];
        int i15 = i14 - i6;
        if (i15 != 0) {
            for (int i16 = i3; i16 <= i6; i16++) {
                iArr[i16] = iArr[i16] - i15;
            }
            int i17 = iArr[i6];
            int i18 = i17 - i6;
            if (e(iB, i17)) {
                objArr = new Object[i17];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i14, objArr, i6, i18);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i19 = iArr[i3] + 1;
        abstractMap.c = e(i2, i19) ? Arrays.copyOf(iArr, i19) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        dcv dcvVar = (dcv) entry.getValue();
        int iA = dcvVar.a() - dcvVar.b();
        System.arraycopy(dcvVar.b.b, dcvVar.b(), objArr, i2, iA);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + iA;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new dcv(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(super.hashCode());
        }
        return this.e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }

    public dcw(List list) {
        this.d = new dcv(this, -1);
        this.e = null;
        this.f = null;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ((fsc) it.next()).a;
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            ((fsc) it2.next()).a;
            throw null;
        }
        int[] iArr = {0};
        this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.c = iArr;
    }
}
