package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epi {
    public final int a;
    public final epz b;
    public final equ c;
    public final epn d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final elv g;
    private final IdentityHashMap h;
    private final fbc i;

    public epi(eph ephVar) {
        Integer num = ephVar.a;
        num.getClass();
        this.a = num.intValue();
        epz epzVar = ephVar.b;
        epzVar.getClass();
        this.b = epzVar;
        equ equVar = ephVar.c;
        equVar.getClass();
        this.c = equVar;
        epn epnVar = ephVar.d;
        epnVar.getClass();
        this.d = epnVar;
        this.e = ephVar.e;
        this.g = ephVar.f;
        this.f = ephVar.g;
        this.i = ephVar.h;
        this.h = null;
    }

    public final String toString() {
        crt crtVarA = clq.Q(this).a("defaultPort", this.a);
        crtVarA.e("proxyDetector", this.b);
        crtVarA.e("syncContext", this.c);
        crtVarA.e("serviceConfigParser", this.d);
        crtVarA.e("customArgs", this.h);
        crtVarA.e("scheduledExecutorService", this.e);
        crtVarA.e("channelLogger", this.g);
        crtVarA.e("executor", this.f);
        crtVarA.e("overrideAuthority", null);
        crtVarA.e("metricRecorder", this.i);
        return crtVarA.toString();
    }
}
