package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djk implements Runnable {
    final Future a;
    final djj b;

    public djk(Future future, djj djjVar) {
        this.a = future;
        this.b = djjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thL;
        Object obj = this.a;
        if ((obj instanceof dkr) && (thL = ((dkr) obj).l()) != null) {
            this.b.a(thL);
            return;
        }
        try {
            this.b.b(cnx.H(this.a));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.d(this.b);
        return crtVarQ.toString();
    }
}
