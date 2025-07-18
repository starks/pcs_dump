package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pj extends pg {
    private boolean at;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public pf d = this.L;
    public int as = 0;

    public pj() {
        this.T.clear();
        this.T.add(this.d);
        int length = this.S.length;
        for (int i = 0; i < 6; i++) {
            this.S[i] = this.d;
        }
    }

    @Override // defpackage.pg
    public final void E(oy oyVar, boolean z) {
        if (this.V == null) {
            return;
        }
        int iP = oy.p(this.d);
        if (this.as == 1) {
            this.aa = iP;
            this.ab = 0;
            x(this.V.h());
            C(0);
            return;
        }
        this.aa = 0;
        this.ab = iP;
        C(this.V.j());
        x(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.pf L(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto L14
            r0 = 4
            if (r3 == r0) goto Lf
            goto L1b
        Lf:
            int r3 = r2.as
            if (r3 != 0) goto L1b
            goto L18
        L14:
            int r3 = r2.as
            if (r3 != r0) goto L1b
        L18:
            pf r2 = r2.d
            return r2
        L1b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj.L(int):pf");
    }

    public final void a(int i) {
        this.d.e(i);
        this.at = true;
    }

    @Override // defpackage.pg
    public final void b(oy oyVar, boolean z) {
        pg pgVar = this.V;
        if (pgVar == null) {
            return;
        }
        Object objL = pgVar.L(2);
        Object objL2 = pgVar.L(4);
        pg pgVar2 = this.V;
        boolean z2 = pgVar2 != null && pgVar2.ar[0] == 2;
        if (this.as == 0) {
            objL = pgVar.L(3);
            objL2 = pgVar.L(5);
            pg pgVar3 = this.V;
            z2 = pgVar3 != null && pgVar3.ar[1] == 2;
        }
        if (this.at) {
            pf pfVar = this.d;
            if (pfVar.c) {
                pb pbVarC = oyVar.c(pfVar);
                oyVar.g(pbVarC, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        oyVar.h(oyVar.c(objL2), pbVarC, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    pb pbVarC2 = oyVar.c(objL2);
                    oyVar.h(pbVarC, oyVar.c(objL), 0, 5);
                    oyVar.h(pbVarC2, pbVarC, 0, 5);
                }
                this.at = false;
                return;
            }
        }
        if (this.b != -1) {
            pb pbVarC3 = oyVar.c(this.d);
            oyVar.n(pbVarC3, oyVar.c(objL), this.b, 8);
            if (z2) {
                oyVar.h(oyVar.c(objL2), pbVarC3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            pb pbVarC4 = oyVar.c(this.d);
            pb pbVarC5 = oyVar.c(objL2);
            oyVar.n(pbVarC4, pbVarC5, -this.c, 8);
            if (z2) {
                oyVar.h(pbVarC4, oyVar.c(objL), 0, 5);
                oyVar.h(pbVarC5, pbVarC4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            pb pbVarC6 = oyVar.c(this.d);
            pb pbVarC7 = oyVar.c(objL2);
            float f = this.a;
            ox oxVarA = oyVar.a();
            oxVarA.f.k(pbVarC6, -1.0f);
            oxVarA.f.k(pbVarC7, f);
            oyVar.f(oxVarA);
        }
    }

    public final void c(int i) {
        if (this.as == i) {
            return;
        }
        this.as = i;
        this.T.clear();
        if (this.as == 1) {
            this.d = this.K;
        } else {
            this.d = this.L;
        }
        this.T.add(this.d);
        int length = this.S.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.S[i2] = this.d;
        }
    }

    @Override // defpackage.pg
    public final boolean d() {
        return true;
    }

    @Override // defpackage.pg
    public final boolean e() {
        return this.at;
    }

    @Override // defpackage.pg
    public final boolean f() {
        return this.at;
    }
}
