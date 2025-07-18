package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dix extends dim {
    private diw b;

    public dix(cwu cwuVar, boolean z, Executor executor, dir dirVar) {
        super(cwuVar, z, false);
        this.b = new diu(this, dirVar, executor);
        q();
    }

    @Override // defpackage.dim
    public final void j() {
        diw diwVar = this.b;
        if (diwVar != null) {
            diwVar.f();
        }
    }

    @Override // defpackage.dif
    protected final void n() {
        diw diwVar = this.b;
        if (diwVar != null) {
            diwVar.h();
        }
    }

    @Override // defpackage.dim
    public final void s(int i) {
        super.s(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public dix(cwu cwuVar, boolean z, Executor executor, Callable callable) {
        super(cwuVar, z, false);
        this.b = new div(this, callable, executor);
        q();
    }

    @Override // defpackage.dim
    public final void h(int i, Object obj) {
    }
}
