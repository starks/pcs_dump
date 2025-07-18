package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcm extends dcd {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile dbc g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public dcm(String str) {
        super(str);
        if (a || b) {
            this.g = new dce().a(a());
        } else {
            if (!c) {
                this.g = null;
                return;
            }
            dco dcoVar = dcq.c;
            String str2 = dcoVar.a;
            this.g = new dco(dcoVar.b, dcoVar.c, Level.OFF, dcoVar.e, dcoVar.f).a(a());
        }
    }

    public static void e() {
        while (true) {
            dcm dcmVar = (dcm) dcl.a.poll();
            if (dcmVar == null) {
                f();
                return;
            }
            dcmVar.g = ((dcf) d.get()).a(dcmVar.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [daz, java.lang.Object] */
    private static void f() {
        while (true) {
            exo exoVar = (exo) f.poll();
            if (exoVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = exoVar.a;
            Object obj = exoVar.b;
            if (!r1.v()) {
                if (((dbc) obj).d(r1.m())) {
                }
            }
            ((dbc) obj).c(r1);
        }
    }

    @Override // defpackage.dcd, defpackage.dbc
    public final void b(RuntimeException runtimeException, daz dazVar) {
        if (this.g != null) {
            this.g.b(runtimeException, dazVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.dbc
    public final void c(daz dazVar) {
        if (this.g != null) {
            this.g.c(dazVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new exo(this, dazVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.dbc
    public final boolean d(Level level) {
        return this.g == null || this.g.d(level);
    }
}
