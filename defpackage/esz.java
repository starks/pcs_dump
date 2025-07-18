package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esz {
    public static final Logger a = Logger.getLogger(esz.class.getName());
    public final String b;
    public final AtomicLong c;

    public esz(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        clq.w(j > 0, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(j);
    }
}
