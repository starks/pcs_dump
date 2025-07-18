package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {
    private static final a b;
    private final Unsafe a;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e);
        }
        declaredField.setAccessible(true);
        try {
            b = new a((Unsafe) declaredField.get(null));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("Couldn't get the Unsafe", e2);
        }
    }

    a(Unsafe unsafe) {
        this.a = unsafe;
    }

    public static a h() {
        return b;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final boolean c(Object obj, long j, int i, int i2) {
        return this.a.compareAndSwapInt(obj, j, i, i2);
    }

    public final boolean d(Object obj, long j, long j2, long j3) {
        return this.a.compareAndSwapLong(obj, j, j2, j3);
    }

    public final boolean e(Object obj, long j, Object obj2) {
        return j$.com.android.tools.r8.a.a(this.a, obj, j, null, obj2);
    }

    public final int f(Object obj, long j) {
        while (true) {
            int intVolatile = this.a.getIntVolatile(obj, j);
            Object obj2 = obj;
            long j2 = j;
            if (this.a.compareAndSwapInt(obj2, j2, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            obj = obj2;
            j = j2;
        }
    }

    public final Object g(Object obj, long j) {
        return this.a.getObjectVolatile(obj, j);
    }

    public final long i(Class cls, String str) throws NoSuchFieldException {
        try {
            return this.a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Cannot find field:", e);
        }
    }

    public final void j(Object obj, long j, Object obj2) {
        this.a.putObjectVolatile(obj, j, obj2);
    }
}
