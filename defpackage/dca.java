package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dca {
    private static String a = "dcj";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"dcj", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return ddl.a().a;
    }

    public static long b() {
        return dby.a.c();
    }

    public static dbc d(String str) {
        return dby.a.e(str);
    }

    public static dbg f() {
        return i().a();
    }

    public static dbz g() {
        return dby.a.h();
    }

    public static dcr i() {
        return dby.a.j();
    }

    public static dcy k() {
        return i().b();
    }

    public static String l() {
        return dby.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract dbc e(String str);

    protected abstract dbz h();

    protected dcr j() {
        return dct.a;
    }

    protected abstract String m();
}
