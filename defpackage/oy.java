package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oy {
    public static boolean a = false;
    public static final boolean b = true;
    public static final boolean c = true;
    public static final boolean d = true;
    public static long e;
    ox[] h;
    public final zw m;
    private final ox u;
    private ox v;
    private int n = 1000;
    public boolean f = false;
    int g = 0;
    private int o = 32;
    private int p = 32;
    public boolean i = false;
    public boolean j = false;
    private boolean[] q = new boolean[32];
    int k = 1;
    int l = 0;
    private int r = 32;
    private pb[] s = new pb[1000];
    private int t = 0;

    public oy() {
        this.h = null;
        this.h = new ox[32];
        t();
        zw zwVar = new zw();
        this.m = zwVar;
        this.u = new pa(zwVar);
        this.v = new ox(zwVar);
    }

    public static final int p(Object obj) {
        pb pbVar = ((pf) obj).h;
        if (pbVar != null) {
            return (int) (pbVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(ox oxVar) {
        int i;
        if (oxVar.e) {
            oxVar.a.d(this, oxVar.b);
        } else {
            ox[] oxVarArr = this.h;
            int i2 = this.l;
            oxVarArr[i2] = oxVar;
            pb pbVar = oxVar.a;
            pbVar.d = i2;
            this.l = i2 + 1;
            pbVar.e(this, oxVar);
        }
        if (this.f) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.h[i3] == null) {
                    System.out.println("WTF");
                }
                ox oxVar2 = this.h[i3];
                if (oxVar2 != null && oxVar2.e) {
                    oxVar2.a.d(this, oxVar2.b);
                    ((fui) this.m.b).n(oxVar2);
                    this.h[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        ox[] oxVarArr2 = this.h;
                        int i6 = i4 - 1;
                        ox oxVar3 = oxVarArr2[i4];
                        oxVarArr2[i6] = oxVar3;
                        pb pbVar2 = oxVar3.a;
                        if (pbVar2.d == i4) {
                            pbVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.h[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.l; i++) {
            ox oxVar = this.h[i];
            oxVar.a.f = oxVar.b;
        }
    }

    private final void s() {
        int i = this.o;
        int i2 = i + i;
        this.o = i2;
        this.h = (ox[]) Arrays.copyOf(this.h, i2);
        this.m.c = (pb[]) Arrays.copyOf((Object[]) this.m.c, this.o);
        int i3 = this.o;
        this.q = new boolean[i3];
        this.p = i3;
        this.r = i3;
    }

    private final void t() {
        for (int i = 0; i < this.l; i++) {
            ox oxVar = this.h[i];
            if (oxVar != null) {
                ((fui) this.m.b).n(oxVar);
            }
            this.h[i] = null;
        }
    }

    private final pb u(int i, String str) {
        pb pbVar = (pb) ((fui) this.m.a).m();
        if (pbVar == null) {
            pbVar = new pb(i);
            pbVar.n = i;
        } else {
            pbVar.c();
            pbVar.n = i;
        }
        int i2 = this.t;
        int i3 = this.n;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.n = i4;
            this.s = (pb[]) Arrays.copyOf(this.s, i4);
        }
        pb[] pbVarArr = this.s;
        int i5 = this.t;
        this.t = i5 + 1;
        pbVarArr[i5] = pbVar;
        return pbVar;
    }

    private final void v(ox oxVar) {
        for (int i = 0; i < this.k; i++) {
            this.q[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            int i3 = this.k;
            if (i2 >= i3 + i3) {
                return;
            }
            if (oxVar.a() != null) {
                this.q[oxVar.a().c] = true;
            }
            pb pbVarM = oxVar.m(this.q);
            if (pbVarM != null) {
                boolean[] zArr = this.q;
                int i4 = pbVarM.c;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (pbVarM != null) {
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.l; i6++) {
                    ox oxVar2 = this.h[i6];
                    if (oxVar2.a.n != 1 && !oxVar2.e && oxVar2.f.l(pbVarM)) {
                        float fA = oxVar2.f.a(pbVarM);
                        if (fA < 0.0f) {
                            float f2 = (-oxVar2.b) / fA;
                            if (f2 < f) {
                                i5 = i6;
                                f = f2;
                            }
                        }
                    }
                }
                if (i5 >= 0) {
                    ox oxVar3 = this.h[i5];
                    oxVar3.a.d = -1;
                    oxVar3.c(pbVarM);
                    pb pbVar = oxVar3.a;
                    pbVar.d = i5;
                    pbVar.e(this, oxVar3);
                }
            } else {
                z = true;
            }
        }
    }

    public final ox a() {
        ox oxVar = (ox) ((fui) this.m.b).m();
        if (oxVar == null) {
            oxVar = new ox(this.m);
            e++;
        } else {
            oxVar.a = null;
            oxVar.f.h();
            oxVar.b = 0.0f;
            oxVar.e = false;
        }
        pb.a++;
        return oxVar;
    }

    public final pb b(int i, String str) {
        if (this.k + 1 >= this.p) {
            s();
        }
        pb pbVarU = u(4, str);
        int i2 = this.g + 1;
        this.g = i2;
        this.k++;
        pbVarU.c = i2;
        pbVarU.e = i;
        ((pb[]) this.m.c)[i2] = pbVarU;
        pa paVar = (pa) this.u;
        oz ozVar = paVar.h;
        ozVar.a = pbVarU;
        Arrays.fill(ozVar.a.i, 0.0f);
        pbVarU.i[pbVarU.e] = 1.0f;
        paVar.o(pbVarU);
        return pbVarU;
    }

    public final pb c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.p) {
            s();
        }
        pf pfVar = (pf) obj;
        pb pbVar = pfVar.h;
        if (pbVar == null) {
            pfVar.j();
            pbVar = pfVar.h;
        }
        int i = pbVar.c;
        if (i != -1) {
            if (i <= this.g && ((pb[]) this.m.c)[i] != null) {
                return pbVar;
            }
            if (i != -1) {
                pbVar.c();
            }
        }
        int i2 = this.g + 1;
        this.g = i2;
        this.k++;
        pbVar.c = i2;
        pbVar.n = 1;
        ((pb[]) this.m.c)[this.g] = pbVar;
        return pbVar;
    }

    public final pb d() {
        if (this.k + 1 >= this.p) {
            s();
        }
        pb pbVarU = u(3, null);
        int i = this.g + 1;
        this.g = i;
        this.k++;
        pbVarU.c = i;
        ((pb[]) this.m.c)[i] = pbVarU;
        return pbVarU;
    }

    public final void e(pb pbVar, pb pbVar2, int i, float f, pb pbVar3, pb pbVar4, int i2, int i3) {
        ox oxVarA = a();
        if (pbVar2 == pbVar3) {
            oxVarA.f.k(pbVar, 1.0f);
            oxVarA.f.k(pbVar4, 1.0f);
            oxVarA.f.k(pbVar2, -2.0f);
        } else if (f == 0.5f) {
            oxVarA.f.k(pbVar, 1.0f);
            oxVarA.f.k(pbVar2, -1.0f);
            oxVarA.f.k(pbVar3, -1.0f);
            oxVarA.f.k(pbVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                oxVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            oxVarA.f.k(pbVar, -1.0f);
            oxVarA.f.k(pbVar2, 1.0f);
            oxVarA.b = i;
        } else if (f >= 1.0f) {
            oxVarA.f.k(pbVar4, -1.0f);
            oxVarA.f.k(pbVar3, 1.0f);
            oxVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            oxVarA.f.k(pbVar, f2);
            oxVarA.f.k(pbVar2, -f2);
            oxVarA.f.k(pbVar3, -f);
            oxVarA.f.k(pbVar4, f);
            if (i > 0 || i2 > 0) {
                oxVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            oxVarA.h(this, i3);
        }
        f(oxVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0194 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.ox r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.f(ox):void");
    }

    public final void g(pb pbVar, int i) {
        if (pbVar.d == -1) {
            pbVar.d(this, i);
            for (int i2 = 0; i2 < this.g + 1; i2++) {
                pb pbVar2 = ((pb[]) this.m.c)[i2];
            }
            return;
        }
        int i3 = pbVar.d;
        if (i3 == -1) {
            float f = i;
            ox oxVarA = a();
            oxVarA.a = pbVar;
            pbVar.f = f;
            oxVarA.b = f;
            oxVarA.e = true;
            f(oxVarA);
            return;
        }
        ox oxVar = this.h[i3];
        if (oxVar.e) {
            oxVar.b = i;
            return;
        }
        if (oxVar.f.e() == 0) {
            oxVar.e = true;
            oxVar.b = i;
            return;
        }
        ox oxVarA2 = a();
        if (i < 0) {
            oxVarA2.b = -i;
            oxVarA2.f.k(pbVar, 1.0f);
        } else {
            oxVarA2.b = i;
            oxVarA2.f.k(pbVar, -1.0f);
        }
        f(oxVarA2);
    }

    public final void h(pb pbVar, pb pbVar2, int i, int i2) {
        ox oxVarA = a();
        pb pbVarD = d();
        pbVarD.e = 0;
        oxVarA.j(pbVar, pbVar2, pbVarD, i);
        if (i2 != 8) {
            j(oxVarA, (int) (-oxVarA.f.a(pbVarD)), i2);
        }
        f(oxVarA);
    }

    public final void i(pb pbVar, pb pbVar2, int i, int i2) {
        ox oxVarA = a();
        pb pbVarD = d();
        pbVarD.e = 0;
        oxVarA.k(pbVar, pbVar2, pbVarD, i);
        if (i2 != 8) {
            j(oxVarA, (int) (-oxVarA.f.a(pbVarD)), i2);
        }
        f(oxVarA);
    }

    final void j(ox oxVar, int i, int i2) {
        oxVar.f.k(b(i2, null), i);
    }

    public final void k() {
        if (this.u.f()) {
            r();
            return;
        }
        if (!this.j) {
            m(this.u);
            return;
        }
        for (int i = 0; i < this.l; i++) {
            if (!this.h[i].e) {
                m(this.u);
                return;
            }
        }
        r();
    }

    public final void l() {
        zw zwVar;
        int i = 0;
        while (true) {
            zwVar = this.m;
            pb[] pbVarArr = (pb[]) zwVar.c;
            if (i >= pbVarArr.length) {
                break;
            }
            pb pbVar = pbVarArr[i];
            if (pbVar != null) {
                pbVar.c();
            }
            i++;
        }
        Object obj = zwVar.a;
        pb[] pbVarArr2 = this.s;
        int i2 = this.t;
        int length = pbVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            pb pbVar2 = pbVarArr2[i3];
            fui fuiVar = (fui) obj;
            int i4 = fuiVar.a;
            if (i4 < 256) {
                ((Object[]) fuiVar.b)[i4] = pbVar2;
                fuiVar.a = i4 + 1;
            }
        }
        this.t = 0;
        Arrays.fill((Object[]) this.m.c, (Object) null);
        this.g = 0;
        pa paVar = (pa) this.u;
        paVar.g = 0;
        paVar.b = 0.0f;
        this.k = 1;
        for (int i5 = 0; i5 < this.l; i5++) {
            ox oxVar = this.h[i5];
            if (oxVar != null) {
                oxVar.c = false;
            }
        }
        t();
        this.l = 0;
        this.v = new ox(this.m);
    }

    final void m(ox oxVar) {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.l) {
                break;
            }
            int i3 = 1;
            if (this.h[i2].a.n != 1 && this.h[i2].b < 0.0f) {
                int i4 = 0;
                int i5 = 0;
                while (i4 == 0) {
                    i5 += i3;
                    float f = Float.MAX_VALUE;
                    int i6 = -1;
                    int i7 = -1;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < this.l) {
                        ox oxVar2 = this.h[i8];
                        if (oxVar2.a.n != i3 && !oxVar2.e && oxVar2.b < 0.0f) {
                            int iE = oxVar2.f.e();
                            int i10 = 0;
                            while (i10 < iE) {
                                pb pbVarF = oxVar2.f.f(i10);
                                float fA = oxVar2.f.a(pbVarF);
                                int i11 = i3;
                                if (fA > 0.0f) {
                                    for (int i12 = 0; i12 < 9; i12++) {
                                        float f2 = pbVarF.h[i12] / fA;
                                        if ((f2 < f && i12 == i9) || i12 > i9) {
                                            i7 = pbVarF.c;
                                            i9 = i12;
                                            f = f2;
                                            i6 = i8;
                                        }
                                    }
                                }
                                i10++;
                                i3 = i11;
                            }
                        }
                        i8++;
                        i3 = i3;
                    }
                    int i13 = i3;
                    if (i6 != -1) {
                        ox oxVar3 = this.h[i6];
                        oxVar3.a.d = -1;
                        oxVar3.c(((pb[]) this.m.c)[i7]);
                        pb pbVar = oxVar3.a;
                        pbVar.d = i6;
                        pbVar.e(this, oxVar3);
                        i = 0;
                    } else {
                        i = i13;
                    }
                    i4 = ((i5 > this.k / 2 ? 0 : i13) ^ 1) | i;
                    i3 = i13;
                }
            } else {
                i2++;
            }
        }
        v(oxVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.pb r6, defpackage.pb r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            ox r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            ow r8 = r1.f
            r8.k(r6, r2)
            ow r6 = r1.f
            r6.k(r7, r3)
            goto L42
        L38:
            ow r8 = r1.f
            r8.k(r6, r3)
            ow r6 = r1.f
            r6.k(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.h(r5, r9)
        L47:
            r5.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.n(pb, pb, int, int):void");
    }

    public final void o(pb pbVar, pb pbVar2, pb pbVar3, pb pbVar4, float f) {
        ox oxVarA = a();
        oxVarA.i(pbVar, pbVar2, pbVar3, pbVar4, f);
        f(oxVarA);
    }
}
