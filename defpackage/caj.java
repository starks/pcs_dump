package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caj implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public caj(Looper looper, int i) {
        this.b = i;
        this.a = new bya(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        Handler handler = this.a;
        if (i != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public caj(int i) {
        this.b = i;
        this.a = new bya(Looper.getMainLooper());
    }
}
