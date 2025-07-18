package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fon {
    public static final foh a;
    private static final int b = b(Throwable.class, -1);

    static {
        foh fohVar;
        try {
            fohVar = foo.a ? fpi.a : foe.a;
        } catch (Throwable unused) {
            fohVar = fpi.a;
        }
        a = fohVar;
    }

    public static final fiy a(Class cls) throws SecurityException {
        Object next;
        fiy fiyVar;
        ffs ffsVar;
        fom fomVar = fom.a;
        if (b == b(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                int i2 = 4;
                if (length2 == 0) {
                    ffsVar = new ffs(new ada(new ada(constructor, 8), i2), 0);
                } else if (length2 != 1) {
                    ffsVar = length2 != 2 ? new ffs(null, -1) : (fjs.c(parameterTypes[0], String.class) && fjs.c(parameterTypes[1], Throwable.class)) ? new ffs(new ada(new ada(constructor, 5), i2), 3) : new ffs(null, -1);
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    ffsVar = fjs.c(cls2, String.class) ? new ffs(new ada(new ada(constructor, 6), i2), 2) : fjs.c(cls2, Throwable.class) ? new ffs(new ada(new ada(constructor, 7), i2), 1) : new ffs(null, -1);
                }
                arrayList.add(ffsVar);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((ffs) next).b).intValue();
                    while (true) {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((ffs) next2).b).intValue();
                        int i3 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                        if (iIntValue < iIntValue2) {
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        iIntValue = i3;
                    }
                }
            }
            ffs ffsVar2 = (ffs) next;
            if (ffsVar2 != null && (fiyVar = (fiy) ffsVar2.a) != null) {
                return fiyVar;
            }
        }
        return fomVar;
    }

    private static final int b(Class cls, int i) {
        Object objB;
        fjp.n(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objB = ffh.b(th);
            }
        } while (cls != null);
        objB = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objB instanceof fft)) {
            objB = objValueOf;
        }
        return ((Number) objB).intValue();
    }
}
