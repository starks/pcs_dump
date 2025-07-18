package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class my implements Executor {
    private final /* synthetic */ int a;

    public my(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            new Thread(runnable).start();
        } else {
            ((nb) mz.a().b).a.execute(runnable);
        }
    }
}
