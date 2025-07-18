package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
enum deh implements def {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;

    private static final Unsafe c;
    private static final int d;

    static {
        Unsafe unsafeB = b();
        c = unsafeB;
        d = unsafeB.arrayBaseOffset(byte[].class);
        if (unsafeB.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    private static Unsafe b() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: deg
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        deh dehVar = deh.UNSAFE_LITTLE_ENDIAN;
                        return a.h();
                    }
                });
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.def
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return c.getLong(bArr, i + d);
        }
        if (iOrdinal == 1) {
            return Long.reverseBytes(c.getLong(bArr, i + d));
        }
        throw null;
    }
}
