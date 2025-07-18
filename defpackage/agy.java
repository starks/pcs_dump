package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agy extends ahd {
    public boolean b;
    public boolean c;
    public xk e;
    public Runnable g;
    public final /* synthetic */ ahc h;
    public long a = -1;
    public int d = 0;
    public final ahn f = new ahn();

    public agy(ahc ahcVar) {
        this.h = ahcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c A[EDGE_INSN: B:59:0x009c->B:29:0x009c BREAK  A[LOOP:0: B:17:0x006c->B:28:0x0098], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agy.m():void");
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void a(ahc ahcVar) {
        this.c = true;
    }

    public final long h() {
        return this.h.p;
    }

    public final void i() {
        if (this.b) {
            m();
            this.e.d(h() + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void j(Runnable runnable) {
        this.g = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            m();
            this.e.d(0.0f);
        }
    }

    public final /* synthetic */ void k(float f) {
        if (f >= 1.0f) {
            ahc ahcVar = this.h;
            ahcVar.t(ahcVar, ahb.b, false);
            return;
        }
        long jH = h();
        ahc ahcVarG = ((ahk) this.h).g(0);
        ahc ahcVar2 = ahcVarG.n;
        ahcVarG.n = null;
        this.h.y(-1L, this.a);
        this.h.y(jH, -1L);
        this.a = jH;
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        this.h.o.clear();
        if (ahcVar2 != null) {
            ahcVar2.t(ahcVar2, ahb.b, true);
        }
    }

    public final void l(float f) {
        long jMax = Math.max(-1L, Math.min(h() + 1, Math.round(f)));
        this.h.y(jMax, this.a);
        this.a = jMax;
    }
}
