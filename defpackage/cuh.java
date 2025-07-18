package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cuh extends cuf {
    volatile long a;
    cuv b;
    cuv c;

    public cuh(Object obj, int i, cuv cuvVar) {
        super(obj, i, cuvVar);
        this.a = Long.MAX_VALUE;
        int i2 = cuu.y;
        this.b = ctz.a;
        this.c = ctz.a;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final long c() {
        return this.a;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final cuv g() {
        return this.b;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final cuv i() {
        return this.c;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void m(cuv cuvVar) {
        this.b = cuvVar;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void o(cuv cuvVar) {
        this.c = cuvVar;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void q(long j) {
        this.a = j;
    }
}
