package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkk implements Runnable {
    dkm a;

    public dkk(dkm dkmVar) {
        this.a = dkmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        djy djyVar;
        dkm dkmVar = this.a;
        if (dkmVar == null || (djyVar = dkmVar.a) == null) {
            return;
        }
        this.a = null;
        if (djyVar.isDone()) {
            dkmVar.f(djyVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = dkmVar.b;
            dkmVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    dkmVar.e(new dkl(str));
                    throw th;
                }
            }
            dkmVar.e(new dkl(str + ": " + djyVar.toString()));
        } finally {
            djyVar.cancel(true);
        }
    }
}
