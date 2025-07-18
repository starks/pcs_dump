package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pv extends qa {
    public pv(pg pgVar) {
        super(pgVar);
        pgVar.i.d();
        pgVar.j.d();
        this.f = ((pj) pgVar).as;
    }

    private final void g(ps psVar) {
        this.h.j.add(psVar);
        psVar.k.add(this.h);
    }

    @Override // defpackage.qa
    public final void b() {
        pg pgVar = this.d;
        pj pjVar = (pj) pgVar;
        int i = pjVar.b;
        int i2 = pjVar.c;
        float f = pjVar.a;
        if (pjVar.as == 1) {
            if (i != -1) {
                this.h.k.add(pgVar.V.i.h);
                this.d.V.i.h.j.add(this.h);
                this.h.e = i;
            } else if (i2 != -1) {
                this.h.k.add(pgVar.V.i.i);
                this.d.V.i.i.j.add(this.h);
                this.h.e = -i2;
            } else {
                ps psVar = this.h;
                psVar.b = true;
                psVar.k.add(pgVar.V.i.i);
                this.d.V.i.i.j.add(this.h);
            }
            g(this.d.i.h);
            g(this.d.i.i);
            return;
        }
        if (i != -1) {
            this.h.k.add(pgVar.V.j.h);
            this.d.V.j.h.j.add(this.h);
            this.h.e = i;
        } else if (i2 != -1) {
            this.h.k.add(pgVar.V.j.i);
            this.d.V.j.i.j.add(this.h);
            this.h.e = -i2;
        } else {
            ps psVar2 = this.h;
            psVar2.b = true;
            psVar2.k.add(pgVar.V.j.i);
            this.d.V.j.i.j.add(this.h);
        }
        g(this.d.j.h);
        g(this.d.j.i);
    }

    @Override // defpackage.qa
    public final void c() {
        pg pgVar = this.d;
        if (((pj) pgVar).as == 1) {
            pgVar.aa = this.h.f;
        } else {
            pgVar.ab = this.h.f;
        }
    }

    @Override // defpackage.qa
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.qa, defpackage.pq
    public final void e(pq pqVar) {
        ps psVar = this.h;
        if (psVar.c && !psVar.i) {
            this.h.c((int) ((((ps) psVar.k.get(0)).f * ((pj) this.d).a) + 0.5f));
        }
    }

    @Override // defpackage.qa
    public final boolean f() {
        return false;
    }
}
