package defpackage;

import android.content.Context;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsu implements Thread.UncaughtExceptionHandler {
    private final Context a;
    private final Thread.UncaughtExceptionHandler b;

    public bsu(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = context;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        bnb.a(this.a, th);
        this.b.uncaughtException(thread, th);
    }
}
