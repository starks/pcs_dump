package j$.util;

import j$.util.Spliterator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {
    private static final Spliterator a = new S();
    private static final Spliterator.OfLong b = null;

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static Spliterator b() {
        return a;
    }

    public static Iterator c(Spliterator spliterator) {
        spliterator.getClass();
        return new M(spliterator);
    }

    public static Spliterator d(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new N(objArr, i, i2, i3);
    }

    public static Spliterator e(Iterator it) {
        it.getClass();
        return new T(it);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i, int i2, int i3) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new U(jArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new T(collection, i);
    }
}
