package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pl {
    static final boolean[] a = new boolean[3];

    static void a(ph phVar, oy oyVar, pg pgVar) {
        pgVar.q = -1;
        pgVar.r = -1;
        if (phVar.ar[0] != 2 && pgVar.ar[0] == 4) {
            pf pfVar = pgVar.K;
            int i = pfVar.f;
            int iJ = phVar.j() - pgVar.M.f;
            pfVar.h = oyVar.c(pfVar);
            pf pfVar2 = pgVar.M;
            pfVar2.h = oyVar.c(pfVar2);
            oyVar.g(pgVar.K.h, i);
            oyVar.g(pgVar.M.h, iJ);
            pgVar.q = 2;
            pgVar.aa = i;
            int i2 = iJ - i;
            pgVar.W = i2;
            int i3 = pgVar.ad;
            if (i2 < i3) {
                pgVar.W = i3;
            }
        }
        if (phVar.ar[1] == 2 || pgVar.ar[1] != 4) {
            return;
        }
        pf pfVar3 = pgVar.L;
        int i4 = pfVar3.f;
        int iH = phVar.h() - pgVar.N.f;
        pfVar3.h = oyVar.c(pfVar3);
        pf pfVar4 = pgVar.N;
        pfVar4.h = oyVar.c(pfVar4);
        oyVar.g(pgVar.L.h, i4);
        oyVar.g(pgVar.N.h, iH);
        if (pgVar.ac > 0 || pgVar.ai == 8) {
            pf pfVar5 = pgVar.O;
            pfVar5.h = oyVar.c(pfVar5);
            oyVar.g(pgVar.O.h, pgVar.ac + i4);
        }
        pgVar.r = 2;
        pgVar.ab = i4;
        int i5 = iH - i4;
        pgVar.X = i5;
        int i6 = pgVar.ae;
        if (i5 < i6) {
            pgVar.X = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
