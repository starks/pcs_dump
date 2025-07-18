package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nb extends nc {
    private volatile Handler c;
    private final Object b = new Object();
    public final ExecutorService a = Executors.newFixedThreadPool(4, new na());

    @Override // defpackage.nc
    public final void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    @Override // defpackage.nc
    public final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
