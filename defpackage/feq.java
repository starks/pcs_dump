package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feq extends feh {
    final eqc a;
    volatile boolean b;
    public boolean c;
    public Runnable d;
    public Runnable e;
    private final boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public feq() {
    }

    @Override // defpackage.feu
    public final void a() {
        this.a.a(eqo.b, new epc());
        this.i = true;
    }

    @Override // defpackage.feu
    public final void b(Throwable th) {
        epc epcVar;
        List list = eqo.a;
        th.getClass();
        Throwable cause = th;
        while (true) {
            epcVar = null;
            if (cause == null) {
                break;
            }
            if (cause instanceof eqp) {
                break;
            } else {
                if (cause instanceof eqr) {
                    epcVar = ((eqr) cause).b;
                    break;
                }
                cause = cause.getCause();
            }
        }
        if (epcVar == null) {
            epcVar = new epc();
        }
        this.a.a(eqo.c(th), epcVar);
        this.h = true;
    }

    @Override // defpackage.feu
    public final void c(Object obj) {
        if (this.b && this.f) {
            throw new eqr(eqo.c.e("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception"));
        }
        clq.G(!this.h, "Stream was terminated by error, no further calls are allowed");
        clq.G(!this.i, "Stream is already completed, no further calls are allowed");
        if (!this.g) {
            this.a.g(new epc());
            this.g = true;
        }
        this.a.e(obj);
    }

    public final boolean d() {
        return this.a.h();
    }

    public final boolean e() {
        return this.a.i();
    }

    public feq(eqc eqcVar, boolean z) {
        this();
        this.h = false;
        this.i = false;
        this.a = eqcVar;
        this.f = z;
    }
}
