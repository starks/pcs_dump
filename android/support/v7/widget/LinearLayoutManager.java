package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.iu;
import defpackage.jd;
import defpackage.je;
import defpackage.jf;
import defpackage.jg;
import defpackage.jq;
import defpackage.jr;
import defpackage.jt;
import defpackage.jx;
import defpackage.jy;
import defpackage.jz;
import defpackage.kc;
import defpackage.kh;
import defpackage.ki;
import defpackage.kj;
import defpackage.vv;
import defpackage.vw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends jy implements kh {
    private jf a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final je f;
    private int g;
    private int[] h;
    int k;
    jq l;
    boolean m;
    int n;
    int o;
    jg p;
    final jd q;

    public LinearLayoutManager(Context context) {
        this();
    }

    private final void bA() {
        this.m = (this.k == 1 || !Z()) ? this.c : !this.c;
    }

    private final void bB(int i, int i2, boolean z, kj kjVar) {
        int iJ;
        this.a.m = ab();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        P(kjVar, iArr);
        int iMax = Math.max(0, this.h[0]);
        int iMax2 = Math.max(0, this.h[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        jf jfVar = this.a;
        jfVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        jfVar.i = iMax;
        if (i == 1) {
            jfVar.h = i3 + this.l.g();
            View viewBw = bw();
            jf jfVar2 = this.a;
            jfVar2.e = true == this.m ? -1 : 1;
            int iBk = bk(viewBw);
            jf jfVar3 = this.a;
            jfVar2.d = iBk + jfVar3.e;
            jfVar3.b = this.l.a(viewBw);
            iJ = this.l.a(viewBw) - this.l.f();
        } else {
            View viewBx = bx();
            this.a.h += this.l.j();
            jf jfVar4 = this.a;
            jfVar4.e = true != this.m ? -1 : 1;
            int iBk2 = bk(viewBx);
            jf jfVar5 = this.a;
            jfVar4.d = iBk2 + jfVar5.e;
            jfVar5.b = this.l.d(viewBx);
            iJ = (-this.l.d(viewBx)) + this.l.j();
        }
        jf jfVar6 = this.a;
        jfVar6.c = i2;
        if (z) {
            jfVar6.c = i2 - iJ;
        }
        jfVar6.g = iJ;
    }

    private final void bC(jd jdVar) {
        bD(jdVar.b, jdVar.c);
    }

    private final void bD(int i, int i2) {
        this.a.c = this.l.f() - i2;
        jf jfVar = this.a;
        jfVar.e = true != this.m ? 1 : -1;
        jfVar.d = i;
        jfVar.f = 1;
        jfVar.b = i2;
        jfVar.g = Integer.MIN_VALUE;
    }

    private final void bE(jd jdVar) {
        bF(jdVar.b, jdVar.c);
    }

    private final void bF(int i, int i2) {
        this.a.c = i2 - this.l.j();
        jf jfVar = this.a;
        jfVar.d = i;
        jfVar.e = true != this.m ? -1 : 1;
        jfVar.f = -1;
        jfVar.b = i2;
        jfVar.g = Integer.MIN_VALUE;
    }

    private final int bq(kj kjVar) {
        if (am() == 0) {
            return 0;
        }
        Q();
        return jt.s(kjVar, this.l, ag(!this.e), af(!this.e), this, this.e, this.m);
    }

    private final int br(kj kjVar) {
        if (am() == 0) {
            return 0;
        }
        Q();
        return jt.t(kjVar, this.l, ag(!this.e), af(!this.e), this, this.e);
    }

    private final int bs(int i, kc kcVar, kj kjVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -J(-iF2, kcVar, kjVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int bt(int i, kc kcVar, kj kjVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -J(iJ2, kcVar, kjVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final View bu() {
        return M(0, am());
    }

    private final View bv() {
        return M(am() - 1, -1);
    }

    private final View bw() {
        return ay(this.m ? 0 : am() - 1);
    }

    private final View bx() {
        return ay(this.m ? am() - 1 : 0);
    }

    private final void by(kc kcVar, jf jfVar) {
        if (!jfVar.a || jfVar.m) {
            return;
        }
        int i = jfVar.g;
        int i2 = jfVar.i;
        if (jfVar.f == -1) {
            int iAm = am();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < iAm; i3++) {
                        View viewAy = ay(i3);
                        if (this.l.d(viewAy) < iE || this.l.m(viewAy) < iE) {
                            bz(kcVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAm - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewAy2 = ay(i5);
                    if (this.l.d(viewAy2) < iE || this.l.m(viewAy2) < iE) {
                        bz(kcVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAm2 = am();
            if (!this.m) {
                for (int i7 = 0; i7 < iAm2; i7++) {
                    View viewAy3 = ay(i7);
                    if (this.l.a(viewAy3) > i6 || this.l.l(viewAy3) > i6) {
                        bz(kcVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAm2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAy4 = ay(i9);
                if (this.l.a(viewAy4) > i6 || this.l.l(viewAy4) > i6) {
                    bz(kcVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bz(kc kcVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aP(i, kcVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aP(i2, kcVar);
                }
            }
        }
    }

    private final int c(kj kjVar) {
        if (am() == 0) {
            return 0;
        }
        Q();
        return jt.r(kjVar, this.l, ag(!this.e), af(!this.e), this, this.e);
    }

    @Override // defpackage.jy
    public final int B(kj kjVar) {
        return c(kjVar);
    }

    @Override // defpackage.jy
    public final int C(kj kjVar) {
        return bq(kjVar);
    }

    @Override // defpackage.jy
    public final int D(kj kjVar) {
        return br(kjVar);
    }

    @Override // defpackage.jy
    public final int E(kj kjVar) {
        return c(kjVar);
    }

    @Override // defpackage.jy
    public final int F(kj kjVar) {
        return bq(kjVar);
    }

    @Override // defpackage.jy
    public final int G(kj kjVar) {
        return br(kjVar);
    }

    final int H(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && Z()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && Z()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int I(kc kcVar, jf jfVar, kj kjVar, boolean z) {
        int i = jfVar.c;
        int i2 = jfVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                jfVar.g = i2 + i;
            }
            by(kcVar, jfVar);
        }
        int i3 = jfVar.c + jfVar.h;
        je jeVar = this.f;
        while (true) {
            if ((!jfVar.m && i3 <= 0) || !jfVar.d(kjVar)) {
                break;
            }
            jeVar.a = 0;
            jeVar.b = false;
            jeVar.c = false;
            jeVar.d = false;
            k(kcVar, kjVar, jfVar, jeVar);
            if (!jeVar.b) {
                int i4 = jfVar.b;
                int i5 = jeVar.a;
                jfVar.b = i4 + (jfVar.f * i5);
                if (!jeVar.c || jfVar.l != null || !kjVar.g) {
                    jfVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = jfVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    jfVar.g = i7;
                    int i8 = jfVar.c;
                    if (i8 < 0) {
                        jfVar.g = i7 + i8;
                    }
                    by(kcVar, jfVar);
                }
                if (z && jeVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - jfVar.c;
    }

    final int J(int i, kc kcVar, kj kjVar) {
        if (am() != 0 && i != 0) {
            Q();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            bB(i2, iAbs, true, kjVar);
            jf jfVar = this.a;
            int I = jfVar.g + I(kcVar, jfVar, kjVar, false);
            if (I >= 0) {
                if (iAbs > I) {
                    i = i2 * I;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.kh
    public final PointF K(int i) {
        if (am() == 0) {
            return null;
        }
        float f = (i < bk(ay(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.jy
    public final Parcelable L() {
        jg jgVar = this.p;
        if (jgVar != null) {
            return new jg(jgVar);
        }
        jg jgVar2 = new jg();
        if (am() <= 0) {
            jgVar2.a();
            return jgVar2;
        }
        Q();
        boolean z = this.b ^ this.m;
        jgVar2.c = z;
        if (z) {
            View viewBw = bw();
            jgVar2.b = this.l.f() - this.l.a(viewBw);
            jgVar2.a = bk(viewBw);
            return jgVar2;
        }
        View viewBx = bx();
        jgVar2.a = bk(viewBx);
        jgVar2.b = this.l.d(viewBx) - this.l.j();
        return jgVar2;
    }

    final View M(int i, int i2) {
        Q();
        if (i2 <= i && i2 >= i) {
            return ay(i);
        }
        int iD = this.l.d(ay(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.E.n(i, i2, i4, i3) : this.F.n(i, i2, i4, i3);
    }

    @Override // defpackage.jy
    public final View N(int i) {
        int iAm = am();
        if (iAm == 0) {
            return null;
        }
        int iBk = i - bk(ay(0));
        if (iBk >= 0 && iBk < iAm) {
            View viewAy = ay(iBk);
            if (bk(viewAy) == i) {
                return viewAy;
            }
        }
        return super.N(i);
    }

    @Override // defpackage.jy
    public final void O(String str) {
        if (this.p == null) {
            super.O(str);
        }
    }

    protected final void P(kj kjVar, int[] iArr) {
        int iK = kjVar.a != -1 ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void Q() {
        if (this.a == null) {
            this.a = new jf();
        }
    }

    @Override // defpackage.jy
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (am() > 0) {
            View viewAh = ah(0, am(), false);
            accessibilityEvent.setFromIndex(viewAh == null ? -1 : bk(viewAh));
            View viewAh2 = ah(am() - 1, -1, false);
            accessibilityEvent.setToIndex(viewAh2 != null ? bk(viewAh2) : -1);
        }
    }

    @Override // defpackage.jy
    public final void S(Parcelable parcelable) {
        if (parcelable instanceof jg) {
            jg jgVar = (jg) parcelable;
            this.p = jgVar;
            if (this.n != -1) {
                jgVar.a();
            }
            aR();
        }
    }

    @Override // defpackage.jy
    public final void T(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        jg jgVar = this.p;
        if (jgVar != null) {
            jgVar.a();
        }
        aR();
    }

    public final void U(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.x(i, "invalid orientation:"));
        }
        O(null);
        if (i != this.k || this.l == null) {
            jq jqVarP = jq.p(this, i);
            this.l = jqVarP;
            this.q.a = jqVarP;
            this.k = i;
            aR();
        }
    }

    public final void V(boolean z) {
        O(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aR();
    }

    @Override // defpackage.jy
    public final boolean W() {
        return this.k == 0;
    }

    @Override // defpackage.jy
    public final boolean X() {
        return this.k == 1;
    }

    @Override // defpackage.jy
    public final boolean Y() {
        return true;
    }

    protected final boolean Z() {
        return ap() == 1;
    }

    @Override // defpackage.jy
    public final boolean aa() {
        return this.c;
    }

    final boolean ab() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.jy
    public final boolean ac() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iAm = am();
            for (int i = 0; i < iAm; i++) {
                ViewGroup.LayoutParams layoutParams = ay(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jy
    public final void ad(int i, int i2, kj kjVar, iu iuVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (am() == 0 || i == 0) {
            return;
        }
        Q();
        bB(i > 0 ? 1 : -1, Math.abs(i), true, kjVar);
        v(kjVar, this.a, iuVar);
    }

    @Override // defpackage.jy
    public final void ae(int i, iu iuVar) {
        boolean z;
        int i2;
        jg jgVar = this.p;
        if (jgVar == null || !jgVar.b()) {
            bA();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            jg jgVar2 = this.p;
            z = jgVar2.c;
            i2 = jgVar2.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            iuVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View af(boolean z) {
        return this.m ? ah(0, am(), z) : ah(am() - 1, -1, z);
    }

    final View ag(boolean z) {
        return this.m ? ah(am() - 1, -1, z) : ah(0, am(), z);
    }

    final View ah(int i, int i2, boolean z) {
        Q();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        return i3 == 0 ? this.E.n(i, i2, i4, 320) : this.F.n(i, i2, i4, 320);
    }

    public final void aj(int i) {
        this.n = i;
        this.o = 0;
        jg jgVar = this.p;
        if (jgVar != null) {
            jgVar.a();
        }
        aR();
    }

    @Override // defpackage.jy
    public final void ak(RecyclerView recyclerView, int i) {
        ki kiVar = new ki(recyclerView.getContext());
        kiVar.a = i;
        aY(kiVar);
    }

    @Override // defpackage.jy
    public int d(int i, kc kcVar, kj kjVar) {
        if (this.k == 1) {
            return 0;
        }
        return J(i, kcVar, kjVar);
    }

    @Override // defpackage.jy
    public int e(int i, kc kcVar, kj kjVar) {
        if (this.k == 0) {
            return 0;
        }
        return J(i, kcVar, kjVar);
    }

    @Override // defpackage.jy
    public jz f() {
        return new jz(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i(defpackage.kc r17, defpackage.kj r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.Q()
            int r1 = r0.am()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.am()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            jq r7 = r0.l
            int r7 = r7.j()
            jq r8 = r0.l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.ay(r1)
            int r13 = bk(r12)
            jq r14 = r0.l
            int r14 = r14.d(r12)
            jq r15 = r0.l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            jz r13 = (defpackage.jz) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r2
            goto L5c
        L5b:
            r13 = r3
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r2
            goto L63
        L62:
            r14 = r3
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.i(kc, kj, boolean, boolean):android.view.View");
    }

    @Override // defpackage.jy
    public View j(View view, int i, kc kcVar, kj kjVar) {
        int iH;
        View viewBu;
        bA();
        if (am() == 0 || (iH = H(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Q();
        bB(iH, (int) (this.l.k() * 0.33333334f), false, kjVar);
        jf jfVar = this.a;
        jfVar.g = Integer.MIN_VALUE;
        jfVar.a = false;
        I(kcVar, jfVar, kjVar, true);
        if (iH == -1) {
            viewBu = this.m ? bv() : bu();
            iH = -1;
        } else {
            viewBu = this.m ? bu() : bv();
        }
        View viewBx = iH == -1 ? bx() : bw();
        if (!viewBx.hasFocusable()) {
            return viewBu;
        }
        if (viewBu == null) {
            return null;
        }
        return viewBx;
    }

    public void k(kc kcVar, kj kjVar, jf jfVar, je jeVar) {
        int iAv;
        int i;
        int iC;
        int i2;
        int iC2;
        View viewA = jfVar.a(kcVar);
        if (viewA == null) {
            jeVar.b = true;
            return;
        }
        jz jzVar = (jz) viewA.getLayoutParams();
        if (jfVar.l == null) {
            if (this.m == (jfVar.f == -1)) {
                aC(viewA);
            } else {
                aD(viewA, 0);
            }
        } else {
            if (this.m == (jfVar.f == -1)) {
                aA(viewA);
            } else {
                aB(viewA, 0);
            }
        }
        jz jzVar2 = (jz) viewA.getLayoutParams();
        Rect rectD = this.s.d(viewA);
        int i3 = rectD.left + rectD.right;
        int i4 = rectD.top + rectD.bottom;
        int iAn = jy.an(this.C, this.A, at() + au() + jzVar2.leftMargin + jzVar2.rightMargin + i3, jzVar2.width, W());
        int iAn2 = jy.an(this.D, this.B, av() + as() + jzVar2.topMargin + jzVar2.bottomMargin + i4, jzVar2.height, X());
        if (bc(viewA, iAn, iAn2, jzVar2)) {
            viewA.measure(iAn, iAn2);
        }
        jeVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (Z()) {
                iC = this.C - au();
                iC2 = iC - this.l.c(viewA);
            } else {
                int iAt = at();
                iC = this.l.c(viewA) + iAt;
                iC2 = iAt;
            }
            if (jfVar.f == -1) {
                i2 = jfVar.b;
                iAv = i2 - jeVar.a;
            } else {
                iAv = jfVar.b;
                i2 = jeVar.a + iAv;
            }
        } else {
            iAv = av();
            int iC3 = this.l.c(viewA) + iAv;
            if (jfVar.f == -1) {
                iC = jfVar.b;
                i = iC - jeVar.a;
            } else {
                i = jfVar.b;
                iC = jeVar.a + i;
            }
            int i5 = i;
            i2 = iC3;
            iC2 = i5;
        }
        bm(viewA, iC2, iAv, iC, i2);
        if (jzVar.c() || jzVar.b()) {
            jeVar.c = true;
        }
        jeVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.jy
    public void m(kc kcVar, kj kjVar, vw vwVar) {
        super.m(kcVar, kjVar, vwVar);
        jr jrVar = this.s.m;
        if (jrVar == null || jrVar.a() <= 0) {
            return;
        }
        vwVar.d(vv.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    @Override // defpackage.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(defpackage.kc r14, defpackage.kj r15) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.o(kc, kj):void");
    }

    @Override // defpackage.jy
    public void p(kj kjVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void r(boolean z) {
        O(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aR();
    }

    @Override // defpackage.jy
    public boolean t(int i, Bundle bundle) {
        int iMin;
        if (super.t(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                iMin = Math.min(i2, b(recyclerView.f, recyclerView.K) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                iMin = Math.min(i3, a(recyclerView2.f, recyclerView2.K) - 1);
            }
            if (iMin >= 0) {
                aj(iMin);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jy
    public boolean u() {
        return this.p == null && this.b == this.d;
    }

    public void v(kj kjVar, jf jfVar, iu iuVar) {
        int i = jfVar.d;
        if (i < 0 || i >= kjVar.a()) {
            return;
        }
        iuVar.a(i, Math.max(0, jfVar.g));
    }

    public LinearLayoutManager() {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new jd();
        this.f = new je();
        this.g = 2;
        this.h = new int[2];
        U(1);
        V(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new jd();
        this.f = new je();
        this.g = 2;
        this.h = new int[2];
        jx jxVarAw = aw(context, attributeSet, i, i2);
        U(jxVarAw.a);
        V(jxVarAw.c);
        r(jxVarAw.d);
    }

    @Override // defpackage.jy
    public final void ai(RecyclerView recyclerView) {
    }

    public void l(kc kcVar, kj kjVar, jd jdVar, int i) {
    }
}
