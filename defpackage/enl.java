package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enl {
    public static final Logger a = Logger.getLogger(enl.class.getName());
    public static final enl b = new enl();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap d = new ConcurrentSkipListMap();
    public final ConcurrentMap e = new ConcurrentHashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();
    public final ConcurrentMap g = new ConcurrentHashMap();

    public static long a(enu enuVar) {
        return enuVar.c().a;
    }

    public static void b(Map map, enn ennVar) {
    }

    public static void c(Map map, enn ennVar) {
    }
}
