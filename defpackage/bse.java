package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bse {
    public static final Executor a;

    static {
        eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
        eqhVar.h("brella-sql-%d");
        a = Executors.newSingleThreadExecutor(eqh.m(eqhVar));
    }
}
