package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pu {
    public static final po a = new po();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, pg pgVar, qg qgVar, boolean z) {
        pf pfVar;
        pf pfVar2;
        float f;
        pf pfVar3;
        pf pfVar4;
        if (pgVar.o) {
            return;
        }
        b++;
        if (!(pgVar instanceof ph) && pgVar.K() && c(pgVar)) {
            ph.Y(pgVar, qgVar, new po());
        }
        pf pfVarL = pgVar.L(2);
        pf pfVarL2 = pgVar.L(4);
        int iA = pfVarL.a();
        int iA2 = pfVarL2.a();
        HashSet hashSet = pfVarL.a;
        if (hashSet != null && pfVarL.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                pf pfVar5 = (pf) it.next();
                pg pgVar2 = pfVar5.d;
                boolean zC = c(pgVar2);
                if (pgVar2.K() && zC) {
                    f = 0.0f;
                    ph.Y(pgVar2, qgVar, new po());
                } else {
                    f = 0.0f;
                }
                pf pfVar6 = pgVar2.K;
                boolean z2 = (pfVar5 == pfVar6 && (pfVar4 = pgVar2.M.e) != null && pfVar4.c) || (pfVar5 == pgVar2.M && (pfVar3 = pfVar6.e) != null && pfVar3.c);
                if (pgVar2.N() != 3 || zC) {
                    if (!pgVar2.K()) {
                        pf pfVar7 = pgVar2.K;
                        if (pfVar5 == pfVar7 && pgVar2.M.e == null) {
                            int iB = pfVar7.b() + iA;
                            pgVar2.v(iB, pgVar2.j() + iB);
                            a(i2, pgVar2, qgVar, z);
                        } else {
                            pf pfVar8 = pgVar2.M;
                            if (pfVar5 == pfVar8 && pfVar7.e == null) {
                                int iB2 = iA - pfVar8.b();
                                pgVar2.v(iB2 - pgVar2.j(), iB2);
                                a(i2, pgVar2, qgVar, z);
                            } else if (z2 && !pgVar2.I()) {
                                e(i2, qgVar, pgVar2, z);
                            }
                        }
                    }
                } else if (pgVar2.N() == 3 && pgVar2.x >= 0 && pgVar2.w >= 0 && (pgVar2.ai == 8 || (pgVar2.t == 0 && pgVar2.Y == f))) {
                    if (!pgVar2.I() && z2 && !pgVar2.I()) {
                        f(i2, pgVar, qgVar, pgVar2, z);
                    }
                }
            }
        }
        if (pgVar instanceof pj) {
            return;
        }
        HashSet hashSet2 = pfVarL2.a;
        if (hashSet2 != null && pfVarL2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                pf pfVar9 = (pf) it2.next();
                pg pgVar3 = pfVar9.d;
                boolean zC2 = c(pgVar3);
                if (pgVar3.K() && zC2) {
                    ph.Y(pgVar3, qgVar, new po());
                }
                pf pfVar10 = pgVar3.K;
                boolean z3 = (pfVar9 == pfVar10 && (pfVar2 = pgVar3.M.e) != null && pfVar2.c) || (pfVar9 == pgVar3.M && (pfVar = pfVar10.e) != null && pfVar.c);
                if (pgVar3.N() != 3 || zC2) {
                    if (!pgVar3.K()) {
                        pf pfVar11 = pgVar3.K;
                        if (pfVar9 == pfVar11 && pgVar3.M.e == null) {
                            int iB3 = pfVar11.b() + iA2;
                            pgVar3.v(iB3, pgVar3.j() + iB3);
                            a(i3, pgVar3, qgVar, z);
                        } else {
                            pf pfVar12 = pgVar3.M;
                            if (pfVar9 == pfVar12 && pfVar11.e == null) {
                                int iB4 = iA2 - pfVar12.b();
                                pgVar3.v(iB4 - pgVar3.j(), iB4);
                                a(i3, pgVar3, qgVar, z);
                            } else if (z3 && !pgVar3.I()) {
                                e(i3, qgVar, pgVar3, z);
                            }
                        }
                    }
                } else if (pgVar3.N() == 3 && pgVar3.x >= 0 && pgVar3.w >= 0 && (pgVar3.ai == 8 || (pgVar3.t == 0 && pgVar3.Y == 0.0f))) {
                    if (!pgVar3.I() && z3 && !pgVar3.I()) {
                        f(i3, pgVar, qgVar, pgVar3, z);
                    }
                }
            }
        }
        pgVar.o = true;
    }

    public static void b(int i, pg pgVar, qg qgVar) {
        pf pfVar;
        pf pfVar2;
        pf pfVar3;
        pf pfVar4;
        if (pgVar.p) {
            return;
        }
        c++;
        if (!(pgVar instanceof ph) && pgVar.K() && c(pgVar)) {
            ph.Y(pgVar, qgVar, new po());
        }
        pf pfVarL = pgVar.L(3);
        pf pfVarL2 = pgVar.L(5);
        int iA = pfVarL.a();
        int iA2 = pfVarL2.a();
        HashSet hashSet = pfVarL.a;
        if (hashSet != null && pfVarL.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                pf pfVar5 = (pf) it.next();
                pg pgVar2 = pfVar5.d;
                boolean zC = c(pgVar2);
                if (pgVar2.K() && zC) {
                    ph.Y(pgVar2, qgVar, new po());
                }
                pf pfVar6 = pgVar2.L;
                boolean z = (pfVar5 == pfVar6 && (pfVar4 = pgVar2.N.e) != null && pfVar4.c) || (pfVar5 == pgVar2.N && (pfVar3 = pfVar6.e) != null && pfVar3.c);
                if (pgVar2.O() != 3 || zC) {
                    if (!pgVar2.K()) {
                        pf pfVar7 = pgVar2.L;
                        if (pfVar5 == pfVar7 && pgVar2.N.e == null) {
                            int iB = pfVar7.b() + iA;
                            pgVar2.w(iB, pgVar2.h() + iB);
                            b(i2, pgVar2, qgVar);
                        } else {
                            pf pfVar8 = pgVar2.N;
                            if (pfVar5 == pfVar8 && pfVar7.e == null) {
                                int iB2 = iA - pfVar8.b();
                                pgVar2.w(iB2 - pgVar2.h(), iB2);
                                b(i2, pgVar2, qgVar);
                            } else if (z && !pgVar2.J()) {
                                g(i2, qgVar, pgVar2);
                            }
                        }
                    }
                } else if (pgVar2.O() == 3 && pgVar2.A >= 0 && pgVar2.z >= 0 && (pgVar2.ai == 8 || (pgVar2.u == 0 && pgVar2.Y == 0.0f))) {
                    if (!pgVar2.J() && z && !pgVar2.J()) {
                        h(i2, pgVar, qgVar, pgVar2);
                    }
                }
            }
        }
        if (pgVar instanceof pj) {
            return;
        }
        HashSet hashSet2 = pfVarL2.a;
        if (hashSet2 != null && pfVarL2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                pf pfVar9 = (pf) it2.next();
                pg pgVar3 = pfVar9.d;
                boolean zC2 = c(pgVar3);
                if (pgVar3.K() && zC2) {
                    ph.Y(pgVar3, qgVar, new po());
                }
                pf pfVar10 = pgVar3.L;
                boolean z2 = (pfVar9 == pfVar10 && (pfVar2 = pgVar3.N.e) != null && pfVar2.c) || (pfVar9 == pgVar3.N && (pfVar = pfVar10.e) != null && pfVar.c);
                if (pgVar3.O() != 3 || zC2) {
                    if (!pgVar3.K()) {
                        pf pfVar11 = pgVar3.L;
                        if (pfVar9 == pfVar11 && pgVar3.N.e == null) {
                            int iB3 = pfVar11.b() + iA2;
                            pgVar3.w(iB3, pgVar3.h() + iB3);
                            b(i3, pgVar3, qgVar);
                        } else {
                            pf pfVar12 = pgVar3.N;
                            if (pfVar9 == pfVar12 && pfVar11.e == null) {
                                int iB4 = iA2 - pfVar12.b();
                                pgVar3.w(iB4 - pgVar3.h(), iB4);
                                b(i3, pgVar3, qgVar);
                            } else if (z2 && !pgVar3.J()) {
                                g(i3, qgVar, pgVar3);
                            }
                        }
                    }
                } else if (pgVar3.O() == 3 && pgVar3.A >= 0 && pgVar3.z >= 0 && (pgVar3.ai == 8 || (pgVar3.u == 0 && pgVar3.Y == 0.0f))) {
                    if (!pgVar3.J() && z2 && !pgVar3.J()) {
                        h(i3, pgVar, qgVar, pgVar3);
                    }
                }
            }
        }
        pf pfVarL3 = pgVar.L(6);
        if (pfVarL3.a != null && pfVarL3.c) {
            int iA3 = pfVarL3.a();
            Iterator it3 = pfVarL3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                pf pfVar13 = (pf) it3.next();
                pg pgVar4 = pfVar13.d;
                boolean zC3 = c(pgVar4);
                if (pgVar4.K() && zC3) {
                    ph.Y(pgVar4, qgVar, new po());
                }
                if (pgVar4.O() != 3 || zC3) {
                    if (!pgVar4.K() && pfVar13 == pgVar4.O) {
                        int iB5 = pfVar13.b() + iA3;
                        if (pgVar4.G) {
                            int i5 = iB5 - pgVar4.ac;
                            int i6 = pgVar4.X + i5;
                            pgVar4.ab = i5;
                            pgVar4.L.e(i5);
                            pgVar4.N.e(i6);
                            pgVar4.O.e(iB5);
                            pgVar4.n = true;
                        }
                        b(i4, pgVar4, qgVar);
                    }
                }
            }
        }
        pgVar.p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.pg r8) {
        /*
            int r0 = r8.N()
            int r1 = r8.O()
            pg r2 = r8.V
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.N()
        L12:
            if (r2 == 0) goto L17
            r2.O()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4b
            boolean r7 = r8.e()
            if (r7 != 0) goto L4b
            if (r0 == r2) goto L4b
            if (r0 != r4) goto L39
            int r0 = r8.t
            if (r0 != 0) goto L3d
            float r0 = r8.Y
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
            boolean r0 = r8.G(r5)
            if (r0 != 0) goto L4b
            goto L3d
        L39:
            if (r0 == r4) goto L3d
        L3b:
            r0 = r5
            goto L4c
        L3d:
            int r0 = r8.t
            if (r0 != r6) goto L3b
            int r0 = r8.j()
            boolean r0 = r8.H(r5, r0)
            if (r0 == 0) goto L3b
        L4b:
            r0 = r6
        L4c:
            if (r1 == r6) goto L7b
            boolean r7 = r8.f()
            if (r7 != 0) goto L7b
            if (r1 == r2) goto L7b
            if (r1 != r4) goto L69
            int r1 = r8.u
            if (r1 != 0) goto L6d
            float r1 = r8.Y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6d
            boolean r1 = r8.G(r6)
            if (r1 != 0) goto L7b
            goto L6d
        L69:
            if (r1 == r4) goto L6d
        L6b:
            r1 = r5
            goto L7c
        L6d:
            int r1 = r8.u
            if (r1 != r6) goto L6b
            int r1 = r8.h()
            boolean r1 = r8.H(r6, r1)
            if (r1 == 0) goto L6b
        L7b:
            r1 = r6
        L7c:
            float r8 = r8.Y
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8a
            if (r0 != 0) goto L89
            if (r1 != 0) goto L89
            r0 = r5
            r1 = r0
            goto L8a
        L89:
            return r6
        L8a:
            if (r0 == 0) goto L8f
            if (r1 == 0) goto L8f
            return r6
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu.c(pg):boolean");
    }

    public static void d(pd pdVar, qg qgVar, int i, boolean z) {
        if (pdVar.c()) {
            if (i == 0) {
                a(1, pdVar, qgVar, z);
            } else {
                b(1, pdVar, qgVar);
            }
        }
    }

    private static void e(int i, qg qgVar, pg pgVar, boolean z) {
        float f = pgVar.af;
        int iA = pgVar.K.e.a();
        int iA2 = pgVar.M.e.a();
        int iB = pgVar.K.b() + iA;
        int iB2 = iA2 - pgVar.M.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = pgVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        pgVar.v(i3, i4);
        a(i + 1, pgVar, qgVar, z);
    }

    private static void f(int i, pg pgVar, qg qgVar, pg pgVar2, boolean z) {
        float f = pgVar2.af;
        int iA = pgVar2.K.e.a() + pgVar2.K.b();
        int iA2 = pgVar2.M.e.a() - pgVar2.M.b();
        if (iA2 >= iA) {
            int iJ = pgVar2.j();
            int i2 = iA2 - iA;
            if (pgVar2.ai != 8) {
                int i3 = pgVar2.t;
                if (i3 == 2) {
                    iJ = (int) (pgVar2.af * 0.5f * (pgVar instanceof ph ? pgVar.j() : pgVar.V.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = Math.max(pgVar2.w, iJ);
                int i4 = pgVar2.x;
                if (i4 > 0) {
                    iJ = Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            pgVar2.v(i5, iJ + i5);
            a(i + 1, pgVar2, qgVar, z);
        }
    }

    private static void g(int i, qg qgVar, pg pgVar) {
        float f = pgVar.ag;
        int iA = pgVar.L.e.a();
        int iA2 = pgVar.N.e.a();
        int iB = pgVar.L.b() + iA;
        int iB2 = iA2 - pgVar.N.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = pgVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iH;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iH;
        }
        pgVar.w(i4, i5);
        b(i + 1, pgVar, qgVar);
    }

    private static void h(int i, pg pgVar, qg qgVar, pg pgVar2) {
        float f = pgVar2.ag;
        int iA = pgVar2.L.e.a() + pgVar2.L.b();
        int iA2 = pgVar2.N.e.a() - pgVar2.N.b();
        if (iA2 >= iA) {
            int iH = pgVar2.h();
            int i2 = iA2 - iA;
            if (pgVar2.ai != 8) {
                int i3 = pgVar2.u;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (pgVar instanceof ph ? pgVar.h() : pgVar.V.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(pgVar2.z, iH);
                int i4 = pgVar2.A;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            pgVar2.w(i5, iH + i5);
            b(i + 1, pgVar2, qgVar);
        }
    }
}
