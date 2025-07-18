package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvq extends fwh {
    public fwh a;

    public fvq(fwh fwhVar) {
        fwhVar.getClass();
        this.a = fwhVar;
    }

    @Override // defpackage.fwh
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.fwh
    public final long h() {
        return this.a.h();
    }

    @Override // defpackage.fwh
    public final fwh i() {
        return this.a.i();
    }

    @Override // defpackage.fwh
    public final fwh j(long j) {
        return this.a.j(j);
    }

    @Override // defpackage.fwh
    public final fwh k(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.k(j, timeUnit);
    }

    @Override // defpackage.fwh
    public final void l() throws InterruptedIOException {
        this.a.l();
    }

    @Override // defpackage.fwh
    public final fwh m() {
        return this.a.m();
    }
}
