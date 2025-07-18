package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pw extends qa {
    public pw(pg pgVar) {
        super(pgVar);
    }

    private final void g(ps psVar) {
        this.h.j.add(psVar);
        psVar.k.add(this.h);
    }

    @Override // defpackage.qa
    public final void b() {
        pg pgVar = this.d;
        if (pgVar instanceof pd) {
            ps psVar = this.h;
            psVar.b = true;
            pd pdVar = (pd) pgVar;
            int i = pdVar.a;
            boolean z = pdVar.b;
            int i2 = 0;
            if (i == 0) {
                psVar.l = 4;
                while (i2 < pdVar.at) {
                    pg pgVar2 = pdVar.as[i2];
                    if (z || pgVar2.ai != 8) {
                        ps psVar2 = pgVar2.i.h;
                        psVar2.j.add(this.h);
                        this.h.k.add(psVar2);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
                return;
            }
            if (i == 1) {
                psVar.l = 5;
                while (i2 < pdVar.at) {
                    pg pgVar3 = pdVar.as[i2];
                    if (z || pgVar3.ai != 8) {
                        ps psVar3 = pgVar3.i.i;
                        psVar3.j.add(this.h);
                        this.h.k.add(psVar3);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
                return;
            }
            if (i == 2) {
                psVar.l = 6;
                while (i2 < pdVar.at) {
                    pg pgVar4 = pdVar.as[i2];
                    if (z || pgVar4.ai != 8) {
                        ps psVar4 = pgVar4.j.h;
                        psVar4.j.add(this.h);
                        this.h.k.add(psVar4);
                    }
                    i2++;
                }
                g(this.d.j.h);
                g(this.d.j.i);
                return;
            }
            if (i != 3) {
                return;
            }
            psVar.l = 7;
            while (i2 < pdVar.at) {
                pg pgVar5 = pdVar.as[i2];
                if (z || pgVar5.ai != 8) {
                    ps psVar5 = pgVar5.j.i;
                    psVar5.j.add(this.h);
                    this.h.k.add(psVar5);
                }
                i2++;
            }
            g(this.d.j.h);
            g(this.d.j.i);
        }
    }

    @Override // defpackage.qa
    public final void c() {
        pg pgVar = this.d;
        if (pgVar instanceof pd) {
            int i = ((pd) pgVar).a;
            if (i == 0 || i == 1) {
                pgVar.aa = this.h.f;
            } else {
                pgVar.ab = this.h.f;
            }
        }
    }

    @Override // defpackage.qa
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.qa, defpackage.pq
    public final void e(pq pqVar) {
        pd pdVar = (pd) this.d;
        int i = pdVar.a;
        Iterator it = this.h.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((ps) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.h.c(i3 + pdVar.c);
        } else {
            this.h.c(i2 + pdVar.c);
        }
    }

    @Override // defpackage.qa
    public final boolean f() {
        return false;
    }
}
