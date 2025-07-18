package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cud extends cuf {
    volatile long a;
    cuv b;
    cuv c;

    public cud(Object obj, int i, cuv cuvVar) {
        super(obj, i, cuvVar);
        this.a = Long.MAX_VALUE;
        int i2 = cuu.y;
        this.b = ctz.a;
        this.c = ctz.a;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final long b() {
        return this.a;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final cuv f() {
        return this.b;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final cuv h() {
        return this.c;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void l(cuv cuvVar) {
        this.b = cuvVar;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void n(cuv cuvVar) {
        this.c = cuvVar;
    }
}
