package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djq {
    public static final /* synthetic */ int a = 0;
    private static final cyj b;
    private static final cyj c;

    static {
        cyx cyxVar = new cyx(new cwh(new cvq(new bre(8), cyi.a), new cvq(new bre(9), cyi.a)));
        b = cyxVar;
        c = new cvq(new bre(10), cyxVar);
    }

    public static Exception a(Class cls, Throwable th) {
        List listAsList = Arrays.asList(cls.getConstructors());
        cyj cyjVar = c;
        Object[] objArrB = dcr.B(listAsList);
        Arrays.sort(objArrB, cyjVar);
        List listAsList2 = Arrays.asList(objArrB);
        listAsList2.getClass();
        Iterator it = new ArrayList(listAsList2).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) b((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException(a.G(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th);
    }

    private static Object b(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
