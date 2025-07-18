package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgy implements Map, Serializable {
    public static final fgy a;
    public static final ffh i = new ffh();
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] j;
    private int k;
    private int l;
    private fha m;
    private fgz n;
    private fgg o;

    static {
        fgy fgyVar = new fgy(0);
        fgyVar.h = true;
        a = fgyVar;
    }

    public fgy() {
        this(8);
    }

    private final int l() {
        return this.j.length;
    }

    private final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.l;
    }

    private final void n(boolean z) {
        int i2;
        Object[] objArr = this.c;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.e;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.d;
            int i5 = iArr[i3];
            if (i5 >= 0) {
                int i6 = i4 + 1;
                Object[] objArr2 = this.b;
                objArr2[i4] = objArr2[i3];
                if (objArr != null) {
                    objArr[i4] = objArr[i3];
                }
                if (z) {
                    iArr[i4] = i5;
                    this.j[i5] = i6;
                }
                i4 = i6;
            }
            i3++;
        }
        ffh.l(this.b, i4, i2);
        if (objArr != null) {
            ffh.l(objArr, i4, this.e);
        }
        this.e = i4;
    }

    private final void o(int i2) {
        int iD = d();
        int i3 = this.e;
        int i4 = iD - i3;
        int i5 = i3 - this.g;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i6 = this.e + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > d()) {
            int iAs = ffh.as(d(), i6);
            this.b = ffh.o(this.b, iAs);
            Object[] objArr = this.c;
            this.c = objArr != null ? ffh.o(objArr, iAs) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.d, iAs);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            int iG = ffh.g(iAs);
            if (iG > l()) {
                q(iG);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r3[r0] = r6;
        r5.d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q(int r6) {
        /*
            r5 = this;
            r5.p()
            int r0 = r5.e
            int r1 = r5.g
            r2 = 0
            if (r0 <= r1) goto Ld
            r5.n(r2)
        Ld:
            int[] r0 = new int[r6]
            r5.j = r0
            int r6 = defpackage.ffh.h(r6)
            r5.l = r6
        L17:
            int r6 = r5.e
            if (r2 >= r6) goto L4e
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.b
            r0 = r0[r2]
            int r0 = r5.m(r0)
            int r1 = r5.k
        L27:
            int[] r3 = r5.j
            r4 = r3[r0]
            if (r4 != 0) goto L35
            r3[r0] = r6
            int[] r1 = r5.d
            r1[r2] = r0
            r2 = r6
            goto L17
        L35:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L46
            int r3 = r0 + (-1)
            if (r0 != 0) goto L44
            int r0 = r5.l()
            int r0 = r0 + (-1)
            goto L27
        L44:
            r0 = r3
            goto L27
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgy.q(int):void");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.h) {
            return new fhc(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int iM = m(obj);
            int i2 = this.k;
            int i3 = i2 + i2;
            int iL = l() >> 1;
            int i4 = 0;
            while (true) {
                int i5 = this.j[iM];
                if (i5 <= 0) {
                    if (this.e < d()) {
                        int i6 = this.e;
                        int i7 = i6 + 1;
                        this.e = i7;
                        this.b[i6] = obj;
                        this.d[i6] = iM;
                        this.j[iM] = i7;
                        this.g++;
                        p();
                        if (i4 > this.k) {
                            this.k = i4;
                        }
                        return i6;
                    }
                    o(1);
                } else {
                    if (fjs.c(this.b[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > fjs.j(i3, iL)) {
                        int iL2 = l();
                        q(iL2 + iL2);
                        break;
                    }
                    iM = iM == 0 ? l() - 1 : iM - 1;
                }
            }
        }
    }

    public final int b(Object obj) {
        int iM = m(obj);
        int i2 = this.k;
        while (true) {
            int i3 = this.j[iM];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (fjs.c(this.b[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    public final int c(Object obj) {
        int i2 = this.e;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.d[i2] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (fjs.c(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i2 = this.e - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.d;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.j[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ffh.l(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            ffh.l(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        fgy fgyVar = a;
        fgyVar.getClass();
        return fgyVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        fgz fgzVar = this.n;
        if (fgzVar != null) {
            return fgzVar;
        }
        fgz fgzVar2 = new fgz(this);
        this.n = fgzVar2;
        return fgzVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:6:0x0021->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r11) {
        /*
            r10 = this;
            java.lang.Object[] r0 = r10.b
            defpackage.ffh.k(r0, r11)
            java.lang.Object[] r0 = r10.c
            if (r0 == 0) goto Lc
            defpackage.ffh.k(r0, r11)
        Lc:
            int[] r0 = r10.d
            r0 = r0[r11]
            int r1 = r10.k
            int r1 = r1 + r1
            int r2 = r10.l()
            int r2 = r2 >> 1
            int r1 = defpackage.fjs.j(r1, r2)
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L21:
            r5 = -1
            if (r0 != 0) goto L2a
            int r0 = r10.l()
            int r0 = r0 + r5
            goto L2c
        L2a:
            int r0 = r0 + (-1)
        L2c:
            int r4 = r4 + 1
            int r6 = r10.k
            if (r4 <= r6) goto L37
            int[] r0 = r10.j
            r0[r1] = r2
            goto L6a
        L37:
            int[] r6 = r10.j
            r7 = r6[r0]
            if (r7 != 0) goto L40
            r6[r1] = r2
            goto L6a
        L40:
            if (r7 >= 0) goto L47
            r6[r1] = r5
        L44:
            r1 = r0
            r4 = r2
            goto L63
        L47:
            java.lang.Object[] r6 = r10.b
            int r8 = r7 + (-1)
            r6 = r6[r8]
            int r6 = r10.m(r6)
            int r6 = r6 - r0
            int r9 = r10.l()
            int r9 = r9 + r5
            r6 = r6 & r9
            if (r6 < r4) goto L63
            int[] r4 = r10.j
            r4[r1] = r7
            int[] r4 = r10.d
            r4[r8] = r1
            goto L44
        L63:
            int r3 = r3 + r5
            if (r3 >= 0) goto L21
            int[] r0 = r10.j
            r0[r1] = r5
        L6a:
            int[] r0 = r10.d
            r0[r11] = r5
            int r11 = r10.g
            int r11 = r11 + r5
            r10.g = r11
            r10.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgy.g(int):void");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[iB];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        fgu fguVar = new fgu(this);
        int i2 = 0;
        while (fguVar.hasNext()) {
            int i3 = fguVar.b;
            fgy fgyVar = fguVar.a;
            if (i3 >= fgyVar.e) {
                throw new NoSuchElementException();
            }
            fguVar.b = i3 + 1;
            fguVar.c = i3;
            Object obj = fgyVar.b[i3];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fguVar.a.c;
            objArr.getClass();
            Object obj2 = objArr[fguVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fguVar.b();
            i2 += iHashCode ^ iHashCode2;
        }
        return i2;
    }

    public final boolean i(Map.Entry entry) {
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return fjs.c(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrN = ffh.n(d());
        this.c = objArrN;
        return objArrN;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        fha fhaVar = this.m;
        if (fhaVar != null) {
            return fhaVar;
        }
        fha fhaVar2 = new fha(this);
        this.m = fhaVar2;
        return fhaVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int iA = a(obj);
        Object[] objArrK = k();
        if (iA >= 0) {
            objArrK[iA] = obj2;
            return null;
        }
        int i2 = (-iA) - 1;
        Object obj3 = objArrK[i2];
        objArrK[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArrK = k();
            if (iA >= 0) {
                objArrK[iA] = entry.getValue();
            } else {
                int i2 = (-iA) - 1;
                if (!fjs.c(entry.getValue(), objArrK[i2])) {
                    objArrK[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[iB];
        g(iB);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        fgu fguVar = new fgu(this);
        int i2 = 0;
        while (fguVar.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = fguVar.b;
            fgy fgyVar = fguVar.a;
            if (i3 >= fgyVar.e) {
                throw new NoSuchElementException();
            }
            fguVar.b = i3 + 1;
            fguVar.c = i3;
            Object obj = fgyVar.b[i3];
            if (obj == fgyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            fgy fgyVar2 = fguVar.a;
            Object[] objArr = fgyVar2.c;
            objArr.getClass();
            Object obj2 = objArr[fguVar.c];
            if (obj2 == fgyVar2) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fguVar.b();
            i2++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        fgg fggVar = this.o;
        if (fggVar != null) {
            return fggVar;
        }
        fgg fggVar2 = new fgg(this);
        this.o = fggVar2;
        return fggVar2;
    }

    public fgy(int i2) {
        Object[] objArrN = ffh.n(i2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[ffh.g(i2)];
        this.b = objArrN;
        this.c = null;
        this.d = iArr;
        this.j = iArr2;
        this.k = 2;
        this.e = 0;
        this.l = ffh.h(l());
    }
}
