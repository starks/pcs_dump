package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ta implements ThreadFactory {
    private final String a = "fonts-androidx";
    private final int b = 10;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new sz(runnable, this.a, 10);
    }
}
