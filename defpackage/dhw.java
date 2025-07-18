package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhw {
    static final dhw a = new dhw();
    final Runnable b;
    final Executor c;
    dhw next;

    public dhw() {
        this.b = null;
        this.c = null;
    }

    public dhw(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
