package j$.com.android.tools.r8;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ Unsafe a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ long c;

    public /* synthetic */ b(Class cls, String str, Class cls2) throws NoSuchFieldException, SecurityException {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                }
            }
            throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
        }
        declaredField.setAccessible(true);
        Unsafe unsafe = (Unsafe) declaredField.get(null);
        this.a = unsafe;
        this.b = cls.getDeclaredField(str).getType();
        if (!cls2.isPrimitive() || cls2 == Integer.TYPE || cls2 == Long.TYPE) {
            this.c = unsafe.objectFieldOffset(cls.getDeclaredField(str));
            return;
        }
        throw new UnsupportedOperationException("Using a VarHandle for a field of type '" + cls2.getName() + "' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
    }

    public static /* synthetic */ int e(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static /* synthetic */ long f(Object obj) {
        return obj instanceof Long ? ((Long) obj).longValue() : e(obj);
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2, Object obj3) {
        Class cls = Integer.TYPE;
        Class cls2 = this.b;
        if (cls2 == cls) {
            return this.a.compareAndSwapInt(obj, this.c, e(obj2), e(obj3));
        }
        if (cls2 != Long.TYPE) {
            return a.a(this.a, obj, this.c, obj2, obj3);
        }
        return this.a.compareAndSwapLong(obj, this.c, f(obj2), f(obj3));
    }

    public final /* synthetic */ Object b(Object obj) {
        Class cls = Integer.TYPE;
        long j = this.c;
        Class cls2 = this.b;
        return cls2 == cls ? Integer.valueOf(this.a.getInt(obj, j)) : cls2 == Long.TYPE ? Long.valueOf(this.a.getLong(obj, j)) : this.a.getObject(obj, j);
    }

    public final /* synthetic */ void c(Object obj, Object obj2) {
        Class cls = this.b;
        Class cls2 = Integer.TYPE;
        if (cls == cls2) {
            int iE = e(obj2);
            Class cls3 = Integer.TYPE;
            Class cls4 = this.b;
            if (cls4 == cls3) {
                this.a.putInt(obj, this.c, iE);
                return;
            } else if (cls4 == Long.TYPE) {
                this.a.putLong(obj, this.c, iE);
                return;
            } else {
                c(obj, Integer.valueOf(iE));
                return;
            }
        }
        long j = this.c;
        Class cls5 = Long.TYPE;
        if (cls != cls5) {
            this.a.putObject(obj, j, obj2);
            return;
        }
        long jF = f(obj2);
        if (cls == cls5) {
            this.a.putLong(obj, this.c, jF);
        } else {
            if (cls == cls2) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            this.a.putObject(obj, j, Long.valueOf(jF));
        }
    }

    public final /* synthetic */ void d(Object obj, Object obj2) {
        Class cls = this.b;
        Class cls2 = Integer.TYPE;
        if (cls == cls2) {
            int iE = e(obj2);
            Class cls3 = Integer.TYPE;
            Class cls4 = this.b;
            if (cls4 == cls3) {
                this.a.putOrderedInt(obj, this.c, iE);
                return;
            } else if (cls4 == Long.TYPE) {
                this.a.putOrderedLong(obj, this.c, iE);
                return;
            } else {
                d(obj, Integer.valueOf(iE));
                return;
            }
        }
        long j = this.c;
        Class cls5 = Long.TYPE;
        if (cls != cls5) {
            this.a.putOrderedObject(obj, j, obj2);
            return;
        }
        long jF = f(obj2);
        if (cls == cls5) {
            this.a.putOrderedLong(obj, this.c, jF);
        } else {
            if (cls == cls2) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            this.a.putOrderedObject(obj, j, Long.valueOf(jF));
        }
    }

    public final /* synthetic */ boolean g(ConcurrentLinkedQueue concurrentLinkedQueue, Object obj, Object obj2) {
        Class cls = Integer.TYPE;
        Class cls2 = this.b;
        if (cls2 == cls) {
            return this.a.compareAndSwapInt(concurrentLinkedQueue, this.c, e(obj), e(obj2));
        }
        if (cls2 != Long.TYPE) {
            return a.a(this.a, concurrentLinkedQueue, this.c, obj, obj2);
        }
        return this.a.compareAndSwapLong(concurrentLinkedQueue, this.c, f(obj), f(obj2));
    }
}
