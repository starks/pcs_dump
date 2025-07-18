package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cul extends cun {
    volatile long a;
    cuv b;
    cuv c;

    public cul(ReferenceQueue referenceQueue, Object obj, int i, cuv cuvVar) {
        super(referenceQueue, obj, i, cuvVar);
        this.a = Long.MAX_VALUE;
        int i2 = cuu.y;
        this.b = ctz.a;
        this.c = ctz.a;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final long b() {
        return this.a;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv f() {
        return this.b;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv h() {
        return this.c;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void l(cuv cuvVar) {
        this.b = cuvVar;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void n(cuv cuvVar) {
        this.c = cuvVar;
    }
}
