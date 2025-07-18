package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgl implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;
    final /* synthetic */ dke d;

    public cgl(Runnable runnable, dke dkeVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.d = dkeVar;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        clq.r(this.d.schedule(this, this.b, this.c));
    }
}
