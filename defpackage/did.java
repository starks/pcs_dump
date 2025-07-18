package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class did extends dhr {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    public static final /* synthetic */ int g = 0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: dic
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        int i = did.g;
                        return a.h();
                    }
                });
            }
            try {
                c = unsafe.objectFieldOffset(dif.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(dif.class.getDeclaredField("listeners"));
                d = unsafe.objectFieldOffset(dif.class.getDeclaredField("value"));
                e = unsafe.objectFieldOffset(die.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(die.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.dhr
    public final dhw a(dif difVar, dhw dhwVar) {
        dhw dhwVar2;
        do {
            dhwVar2 = difVar.listeners;
            if (dhwVar == dhwVar2) {
                break;
            }
        } while (!e(difVar, dhwVar2, dhwVar));
        return dhwVar2;
    }

    @Override // defpackage.dhr
    public final die b(dif difVar, die dieVar) {
        die dieVar2;
        do {
            dieVar2 = difVar.waiters;
            if (dieVar == dieVar2) {
                break;
            }
        } while (!g(difVar, dieVar2, dieVar));
        return dieVar2;
    }

    @Override // defpackage.dhr
    public final void c(die dieVar, die dieVar2) {
        a.putObject(dieVar, f, dieVar2);
    }

    @Override // defpackage.dhr
    public final void d(die dieVar, Thread thread) {
        a.putObject(dieVar, e, thread);
    }

    @Override // defpackage.dhr
    public final boolean e(dif difVar, dhw dhwVar, dhw dhwVar2) {
        return dib.a(a, difVar, b, dhwVar, dhwVar2);
    }

    @Override // defpackage.dhr
    public final boolean f(dif difVar, Object obj, Object obj2) {
        return dib.a(a, difVar, d, obj, obj2);
    }

    @Override // defpackage.dhr
    public final boolean g(dif difVar, die dieVar, die dieVar2) {
        return dib.a(a, difVar, c, dieVar, dieVar2);
    }
}
