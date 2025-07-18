package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ehm {
    final Unsafe a;

    public ehm(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract double b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract void d(long j, byte[] bArr, long j2, long j3);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(Object obj, long j, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public abstract boolean i(Object obj, long j);

    public final int j(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long k(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final long l(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final void m(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void n(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final boolean o() {
        try {
            Class<?> cls = this.a.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            return true;
        } catch (Throwable th) {
            ehn.n(th);
            return false;
        }
    }

    public final boolean p() {
        try {
            Class<?> cls = this.a.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            return ehn.k() != null;
        } catch (Throwable th) {
            ehn.n(th);
            return false;
        }
    }
}
