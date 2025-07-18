package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class cuf extends cte {
    final Object g;
    final int h;
    final cuv i;
    volatile cuj j = cuu.b;

    public cuf(Object obj, int i, cuv cuvVar) {
        this.g = obj;
        this.h = i;
        this.i = cuvVar;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final int a() {
        return this.h;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final cuj d() {
        return this.j;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final cuv e() {
        return this.i;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.cte, defpackage.cuv
    public final void p(cuj cujVar) {
        this.j = cujVar;
    }
}
