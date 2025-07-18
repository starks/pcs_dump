package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asf extends ena {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ asg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asf(asg asgVar, eqc eqcVar, AtomicReference atomicReference) {
        super(eqcVar);
        this.a = atomicReference;
        this.b = asgVar;
    }

    @Override // defpackage.eps, defpackage.eqc
    public final void a(eqo eqoVar, epc epcVar) {
        Object obj = this.a.get();
        System.err.println("val in interceptor: ".concat(String.valueOf(String.valueOf(obj))));
        if (obj != null) {
            epcVar.f(this.b.a, obj);
        }
        b().a(eqoVar, epcVar);
    }
}
