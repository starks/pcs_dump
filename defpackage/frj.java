package defpackage;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frj {
    public final Object a;
    public final Object b;

    public frj(fag fagVar, eqd eqdVar) {
        this.a = fagVar;
        this.b = eqdVar;
    }

    private static String h(fvk fvkVar) {
        long j = fvkVar.b;
        return j <= 64 ? fvkVar.w().d() : fvkVar.x((int) Math.min(j, 64L)).d().concat("...");
    }

    public final boolean a() {
        return ((Logger) this.a).isLoggable((Level) this.b);
    }

    public final void b(int i, int i2, fvk fvkVar, int i3, boolean z) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", fbc.c(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + h(fvkVar));
        }
    }

    public final void c(int i, int i2, fdi fdiVar, fvn fvnVar) {
        if (a()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String strC = fbc.c(i);
            String strValueOf = String.valueOf(fdiVar);
            int iB = fvnVar.b();
            fvk fvkVar = new fvk();
            fvkVar.J(fvnVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strC + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + strValueOf + " length=" + iB + " bytes=" + h(fvkVar));
        }
    }

    public final void d(int i, long j) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", fbc.c(i) + " PING: ack=false bytes=" + j);
        }
    }

    public final void e(int i, int i2, fdi fdiVar) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", fbc.c(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(fdiVar));
        }
    }

    public final void f(int i, fdu fduVar) {
        if (a()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String strC = fbc.c(i);
            EnumMap enumMap = new EnumMap(fch.class);
            for (fch fchVar : fch.values()) {
                int i2 = fchVar.g;
                if (fduVar.c(i2)) {
                    enumMap.put((EnumMap) fchVar, (fch) Integer.valueOf(fduVar.a(i2)));
                }
            }
            ((Logger) obj).logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strC + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    public final void g(int i, int i2, long j) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", fbc.c(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    public frj(fqx fqxVar, frb frbVar) {
        this.a = fqxVar;
        this.b = null;
    }

    public frj(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public frj(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }
}
