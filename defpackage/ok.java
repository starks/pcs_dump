package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ok {
    static final ok a = new ok(null, null);
    final Runnable b;
    final Executor c;
    ok next;

    public ok(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
