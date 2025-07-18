package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbf {
    public static final fbf a = new fbf(new fbc());
    public final IdentityHashMap b = new IdentityHashMap();
    public ScheduledExecutorService c;
    private final fbc d;

    public fbf(fbc fbcVar) {
        this.d = fbcVar;
    }

    final synchronized Object a(fbe fbeVar) {
        fbd fbdVar;
        fbdVar = (fbd) this.b.get(fbeVar);
        if (fbdVar == null) {
            fbdVar = new fbd(fbeVar.a());
            this.b.put(fbeVar, fbdVar);
        }
        ScheduledFuture scheduledFuture = fbdVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            fbdVar.c = null;
        }
        fbdVar.b++;
        return fbdVar.a;
    }

    final synchronized void c(fbe fbeVar, Object obj) throws Throwable {
        Throwable th;
        fbf fbfVar;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fbd fbdVar = (fbd) this.b.get(fbeVar);
            if (fbdVar == null) {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(fbeVar))));
            }
            boolean z = true;
            clq.w(obj == fbdVar.a, "Releasing the wrong instance");
            clq.G(fbdVar.b > 0, "Refcount has already reached zero");
            int i = fbdVar.b - 1;
            fbdVar.b = i;
            if (i == 0) {
                if (fbdVar.c != null) {
                    z = false;
                }
                clq.G(z, "Destroy task already scheduled");
                if (this.c == null) {
                    try {
                        this.c = Executors.newSingleThreadScheduledExecutor(evt.j("grpc-shared-destroyer-%d"));
                    } catch (Throwable th3) {
                        th = th3;
                        fbfVar = this;
                        throw th;
                    }
                }
                fbdVar.c = this.c.schedule(new ewr(new bsk(this, fbdVar, fbeVar, obj, 6)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th4) {
            th = th4;
            fbfVar = this;
            th = th;
            throw th;
        }
    }
}
