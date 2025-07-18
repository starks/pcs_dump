package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkp extends djf implements RunnableFuture {
    private volatile djw a;

    public dkp(dir dirVar) {
        this.a = new dkn(this, dirVar);
    }

    public static dkp g(Runnable runnable, Object obj) {
        return new dkp(Executors.callable(runnable, obj));
    }

    @Override // defpackage.dif
    protected final String a() {
        djw djwVar = this.a;
        return djwVar != null ? a.G(djwVar, "task=[", "]") : super.a();
    }

    @Override // defpackage.dif
    protected final void b() {
        djw djwVar;
        if (p() && (djwVar = this.a) != null) {
            djwVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        djw djwVar = this.a;
        if (djwVar != null) {
            djwVar.run();
        }
        this.a = null;
    }

    public dkp(Callable callable) {
        this.a = new dko(this, callable);
    }
}
