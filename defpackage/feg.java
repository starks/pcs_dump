package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class feg {
    public final elu a;
    public final elt b;

    protected feg(elu eluVar, elt eltVar) {
        this.a = eluVar;
        this.b = eltVar;
    }

    protected abstract feg a(elu eluVar, elt eltVar);

    public final feg c(Executor executor) {
        return a(this.a, this.b.b(executor));
    }

    public final feg d(elx... elxVarArr) {
        return a(ebz.x(this.a, Arrays.asList(elxVarArr)), this.b);
    }
}
