package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dop {
    public static final Logger a = Logger.getLogger(dop.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private dop() {
    }

    public static boolean a() {
        return b.get();
    }
}
