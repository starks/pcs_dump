package defpackage;

import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxp implements Closeable {
    public final /* synthetic */ bxq b;
    private final bru d;
    private final ServiceConnection e;
    private boolean c = false;
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final brw f = new brw(this);

    public bxp(bxq bxqVar, bru bruVar, ServiceConnection serviceConnection) {
        this.b = bxqVar;
        this.d = bruVar;
        this.e = serviceConnection;
    }

    private final void b() {
        dki dkiVar = new dki();
        this.b.i.a.set(dkiVar);
        this.d.a(new bxo(dkiVar));
        try {
            dkiVar.get(this.b.h, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (CancellationException e) {
            this.b.c.j(e, "Closing iterator failed due to dead process");
            this.b.d(ccj.bK);
        } catch (ExecutionException e2) {
            throw new dkq(e2);
        } catch (TimeoutException e3) {
            bxq bxqVar = this.b;
            bxqVar.c.k(e3, "Closing iterator timed out (%ss)", Long.valueOf(bxqVar.h));
            this.b.d(ccj.bL);
        }
    }

    public final exo a() throws ErrorStatusException {
        dki dkiVar = new dki();
        this.b.i.a.set(dkiVar);
        brw brwVar = this.f;
        brwVar.d = dkiVar;
        brwVar.a.clear();
        brwVar.b.set(0);
        AtomicLong atomicLong = brwVar.c;
        cix cixVar = brwVar.e.b.j;
        atomicLong.set(cixVar != null ? ((csm) cixVar.d).a() : 0L);
        try {
            bru bruVar = this.d;
            brw brwVar2 = this.f;
            int iP = cnx.P(this.b.b.B(), 0, 204800);
            if (iP <= 0) {
                iP = 51200;
            }
            bruVar.b(brwVar2, iP);
            try {
                crv crvVar = (crv) dkiVar.get(this.b.h, TimeUnit.SECONDS);
                if (crvVar.b == null) {
                    exo exoVar = (exo) crvVar.a;
                    if (exoVar == null) {
                        close();
                    }
                    return exoVar;
                }
                this.b.d(ccj.bF);
                close();
                throw ErrorStatusException.b(14, bxq.c("onIteratorNextFailure", this.b.f, (Status) crvVar.b), new Object[0]);
            } catch (CancellationException unused) {
                this.b.d(ccj.bE);
                close();
                throw ErrorStatusException.b(14, "next() failed due to dead process", new Object[0]);
            } catch (ExecutionException e) {
                throw new dkq(e);
            } catch (TimeoutException unused2) {
                this.b.d(ccj.bG);
                close();
                throw ErrorStatusException.b(14, "next() timed out (%ss)", Long.valueOf(this.b.h));
            }
        } catch (RemoteException e2) {
            this.b.d(e2 instanceof DeadObjectException ? ccj.bE : ccj.bC);
            close();
            throw ErrorStatusException.c(14, e2, "Failed to call next()", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.d != null) {
            if (this.a.get()) {
                bxq bxqVar = this.b;
                bxqVar.d.l(ccj.bq, bxqVar.e);
            } else {
                bxq bxqVar2 = this.b;
                bxqVar2.d.l(ccj.bp, bxqVar2.e);
            }
        }
        try {
            bqj bqjVarB = this.b.d.b(bql.EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY, this.b.g);
            try {
                b();
                bqjVarB.close();
            } finally {
            }
        } catch (RemoteException e) {
            this.b.d(e instanceof DeadObjectException ? ccj.bK : ccj.bI);
            this.b.c.j(e, "Exception during call to IExampleStoreIterator.close");
        }
        this.b.a.unbindService(this.e);
    }
}
