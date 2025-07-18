package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class py extends qa {
    public final ps a;
    pt b;

    public py(pg pgVar) {
        super(pgVar);
        ps psVar = new ps(this);
        this.a = psVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        psVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.qa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py.b():void");
    }

    @Override // defpackage.qa
    public final void c() {
        ps psVar = this.h;
        if (psVar.i) {
            this.d.ab = psVar.f;
        }
    }

    @Override // defpackage.qa
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.qa, defpackage.pq
    public final void e(pq pqVar) {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            pg pgVar = this.d;
            m(pgVar.L, pgVar.N, 1);
            return;
        }
        pt ptVar = this.e;
        if (ptVar.c && !ptVar.i && this.j == 3) {
            pg pgVar2 = this.d;
            int i3 = pgVar2.u;
            if (i3 == 2) {
                pg pgVar3 = pgVar2.V;
                if (pgVar3 != null) {
                    if (pgVar3.j.e.i) {
                        this.e.c((int) ((r2.f * pgVar2.B) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                pt ptVar2 = pgVar2.i.e;
                if (ptVar2.i) {
                    int i4 = pgVar2.Z;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = ptVar2.f;
                        float f3 = pgVar2.Y;
                        f = f2 / f3;
                        this.e.c((int) (f + 0.5f));
                    } else {
                        f = ptVar2.f * pgVar2.Y;
                        this.e.c((int) (f + 0.5f));
                    }
                }
            }
        }
        ps psVar = this.h;
        if (psVar.c) {
            ps psVar2 = this.i;
            if (psVar2.c) {
                if (psVar.i && psVar2.i && this.e.i) {
                    return;
                }
                if (!this.e.i && this.j == 3) {
                    pg pgVar4 = this.d;
                    if (pgVar4.t == 0 && !pgVar4.J()) {
                        ps psVar3 = (ps) this.h.k.get(0);
                        ps psVar4 = (ps) this.i.k.get(0);
                        int i5 = psVar3.f;
                        ps psVar5 = this.h;
                        int i6 = i5 + psVar5.e;
                        int i7 = psVar4.f + this.i.e;
                        psVar5.c(i6);
                        this.i.c(i7);
                        this.e.c(i7 - i6);
                        return;
                    }
                }
                if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                    ps psVar6 = (ps) this.h.k.get(0);
                    ps psVar7 = (ps) this.i.k.get(0);
                    int i8 = psVar6.f + this.h.e;
                    int i9 = psVar7.f + this.i.e;
                    pt ptVar3 = this.e;
                    int i10 = i9 - i8;
                    int i11 = ptVar3.m;
                    if (i10 < i11) {
                        ptVar3.c(i10);
                    } else {
                        ptVar3.c(i11);
                    }
                }
                if (!this.e.i || this.h.k.size() <= 0 || this.i.k.size() <= 0) {
                    return;
                }
                ps psVar8 = (ps) this.h.k.get(0);
                ps psVar9 = (ps) this.i.k.get(0);
                int i12 = psVar8.f;
                ps psVar10 = this.h;
                int i13 = psVar10.e + i12;
                int i14 = psVar9.f;
                int i15 = this.i.e + i14;
                float f4 = this.d.ag;
                if (psVar8 == psVar9) {
                    f4 = 0.5f;
                }
                if (psVar8 != psVar9) {
                    i14 = i15;
                }
                if (psVar8 != psVar9) {
                    i12 = i13;
                }
                psVar10.c((int) (i12 + 0.5f + (((i14 - i12) - this.e.f) * f4)));
                this.i.c(this.h.f + this.e.f);
            }
        }
    }

    @Override // defpackage.qa
    public final boolean f() {
        return this.j != 3 || this.d.u == 0;
    }

    public final void g() {
        this.g = false;
        this.h.b();
        this.h.i = false;
        this.i.b();
        this.i.i = false;
        this.a.b();
        this.a.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.aj));
    }
}
