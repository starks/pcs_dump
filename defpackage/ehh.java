package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehh {
    private static volatile int a = 100;

    public ehh() {
    }

    public static /* bridge */ /* synthetic */ void k(Object obj, int i, int i2) {
        ((ehi) obj).e(ehu.c(i, 5), Integer.valueOf(i2));
    }

    public static /* bridge */ /* synthetic */ void l(Object obj, int i, long j) {
        ((ehi) obj).e(ehu.c(i, 1), Long.valueOf(j));
    }

    public static /* bridge */ /* synthetic */ void m(Object obj, int i, Object obj2) {
        ((ehi) obj).e(ehu.c(i, 3), obj2);
    }

    public static ehi n(Object obj) {
        return ((efb) obj).unknownFields;
    }

    public static /* synthetic */ Object o() {
        return new ehi();
    }

    public static void p(Object obj, ehi ehiVar) {
        ((efb) obj).unknownFields = ehiVar;
    }

    public static /* synthetic */ Object r(Object obj) {
        ((ehi) obj).d();
        return obj;
    }

    public final /* synthetic */ int a(Object obj) {
        return ((ehi) obj).a();
    }

    public final /* synthetic */ int b(Object obj) {
        ehi ehiVar = (ehi) obj;
        int i = ehiVar.e;
        if (i != -1) {
            return i;
        }
        int iZ = 0;
        for (int i2 = 0; i2 < ehiVar.b; i2++) {
            int iA = ehu.a(ehiVar.c[i2]);
            eea eeaVar = (eea) ehiVar.d[i2];
            int iY = eei.Y(1);
            iZ += iY + iY + eei.Z(2, iA) + eei.G(3, eeaVar);
        }
        ehiVar.e = iZ;
        return iZ;
    }

    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        ehi ehiVarN = n(obj);
        if (ehiVarN != ehi.a) {
            return ehiVarN;
        }
        ehi ehiVar = new ehi();
        p(obj, ehiVar);
        return ehiVar;
    }

    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        return n(obj);
    }

    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!ehi.a.equals(obj2)) {
            if (ehi.a.equals(obj)) {
                ehi ehiVar = (ehi) obj;
                ehi ehiVar2 = (ehi) obj2;
                int i = ehiVar.b + ehiVar2.b;
                int[] iArrCopyOf = Arrays.copyOf(ehiVar.c, i);
                System.arraycopy(ehiVar2.c, 0, iArrCopyOf, ehiVar.b, ehiVar2.b);
                Object[] objArrCopyOf = Arrays.copyOf(ehiVar.d, i);
                System.arraycopy(ehiVar2.d, 0, objArrCopyOf, ehiVar.b, ehiVar2.b);
                return new ehi(i, iArrCopyOf, objArrCopyOf, true);
            }
            ehi ehiVar3 = (ehi) obj2;
            if (!ehiVar3.equals(ehi.a)) {
                ehi ehiVar4 = (ehi) obj;
                ehiVar4.b();
                int i2 = ehiVar4.b + ehiVar3.b;
                ehiVar4.c(i2);
                System.arraycopy(ehiVar3.c, 0, ehiVar4.c, ehiVar4.b, ehiVar3.b);
                System.arraycopy(ehiVar3.d, 0, ehiVar4.d, ehiVar4.b, ehiVar3.b);
                ehiVar4.b = i2;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, int i, eea eeaVar) {
        ((ehi) obj).e(ehu.c(i, 2), eeaVar);
    }

    public final /* bridge */ /* synthetic */ void g(Object obj, int i, long j) {
        ((ehi) obj).e(ehu.c(i, 0), Long.valueOf(j));
    }

    public final void h(Object obj) {
        n(obj).d();
    }

    public final /* synthetic */ void i(Object obj, Object obj2) {
        p(obj, (ehi) obj2);
    }

    public final /* bridge */ /* synthetic */ void j(Object obj, Object obj2) {
        p(obj, (ehi) obj2);
    }

    final boolean s(Object obj, fdu fduVar, int i) throws efp {
        int i2 = fduVar.a;
        int iA = ehu.a(i2);
        int iB = ehu.b(i2);
        if (iB == 0) {
            g(obj, iA, fduVar.o());
            return true;
        }
        if (iB == 1) {
            l(obj, iA, fduVar.n());
            return true;
        }
        if (iB == 2) {
            f(obj, iA, fduVar.s());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i != 0) {
                    return false;
                }
                throw new efp("Protocol message end-group tag did not match expected tag.");
            }
            if (iB != 5) {
                throw new efo();
            }
            k(obj, iA, fduVar.i());
            return true;
        }
        int iC = ehu.c(iA, 4);
        int i3 = i + 1;
        Object objO = o();
        if (i3 >= a) {
            throw new efp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (fduVar.g() != Integer.MAX_VALUE && s(objO, fduVar, i3)) {
        }
        if (iC != fduVar.a) {
            throw new efp("Protocol message end-group tag did not match expected tag.");
        }
        m(obj, iA, r(objO));
        return true;
    }

    public final /* synthetic */ void t(Object obj, fsc fscVar) {
        int i = 0;
        while (true) {
            ehi ehiVar = (ehi) obj;
            if (i >= ehiVar.b) {
                return;
            }
            fscVar.I(ehu.a(ehiVar.c[i]), ehiVar.d[i]);
            i++;
        }
    }

    public final /* synthetic */ void u(Object obj, fsc fscVar) {
        ((ehi) obj).f(fscVar);
    }

    public ehh(byte[] bArr) {
        this();
    }

    public final void q() {
    }
}
