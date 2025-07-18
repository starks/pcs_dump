package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqr implements cca {
    private final Context a;
    private final bqm b;
    private final cbx c;
    private Future d;
    private boolean e;

    public bqr(Context context, bqm bqmVar, cbx cbxVar) {
        this.a = context;
        this.b = bqmVar;
        this.c = cbxVar;
    }

    private final boolean d() {
        synchronized (this) {
            if (!this.d.isDone()) {
                return false;
            }
            try {
                cnx.H(this.d);
                return false;
            } catch (CancellationException | ExecutionException unused) {
                return true;
            }
        }
    }

    private final void e(int i, Exception exc) {
        this.c.f(exc, "Error loading native library");
        if (this.e) {
            return;
        }
        this.b.k(i);
        this.e = true;
    }

    @Override // defpackage.cca
    public final void a(ExecutorService executorService) {
        Callable callable = new Callable() { // from class: bqq
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() throws cbz {
                this.a.b();
                return null;
            }
        };
        synchronized (this) {
            if (this.d == null || d()) {
                this.d = ((dig) executorService).submit(callable);
            }
        }
    }

    public final /* synthetic */ void b() throws cbz {
        try {
            Context context = this.a;
            bux.b(context).a(context);
        } catch (buv | UnsatisfiedLinkError e) {
            throw new cbz(e);
        }
    }

    @Override // defpackage.cca
    public final void c(int i) {
        synchronized (this) {
            clq.G(this.d != null, "finishLoadNativeLibrary called but library loading future is null");
            try {
                this.d.get();
            } catch (InterruptedException e) {
                this.c.j(e, "Interrupted while waiting for library loading");
                Thread.currentThread().interrupt();
                throw e;
            } catch (CancellationException e2) {
                e(i, e2);
                throw e2;
            } catch (ExecutionException e3) {
                e(i, e3);
                if (e3.getCause() instanceof cbz) {
                    throw new cbz(e3.getCause());
                }
                if (!(e3.getCause() instanceof Error)) {
                    throw new dkq(e3.getCause());
                }
                throw new dja((Error) e3.getCause());
            }
        }
    }
}
