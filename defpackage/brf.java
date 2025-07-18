package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brf {
    public static final Executor a;

    static {
        eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
        eqhVar.h("brella-pds-%d");
        a = Executors.newSingleThreadExecutor(eqh.m(eqhVar));
    }
}
