package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anl {
    public static final Executor a = Executors.newCachedThreadPool();
    public static final Executor b = Executors.newSingleThreadExecutor();
    public static final Executor c = Executors.newCachedThreadPool();
    public static final Executor d = Executors.newSingleThreadExecutor();
    public static final Executor e = Executors.newSingleThreadExecutor();
    public static final dke f;
    public static final dke g;
    public static final dke h;

    static {
        eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
        eqhVar.h("pcs-fl-%d");
        f = cnx.y(Executors.newScheduledThreadPool(1, eqh.m(eqhVar)));
        cnx.y(Executors.newScheduledThreadPool(1));
        cnx.y(Executors.newScheduledThreadPool(1));
        cnx.y(Executors.newScheduledThreadPool(1));
        eqh eqhVar2 = new eqh((byte[]) null, (byte[]) null);
        eqhVar2.h("pcs-pd-%d");
        g = cnx.y(Executors.newScheduledThreadPool(1, eqh.m(eqhVar2)));
        eqh eqhVar3 = new eqh((byte[]) null, (byte[]) null);
        eqhVar3.h("pcs-aic-%d");
        h = cnx.y(Executors.newScheduledThreadPool(1, eqh.m(eqhVar3)));
        eqh eqhVar4 = new eqh((byte[]) null, (byte[]) null);
        eqhVar4.h("pcs-pcb-%d");
        cnx.y(Executors.newScheduledThreadPool(1, eqh.m(eqhVar4)));
    }
}
