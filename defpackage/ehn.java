package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehn {
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final Unsafe e;
    private static final Class f;
    private static final boolean g;
    private static final boolean h;
    private static final ehm i;
    private static final long j;

    static {
        Unsafe unsafeL = l();
        e = unsafeL;
        f = Memory.class;
        boolean zX = x(Long.TYPE);
        g = zX;
        boolean zX2 = x(Integer.TYPE);
        h = zX2;
        ehm ehkVar = null;
        if (unsafeL != null) {
            if (zX) {
                ehkVar = new ehl(unsafeL);
            } else if (zX2) {
                ehkVar = new ehk(unsafeL);
            }
        }
        i = ehkVar;
        a = ehkVar == null ? false : ehkVar.p();
        b = ehkVar == null ? false : ehkVar.o();
        c = B(byte[].class);
        B(boolean[].class);
        D(boolean[].class);
        B(int[].class);
        D(int[].class);
        B(long[].class);
        D(long[].class);
        B(float[].class);
        D(float[].class);
        B(double[].class);
        D(double[].class);
        B(Object[].class);
        D(Object[].class);
        Field fieldK = k();
        long jL = -1;
        if (fieldK != null && ehkVar != null) {
            jL = ehkVar.l(fieldK);
        }
        j = jL;
        d = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private ehn() {
    }

    public static boolean A(Object obj, long j2) {
        return c(obj, j2) != 0;
    }

    private static int B(Class cls) {
        if (b) {
            return i.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static Field C(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void D(Class cls) {
        if (b) {
            i.a.arrayIndexScale(cls);
        }
    }

    static byte a(long j2) {
        return i.a(j2);
    }

    public static byte b(Object obj, long j2) {
        return (byte) ((f(obj, j2 & (-4)) >>> ((int) (((~j2) & 3) << 3))) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
    }

    public static byte c(Object obj, long j2) {
        return (byte) ((f(obj, j2 & (-4)) >>> ((int) ((3 & j2) << 3))) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
    }

    static double d(Object obj, long j2) {
        return i.b(obj, j2);
    }

    static float e(Object obj, long j2) {
        return i.c(obj, j2);
    }

    static int f(Object obj, long j2) {
        return i.j(obj, j2);
    }

    static long g(ByteBuffer byteBuffer) {
        return i.k(byteBuffer, j);
    }

    static long h(Object obj, long j2) {
        return i.k(obj, j2);
    }

    static Object i(Class cls) {
        try {
            return e.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object j(Object obj, long j2) {
        return i.a.getObject(obj, j2);
    }

    public static Field k() {
        Field fieldC = C(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = C(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ehj());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void m(long j2, byte[] bArr, long j3, long j4) {
        i.d(j2, bArr, j3, j4);
    }

    public static void n(Throwable th) {
        Logger.getLogger(ehn.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void o(Object obj, long j2, boolean z) {
        i.e(obj, j2, z);
    }

    static void p(byte[] bArr, long j2, byte b2) {
        i.f(bArr, c + j2, b2);
    }

    public static void q(Object obj, long j2, byte b2) {
        int i2 = ((~((int) j2)) & 3) << 3;
        int i3 = AIFeature.Id.ROSIE_ROBOT_TRANSLATE << i2;
        long j3 = j2 & (-4);
        int i4 = (b2 & 255) << i2;
        u(obj, j3, i4 | ((~i3) & f(obj, j3)));
    }

    public static void r(Object obj, long j2, byte b2) {
        int i2 = (((int) j2) & 3) << 3;
        int i3 = AIFeature.Id.ROSIE_ROBOT_TRANSLATE << i2;
        long j3 = j2 & (-4);
        int i4 = (b2 & 255) << i2;
        u(obj, j3, i4 | ((~i3) & f(obj, j3)));
    }

    static void s(Object obj, long j2, double d2) {
        i.g(obj, j2, d2);
    }

    static void t(Object obj, long j2, float f2) {
        i.h(obj, j2, f2);
    }

    static void u(Object obj, long j2, int i2) {
        i.m(obj, j2, i2);
    }

    static void v(Object obj, long j2, long j3) {
        i.n(obj, j2, j3);
    }

    public static void w(Object obj, long j2, Object obj2) {
        i.a.putObject(obj, j2, obj2);
    }

    static boolean x(Class cls) {
        try {
            Class cls2 = f;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean y(Object obj, long j2) {
        return i.i(obj, j2);
    }

    public static boolean z(Object obj, long j2) {
        return b(obj, j2) != 0;
    }
}
