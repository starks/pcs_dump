package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etg implements ezx {
    public static final Logger a = Logger.getLogger(etg.class.getName());
    public final ScheduledExecutorService b;
    public final equ c;
    public evf d;
    public exo e;
    private final fbc f;

    public etg(fbc fbcVar, ScheduledExecutorService scheduledExecutorService, equ equVar) {
        this.f = fbcVar;
        this.b = scheduledExecutorService;
        this.c = equVar;
    }

    @Override // defpackage.ezx
    public final void a() {
        this.c.c();
        this.c.execute(new chg(this, 9));
    }
}
