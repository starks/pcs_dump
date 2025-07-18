package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fll extends flk {
    public final fmo b;
    private final Thread d;

    public fll(fhq fhqVar, Thread thread, fmo fmoVar) {
        super(fhqVar, true);
        this.d = thread;
        this.b = fmoVar;
    }

    @Override // defpackage.fnh
    protected final boolean bh() {
        return true;
    }

    @Override // defpackage.fnh
    protected final void f(Object obj) {
        if (fjs.c(Thread.currentThread(), this.d)) {
            return;
        }
        LockSupport.unpark(this.d);
    }
}
