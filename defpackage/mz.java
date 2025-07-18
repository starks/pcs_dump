package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mz extends nc {
    public static final Executor a = new my(0);
    private static volatile mz c;
    public final nc b;
    private final nc d;

    private mz() {
        nb nbVar = new nb();
        this.d = nbVar;
        this.b = nbVar;
    }

    public static mz a() {
        if (c == null) {
            synchronized (mz.class) {
                if (c == null) {
                    c = new mz();
                }
            }
        }
        return c;
    }

    @Override // defpackage.nc
    public final void b(Runnable runnable) {
        this.b.b(runnable);
    }

    @Override // defpackage.nc
    public final boolean c() {
        return this.b.c();
    }
}
