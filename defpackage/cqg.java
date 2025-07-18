package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqg implements Runnable, cqp {
    private cqn a;
    private cqn b;
    private final boolean c = chj.d(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public cqg(cqn cqnVar, boolean z) {
        this.f = false;
        this.a = cqnVar;
        this.b = cqnVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        if (this.c && !this.e) {
            chj.c();
        }
        this.a = null;
    }

    public final void a(djy djyVar) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        djyVar.c(this, diy.a);
    }

    @Override // defpackage.cqp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cqn cqnVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (cqnVar != null) {
                cqnVar.close();
            }
            if (this.f) {
                cqa.g(cqf.a);
            }
        } catch (Throwable th) {
            if (cqnVar != null) {
                try {
                    cqnVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            chj.b(new bkp(5));
        } else {
            b();
        }
    }
}
