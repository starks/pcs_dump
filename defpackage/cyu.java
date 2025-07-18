package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyu extends cxg {
    public static final cxg a = new cyu(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] b;
    private final transient Object c;
    private final transient int d;

    private cyu(Object obj, Object[] objArr, int i) {
        this.c = obj;
        this.b = objArr;
        this.d = i;
    }

    public static cyu a(int i, Object[] objArr) {
        return d(i, objArr, null);
    }

    static cyu d(int i, Object[] objArr, cxe cxeVar) {
        if (i == 0) {
            return (cyu) a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            dcr.M(obj, obj2);
            return new cyu(null, objArr, 1);
        }
        clq.L(i, objArr.length >> 1);
        Object objQ = q(objArr, i, cxo.j(i), 0);
        if (objQ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objQ;
            fcy fcyVar = (fcy) objArr2[2];
            if (cxeVar == null) {
                throw fcyVar.f();
            }
            cxeVar.c = fcyVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue + iIntValue);
            objQ = obj3;
            i = iIntValue;
        }
        return new cyu(objQ, objArr, i);
    }

    static Object o(Object[] objArr, int i, int i2, int i3) {
        Object objQ = q(objArr, i, i2, i3);
        if (objQ instanceof Object[]) {
            throw ((fcy) ((Object[]) objQ)[2]).f();
        }
        return objQ;
    }

    static Object p(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iD = dcr.D(obj2.hashCode());
            while (true) {
                int i3 = iD & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iD = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iD2 = dcr.D(obj2.hashCode());
            while (true) {
                int i5 = iD2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iD2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iD3 = dcr.D(obj2.hashCode());
            while (true) {
                int i6 = iD3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iD3 = i6 + 1;
            }
        }
    }

    private static Object q(Object[] objArr, int i, int i2, int i3) {
        fcy fcyVar = null;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            dcr.M(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = i5 + i5 + i3;
                int i8 = i6 + i6 + i3;
                Object obj3 = objArr[i7];
                obj3.getClass();
                Object obj4 = objArr[i7 ^ 1];
                obj4.getClass();
                dcr.M(obj3, obj4);
                int iD = dcr.D(obj3.hashCode());
                while (true) {
                    int i9 = iD & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj3;
                            objArr[i8 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj5 = objArr[i11];
                            obj5.getClass();
                            fcy fcyVar2 = new fcy(obj3, obj4, obj5);
                            objArr[i11] = obj4;
                            fcyVar = fcyVar2;
                            break;
                        }
                        iD = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), fcyVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = i5 + i5 + i3;
                int i14 = i12 + i12 + i3;
                Object obj6 = objArr[i13];
                obj6.getClass();
                Object obj7 = objArr[i13 ^ 1];
                obj7.getClass();
                dcr.M(obj6, obj7);
                int iD2 = dcr.D(obj6.hashCode());
                while (true) {
                    int i15 = iD2 & i4;
                    char c = (char) sArr[i15];
                    if (c == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj6;
                            objArr[i14 ^ 1] = obj7;
                        }
                        i12++;
                    } else {
                        if (obj6.equals(objArr[c])) {
                            int i16 = c ^ 1;
                            Object obj8 = objArr[i16];
                            obj8.getClass();
                            fcy fcyVar3 = new fcy(obj6, obj7, obj8);
                            objArr[i16] = obj7;
                            fcyVar = fcyVar3;
                            break;
                        }
                        iD2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), fcyVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i17 = 0;
        while (i5 < i) {
            int i18 = i5 + i5 + i3;
            int i19 = i17 + i17 + i3;
            Object obj9 = objArr[i18];
            obj9.getClass();
            Object obj10 = objArr[i18 ^ 1];
            obj10.getClass();
            dcr.M(obj9, obj10);
            int iD3 = dcr.D(obj9.hashCode());
            while (true) {
                int i20 = iD3 & i4;
                int i21 = iArr[i20];
                if (i21 == -1) {
                    iArr[i20] = i19;
                    if (i17 < i5) {
                        objArr[i19] = obj9;
                        objArr[i19 ^ 1] = obj10;
                    }
                    i17++;
                } else {
                    if (obj9.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj11 = objArr[i22];
                        obj11.getClass();
                        fcy fcyVar4 = new fcy(obj9, obj10, obj11);
                        objArr[i22] = obj10;
                        fcyVar = fcyVar4;
                        break;
                    }
                    iD3 = i20 + 1;
                }
            }
            i5++;
        }
        return i17 == i ? iArr : new Object[]{iArr, Integer.valueOf(i17), fcyVar};
    }

    @Override // defpackage.cxg
    public final cwu b() {
        return new cyt(this.b, 1, this.d);
    }

    @Override // defpackage.cxg, java.util.Map
    public final Object get(Object obj) {
        Object objP = p(this.c, this.b, this.d, 0, obj);
        if (objP == null) {
            return null;
        }
        return objP;
    }

    @Override // defpackage.cxg
    public final cxo h() {
        return new cyr(this, this.b, 0, this.d);
    }

    @Override // defpackage.cxg
    public final cxo i() {
        return new cys(this, new cyt(this.b, 0, this.d));
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.cxg
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.cxg
    public final void m() {
    }
}
