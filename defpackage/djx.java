package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djx {
    private final String a;
    private volatile Logger b;
    private final fjk c = new fjk();

    public djx(Class cls) {
        this.a = cls.getName();
    }

    final Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            Logger logger2 = this.b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.a);
            this.b = logger3;
            return logger3;
        }
    }
}
