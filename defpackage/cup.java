package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cup extends cun {
    volatile long a;
    cuv b;
    cuv c;

    public cup(ReferenceQueue referenceQueue, Object obj, int i, cuv cuvVar) {
        super(referenceQueue, obj, i, cuvVar);
        this.a = Long.MAX_VALUE;
        int i2 = cuu.y;
        this.b = ctz.a;
        this.c = ctz.a;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final long c() {
        return this.a;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv g() {
        return this.b;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv i() {
        return this.c;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void m(cuv cuvVar) {
        this.b = cuvVar;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void o(cuv cuvVar) {
        this.c = cuvVar;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void q(long j) {
        this.a = j;
    }
}
