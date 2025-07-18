package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pg {
    public static final float e = 0.5f;
    public int A;
    public float B;
    int C;
    float D;
    public final int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final pf K;
    public final pf L;
    public final pf M;
    public final pf N;
    public final pf O;
    final pf P;
    final pf Q;
    public final pf R;
    public final pf[] S;
    protected final ArrayList T;
    public final boolean[] U;
    public pg V;
    int W;
    public int X;
    public float Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public float af;
    public float ag;
    public Object ah;
    public int ai;
    public String aj;
    public int ak;
    public int al;
    public final float[] am;
    public final pg[] an;
    public final pg[] ao;
    public int ap;
    public int aq;
    public final int[] ar;
    private boolean c;
    public pp g;
    public pp h;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean f = false;
    public px i = null;
    public py j = null;
    public final boolean[] k = {true, true};
    private boolean a = true;
    private final boolean b = true;
    public int l = -1;
    public int m = -1;

    public pg() {
        new HashMap();
        this.c = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = new int[2];
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        pf pfVar = new pf(this, 2);
        this.K = pfVar;
        pf pfVar2 = new pf(this, 3);
        this.L = pfVar2;
        pf pfVar3 = new pf(this, 4);
        this.M = pfVar3;
        pf pfVar4 = new pf(this, 5);
        this.N = pfVar4;
        pf pfVar5 = new pf(this, 6);
        this.O = pfVar5;
        pf pfVar6 = new pf(this, 8);
        this.P = pfVar6;
        pf pfVar7 = new pf(this, 9);
        this.Q = pfVar7;
        pf pfVar8 = new pf(this, 7);
        this.R = pfVar8;
        this.S = new pf[]{pfVar, pfVar3, pfVar2, pfVar4, pfVar5, pfVar8};
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.U = new boolean[2];
        this.ar = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        this.ai = 0;
        this.aj = null;
        this.ak = 0;
        this.al = 0;
        this.am = new float[]{-1.0f, -1.0f};
        this.an = new pg[]{null, null};
        this.ao = new pg[]{null, null};
        this.ap = -1;
        this.aq = -1;
        arrayList.add(pfVar);
        arrayList.add(pfVar2);
        arrayList.add(pfVar3);
        arrayList.add(pfVar4);
        arrayList.add(pfVar6);
        arrayList.add(pfVar7);
        arrayList.add(pfVar8);
        arrayList.add(pfVar5);
    }

    private final boolean a(int i) {
        pf pfVar;
        pf pfVar2;
        pf[] pfVarArr = this.S;
        int i2 = i + i;
        pf pfVar3 = pfVarArr[i2];
        pf pfVar4 = pfVar3.e;
        return (pfVar4 == null || pfVar4.e == pfVar3 || (pfVar2 = (pfVar = pfVarArr[i2 + 1]).e) == null || pfVar2.e != pfVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(defpackage.oy r28, boolean r29, boolean r30, boolean r31, boolean r32, defpackage.pb r33, defpackage.pb r34, int r35, boolean r36, defpackage.pf r37, defpackage.pf r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, int r49, int r50, int r51, int r52, float r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.c(oy, boolean, boolean, boolean, boolean, pb, pb, int, boolean, pf, pf, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void A(int i) {
        if (i < 0) {
            this.ae = 0;
        } else {
            this.ae = i;
        }
    }

    public final void B(int i) {
        if (i < 0) {
            this.ad = 0;
        } else {
            this.ad = i;
        }
    }

    public final void C(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void D(boolean z, boolean z2) {
        int i;
        int i2;
        px pxVar = this.i;
        boolean z3 = z & pxVar.g;
        py pyVar = this.j;
        boolean z4 = z2 & pyVar.g;
        int i3 = pxVar.h.f;
        int i4 = pyVar.h.f;
        int i5 = pxVar.i.f;
        int i6 = pyVar.i.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aa = i3;
        }
        if (z4) {
            this.ab = i4;
        }
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.ar[0] == 1 && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i9 = this.ad;
            if (i8 < i9) {
                this.W = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.ar[1] == 1 && i10 < (i = this.X)) {
                i10 = i;
            }
            this.X = i10;
            int i11 = this.ae;
            if (i10 < i11) {
                this.X = i11;
            }
        }
    }

    public void E(oy oyVar, boolean z) {
        int i;
        int i2;
        py pyVar;
        px pxVar;
        int iP = oy.p(this.K);
        int iP2 = oy.p(this.L);
        int iP3 = oy.p(this.M);
        int iP4 = oy.p(this.N);
        if (z && (pxVar = this.i) != null) {
            ps psVar = pxVar.h;
            if (psVar.i) {
                ps psVar2 = pxVar.i;
                if (psVar2.i) {
                    iP = psVar.f;
                    iP3 = psVar2.f;
                }
            }
        }
        if (z && (pyVar = this.j) != null) {
            ps psVar3 = pyVar.h;
            if (psVar3.i) {
                ps psVar4 = pyVar.i;
                if (psVar4.i) {
                    iP2 = psVar3.f;
                    iP4 = psVar4.f;
                }
            }
        }
        if (iP3 - iP < 0 || iP4 - iP2 < 0 || iP == Integer.MIN_VALUE || iP == Integer.MAX_VALUE || iP2 == Integer.MIN_VALUE || iP2 == Integer.MAX_VALUE || iP3 == Integer.MIN_VALUE || iP3 == Integer.MAX_VALUE || iP4 == Integer.MIN_VALUE || iP4 == Integer.MAX_VALUE) {
            iP = 0;
            iP2 = 0;
            iP3 = 0;
            iP4 = 0;
        }
        this.aa = iP;
        this.ab = iP2;
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int i3 = iP3 - iP;
        int[] iArr = this.ar;
        int i4 = iArr[0];
        if (i4 == 1 && i3 < (i2 = this.W)) {
            i3 = i2;
        }
        int i5 = iP4 - iP2;
        if (iArr[1] == 1 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i3;
        this.X = i5;
        int i6 = this.ae;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.ad;
        if (i3 < i7) {
            this.W = i7;
        } else {
            i7 = i3;
        }
        int i8 = this.x;
        if (i8 > 0 && i4 == 3) {
            this.W = Math.min(i7, i8);
        }
        int i9 = this.A;
        if (i9 > 0 && this.ar[1] == 3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i3 != i10) {
            this.l = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.m = i11;
        }
    }

    final boolean F() {
        return (this instanceof pm) || (this instanceof pj);
    }

    public final boolean G(int i) {
        if (i == 0) {
            return (this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0) < 2;
        }
        return ((this.L.e != null ? 1 : 0) + (this.N.e != null ? 1 : 0)) + (this.O.e != null ? 1 : 0) < 2;
    }

    public final boolean H(int i, int i2) {
        pf pfVar;
        pf pfVar2;
        if (i == 0) {
            pf pfVar3 = this.K.e;
            return pfVar3 != null && pfVar3.c && (pfVar2 = this.M.e) != null && pfVar2.c && (pfVar2.a() - this.M.b()) - (this.K.e.a() + this.K.b()) >= i2;
        }
        pf pfVar4 = this.L.e;
        if (pfVar4 != null && pfVar4.c && (pfVar = this.N.e) != null && pfVar.c && (pfVar.a() - this.N.b()) - (this.L.e.a() + this.L.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        pf pfVar = this.K;
        pf pfVar2 = pfVar.e;
        if (pfVar2 != null && pfVar2.e == pfVar) {
            return true;
        }
        pf pfVar3 = this.M;
        pf pfVar4 = pfVar3.e;
        return pfVar4 != null && pfVar4.e == pfVar3;
    }

    public final boolean J() {
        pf pfVar = this.L;
        pf pfVar2 = pfVar.e;
        if (pfVar2 != null && pfVar2.e == pfVar) {
            return true;
        }
        pf pfVar3 = this.N;
        pf pfVar4 = pfVar3.e;
        return pfVar4 != null && pfVar4.e == pfVar3;
    }

    public final boolean K() {
        return this.a && this.ai != 8;
    }

    public pf L(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? this.R : this.O : this.N : this.M : this.L : this.K;
    }

    public final int M(int i) {
        return i == 0 ? N() : O();
    }

    public final int N() {
        return this.ar[0];
    }

    public final int O() {
        return this.ar[1];
    }

    public final void P(int i, pg pgVar, int i2, int i3, int i4) {
        L(i).i(pgVar.L(i2), i3, i4, true);
    }

    public final void Q(int i) {
        this.ar[0] = i;
    }

    public final void R(int i) {
        this.ar[1] = i;
    }

    public void S(zw zwVar) {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.R.j();
        this.P.j();
        this.Q.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0401 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0596 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.oy r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.b(oy, boolean):void");
    }

    public boolean d() {
        return this.ai != 8;
    }

    public boolean e() {
        if (this.c) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public boolean f() {
        if (this.n) {
            return true;
        }
        return this.L.c && this.N.c;
    }

    public final int g() {
        return l() + this.X;
    }

    public final int h() {
        if (this.ai == 8) {
            return 0;
        }
        return this.X;
    }

    public final int i() {
        return k() + this.W;
    }

    public final int j() {
        if (this.ai == 8) {
            return 0;
        }
        return this.W;
    }

    public final int k() {
        pg pgVar = this.V;
        return pgVar != null ? ((ph) pgVar).as + this.aa : this.aa;
    }

    public final int l() {
        pg pgVar = this.V;
        return pgVar != null ? ((ph) pgVar).at + this.ab : this.ab;
    }

    public final pg m(int i) {
        pf pfVar;
        pf pfVar2;
        if (i != 0) {
            if (i == 1 && (pfVar2 = (pfVar = this.N).e) != null && pfVar2.e == pfVar) {
                return pfVar2.d;
            }
            return null;
        }
        pf pfVar3 = this.M;
        pf pfVar4 = pfVar3.e;
        if (pfVar4 == null || pfVar4.e != pfVar3) {
            return null;
        }
        return pfVar4.d;
    }

    public final pg n(int i) {
        pf pfVar;
        pf pfVar2;
        if (i != 0) {
            if (i == 1 && (pfVar2 = (pfVar = this.L).e) != null && pfVar2.e == pfVar) {
                return pfVar2.d;
            }
            return null;
        }
        pf pfVar3 = this.K;
        pf pfVar4 = pfVar3.e;
        if (pfVar4 == null || pfVar4.e != pfVar3) {
            return null;
        }
        return pfVar4.d;
    }

    public final qa o(int i) {
        if (i == 0) {
            return this.i;
        }
        if (i == 1) {
            return this.j;
        }
        return null;
    }

    public final void p(ph phVar, oy oyVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            pl.a(phVar, oyVar, this);
            hashSet.remove(this);
            b(oyVar, phVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((pf) it.next()).d.p(phVar, oyVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((pf) it2.next()).d.p(phVar, oyVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((pf) it3.next()).d.p(phVar, oyVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((pf) it4.next()).d.p(phVar, oyVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((pf) it5.next()).d.p(phVar, oyVar, hashSet, 1, true);
            }
        }
    }

    public final void q(oy oyVar) {
        oyVar.c(this.K);
        oyVar.c(this.L);
        oyVar.c(this.M);
        oyVar.c(this.N);
        if (this.ac > 0) {
            oyVar.c(this.O);
        }
    }

    public final void r() {
        if (this.i == null) {
            this.i = new px(this);
        }
        if (this.j == null) {
            this.j = new py(this);
        }
    }

    public void s() {
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.R.d();
        this.V = null;
        this.F = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        int[] iArr = this.ar;
        iArr[0] = 1;
        iArr[1] = 1;
        this.ah = null;
        this.ai = 0;
        this.ak = 0;
        this.al = 0;
        float[] fArr = this.am;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.q = -1;
        this.r = -1;
        int[] iArr2 = this.E;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.t = 0;
        this.u = 0;
        this.y = 1.0f;
        this.B = 1.0f;
        this.x = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.w = 0;
        this.z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.k;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.a = true;
        int[] iArr3 = this.v;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public final void t() {
        this.c = false;
        this.n = false;
        this.o = false;
        this.p = false;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            pf pfVar = (pf) this.T.get(i);
            pfVar.c = false;
            pfVar.b = 0;
        }
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.aj != null) {
            str = "id: " + this.aj + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.aa);
        sb.append(", ");
        sb.append(this.ab);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        sb.append(this.X);
        sb.append(")");
        return sb.toString();
    }

    public final void u(int i) {
        this.ac = i;
        this.G = i > 0;
    }

    public final void v(int i, int i2) {
        if (this.c) {
            return;
        }
        this.K.e(i);
        this.M.e(i2);
        this.aa = i;
        this.W = i2 - i;
        this.c = true;
    }

    public final void w(int i, int i2) {
        if (this.n) {
            return;
        }
        this.L.e(i);
        this.N.e(i2);
        this.ab = i;
        this.X = i2 - i;
        if (this.G) {
            this.O.e(i + this.ac);
        }
        this.n = true;
    }

    public final void x(int i) {
        this.X = i;
        int i2 = this.ae;
        if (i < i2) {
            this.X = i2;
        }
    }

    protected final void y(int i, boolean z) {
        this.U[i] = z;
    }

    public final void z(int i, int i2) {
        this.I = i;
        this.J = i2;
        this.a = false;
    }
}
