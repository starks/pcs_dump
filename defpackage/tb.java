package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tb implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public tb(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.b != 0) {
            this.a.post(runnable);
            return;
        }
        un.y(runnable);
        if (this.a.post(runnable)) {
            return;
        }
        Handler handler = this.a;
        Objects.toString(handler);
        throw new RejectedExecutionException(String.valueOf(handler).concat(" is shutting down"));
    }

    public tb(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }
}
