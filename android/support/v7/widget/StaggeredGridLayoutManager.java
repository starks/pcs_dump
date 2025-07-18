package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ays;
import defpackage.brb;
import defpackage.ja;
import defpackage.jq;
import defpackage.jt;
import defpackage.jx;
import defpackage.jy;
import defpackage.jz;
import defpackage.kc;
import defpackage.kh;
import defpackage.ki;
import defpackage.kj;
import defpackage.kt;
import defpackage.ku;
import defpackage.kw;
import defpackage.kx;
import defpackage.p;
import defpackage.vw;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends jy implements kh {
    private int[] K;
    kx[] a;
    public jq b;
    jq c;
    private int i;
    private int j;
    private int k;
    private final ja l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private kw q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    ays h = new ays();
    private int n = 2;
    private final Rect G = new Rect();
    private final kt H = new kt(this);
    private boolean I = false;
    private boolean J = true;
    private final Runnable L = new p(this, 19, null);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        jx jxVarAw = aw(context, attributeSet, i, i2);
        int i3 = jxVarAw.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        O(null);
        if (i3 != this.j) {
            this.j = i3;
            jq jqVar = this.b;
            this.b = this.c;
            this.c = jqVar;
            aR();
        }
        int i4 = jxVarAw.b;
        O(null);
        if (i4 != this.i) {
            this.h.e();
            aR();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new kx[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new kx(this, i5);
            }
            aR();
        }
        I(jxVarAw.c);
        this.l = new ja();
        this.b = jq.p(this, this.j);
        this.c = jq.p(this, 1 - this.j);
    }

    private final int Q(int i) {
        if (am() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int U(kj kjVar) {
        if (am() == 0) {
            return 0;
        }
        return jt.r(kjVar, this.b, r(!this.J), l(!this.J), this, this.J);
    }

    private final int V(kj kjVar) {
        if (am() == 0) {
            return 0;
        }
        return jt.s(kjVar, this.b, r(!this.J), l(!this.J), this, this.J, this.e);
    }

    private final int Z(kj kjVar) {
        if (am() == 0) {
            return 0;
        }
        return jt.t(kjVar, this.b, r(!this.J), l(!this.J), this, this.J);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int ab(defpackage.kc r22, defpackage.ja r23, defpackage.kj r24) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ab(kc, ja, kj):int");
    }

    private final int af(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int ag(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final void ah(kc kcVar, kj kjVar, boolean z) {
        int iF;
        int i;
        int iAf = af(Integer.MIN_VALUE);
        if (iAf != Integer.MIN_VALUE && (iF = this.b.f() - iAf) > 0) {
            int i2 = -k(-iF, kcVar, kjVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void aj(kc kcVar, kj kjVar, boolean z) {
        int iJ;
        int iAg = ag(Integer.MAX_VALUE);
        if (iAg != Integer.MAX_VALUE && (iJ = iAg - this.b.j()) > 0) {
            int iK = iJ - k(iJ, kcVar, kjVar);
            if (!z || iK <= 0) {
                return;
            }
            this.b.n(-iK);
        }
    }

    private final void bA(View view, int i, int i2) {
        aE(view, this.G);
        ku kuVar = (ku) view.getLayoutParams();
        int iBB = bB(i, kuVar.leftMargin + this.G.left, kuVar.rightMargin + this.G.right);
        int iBB2 = bB(i2, kuVar.topMargin + this.G.top, kuVar.bottomMargin + this.G.bottom);
        if (bc(view, iBB, iBB2, kuVar)) {
            view.measure(iBB, iBB2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int bB(int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 == 0) goto L14
            r4 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r3
        L15:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bB(int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bq(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.e
            if (r0 == 0) goto L9
            int r0 = r6.i()
            goto Ld
        L9:
            int r0 = r6.c()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            ays r4 = r6.h
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            ays r9 = r6.h
            r9.h(r7, r4)
            ays r7 = r6.h
            r7.g(r8, r4)
            goto L41
        L36:
            ays r9 = r6.h
            r9.h(r7, r8)
            goto L41
        L3c:
            ays r9 = r6.h
            r9.g(r7, r8)
        L41:
            if (r2 > r0) goto L44
            goto L56
        L44:
            boolean r7 = r6.e
            if (r7 == 0) goto L4d
            int r7 = r6.c()
            goto L51
        L4d:
            int r7 = r6.i()
        L51:
            if (r3 > r7) goto L56
            r6.aR()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bq(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void br(defpackage.kc r12, defpackage.kj r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.br(kc, kj, boolean):void");
    }

    private final void bs(kc kcVar, ja jaVar) {
        if (!jaVar.a || jaVar.i) {
            return;
        }
        if (jaVar.b == 0) {
            if (jaVar.e == -1) {
                bt(kcVar, jaVar.g);
                return;
            } else {
                bu(kcVar, jaVar.f);
                return;
            }
        }
        int i = 1;
        if (jaVar.e == -1) {
            int i2 = jaVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            bt(kcVar, i3 < 0 ? jaVar.g : jaVar.g - Math.min(i3, jaVar.b));
            return;
        }
        int i4 = jaVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - jaVar.g;
        bu(kcVar, i5 < 0 ? jaVar.f : Math.min(i5, jaVar.b) + jaVar.f);
    }

    private final void bt(kc kcVar, int i) {
        int iAm = am();
        while (true) {
            iAm--;
            if (iAm < 0) {
                return;
            }
            View viewAy = ay(iAm);
            if (this.b.d(viewAy) < i || this.b.m(viewAy) < i) {
                return;
            }
            ku kuVar = (ku) viewAy.getLayoutParams();
            boolean z = kuVar.b;
            if (kuVar.a.a.size() == 1) {
                return;
            }
            kx kxVar = kuVar.a;
            int size = kxVar.a.size();
            View view = (View) kxVar.a.remove(size - 1);
            ku kuVarN = kx.n(view);
            kuVarN.a = null;
            if (kuVarN.c() || kuVarN.b()) {
                kxVar.d -= kxVar.f.b.b(view);
            }
            if (size == 1) {
                kxVar.b = Integer.MIN_VALUE;
            }
            kxVar.c = Integer.MIN_VALUE;
            aO(viewAy, kcVar);
        }
    }

    private final void bu(kc kcVar, int i) {
        while (am() > 0) {
            View viewAy = ay(0);
            if (this.b.a(viewAy) > i || this.b.l(viewAy) > i) {
                return;
            }
            ku kuVar = (ku) viewAy.getLayoutParams();
            boolean z = kuVar.b;
            if (kuVar.a.a.size() == 1) {
                return;
            }
            kx kxVar = kuVar.a;
            View view = (View) kxVar.a.remove(0);
            ku kuVarN = kx.n(view);
            kuVarN.a = null;
            if (kxVar.a.size() == 0) {
                kxVar.c = Integer.MIN_VALUE;
            }
            if (kuVarN.c() || kuVarN.b()) {
                kxVar.d -= kxVar.f.b.b(view);
            }
            kxVar.b = Integer.MIN_VALUE;
            aO(viewAy, kcVar);
        }
    }

    private final void bv() {
        this.e = (this.j == 1 || !P()) ? this.d : !this.d;
    }

    private final void bw(int i) {
        ja jaVar = this.l;
        jaVar.e = i;
        jaVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bx(int i, kj kjVar) {
        int iK;
        int iK2;
        int i2;
        ja jaVar = this.l;
        boolean z = false;
        jaVar.b = 0;
        jaVar.c = i;
        if (!ba() || (i2 = kjVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            if (this.e == (i2 < i)) {
                iK = this.b.k();
                iK2 = 0;
            } else {
                iK2 = this.b.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.j) {
            this.l.g = this.b.e() + iK;
            this.l.f = -iK2;
        } else {
            this.l.f = this.b.j() - iK2;
            this.l.g = this.b.f() + iK;
        }
        ja jaVar2 = this.l;
        jaVar2.h = false;
        jaVar2.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        jaVar2.i = z;
    }

    private final void by(kx kxVar, int i, int i2) {
        int i3 = kxVar.d;
        if (i == -1) {
            if (kxVar.e() + i3 <= i2) {
                this.m.set(kxVar.e, false);
            }
        } else if (kxVar.c() - i3 >= i2) {
            this.m.set(kxVar.e, false);
        }
    }

    private final boolean bz(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        if (i2 == 0) {
            return z != this.e;
        }
        return (z == this.e) == P();
    }

    @Override // defpackage.jy
    public final void A(int i, int i2) {
        bq(i, i2, 4);
    }

    @Override // defpackage.jy
    public final int B(kj kjVar) {
        return U(kjVar);
    }

    @Override // defpackage.jy
    public final int C(kj kjVar) {
        return V(kjVar);
    }

    @Override // defpackage.jy
    public final int D(kj kjVar) {
        return Z(kjVar);
    }

    @Override // defpackage.jy
    public final int E(kj kjVar) {
        return U(kjVar);
    }

    @Override // defpackage.jy
    public final int F(kj kjVar) {
        return V(kjVar);
    }

    @Override // defpackage.jy
    public final int G(kj kjVar) {
        return Z(kjVar);
    }

    final void H(int i, kj kjVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        this.l.a = true;
        bx(iC, kjVar);
        bw(i2);
        ja jaVar = this.l;
        jaVar.c = iC + jaVar.d;
        jaVar.b = Math.abs(i);
    }

    public final void I(boolean z) {
        O(null);
        kw kwVar = this.q;
        if (kwVar != null && kwVar.h != z) {
            kwVar.h = z;
        }
        this.d = z;
        aR();
    }

    final void J(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    @Override // defpackage.kh
    public final PointF K(int i) {
        int iQ = Q(i);
        PointF pointF = new PointF();
        if (iQ == 0) {
            return null;
        }
        float f = iQ;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.jy
    public final Parcelable L() {
        int iF;
        int iJ;
        Object obj;
        kw kwVar = this.q;
        if (kwVar != null) {
            return new kw(kwVar);
        }
        kw kwVar2 = new kw();
        kwVar2.h = this.d;
        kwVar2.i = this.o;
        kwVar2.j = this.p;
        ays aysVar = this.h;
        if (aysVar == null || (obj = aysVar.b) == null) {
            kwVar2.e = 0;
        } else {
            kwVar2.f = (int[]) obj;
            kwVar2.e = kwVar2.f.length;
            kwVar2.g = aysVar.a;
        }
        if (am() <= 0) {
            kwVar2.a = -1;
            kwVar2.b = -1;
            kwVar2.c = 0;
            return kwVar2;
        }
        kwVar2.a = this.o ? i() : c();
        View viewL = this.e ? l(true) : r(true);
        kwVar2.b = viewL != null ? bk(viewL) : -1;
        int i = this.i;
        kwVar2.c = i;
        kwVar2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            if (this.o) {
                iF = this.a[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = this.a[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            kwVar2.d[i2] = iF;
        }
        return kwVar2;
    }

    public final boolean M() {
        int iC;
        if (am() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || v() == null) {
            return false;
        }
        this.h.e();
        aS();
        aR();
        return true;
    }

    @Override // defpackage.jy
    public final void O(String str) {
        if (this.q == null) {
            super.O(str);
        }
    }

    final boolean P() {
        return ap() == 1;
    }

    @Override // defpackage.jy
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (am() > 0) {
            View viewR = r(false);
            View viewL = l(false);
            if (viewR == null || viewL == null) {
                return;
            }
            int iBk = bk(viewR);
            int iBk2 = bk(viewL);
            if (iBk < iBk2) {
                accessibilityEvent.setFromIndex(iBk);
                accessibilityEvent.setToIndex(iBk2);
            } else {
                accessibilityEvent.setFromIndex(iBk2);
                accessibilityEvent.setToIndex(iBk);
            }
        }
    }

    @Override // defpackage.jy
    public final void S(Parcelable parcelable) {
        if (parcelable instanceof kw) {
            kw kwVar = (kw) parcelable;
            this.q = kwVar;
            if (this.f != -1) {
                kwVar.a();
                this.q.b();
            }
            aR();
        }
    }

    @Override // defpackage.jy
    public final void T(int i) {
        kw kwVar = this.q;
        if (kwVar != null && kwVar.a != i) {
            kwVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aR();
    }

    @Override // defpackage.jy
    public final boolean W() {
        return this.j == 0;
    }

    @Override // defpackage.jy
    public final boolean X() {
        return this.j == 1;
    }

    @Override // defpackage.jy
    public final boolean Y() {
        return this.n != 0;
    }

    @Override // defpackage.jy
    public final int a(kc kcVar, kj kjVar) {
        if (this.j == 1) {
            return Math.min(this.i, kjVar.a());
        }
        return -1;
    }

    @Override // defpackage.jy
    public final void aI(int i) {
        super.aI(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.jy
    public final void aJ(int i) {
        super.aJ(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.jy
    public final void aL(int i) {
        if (i == 0) {
            M();
        }
    }

    @Override // defpackage.jy
    public final boolean aa() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // defpackage.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ad(int r5, int r6, defpackage.kj r7, defpackage.iu r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.am()
            if (r6 == 0) goto L7a
            if (r5 != 0) goto Lf
            goto L7a
        Lf:
            r4.H(r5, r7)
            int[] r5 = r4.K
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.i
            int[] r5 = new int[r5]
            r4.K = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.i
            if (r5 >= r1) goto L54
            ja r1 = r4.l
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3a
            int r1 = r1.f
            kx[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            goto L48
        L3a:
            kx[] r2 = r4.a
            r2 = r2[r5]
            int r1 = r1.g
            int r1 = r2.d(r1)
            ja r2 = r4.l
            int r2 = r2.g
        L48:
            int r1 = r1 - r2
            if (r1 < 0) goto L51
            int[] r2 = r4.K
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.K
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L7a
            ja r5 = r4.l
            boolean r5 = r5.a(r7)
            if (r5 == 0) goto L7a
            ja r5 = r4.l
            int r5 = r5.c
            int[] r1 = r4.K
            r1 = r1[r6]
            r8.a(r5, r1)
            ja r5 = r4.l
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ad(int, int, kj, iu):void");
    }

    @Override // defpackage.jy
    public final void ai(RecyclerView recyclerView) {
        bp(this.L);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.jy
    public final void ak(RecyclerView recyclerView, int i) {
        ki kiVar = new ki(recyclerView.getContext());
        kiVar.a = i;
        aY(kiVar);
    }

    @Override // defpackage.jy
    public final int b(kc kcVar, kj kjVar) {
        if (this.j == 0) {
            return Math.min(this.i, kjVar.a());
        }
        return -1;
    }

    @Override // defpackage.jy
    public final void bn() {
        this.h.e();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (am() == 0) {
            return 0;
        }
        return bk(ay(0));
    }

    @Override // defpackage.jy
    public final int d(int i, kc kcVar, kj kjVar) {
        return k(i, kcVar, kjVar);
    }

    @Override // defpackage.jy
    public final int e(int i, kc kcVar, kj kjVar) {
        return k(i, kcVar, kjVar);
    }

    @Override // defpackage.jy
    public final jz f() {
        return this.j == 0 ? new ku(-2, -1) : new ku(-1, -2);
    }

    @Override // defpackage.jy
    public final jz g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ku((ViewGroup.MarginLayoutParams) layoutParams) : new ku(layoutParams);
    }

    @Override // defpackage.jy
    public final jz h(Context context, AttributeSet attributeSet) {
        return new ku(context, attributeSet);
    }

    final int i() {
        int iAm = am();
        if (iAm == 0) {
            return 0;
        }
        return bk(ay(iAm - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    @Override // defpackage.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r9, int r10, defpackage.kc r11, defpackage.kj r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.j(android.view.View, int, kc, kj):android.view.View");
    }

    final int k(int i, kc kcVar, kj kjVar) {
        if (am() == 0 || i == 0) {
            return 0;
        }
        H(i, kjVar);
        int iAb = ab(kcVar, this.l, kjVar);
        if (this.l.b >= iAb) {
            i = i < 0 ? -iAb : iAb;
        }
        this.b.n(-i);
        this.o = this.e;
        ja jaVar = this.l;
        jaVar.b = 0;
        bs(kcVar, jaVar);
        return i;
    }

    final View l(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAm = am() - 1; iAm >= 0; iAm--) {
            View viewAy = ay(iAm);
            int iD = this.b.d(viewAy);
            int iA = this.b.a(viewAy);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAy;
                }
                if (view == null) {
                    view = viewAy;
                }
            }
        }
        return view;
    }

    @Override // defpackage.jy
    public final void m(kc kcVar, kj kjVar, vw vwVar) {
        super.m(kcVar, kjVar, vwVar);
        vwVar.f("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.jy
    public final void n(kc kcVar, kj kjVar, View view, vw vwVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ku)) {
            super.aK(view, vwVar);
            return;
        }
        ku kuVar = (ku) layoutParams;
        if (this.j == 0) {
            int iD = kuVar.d();
            boolean z = kuVar.b;
            vwVar.g(brb.m(iD, 1, -1, -1));
        } else {
            int iD2 = kuVar.d();
            boolean z2 = kuVar.b;
            vwVar.g(brb.m(-1, -1, iD2, 1));
        }
    }

    @Override // defpackage.jy
    public final void o(kc kcVar, kj kjVar) {
        br(kcVar, kjVar, true);
    }

    @Override // defpackage.jy
    public final void p(kj kjVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    @Override // defpackage.jy
    public final void q(Rect rect, int i, int i2) {
        int iAl;
        int iAl2;
        int iAt = at() + au();
        int iAv = av() + as();
        if (this.j == 1) {
            iAl2 = al(i2, rect.height() + iAv, aq());
            iAl = al(i, (this.k * this.i) + iAt, ar());
        } else {
            iAl = al(i, rect.width() + iAt, ar());
            iAl2 = al(i2, (this.k * this.i) + iAv, aq());
        }
        aV(iAl, iAl2);
    }

    final View r(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAm = am();
        View view = null;
        for (int i = 0; i < iAm; i++) {
            View viewAy = ay(i);
            int iD = this.b.d(viewAy);
            if (this.b.a(viewAy) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAy;
                }
                if (view == null) {
                    view = viewAy;
                }
            }
        }
        return view;
    }

    @Override // defpackage.jy
    public final boolean s(jz jzVar) {
        return jzVar instanceof ku;
    }

    @Override // defpackage.jy
    public final boolean u() {
        return this.q == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View v() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.v():android.view.View");
    }

    @Override // defpackage.jy
    public final void w(int i, int i2) {
        bq(i, i2, 1);
    }

    @Override // defpackage.jy
    public final void x() {
        this.h.e();
        aR();
    }

    @Override // defpackage.jy
    public final void y(int i, int i2) {
        bq(i, i2, 8);
    }

    @Override // defpackage.jy
    public final void z(int i, int i2) {
        bq(i, i2, 2);
    }
}
