package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fog {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = fjs.g(fjs.e(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator()));
    }

    public static final void a(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
