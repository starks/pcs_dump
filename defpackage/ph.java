package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ph extends pn {
    int as;
    int at;
    public int b;
    public final fcy aI = new fcy(this);
    public final pr a = new pr(this);
    public qg aH = null;
    public boolean c = false;
    public final oy d = new oy();
    public int au = 0;
    public int av = 0;
    public pe[] aw = new pe[4];
    public pe[] ax = new pe[4];
    public int ay = 257;
    public boolean az = false;
    public boolean aA = false;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    public WeakReference aE = null;
    final HashSet aF = new HashSet();
    public final po aG = new po();

    public static void Y(pg pgVar, qg qgVar, po poVar) {
        int i;
        int i2;
        if (qgVar == null) {
            return;
        }
        if (pgVar.ai == 8 || (pgVar instanceof pj) || (pgVar instanceof pd)) {
            poVar.e = 0;
            poVar.f = 0;
            return;
        }
        poVar.k = pgVar.N();
        poVar.l = pgVar.O();
        poVar.c = pgVar.j();
        poVar.d = pgVar.h();
        poVar.i = false;
        poVar.j = 0;
        boolean z = poVar.k == 3;
        boolean z2 = poVar.l == 3;
        boolean z3 = z && pgVar.Y > 0.0f;
        boolean z4 = z2 && pgVar.Y > 0.0f;
        if (z && pgVar.G(0) && pgVar.t == 0 && !z3) {
            poVar.k = 2;
            if (z2 && pgVar.u == 0) {
                poVar.k = 1;
            }
            z = false;
        }
        if (z2 && pgVar.G(1) && pgVar.u == 0 && !z4) {
            poVar.l = 2;
            if (z && pgVar.t == 0) {
                poVar.l = 1;
            }
            z2 = false;
        }
        if (pgVar.e()) {
            poVar.k = 1;
            z = false;
        }
        if (pgVar.f()) {
            poVar.l = 1;
            z2 = false;
        }
        if (z3) {
            if (pgVar.v[0] == 4) {
                poVar.k = 1;
            } else if (!z2) {
                if (poVar.l == 1) {
                    i2 = poVar.d;
                } else {
                    poVar.k = 2;
                    qgVar.a(pgVar, poVar);
                    i2 = poVar.f;
                }
                poVar.k = 1;
                poVar.c = (int) (pgVar.Y * i2);
            }
        }
        if (z4) {
            if (pgVar.v[1] == 4) {
                poVar.l = 1;
            } else if (!z) {
                if (poVar.k == 1) {
                    i = poVar.c;
                } else {
                    poVar.l = 2;
                    qgVar.a(pgVar, poVar);
                    i = poVar.e;
                }
                poVar.l = 1;
                float f = i;
                if (pgVar.Z == -1) {
                    poVar.d = (int) (f / pgVar.Y);
                } else {
                    poVar.d = (int) (pgVar.Y * f);
                }
            }
        }
        qgVar.a(pgVar, poVar);
        pgVar.C(poVar.e);
        pgVar.x(poVar.f);
        pgVar.G = poVar.h;
        pgVar.u(poVar.g);
        poVar.j = 0;
        boolean z5 = poVar.i;
    }

    private final void aa(pf pfVar, pb pbVar) {
        this.d.h(pbVar, this.d.c(pfVar), 0, 5);
    }

    private final void ab(pf pfVar, pb pbVar) {
        oy oyVar = this.d;
        oyVar.h(oyVar.c(pfVar), pbVar, 0, 5);
    }

    private final void ac() {
        this.au = 0;
        this.av = 0;
    }

    @Override // defpackage.pg
    public final void D(boolean z, boolean z2) {
        super.D(z, z2);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((pg) this.aJ.get(i)).D(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0711 A[Catch: Exception -> 0x08f1, TryCatch #8 {Exception -> 0x08f1, blocks: (B:385:0x0686, B:394:0x06a9, B:396:0x06b5, B:397:0x06b8, B:399:0x06bc, B:401:0x06c6, B:424:0x06f5, B:404:0x06cf, B:423:0x06f2, B:425:0x06fc, B:426:0x0701, B:428:0x0709, B:430:0x0711, B:431:0x071d, B:433:0x0723), top: B:619:0x0686 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x08c1 A[Catch: Exception -> 0x08ef, TryCatch #0 {Exception -> 0x08ef, blocks: (B:521:0x08ae, B:523:0x08b2, B:530:0x08c1, B:532:0x08d8, B:534:0x08dc, B:535:0x08e2), top: B:603:0x08ae }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0955 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0964 A[LOOP:14: B:561:0x0962->B:562:0x0964, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x077f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.pn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 2640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph.T():void");
    }

    public final void U(int i) {
        this.ay = i;
        oy.a = W(512);
    }

    public final boolean V(boolean z, int i) {
        boolean z2;
        boolean z3;
        pr prVar = this.a;
        boolean z4 = false;
        int iM = prVar.a.M(0);
        int iM2 = prVar.a.M(1);
        int iK = prVar.a.k();
        int iL = prVar.a.l();
        if (z && (iM == 2 || iM2 == 2)) {
            ArrayList arrayList = prVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = true;
                    break;
                }
                qa qaVar = (qa) arrayList.get(i2);
                if (qaVar.f == i && !qaVar.f()) {
                    z3 = false;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                if (z3 && iM == 2) {
                    prVar.a.Q(1);
                    ph phVar = prVar.a;
                    phVar.C(prVar.a(phVar, 0));
                    ph phVar2 = prVar.a;
                    phVar2.i.e.c(phVar2.j());
                }
            } else if (z3 && iM2 == 2) {
                prVar.a.R(1);
                ph phVar3 = prVar.a;
                phVar3.x(prVar.a(phVar3, 1));
                ph phVar4 = prVar.a;
                phVar4.j.e.c(phVar4.h());
            }
        }
        if (i == 0) {
            if (prVar.a.ar[0] == 1 || prVar.a.ar[0] == 4) {
                int iJ = prVar.a.j() + iK;
                prVar.a.i.i.c(iJ);
                prVar.a.i.e.c(iJ - iK);
                z2 = true;
            }
            z2 = false;
        } else {
            if (prVar.a.ar[1] == 1 || prVar.a.ar[1] == 4) {
                int iH = prVar.a.h() + iL;
                prVar.a.j.i.c(iH);
                prVar.a.j.e.c(iH - iL);
                z2 = true;
            }
            z2 = false;
        }
        prVar.c();
        ArrayList arrayList2 = prVar.e;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            qa qaVar2 = (qa) arrayList2.get(i3);
            if (qaVar2.f == i && (qaVar2.d != prVar.a || qaVar2.g)) {
                qaVar2.c();
            }
        }
        ArrayList arrayList3 = prVar.e;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z4 = true;
                break;
            }
            qa qaVar3 = (qa) arrayList3.get(i4);
            if (qaVar3.f == i && ((z2 || qaVar3.d != prVar.a) && !(qaVar3.h.i && qaVar3.i.i && ((qaVar3 instanceof pp) || qaVar3.e.i)))) {
                break;
            }
            i4++;
        }
        prVar.a.Q(iM);
        prVar.a.R(iM2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.ay & i) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph.X(int, int, int, int, int, int, int):void");
    }

    final void a(pg pgVar, int i) {
        if (i == 0) {
            int i2 = this.au + 1;
            pe[] peVarArr = this.ax;
            int length = peVarArr.length;
            if (i2 >= length) {
                this.ax = (pe[]) Arrays.copyOf(peVarArr, length + length);
            }
            pe[] peVarArr2 = this.ax;
            int i3 = this.au;
            peVarArr2[i3] = new pe(pgVar, 0, this.c);
            this.au = i3 + 1;
            return;
        }
        int i4 = this.av + 1;
        pe[] peVarArr3 = this.aw;
        int length2 = peVarArr3.length;
        if (i4 >= length2) {
            this.aw = (pe[]) Arrays.copyOf(peVarArr3, length2 + length2);
        }
        pe[] peVarArr4 = this.aw;
        int i5 = this.av;
        peVarArr4[i5] = new pe(pgVar, 1, this.c);
        this.av = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.pn, defpackage.pg
    public final void s() {
        this.d.l();
        this.as = 0;
        this.at = 0;
        super.s();
    }
}
