package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tc implements Runnable {
    private final Callable a;
    private final tj b;
    private final Handler c;

    public tc(Handler handler, Callable callable, tj tjVar) {
        this.a = callable;
        this.b = tjVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sx sxVarCall;
        try {
            sxVarCall = ((su) this.a).call();
        } catch (Exception unused) {
            sxVarCall = null;
        }
        this.c.post(new o(this.b, sxVarCall, 14, (char[]) null));
    }
}
