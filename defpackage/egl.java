package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egl implements egx {
    private static final int[] a = new int[0];
    private static final Unsafe b = ehn.l();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final egi g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final ehh n;
    private final ebz o;
    private final ebz p;
    private final ebq q;
    private final ebq r;

    private egl(int[] iArr, Object[] objArr, int i, int i2, egi egiVar, boolean z, int[] iArr2, int i3, int i4, ebq ebqVar, ebz ebzVar, ehh ehhVar, ebz ebzVar2, ebq ebqVar2) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = egiVar instanceof efb;
        this.h = ebzVar2 != null && ebz.j(egiVar);
        this.j = false;
        this.k = iArr2;
        this.l = i3;
        this.m = i4;
        this.q = ebqVar;
        this.o = ebzVar;
        this.n = ehhVar;
        this.p = ebzVar2;
        this.g = egiVar;
        this.r = ebqVar2;
    }

    private final Object A(Object obj, int i, Object obj2, ehh ehhVar, Object obj3) {
        efg efgVarY;
        int iP = p(i);
        Object objJ = ehn.j(obj, w(v(i)));
        if (objJ == null || (efgVarY = y(i)) == null) {
            return obj2;
        }
        Map mapL = ebq.l(objJ);
        egc egcVarK = ebq.k(B(i));
        Iterator it = mapL.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!efgVarY.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = ehhVar.c(obj3);
                }
                int iU = fsc.u(egcVarK, entry.getKey(), entry.getValue());
                eea eeaVar = eea.b;
                exo exoVar = new exo(iU);
                try {
                    fsc.v((eei) exoVar.a, egcVarK, entry.getKey(), entry.getValue());
                    ehhVar.f(obj2, iP, exoVar.c());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        egx egxVarZ = z(i);
        long jW = w(v(i));
        if (!O(obj, i)) {
            return egxVarZ.e();
        }
        Object object = b.getObject(obj, jW);
        if (R(object)) {
            return object;
        }
        Object objE = egxVarZ.e();
        if (object != null) {
            egxVarZ.g(objE, object);
        }
        return objE;
    }

    private final Object D(Object obj, int i, int i2) {
        egx egxVarZ = z(i2);
        if (!S(obj, i, i2)) {
            return egxVarZ.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (R(object)) {
            return object;
        }
        Object objE = egxVarZ.e();
        if (object != null) {
            egxVarZ.g(objE, object);
        }
        return objE;
    }

    private static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void F(Object obj) {
        if (!R(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void G(Object obj, Object obj2, int i) {
        if (O(obj2, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            egx egxVarZ = z(i);
            if (!O(obj, i)) {
                if (R(object)) {
                    Object objE = egxVarZ.e();
                    egxVarZ.g(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                I(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!R(object2)) {
                Object objE2 = egxVarZ.e();
                egxVarZ.g(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            egxVarZ.g(object2, object);
        }
    }

    private final void H(Object obj, Object obj2, int i) {
        int iP = p(i);
        if (S(obj2, iP, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            egx egxVarZ = z(i);
            if (!S(obj, iP, i)) {
                if (R(object)) {
                    Object objE = egxVarZ.e();
                    egxVarZ.g(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                J(obj, iP, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!R(object2)) {
                Object objE2 = egxVarZ.e();
                egxVarZ.g(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            egxVarZ.g(object2, object);
        }
    }

    private final void I(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        ehn.u(obj, j, (1 << (iS >>> 20)) | ehn.f(obj, j));
    }

    private final void J(Object obj, int i, int i2) {
        ehn.u(obj, s(i2) & 1048575, i);
    }

    private final void K(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        I(obj, i);
    }

    private final void L(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        J(obj, i, i2);
    }

    private final boolean M(Object obj, Object obj2, int i) {
        return O(obj, i) == O(obj2, i);
    }

    private static boolean N(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean O(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j != 1048575) {
            return ((1 << (iS >>> 20)) & ehn.f(obj, j)) != 0;
        }
        int iV = v(i);
        long jW = w(iV);
        switch (u(iV)) {
            case 0:
                return Double.doubleToRawLongBits(ehn.d(obj, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(ehn.e(obj, jW)) != 0;
            case 2:
                return ehn.h(obj, jW) != 0;
            case 3:
                return ehn.h(obj, jW) != 0;
            case 4:
                return ehn.f(obj, jW) != 0;
            case 5:
                return ehn.h(obj, jW) != 0;
            case 6:
                return ehn.f(obj, jW) != 0;
            case 7:
                return ehn.y(obj, jW);
            case 8:
                Object objJ = ehn.j(obj, jW);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof eea) {
                    return !eea.b.equals(objJ);
                }
                throw new IllegalArgumentException();
            case 9:
                return ehn.j(obj, jW) != null;
            case 10:
                return !eea.b.equals(ehn.j(obj, jW));
            case 11:
                return ehn.f(obj, jW) != 0;
            case 12:
                return ehn.f(obj, jW) != 0;
            case 13:
                return ehn.f(obj, jW) != 0;
            case 14:
                return ehn.h(obj, jW) != 0;
            case 15:
                return ehn.f(obj, jW) != 0;
            case 16:
                return ehn.h(obj, jW) != 0;
            case 17:
                return ehn.j(obj, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean P(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? O(obj, i) : (i3 & i4) != 0;
    }

    private static boolean Q(Object obj, int i, egx egxVar) {
        return egxVar.j(ehn.j(obj, w(i)));
    }

    private static boolean R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof efb) {
            return ((efb) obj).isMutable();
        }
        return true;
    }

    private final boolean S(Object obj, int i, int i2) {
        return ehn.f(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean T(Object obj, long j) {
        return ((Boolean) ehn.j(obj, j)).booleanValue();
    }

    private static final int U(byte[] bArr, int i, int i2, ehs ehsVar, Class cls, edm edmVar) {
        ehs ehsVar2 = ehs.DOUBLE;
        switch (ehsVar) {
            case DOUBLE:
                int i3 = i + 8;
                edmVar.c = Double.valueOf(edn.a(bArr, i));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                edmVar.c = Float.valueOf(edn.b(bArr, i));
                return i4;
            case INT64:
            case UINT64:
                int iO = edn.o(bArr, i, edmVar);
                edmVar.c = Long.valueOf(edmVar.b);
                return iO;
            case INT32:
            case UINT32:
            case ENUM:
                int iL = edn.l(bArr, i, edmVar);
                edmVar.c = Integer.valueOf(edmVar.a);
                return iL;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                edmVar.c = Long.valueOf(edn.s(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                edmVar.c = Integer.valueOf(edn.d(bArr, i));
                return i6;
            case BOOL:
                int iO2 = edn.o(bArr, i, edmVar);
                edmVar.c = Boolean.valueOf(edmVar.b != 0);
                return iO2;
            case STRING:
                return edn.j(bArr, i, edmVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return edn.f(egr.a.a(cls), bArr, i, i2, edmVar);
            case BYTES:
                return edn.c(bArr, i, edmVar);
            case SINT32:
                int iL2 = edn.l(bArr, i, edmVar);
                edmVar.c = Integer.valueOf(eee.H(edmVar.a));
                return iL2;
            case SINT64:
                int iO3 = edn.o(bArr, i, edmVar);
                edmVar.c = Long.valueOf(eee.I(edmVar.b));
                return iO3;
        }
    }

    private final void V(Object obj, int i, fdu fduVar) {
        if (N(i)) {
            ehn.w(obj, w(i), fduVar.y());
        } else if (this.i) {
            ehn.w(obj, w(i), fduVar.x());
        } else {
            ehn.w(obj, w(i), fduVar.s());
        }
    }

    private final void W(fsc fscVar, int i, Object obj, int i2) {
        if (obj != null) {
            egc egcVarK = ebq.k(B(i2));
            Map mapJ = ebq.j(obj);
            Object obj2 = fscVar.a;
            for (Map.Entry entry : mapJ.entrySet()) {
                ((eei) fscVar.a).A(i, 2);
                ((eei) fscVar.a).C(fsc.u(egcVarK, entry.getKey(), entry.getValue()));
                fsc.v((eei) fscVar.a, egcVarK, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void X(int i, Object obj, fsc fscVar) {
        if (obj instanceof String) {
            fscVar.O(i, (String) obj);
        } else {
            fscVar.x(i, (eea) obj);
        }
    }

    private static final void Y(ehh ehhVar, Object obj, fsc fscVar) {
        ehhVar.u(ehhVar.d(obj), fscVar);
    }

    static ehi d(Object obj) {
        efb efbVar = (efb) obj;
        ehi ehiVar = efbVar.unknownFields;
        if (ehiVar != ehi.a) {
            return ehiVar;
        }
        ehi ehiVar2 = new ehi();
        efbVar.unknownFields = ehiVar2;
        return ehiVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.egl l(defpackage.egf r32, defpackage.ebq r33, defpackage.ebz r34, defpackage.ehh r35, defpackage.ebz r36, defpackage.ebq r37) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.l(egf, ebq, ebz, ehh, ebz, ebq):egl");
    }

    private static double n(Object obj, long j) {
        return ((Double) ehn.j(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) ehn.j(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) ehn.j(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return t(i, 0);
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iP = p(i4);
            if (i == iP) {
                return i4;
            }
            if (i < iP) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) ehn.j(obj, j)).longValue();
    }

    private final efg y(int i) {
        int i2 = i / 3;
        return (efg) this.d[i2 + i2 + 1];
    }

    private final egx z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        egx egxVar = (egx) objArr[i3];
        if (egxVar != null) {
            return egxVar;
        }
        egx egxVarA = egr.a.a((Class) objArr[i3 + 1]);
        this.d[i3] = egxVarA;
        return egxVarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.egx
    public final int a(Object obj) {
        int i;
        int i2;
        int i3;
        egl eglVar;
        Object obj2;
        int iAs;
        int iO;
        int iE;
        int size;
        int size2;
        int iJ;
        int iY;
        int iY2;
        int iY3;
        int iY4;
        int iY5;
        int iAa;
        int iJ2;
        Unsafe unsafe = b;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i5 < this.c.length) {
            int iV = this.v(i5);
            int iU = u(iV);
            int iP = this.p(i5);
            int i8 = this.c[i5 + 2];
            int i9 = i8 & 1048575;
            if (iU <= 17) {
                if (i9 != i7) {
                    i4 = i9 == 1048575 ? 0 : unsafe.getInt(obj, i9);
                    i7 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long jW = w(iV);
            if (iU >= eer.DOUBLE_LIST_PACKED.Z) {
                int i10 = eer.SINT64_LIST_PACKED.Z;
            }
            switch (iU) {
                case 0:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.as(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.av(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.M(iP, unsafe.getLong(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.ab(iP, unsafe.getLong(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.K(iP, unsafe.getInt(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.au(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.at(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.ar(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        Object object = unsafe.getObject(obj2, jW);
                        iAs = object instanceof eea ? eei.G(iP, (eea) object) : eei.W(iP, (String) object);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = egy.f(iP, unsafe.getObject(obj2, jW), eglVar.z(i5));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.G(iP, (eea) unsafe.getObject(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.Z(iP, unsafe.getInt(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.I(iP, unsafe.getInt(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.aw(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.ax(iP);
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.S(iP, unsafe.getInt(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.U(iP, unsafe.getLong(obj2, jW));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    if (eglVar.P(obj2, i5, i2, i3, i)) {
                        iAs = eei.J(iP, (egi) unsafe.getObject(obj2, jW), eglVar.z(i5));
                        i6 += iAs;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iO = egy.o(iP, (List) unsafe.getObject(obj, jW));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                    iO = egy.n(iP, (List) unsafe.getObject(obj, jW));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar = egy.a;
                    if (list.size() != 0) {
                        iE = egy.e(list);
                        size = list.size() * eei.Y(iP);
                        iY4 = iE + size;
                        i6 += iY4;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    iY4 = 0;
                    i6 += iY4;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar2 = egy.a;
                    size2 = list2.size();
                    if (size2 != 0) {
                        iJ = egy.j(list2);
                        iY = eei.Y(iP);
                        iO = iJ + (size2 * iY);
                        i6 += iO;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar3 = egy.a;
                    size2 = list3.size();
                    if (size2 != 0) {
                        iJ = egy.d(list3);
                        iY = eei.Y(iP);
                        iO = iJ + (size2 * iY);
                        i6 += iO;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 23:
                    iO = egy.o(iP, (List) unsafe.getObject(obj, jW));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 24:
                    iO = egy.n(iP, (List) unsafe.getObject(obj, jW));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar4 = egy.a;
                    int size3 = list4.size();
                    iO = size3 == 0 ? 0 : size3 * eei.ar(iP);
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar5 = egy.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iY2 = 0;
                    } else {
                        iY2 = eei.Y(iP) * size4;
                        if (list5 instanceof efw) {
                            efw efwVar = (efw) list5;
                            for (int i11 = 0; i11 < size4; i11++) {
                                Object objC = efwVar.c();
                                iY2 += objC instanceof eea ? eei.H((eea) objC) : eei.X((String) objC);
                            }
                        } else {
                            for (int i12 = 0; i12 < size4; i12++) {
                                Object obj3 = list5.get(i12);
                                iY2 += obj3 instanceof eea ? eei.H((eea) obj3) : eei.X((String) obj3);
                            }
                        }
                    }
                    i6 += iY2;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, jW);
                    egx egxVarZ = this.z(i5);
                    ehh ehhVar6 = egy.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iY3 = 0;
                    } else {
                        iY3 = eei.Y(iP) * size5;
                        for (int i13 = 0; i13 < size5; i13++) {
                            Object obj4 = list6.get(i13);
                            iY3 += obj4 instanceof efv ? eei.O((efv) obj4) : eei.R((egi) obj4, egxVarZ);
                        }
                    }
                    i6 += iY3;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar7 = egy.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iY4 = 0;
                    } else {
                        iY4 = size6 * eei.Y(iP);
                        for (int i14 = 0; i14 < list7.size(); i14++) {
                            iY4 += eei.H((eea) list7.get(i14));
                        }
                    }
                    i6 += iY4;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar8 = egy.a;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iJ = egy.i(list8);
                        iY = eei.Y(iP);
                        iO = iJ + (size2 * iY);
                        i6 += iO;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar9 = egy.a;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iJ = egy.a(list9);
                        iY = eei.Y(iP);
                        iO = iJ + (size2 * iY);
                        i6 += iO;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 31:
                    iO = egy.n(iP, (List) unsafe.getObject(obj, jW));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 32:
                    iO = egy.o(iP, (List) unsafe.getObject(obj, jW));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar10 = egy.a;
                    size2 = list10.size();
                    if (size2 != 0) {
                        iJ = egy.g(list10);
                        iY = eei.Y(iP);
                        iO = iJ + (size2 * iY);
                        i6 += iO;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar11 = egy.a;
                    size2 = list11.size();
                    if (size2 != 0) {
                        iJ = egy.h(list11);
                        iY = eei.Y(iP);
                        iO = iJ + (size2 * iY);
                        i6 += iO;
                        i2 = i7;
                        i3 = i4;
                        eglVar = this;
                        obj2 = obj;
                        break;
                    }
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                case 35:
                    size = egy.c((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 36:
                    size = egy.b((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 37:
                    size = egy.e((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 38:
                    size = egy.j((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 39:
                    size = egy.d((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 40:
                    size = egy.c((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 41:
                    size = egy.b((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, jW);
                    ehh ehhVar12 = egy.a;
                    size = list12.size();
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 43:
                    size = egy.i((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 44:
                    size = egy.a((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 45:
                    size = egy.b((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 46:
                    size = egy.c((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 47:
                    size = egy.g((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 48:
                    size = egy.h((List) unsafe.getObject(obj, jW));
                    if (size > 0) {
                        iY5 = eei.Y(iP);
                        iAa = eei.aa(size);
                        iE = iY5 + iAa;
                        iY4 = iE + size;
                        i6 += iY4;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, jW);
                    egx egxVarZ2 = this.z(i5);
                    ehh ehhVar13 = egy.a;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        iJ2 = 0;
                    } else {
                        iJ2 = 0;
                        for (int i15 = 0; i15 < size7; i15++) {
                            iJ2 += eei.J(iP, (egi) list13.get(i15), egxVarZ2);
                        }
                    }
                    i6 += iJ2;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 50:
                    iO = ebq.m(iP, unsafe.getObject(obj, jW), this.B(i5));
                    i6 += iO;
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 51:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.as(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 52:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.av(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 53:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.M(iP, x(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 54:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.ab(iP, x(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 55:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.K(iP, q(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 56:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.au(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 57:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.at(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 58:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.ar(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 59:
                    if (this.S(obj, iP, i5)) {
                        Object object2 = unsafe.getObject(obj, jW);
                        iO = object2 instanceof eea ? eei.G(iP, (eea) object2) : eei.W(iP, (String) object2);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 60:
                    if (this.S(obj, iP, i5)) {
                        iO = egy.f(iP, unsafe.getObject(obj, jW), this.z(i5));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 61:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.G(iP, (eea) unsafe.getObject(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 62:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.Z(iP, q(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 63:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.I(iP, q(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 64:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.aw(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 65:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.ax(iP);
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 66:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.S(iP, q(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 67:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.U(iP, x(obj, jW));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                case 68:
                    if (this.S(obj, iP, i5)) {
                        iO = eei.J(iP, (egi) unsafe.getObject(obj, jW), this.z(i5));
                        i6 += iO;
                    }
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
                default:
                    i2 = i7;
                    i3 = i4;
                    eglVar = this;
                    obj2 = obj;
                    break;
            }
            i5 += 3;
            this = eglVar;
            obj = obj2;
            i7 = i2;
            i4 = i3;
        }
        egl eglVar2 = this;
        Object obj5 = obj;
        ehh ehhVar14 = eglVar2.n;
        int iA = i6 + ehhVar14.a(ehhVar14.d(obj5));
        if (!eglVar2.h) {
            return iA;
        }
        eep eepVarH = ebz.h(obj5);
        int i16 = eepVarH.b.b;
        int iJ3 = 0;
        for (int i17 = 0; i17 < i16; i17++) {
            eha ehaVar = (eha) eepVarH.b.d(i17);
            iJ3 += eep.j((eey) ehaVar.a, ehaVar.b);
        }
        for (Map.Entry entry : eepVarH.b.a()) {
            iJ3 += eep.j((eey) entry.getKey(), entry.getValue());
        }
        return iA + iJ3;
    }

    @Override // defpackage.egx
    public final int b(Object obj) {
        int i;
        int iA;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iV = v(i4);
            int iP = p(i4);
            long jW = w(iV);
            int iHashCode = 37;
            switch (u(iV)) {
                case 0:
                    i = i3 * 53;
                    iA = efn.a(Double.doubleToLongBits(ehn.d(obj, jW)));
                    i3 = i + iA;
                    break;
                case 1:
                    i = i3 * 53;
                    iA = Float.floatToIntBits(ehn.e(obj, jW));
                    i3 = i + iA;
                    break;
                case 2:
                    i = i3 * 53;
                    iA = efn.a(ehn.h(obj, jW));
                    i3 = i + iA;
                    break;
                case 3:
                    i = i3 * 53;
                    iA = efn.a(ehn.h(obj, jW));
                    i3 = i + iA;
                    break;
                case 4:
                    i = i3 * 53;
                    iA = ehn.f(obj, jW);
                    i3 = i + iA;
                    break;
                case 5:
                    i = i3 * 53;
                    iA = efn.a(ehn.h(obj, jW));
                    i3 = i + iA;
                    break;
                case 6:
                    i = i3 * 53;
                    iA = ehn.f(obj, jW);
                    i3 = i + iA;
                    break;
                case 7:
                    i = i3 * 53;
                    boolean zY = ehn.y(obj, jW);
                    byte[] bArr = efn.b;
                    iA = a.d(zY);
                    i3 = i + iA;
                    break;
                case 8:
                    i = i3 * 53;
                    iA = ((String) ehn.j(obj, jW)).hashCode();
                    i3 = i + iA;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objJ = ehn.j(obj, jW);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iA = ehn.j(obj, jW).hashCode();
                    i3 = i + iA;
                    break;
                case 11:
                    i = i3 * 53;
                    iA = ehn.f(obj, jW);
                    i3 = i + iA;
                    break;
                case 12:
                    i = i3 * 53;
                    iA = ehn.f(obj, jW);
                    i3 = i + iA;
                    break;
                case 13:
                    i = i3 * 53;
                    iA = ehn.f(obj, jW);
                    i3 = i + iA;
                    break;
                case 14:
                    i = i3 * 53;
                    iA = efn.a(ehn.h(obj, jW));
                    i3 = i + iA;
                    break;
                case 15:
                    i = i3 * 53;
                    iA = ehn.f(obj, jW);
                    i3 = i + iA;
                    break;
                case 16:
                    i = i3 * 53;
                    iA = efn.a(ehn.h(obj, jW));
                    i3 = i + iA;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objJ2 = ehn.j(obj, jW);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iA = ehn.j(obj, jW).hashCode();
                    i3 = i + iA;
                    break;
                case 50:
                    i = i3 * 53;
                    iA = ehn.j(obj, jW).hashCode();
                    i3 = i + iA;
                    break;
                case 51:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = efn.a(Double.doubleToLongBits(n(obj, jW)));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = Float.floatToIntBits(o(obj, jW));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = efn.a(x(obj, jW));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = efn.a(x(obj, jW));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = q(obj, jW);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = efn.a(x(obj, jW));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = q(obj, jW);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        boolean zT = T(obj, jW);
                        byte[] bArr2 = efn.b;
                        iA = a.d(zT);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = ((String) ehn.j(obj, jW)).hashCode();
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = ehn.j(obj, jW).hashCode();
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = ehn.j(obj, jW).hashCode();
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = q(obj, jW);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = q(obj, jW);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = q(obj, jW);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = efn.a(x(obj, jW));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = q(obj, jW);
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = efn.a(x(obj, jW));
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iA = ehn.j(obj, jW).hashCode();
                        i3 = i + iA;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.n.d(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + ebz.h(obj).hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.edm r39) {
        /*
            Method dump skipped, instructions count: 3652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.c(java.lang.Object, byte[], int, int, int, edm):int");
    }

    @Override // defpackage.egx
    public final Object e() {
        return ebq.i(this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // defpackage.egx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = R(r7)
            if (r0 != 0) goto L8
            goto L89
        L8:
            boolean r0 = r7 instanceof defpackage.efb
            if (r0 == 0) goto L18
            r0 = r7
            efb r0 = (defpackage.efb) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r6.c
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L7b
            int r2 = r6.v(r1)
            long r3 = w(r2)
            int r2 = u(r2)
            r5 = 9
            if (r2 == r5) goto L65
            r5 = 60
            if (r2 == r5) goto L4d
            r5 = 68
            if (r2 == r5) goto L4d
            switch(r2) {
                case 17: goto L65;
                case 18: goto L49;
                case 19: goto L49;
                case 20: goto L49;
                case 21: goto L49;
                case 22: goto L49;
                case 23: goto L49;
                case 24: goto L49;
                case 25: goto L49;
                case 26: goto L49;
                case 27: goto L49;
                case 28: goto L49;
                case 29: goto L49;
                case 30: goto L49;
                case 31: goto L49;
                case 32: goto L49;
                case 33: goto L49;
                case 34: goto L49;
                case 35: goto L49;
                case 36: goto L49;
                case 37: goto L49;
                case 38: goto L49;
                case 39: goto L49;
                case 40: goto L49;
                case 41: goto L49;
                case 42: goto L49;
                case 43: goto L49;
                case 44: goto L49;
                case 45: goto L49;
                case 46: goto L49;
                case 47: goto L49;
                case 48: goto L49;
                case 49: goto L49;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L78
        L3a:
            sun.misc.Unsafe r2 = defpackage.egl.b
            java.lang.Object r5 = r2.getObject(r7, r3)
            if (r5 == 0) goto L78
            defpackage.ebq.q(r5)
            r2.putObject(r7, r3, r5)
            goto L78
        L49:
            defpackage.ebz.b(r7, r3)
            goto L78
        L4d:
            int r2 = r6.p(r1)
            boolean r2 = r6.S(r7, r2, r1)
            if (r2 == 0) goto L78
            egx r2 = r6.z(r1)
            sun.misc.Unsafe r5 = defpackage.egl.b
            java.lang.Object r3 = r5.getObject(r7, r3)
            r2.f(r3)
            goto L78
        L65:
            boolean r2 = r6.O(r7, r1)
            if (r2 == 0) goto L78
            egx r2 = r6.z(r1)
            sun.misc.Unsafe r5 = defpackage.egl.b
            java.lang.Object r3 = r5.getObject(r7, r3)
            r2.f(r3)
        L78:
            int r1 = r1 + 3
            goto L1b
        L7b:
            ehh r0 = r6.n
            r0.h(r7)
            boolean r0 = r6.h
            if (r0 == 0) goto L89
            ebz r6 = r6.p
            r6.e(r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.f(java.lang.Object):void");
    }

    @Override // defpackage.egx
    public final void g(Object obj, Object obj2) {
        F(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            int iP = p(i);
            switch (u(iV)) {
                case 0:
                    if (O(obj2, i)) {
                        ehn.s(obj, jW, ehn.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (O(obj2, i)) {
                        ehn.t(obj, jW, ehn.e(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (O(obj2, i)) {
                        ehn.v(obj, jW, ehn.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (O(obj2, i)) {
                        ehn.v(obj, jW, ehn.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (O(obj2, i)) {
                        ehn.u(obj, jW, ehn.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (O(obj2, i)) {
                        ehn.v(obj, jW, ehn.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (O(obj2, i)) {
                        ehn.u(obj, jW, ehn.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (O(obj2, i)) {
                        ehn.o(obj, jW, ehn.y(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (O(obj2, i)) {
                        ehn.w(obj, jW, ehn.j(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    G(obj, obj2, i);
                    break;
                case 10:
                    if (O(obj2, i)) {
                        ehn.w(obj, jW, ehn.j(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (O(obj2, i)) {
                        ehn.u(obj, jW, ehn.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (O(obj2, i)) {
                        ehn.u(obj, jW, ehn.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (O(obj2, i)) {
                        ehn.u(obj, jW, ehn.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (O(obj2, i)) {
                        ehn.v(obj, jW, ehn.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (O(obj2, i)) {
                        ehn.u(obj, jW, ehn.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (O(obj2, i)) {
                        ehn.v(obj, jW, ehn.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    G(obj, obj2, i);
                    break;
                case 18:
                case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    ebz.c(obj, obj2, jW);
                    break;
                case 50:
                    ehh ehhVar = egy.a;
                    ehn.w(obj, jW, ebq.o(ehn.j(obj, jW), ehn.j(obj2, jW)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (S(obj2, iP, i)) {
                        ehn.w(obj, jW, ehn.j(obj2, jW));
                        J(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    H(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (S(obj2, iP, i)) {
                        ehn.w(obj, jW, ehn.j(obj2, jW));
                        J(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    H(obj, obj2, i);
                    break;
            }
        }
        egy.m(this.n, obj, obj2);
        if (this.h) {
            egy.p(this.p, obj, obj2);
        }
    }

    @Override // defpackage.egx
    public final void h(Object obj, byte[] bArr, int i, int i2, edm edmVar) {
        c(obj, bArr, i, i2, 0, edmVar);
    }

    @Override // defpackage.egx
    public final boolean i(Object obj, Object obj2) {
        boolean zG;
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            switch (u(iV)) {
                case 0:
                    if (!M(obj, obj2, i) || Double.doubleToLongBits(ehn.d(obj, jW)) != Double.doubleToLongBits(ehn.d(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!M(obj, obj2, i) || Float.floatToIntBits(ehn.e(obj, jW)) != Float.floatToIntBits(ehn.e(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!M(obj, obj2, i) || ehn.h(obj, jW) != ehn.h(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!M(obj, obj2, i) || ehn.h(obj, jW) != ehn.h(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!M(obj, obj2, i) || ehn.f(obj, jW) != ehn.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!M(obj, obj2, i) || ehn.h(obj, jW) != ehn.h(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!M(obj, obj2, i) || ehn.f(obj, jW) != ehn.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!M(obj, obj2, i) || ehn.y(obj, jW) != ehn.y(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (M(obj, obj2, i)) {
                        Object objJ = ehn.j(obj, jW);
                        Object objJ2 = ehn.j(obj2, jW);
                        ehh ehhVar = egy.a;
                        if (a.g(objJ, objJ2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (M(obj, obj2, i)) {
                        Object objJ3 = ehn.j(obj, jW);
                        Object objJ4 = ehn.j(obj2, jW);
                        ehh ehhVar2 = egy.a;
                        if (a.g(objJ3, objJ4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (M(obj, obj2, i)) {
                        Object objJ5 = ehn.j(obj, jW);
                        Object objJ6 = ehn.j(obj2, jW);
                        ehh ehhVar3 = egy.a;
                        if (a.g(objJ5, objJ6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!M(obj, obj2, i) || ehn.f(obj, jW) != ehn.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!M(obj, obj2, i) || ehn.f(obj, jW) != ehn.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!M(obj, obj2, i) || ehn.f(obj, jW) != ehn.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!M(obj, obj2, i) || ehn.h(obj, jW) != ehn.h(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!M(obj, obj2, i) || ehn.f(obj, jW) != ehn.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!M(obj, obj2, i) || ehn.h(obj, jW) != ehn.h(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (M(obj, obj2, i)) {
                        Object objJ7 = ehn.j(obj, jW);
                        Object objJ8 = ehn.j(obj2, jW);
                        ehh ehhVar4 = egy.a;
                        if (a.g(objJ7, objJ8)) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    Object objJ9 = ehn.j(obj, jW);
                    Object objJ10 = ehn.j(obj2, jW);
                    ehh ehhVar5 = egy.a;
                    zG = a.g(objJ9, objJ10);
                    break;
                case 50:
                    Object objJ11 = ehn.j(obj, jW);
                    Object objJ12 = ehn.j(obj2, jW);
                    ehh ehhVar6 = egy.a;
                    zG = a.g(objJ11, objJ12);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jS = s(i) & 1048575;
                    if (ehn.f(obj, jS) == ehn.f(obj2, jS)) {
                        Object objJ13 = ehn.j(obj, jW);
                        Object objJ14 = ehn.j(obj2, jW);
                        ehh ehhVar7 = egy.a;
                        if (a.g(objJ13, objJ14)) {
                            continue;
                        }
                    }
                    return false;
                default:
            }
            if (!zG) {
                return false;
            }
        }
        if (!this.n.d(obj).equals(this.n.d(obj2))) {
            return false;
        }
        if (this.h) {
            return ebz.h(obj).equals(ebz.h(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    @Override // defpackage.egx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.j(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a8, code lost:
    
        r0.put(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ab, code lost:
    
        ((defpackage.eee) r19.c).A(r4);
        r12 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06b0 A[Catch: all -> 0x06d8, TryCatch #8 {all -> 0x06d8, blocks: (B:218:0x06ab, B:220:0x06b0, B:221:0x06b5), top: B:257:0x06ab }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06e8 A[LOOP:3: B:237:0x06e4->B:239:0x06e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.egx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Object r18, defpackage.fdu r19, defpackage.een r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.k(java.lang.Object, fdu, een):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0286  */
    @Override // defpackage.egx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r19, defpackage.fsc r20) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.m(java.lang.Object, fsc):void");
    }
}
