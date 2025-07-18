package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cum extends cun {
    volatile long a;
    cuv b;
    cuv c;
    volatile long d;
    cuv e;
    cuv f;

    public cum(ReferenceQueue referenceQueue, Object obj, int i, cuv cuvVar) {
        super(referenceQueue, obj, i, cuvVar);
        this.a = Long.MAX_VALUE;
        int i2 = cuu.y;
        this.b = ctz.a;
        this.c = ctz.a;
        this.d = Long.MAX_VALUE;
        this.e = ctz.a;
        this.f = ctz.a;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final long b() {
        return this.a;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final long c() {
        return this.d;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv f() {
        return this.b;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv g() {
        return this.e;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv h() {
        return this.c;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final cuv i() {
        return this.f;
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
    public final void m(cuv cuvVar) {
        this.e = cuvVar;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void n(cuv cuvVar) {
        this.c = cuvVar;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void o(cuv cuvVar) {
        this.f = cuvVar;
    }

    @Override // defpackage.cun, defpackage.cuv
    public final void q(long j) {
        this.d = j;
    }
}
