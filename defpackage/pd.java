package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pd extends pk {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[PHI: r7
  0x00f1: PHI (r7v9 boolean) = (r7v3 boolean), (r7v10 boolean) binds: [B:74:0x00ec, B:76:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa  */
    @Override // defpackage.pg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.oy r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd.b(oy, boolean):void");
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.at;
            if (i4 >= i) {
                break;
            }
            pg pgVar = this.as[i4];
            if ((this.b || pgVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !pgVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !pgVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.at; i5++) {
            pg pgVar2 = this.as[i5];
            if (this.b || pgVar2.d()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = pgVar2.L(2).a();
                    } else if (i6 == 1) {
                        iMax = pgVar2.L(4).a();
                    } else if (i6 == 2) {
                        iMax = pgVar2.L(3).a();
                    } else if (i6 == 3) {
                        iMax = pgVar2.L(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, pgVar2.L(2).a());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, pgVar2.L(4).a());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, pgVar2.L(3).a());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, pgVar2.L(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            v(i8, i8);
        } else {
            w(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.pg
    public final boolean d() {
        return true;
    }

    @Override // defpackage.pg
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.pg
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.pg
    public final String toString() {
        String strConcat = "[Barrier] " + this.aj + " {";
        for (int i = 0; i < this.at; i++) {
            pg pgVar = this.as[i];
            if (i > 0) {
                strConcat = String.valueOf(strConcat).concat(", ");
            }
            strConcat = String.valueOf(strConcat).concat(String.valueOf(pgVar.aj));
        }
        return String.valueOf(strConcat).concat("}");
    }
}
