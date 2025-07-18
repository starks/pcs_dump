package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjs {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public static void b(String str) {
        ffy ffyVar = new ffy(a.z(str, "lateinit property ", " has not been initialized"));
        d(ffyVar, fjs.class.getName());
        throw ffyVar;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    static void d(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static fku e(Iterator it) {
        return f(new ux(it, 4));
    }

    public static fku f(fku fkuVar) {
        return fkuVar instanceof fkq ? fkuVar : new fkq(fkuVar);
    }

    public static List g(fku fkuVar) {
        Iterator itA = fkuVar.a();
        if (!itA.hasNext()) {
            return fgm.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            return ffh.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static /* synthetic */ String h(fku fkuVar, CharSequence charSequence) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator itA = fkuVar.a();
        int i = 0;
        while (itA.hasNext()) {
            Object next = itA.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            fjz.d(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static int i(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int j(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int k(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + ".");
    }

    public static fkh l(fkh fkhVar, int i) {
        fkhVar.getClass();
        if (fkhVar.c <= 0) {
            i = -i;
        }
        return new fkh(fkhVar.a, fkhVar.b, i);
    }

    public static fki m(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? fki.e : new fki(i, i2 - 1);
    }

    public static final long o(long j, long j2) {
        return j & (~j2);
    }

    public static final void p(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.x(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final void q(fhq fhqVar, Throwable th) {
        Iterator it = fog.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(fhqVar, th);
            } catch (fol unused) {
                return;
            } catch (Throwable th2) {
                fog.a(fme.c(th, th2));
            }
        }
        try {
            ffh.a(th, new foi(fhqVar));
        } catch (Throwable unused2) {
        }
        fog.a(th);
    }

    public static final fui r(Object obj) {
        if (obj == null) {
            obj = fnz.a;
        }
        return new fui(obj);
    }

    public final long n(long j, int i) {
        return o(j, 1073741823L) | i;
    }
}
