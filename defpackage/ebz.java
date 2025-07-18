package defpackage;

import j$.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebz {
    public static volatile epg a;

    public ebz() {
    }

    public static void C(fsc fscVar, Map.Entry entry) {
        eey eeyVar = (eey) entry.getKey();
        ehs ehsVar = ehs.DOUBLE;
        ehs ehsVar2 = eeyVar.a;
        throw null;
    }

    private static int D(byte b) {
        return b & 63;
    }

    private static boolean E(byte b) {
        return b > -65;
    }

    static efm a(Object obj, long j) {
        return (efm) ehn.j(obj, j);
    }

    public static void b(Object obj, long j) {
        a(obj, j).b();
    }

    public static void c(Object obj, Object obj2, long j) {
        efm efmVarA = a(obj, j);
        efm efmVarA2 = a(obj2, j);
        int size = efmVarA.size();
        int size2 = efmVarA2.size();
        if (size > 0 && size2 > 0) {
            if (!efmVarA.c()) {
                efmVarA = efmVarA.e(size2 + size);
            }
            efmVarA.addAll(efmVarA2);
        }
        if (size > 0) {
            efmVarA2 = efmVarA;
        }
        ehn.w(obj, j, efmVarA2);
    }

    public static List d(Object obj, long j) {
        efm efmVarA = a(obj, j);
        if (efmVarA.c()) {
            return efmVarA;
        }
        int size = efmVarA.size();
        efm efmVarE = efmVarA.e(size == 0 ? 10 : size + size);
        ehn.w(obj, j, efmVarE);
        return efmVarE;
    }

    public static void f(Map.Entry entry) {
    }

    public static Object g(een eenVar, egi egiVar, int i) {
        return eenVar.b(egiVar, i);
    }

    public static eep h(Object obj) {
        return ((eex) obj).a;
    }

    public static eep i(Object obj) {
        return ((eex) obj).a();
    }

    public static boolean j(egi egiVar) {
        return egiVar instanceof eex;
    }

    public static void k(eea eeaVar, Object obj, een eenVar, eep eepVar) {
        throw null;
    }

    public static Object l(fdu fduVar, Object obj, een eenVar, eep eepVar, Object obj2) {
        if (eez.D() == ehs.ENUM) {
            fduVar.j();
            throw null;
        }
        switch (eez.D().ordinal()) {
            case 0:
                fduVar.e();
                break;
            case 1:
                fduVar.f();
                break;
            case 2:
                fduVar.o();
                break;
            case 3:
                fduVar.r();
                break;
            case 4:
                fduVar.j();
                break;
            case 5:
                fduVar.n();
                break;
            case 6:
                fduVar.i();
                break;
            case 7:
                fduVar.R();
                break;
            case 8:
                fduVar.x();
                break;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                fduVar.s();
                break;
            case 12:
                fduVar.m();
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                fduVar.k();
                break;
            case 15:
                fduVar.p();
                break;
            case 16:
                fduVar.l();
                break;
            case 17:
                fduVar.q();
                break;
        }
        int iOrdinal = eez.D().ordinal();
        if (iOrdinal == 9 || iOrdinal != 10) {
            throw null;
        }
        throw null;
    }

    public static void m(fdu fduVar, Object obj, een eenVar, eep eepVar) {
        throw null;
    }

    public static int n(int i, ehf ehfVar, ehf ehfVar2) {
        ehz.f(ehfVar);
        ehz.f(ehfVar2);
        int iCompare = Long.compare(ehfVar.b, ehfVar2.b);
        return iCompare != 0 ? iCompare : Integer.compare(ehfVar.c, ehfVar2.c);
    }

    public static eek o(Duration duration) {
        return ehx.c(duration.getSeconds(), duration.getNano());
    }

    public static void p(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws efp {
        if (E(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || E(b3) || E(b4)) {
            throw new efp("Protocol message had invalid UTF-8.");
        }
        int iD = ((b & 7) << 18) | (D(b2) << 12) | (D(b3) << 6) | D(b4);
        cArr[i] = (char) ((iD >>> 10) + 55232);
        cArr[i + 1] = (char) ((iD & 1023) + 56320);
    }

    public static void q(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static void r(byte b, byte b2, byte b3, char[] cArr, int i) throws efp {
        if (!E(b2)) {
            if (b != -32) {
                if ((b == -19 || b2 < -96) && !E(b3)) {
                    cArr[i] = (char) (((b & 15) << 12) | (D(b2) << 6) | D(b3));
                    return;
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b == -19) {
                    cArr[i] = (char) (((b & 15) << 12) | (D(b2) << 6) | D(b3));
                    return;
                } else {
                    cArr[i] = (char) (((b & 15) << 12) | (D(b2) << 6) | D(b3));
                    return;
                }
            }
        }
        throw new efp("Protocol message had invalid UTF-8.");
    }

    public static void s(byte b, byte b2, char[] cArr, int i) throws efp {
        if (b < -62 || E(b2)) {
            throw new efp("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | D(b2));
    }

    public static boolean t(byte b) {
        return b >= 0;
    }

    public static boolean u(byte b) {
        return b < -16;
    }

    public static boolean v(byte b) {
        return b < -32;
    }

    public static elu x(elu eluVar, List list) {
        eluVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eluVar = new ely(eluVar, (elx) it.next());
        }
        return eluVar;
    }

    public void A(Object obj) {
        throw null;
    }

    public final void e(Object obj) {
        h(obj).e();
    }

    public emb w() {
        throw null;
    }

    public void y(eqo eqoVar, epc epcVar) {
        throw null;
    }

    public ebz(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this();
    }

    public ebz(byte[] bArr, char[] cArr) {
    }

    public void B() {
    }

    public void z(epc epcVar) {
    }
}
