package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djl implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public djl(djy djyVar, Future future, int i) {
        this.c = i;
        this.a = djyVar;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            cnx.K(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public djl(dir dirVar, Executor executor, int i) {
        this.c = i;
        this.a = dirVar;
        executor.getClass();
        this.b = executor;
    }
}
