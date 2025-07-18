package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class px extends qa {
    private static final int[] a = new int[2];

    public px(pg pgVar) {
        super(pgVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.qa
    public final void b() {
        pg pgVar;
        pg pgVar2;
        pg pgVar3;
        pg pgVar4 = this.d;
        if (pgVar4.f) {
            this.e.c(pgVar4.j());
        }
        if (!this.e.i) {
            int iN = this.d.N();
            this.j = iN;
            if (iN != 3) {
                if (this.j == 4 && (pgVar3 = this.d.V) != null && (pgVar3.N() == 1 || pgVar3.N() == 4)) {
                    int iJ = (pgVar3.j() - this.d.K.b()) - this.d.M.b();
                    j(this.h, pgVar3.i.h, this.d.K.b());
                    j(this.i, pgVar3.i.i, -this.d.M.b());
                    this.e.c(iJ);
                    return;
                }
                if (this.j == 1) {
                    this.e.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (pgVar = this.d.V) != null && (pgVar.N() == 1 || pgVar.N() == 4)) {
            j(this.h, pgVar.i.h, this.d.K.b());
            j(this.i, pgVar.i.i, -this.d.M.b());
            return;
        }
        pt ptVar = this.e;
        if (ptVar.i) {
            pg pgVar5 = this.d;
            if (pgVar5.f) {
                pf[] pfVarArr = pgVar5.S;
                pf pfVar = pfVarArr[0];
                pf pfVar2 = pfVar.e;
                if (pfVar2 != null && pfVarArr[1].e != null) {
                    if (pgVar5.I()) {
                        this.h.e = this.d.S[0].b();
                        this.i.e = -this.d.S[1].b();
                        return;
                    }
                    ps psVarK = k(this.d.S[0]);
                    if (psVarK != null) {
                        j(this.h, psVarK, this.d.S[0].b());
                    }
                    ps psVarK2 = k(this.d.S[1]);
                    if (psVarK2 != null) {
                        j(this.i, psVarK2, -this.d.S[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (pfVar2 != null) {
                    ps psVarK3 = k(pfVar);
                    if (psVarK3 != null) {
                        j(this.h, psVarK3, this.d.S[0].b());
                        j(this.i, this.h, this.e.f);
                        return;
                    }
                    return;
                }
                pf pfVar3 = pfVarArr[1];
                if (pfVar3.e != null) {
                    ps psVarK4 = k(pfVar3);
                    if (psVarK4 != null) {
                        j(this.i, psVarK4, -this.d.S[1].b());
                        j(this.h, this.i, -this.e.f);
                        return;
                    }
                    return;
                }
                if ((pgVar5 instanceof pk) || pgVar5.V == null || pgVar5.L(7).e != null) {
                    return;
                }
                pg pgVar6 = this.d;
                j(this.h, pgVar6.V.i.h, pgVar6.k());
                j(this.i, this.h, this.e.f);
                return;
            }
        }
        if (this.j == 3) {
            pg pgVar7 = this.d;
            int i = pgVar7.t;
            if (i == 2) {
                pg pgVar8 = pgVar7.V;
                if (pgVar8 != null) {
                    pt ptVar2 = pgVar8.j.e;
                    ptVar.k.add(ptVar2);
                    ptVar2.j.add(this.e);
                    pt ptVar3 = this.e;
                    ptVar3.b = true;
                    ptVar3.j.add(this.h);
                    this.e.j.add(this.i);
                }
            } else if (i == 3) {
                if (pgVar7.u == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    py pyVar = pgVar7.j;
                    pyVar.h.a = this;
                    pyVar.i.a = this;
                    ptVar.a = this;
                    if (pgVar7.J()) {
                        this.e.k.add(this.d.j.e);
                        this.d.j.e.j.add(this.e);
                        py pyVar2 = this.d.j;
                        pyVar2.e.a = this;
                        this.e.k.add(pyVar2.h);
                        this.e.k.add(this.d.j.i);
                        this.d.j.h.j.add(this.e);
                        this.d.j.i.j.add(this.e);
                    } else if (this.d.I()) {
                        this.d.j.e.k.add(this.e);
                        this.e.j.add(this.d.j.e);
                    } else {
                        this.d.j.e.k.add(this.e);
                    }
                } else {
                    pt ptVar4 = pgVar7.j.e;
                    ptVar.k.add(ptVar4);
                    ptVar4.j.add(this.e);
                    this.d.j.h.j.add(this.e);
                    this.d.j.i.j.add(this.e);
                    pt ptVar5 = this.e;
                    ptVar5.b = true;
                    ptVar5.j.add(this.h);
                    this.e.j.add(this.i);
                    this.h.k.add(this.e);
                    this.i.k.add(this.e);
                }
            }
        }
        pg pgVar9 = this.d;
        pf[] pfVarArr2 = pgVar9.S;
        pf pfVar4 = pfVarArr2[0];
        pf pfVar5 = pfVar4.e;
        if (pfVar5 != null && pfVarArr2[1].e != null) {
            if (pgVar9.I()) {
                this.h.e = this.d.S[0].b();
                this.i.e = -this.d.S[1].b();
                return;
            }
            ps psVarK5 = k(this.d.S[0]);
            ps psVarK6 = k(this.d.S[1]);
            if (psVarK5 != null) {
                psVarK5.a(this);
            }
            if (psVarK6 != null) {
                psVarK6.a(this);
            }
            this.k = 4;
            return;
        }
        if (pfVar5 != null) {
            ps psVarK7 = k(pfVar4);
            if (psVarK7 != null) {
                j(this.h, psVarK7, this.d.S[0].b());
                i(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        pf pfVar6 = pfVarArr2[1];
        if (pfVar6.e != null) {
            ps psVarK8 = k(pfVar6);
            if (psVarK8 != null) {
                j(this.i, psVarK8, -this.d.S[1].b());
                i(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if ((pgVar9 instanceof pk) || (pgVar2 = pgVar9.V) == null) {
            return;
        }
        j(this.h, pgVar2.i.h, pgVar9.k());
        i(this.i, this.h, 1, this.e);
    }

    @Override // defpackage.qa
    public final void c() {
        ps psVar = this.h;
        if (psVar.i) {
            this.d.aa = psVar.f;
        }
    }

    @Override // defpackage.qa
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
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
            m(pgVar.K, pgVar.M, 0);
            return;
        }
        if (!this.e.i && this.j == 3) {
            pg pgVar2 = this.d;
            int i3 = pgVar2.t;
            if (i3 == 2) {
                pg pgVar3 = pgVar2.V;
                if (pgVar3 != null) {
                    if (pgVar3.i.e.i) {
                        this.e.c((int) ((r6.f * pgVar2.y) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = pgVar2.u;
                if (i4 == 0 || i4 == 3) {
                    py pyVar = pgVar2.j;
                    ps psVar = pyVar.h;
                    ps psVar2 = pyVar.i;
                    boolean z = pgVar2.K.e != null;
                    boolean z2 = pgVar2.L.e != null;
                    boolean z3 = pgVar2.M.e != null;
                    boolean z4 = pgVar2.N.e != null;
                    int i5 = pgVar2.Z;
                    if (z && z2 && z3 && z4) {
                        float f2 = pgVar2.Y;
                        if (psVar.i && psVar2.i) {
                            ps psVar3 = this.h;
                            if (psVar3.c && this.i.c) {
                                int i6 = ((ps) psVar3.k.get(0)).f + this.h.e;
                                int i7 = ((ps) this.i.k.get(0)).f - this.i.e;
                                int i8 = psVar.f + psVar.e;
                                int i9 = psVar2.f - psVar2.e;
                                int[] iArr = a;
                                n(iArr, i6, i7, i8, i9, f2, i5);
                                this.e.c(iArr[0]);
                                this.d.j.e.c(iArr[1]);
                                return;
                            }
                            return;
                        }
                        ps psVar4 = this.h;
                        if (psVar4.i) {
                            ps psVar5 = this.i;
                            if (psVar5.i) {
                                if (!psVar.c || !psVar2.c) {
                                    return;
                                }
                                int i10 = psVar4.f + psVar4.e;
                                int i11 = psVar5.f - psVar5.e;
                                int i12 = ((ps) psVar.k.get(0)).f + psVar.e;
                                int i13 = ((ps) psVar2.k.get(0)).f - psVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                this.e.c(iArr2[0]);
                                this.d.j.e.c(iArr2[1]);
                            }
                        }
                        ps psVar6 = this.h;
                        if (!psVar6.c || !this.i.c || !psVar.c || !psVar2.c) {
                            return;
                        }
                        int i14 = ((ps) psVar6.k.get(0)).f + this.h.e;
                        int i15 = ((ps) this.i.k.get(0)).f - this.i.e;
                        int i16 = ((ps) psVar.k.get(0)).f + psVar.e;
                        int i17 = ((ps) psVar2.k.get(0)).f - psVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        this.e.c(iArr3[0]);
                        this.d.j.e.c(iArr3[1]);
                    } else if (z && z3) {
                        ps psVar7 = this.h;
                        if (!psVar7.c || !this.i.c) {
                            return;
                        }
                        float f3 = pgVar2.Y;
                        int i18 = (((ps) this.i.k.get(0)).f - this.i.e) - (((ps) psVar7.k.get(0)).f + this.h.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            this.e.c(iH);
                            this.d.j.e.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            this.e.c(iH3);
                            this.d.j.e.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!psVar.c || !psVar2.c) {
                            return;
                        }
                        float f4 = pgVar2.Y;
                        int i21 = (((ps) psVar2.k.get(0)).f - psVar2.e) - (((ps) psVar.k.get(0)).f + psVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            this.e.c(iH6);
                            this.d.j.e.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            this.e.c(iH8);
                            this.d.j.e.c(iH7);
                        }
                    }
                } else {
                    int i24 = pgVar2.Z;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = pgVar2.j.e.f;
                        float f6 = pgVar2.Y;
                        f = f5 * f6;
                        this.e.c((int) (f + 0.5f));
                    } else {
                        f = pgVar2.j.e.f / pgVar2.Y;
                        this.e.c((int) (f + 0.5f));
                    }
                }
            }
        }
        ps psVar8 = this.h;
        if (psVar8.c) {
            ps psVar9 = this.i;
            if (psVar9.c) {
                if (psVar8.i && psVar9.i && this.e.i) {
                    return;
                }
                if (!this.e.i && this.j == 3) {
                    pg pgVar4 = this.d;
                    if (pgVar4.t == 0 && !pgVar4.I()) {
                        ps psVar10 = (ps) this.h.k.get(0);
                        ps psVar11 = (ps) this.i.k.get(0);
                        int i25 = psVar10.f;
                        ps psVar12 = this.h;
                        int i26 = i25 + psVar12.e;
                        int i27 = psVar11.f + this.i.e;
                        psVar12.c(i26);
                        this.i.c(i27);
                        this.e.c(i27 - i26);
                        return;
                    }
                }
                if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                    ps psVar13 = (ps) this.h.k.get(0);
                    int iMin = Math.min((((ps) this.i.k.get(0)).f + this.i.e) - (psVar13.f + this.h.e), this.e.m);
                    pg pgVar5 = this.d;
                    int i28 = pgVar5.x;
                    int iMax = Math.max(pgVar5.w, iMin);
                    if (i28 > 0) {
                        iMax = Math.min(i28, iMax);
                    }
                    this.e.c(iMax);
                }
                if (this.e.i) {
                    ps psVar14 = (ps) this.h.k.get(0);
                    ps psVar15 = (ps) this.i.k.get(0);
                    int i29 = psVar14.f;
                    ps psVar16 = this.h;
                    int i30 = psVar16.e + i29;
                    int i31 = psVar15.f;
                    int i32 = this.i.e + i31;
                    float f7 = this.d.af;
                    if (psVar14 == psVar15) {
                        f7 = 0.5f;
                    }
                    if (psVar14 != psVar15) {
                        i31 = i32;
                    }
                    if (psVar14 != psVar15) {
                        i29 = i30;
                    }
                    psVar16.c((int) (i29 + 0.5f + (((i31 - i29) - this.e.f) * f7)));
                    this.i.c(this.h.f + this.e.f);
                }
            }
        }
    }

    @Override // defpackage.qa
    public final boolean f() {
        return this.j != 3 || this.d.t == 0;
    }

    public final void g() {
        this.g = false;
        this.h.b();
        this.h.i = false;
        this.i.b();
        this.i.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.aj));
    }
}
