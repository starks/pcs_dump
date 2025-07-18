package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qa implements pq {
    public int c;
    public pg d;
    protected int j;
    ald l;
    public final pt e = new pt(this);
    public int f = 0;
    public boolean g = false;
    public final ps h = new ps(this);
    public final ps i = new ps(this);
    protected int k = 1;

    public qa(pg pgVar) {
        this.d = pgVar;
    }

    protected static final void j(ps psVar, ps psVar2, int i) {
        psVar.k.add(psVar2);
        psVar.e = i;
        psVar2.j.add(psVar);
    }

    protected static final ps k(pf pfVar) {
        pf pfVar2 = pfVar.e;
        if (pfVar2 == null) {
            return null;
        }
        int i = pfVar2.i;
        pg pgVar = pfVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return pgVar.i.h;
        }
        if (i2 == 2) {
            return pgVar.j.h;
        }
        if (i2 == 3) {
            return pgVar.i.i;
        }
        if (i2 == 4) {
            return pgVar.j.i;
        }
        if (i2 != 5) {
            return null;
        }
        return pgVar.j.a;
    }

    protected static final ps l(pf pfVar, int i) {
        pf pfVar2 = pfVar.e;
        if (pfVar2 == null) {
            return null;
        }
        pg pgVar = pfVar2.d;
        qa qaVar = i == 0 ? pgVar.i : pgVar.j;
        int i2 = pfVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return qaVar.h;
        }
        if (i2 == 3 || i2 == 4) {
            return qaVar.i;
        }
        return null;
    }

    public long a() {
        if (this.e.i) {
            return r2.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // defpackage.pq
    public void e(pq pqVar) {
        throw null;
    }

    public abstract boolean f();

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            pg pgVar = this.d;
            int i3 = pgVar.x;
            int iMax = Math.max(pgVar.w, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            pg pgVar2 = this.d;
            int i4 = pgVar2.A;
            int iMax2 = Math.max(pgVar2.z, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final void i(ps psVar, ps psVar2, int i, pt ptVar) {
        psVar.k.add(psVar2);
        psVar.k.add(this.e);
        psVar.g = i;
        psVar.h = ptVar;
        psVar2.j.add(psVar);
        ptVar.j.add(psVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m(defpackage.pf r10, defpackage.pf r11, int r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.m(pf, pf, int):void");
    }
}
