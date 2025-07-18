package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwf {
    public static final ExecutorService a;
    public static final ExecutorService b;

    static {
        bfe bfeVar = bxz.a;
        eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
        eqhVar.h("brella-inappjobsvcimpl-%d");
        a = bfeVar.g(eqh.m(eqhVar), 1);
        bfe bfeVar2 = bxz.a;
        eqh eqhVar2 = new eqh((byte[]) null, (byte[]) null);
        eqhVar2.h("brella-inappjobsvc-%d");
        b = bfeVar2.g(eqh.m(eqhVar2), 1);
    }
}
