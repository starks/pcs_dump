package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cal extends cag {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final ezn e = new ezn();

    private final void q() {
        if (this.b) {
            if (!d()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
        }
    }

    @Override // defpackage.cag
    public final cag a(Executor executor, bzx bzxVar) {
        cal calVar = new cal();
        this.e.c(new cae(cam.a(executor), bzxVar, calVar, 1));
        l();
        return calVar;
    }

    @Override // defpackage.cag
    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.cag
    public final Object c() {
        Object obj;
        synchronized (this.a) {
            aso.D(this.b, "Task is not yet complete");
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.d;
            if (exc != null) {
                throw new caf(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.cag
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.cag
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.cag
    public final void f(Executor executor, caa caaVar) {
        this.e.c(new bzz(cam.a(executor), caaVar, 0));
        l();
    }

    @Override // defpackage.cag
    public final void g(cab cabVar) {
        h(cak.a, cabVar);
    }

    @Override // defpackage.cag
    public final void h(Executor executor, cab cabVar) {
        this.e.c(new bzz(cam.a(executor), cabVar, 2));
        l();
    }

    @Override // defpackage.cag
    public final void i(cac cacVar) {
        j(cak.a, cacVar);
    }

    @Override // defpackage.cag
    public final void j(Executor executor, cac cacVar) {
        this.e.c(new bzz(cam.a(executor), cacVar, 3));
        l();
    }

    @Override // defpackage.cag
    public final void k(Executor executor, cad cadVar) {
        this.e.c(new bzz(cam.a(executor), cadVar, 4));
        l();
    }

    public final void l() {
        synchronized (this.a) {
            if (this.b) {
                this.e.d(this);
            }
        }
    }

    public final void m(Exception exc) {
        aso.G(exc, "Exception must not be null");
        synchronized (this.a) {
            q();
            this.b = true;
            this.d = exc;
        }
        this.e.d(this);
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            q();
            this.b = true;
            this.f = obj;
        }
        this.e.d(this);
    }

    public final boolean o(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.d(this);
            return true;
        }
    }

    public final void p() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.d(this);
        }
    }
}
