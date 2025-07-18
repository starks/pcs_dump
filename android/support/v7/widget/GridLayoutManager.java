package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.brb;
import defpackage.iu;
import defpackage.ix;
import defpackage.iy;
import defpackage.iz;
import defpackage.jd;
import defpackage.je;
import defpackage.jf;
import defpackage.jr;
import defpackage.jy;
import defpackage.jz;
import defpackage.kc;
import defpackage.kj;
import defpackage.vv;
import defpackage.vw;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    final iz g;
    final Rect h;
    int i;
    int j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        ix ixVar = new ix();
        this.g = ixVar;
        this.h = new Rect();
        this.H = -1;
        this.i = -1;
        this.j = -1;
        int i3 = aw(context, attributeSet, i, i2).b;
        if (i3 == this.b) {
            return;
        }
        this.a = true;
        if (i3 <= 0) {
            throw new IllegalArgumentException(a.x(i3, "Span count should be at least 1. Provided "));
        }
        this.b = i3;
        ixVar.b();
        aR();
    }

    private final void bA(View view, int i, boolean z) {
        int iAn;
        int iAn2;
        iy iyVar = (iy) view.getLayoutParams();
        Rect rect = iyVar.d;
        int i2 = rect.top + rect.bottom + iyVar.topMargin + iyVar.bottomMargin;
        int i3 = rect.left + rect.right + iyVar.leftMargin + iyVar.rightMargin;
        int iC = c(iyVar.a, iyVar.b);
        if (this.k == 1) {
            iAn2 = an(iC, i, i3, iyVar.width, false);
            iAn = an(this.l.k(), this.B, i2, iyVar.height, true);
        } else {
            int iAn3 = an(iC, i, i2, iyVar.height, false);
            int iAn4 = an(this.l.k(), this.A, i3, iyVar.width, true);
            iAn = iAn3;
            iAn2 = iAn4;
        }
        bB(view, iAn2, iAn, z);
    }

    private final void bB(View view, int i, int i2, boolean z) {
        boolean zBc;
        jz jzVar = (jz) view.getLayoutParams();
        if (z) {
            zBc = true;
            if (this.w && jy.aZ(view.getMeasuredWidth(), i, jzVar.width) && jy.aZ(view.getMeasuredHeight(), i2, jzVar.height)) {
                zBc = false;
            }
        } else {
            zBc = bc(view, i, i2, jzVar);
        }
        if (zBc) {
            view.measure(i, i2);
        }
    }

    private final void bC() {
        int iAs;
        int iAv;
        if (this.k == 1) {
            iAs = this.C - au();
            iAv = at();
        } else {
            iAs = this.D - as();
            iAv = av();
        }
        by(iAs - iAv);
    }

    private final int bq(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.s;
            return bs(recyclerView.f, recyclerView.K, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bt(recyclerView2.f, recyclerView2.K, i);
    }

    private final int br(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.s;
            return bs(recyclerView.f, recyclerView.K, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bt(recyclerView2.f, recyclerView2.K, i);
    }

    private final int bs(kc kcVar, kj kjVar, int i) {
        if (!kjVar.g) {
            return iz.c(i, this.b);
        }
        int iA = kcVar.a(i);
        if (iA != -1) {
            return iz.c(iA, this.b);
        }
        Log.w("GridLayoutManager", a.x(i, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private final int bt(kc kcVar, kj kjVar, int i) {
        if (!kjVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = kcVar.a(i);
        if (iA != -1) {
            return iA % this.b;
        }
        Log.w("GridLayoutManager", a.x(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bu(kc kcVar, kj kjVar, int i) {
        if (!kjVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (kcVar.a(i) == -1) {
            Log.w("GridLayoutManager", a.x(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        }
        return 1;
    }

    private final Set bv(int i) {
        return bx(bq(i), i);
    }

    private final Set bw(int i) {
        return bx(br(i), i);
    }

    private final Set bx(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int iBu = bu(recyclerView.f, recyclerView.K, i2);
        for (int i3 = i; i3 < i + iBu; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void by(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bz() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    @Override // defpackage.jy
    public final void A(int i, int i2) {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.jy
    public final int a(kc kcVar, kj kjVar) {
        if (this.k == 1) {
            return Math.min(this.b, ao());
        }
        if (kjVar.a() <= 0) {
            return 0;
        }
        return bs(kcVar, kjVar, kjVar.a() - 1) + 1;
    }

    @Override // defpackage.jy
    public final int b(kc kcVar, kj kjVar) {
        if (this.k == 0) {
            return Math.min(this.b, ao());
        }
        if (kjVar.a() <= 0) {
            return 0;
        }
        return bs(kcVar, kjVar, kjVar.a() - 1) + 1;
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !Z()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final int d(int i, kc kcVar, kj kjVar) {
        bC();
        bz();
        return super.d(i, kcVar, kjVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final int e(int i, kc kcVar, kj kjVar) {
        bC();
        bz();
        return super.e(i, kcVar, kjVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final jz f() {
        return this.k == 0 ? new iy(-2, -1) : new iy(-1, -2);
    }

    @Override // defpackage.jy
    public final jz g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new iy((ViewGroup.MarginLayoutParams) layoutParams) : new iy(layoutParams);
    }

    @Override // defpackage.jy
    public final jz h(Context context, AttributeSet attributeSet) {
        return new iy(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(kc kcVar, kj kjVar, boolean z, boolean z2) {
        int i;
        int iAm;
        int i2;
        int iAm2 = am();
        if (z2) {
            i = -1;
            iAm = am() - 1;
            i2 = -1;
        } else {
            i = iAm2;
            iAm = 0;
            i2 = 1;
        }
        int iA = kjVar.a();
        Q();
        int iJ = this.l.j();
        int iF = this.l.f();
        View view = null;
        View view2 = null;
        while (iAm != i) {
            View viewAy = ay(iAm);
            int iBk = bk(viewAy);
            if (iBk >= 0 && iBk < iA && bt(kcVar, kjVar, iBk) == 0) {
                if (((jz) viewAy.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewAy;
                    }
                } else {
                    if (this.l.d(viewAy) < iF && this.l.a(viewAy) >= iJ) {
                        return viewAy;
                    }
                    if (view == null) {
                        view = viewAy;
                    }
                }
            }
            iAm += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r23, int r24, defpackage.kc r25, defpackage.kj r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.j(android.view.View, int, kc, kj):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void k(kc kcVar, kj kjVar, jf jfVar, je jeVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int iC2;
        int iAt;
        int i4;
        int iAn;
        int iAn2;
        boolean z;
        View viewA;
        int i5 = this.l.i();
        int i6 = am() > 0 ? this.c[this.b] : 0;
        boolean z2 = i5 != 1073741824;
        if (z2) {
            bC();
        }
        int i7 = jfVar.e;
        int iBt = this.b;
        if (i7 != 1) {
            iBt = bt(kcVar, kjVar, jfVar.d) + bu(kcVar, kjVar, jfVar.d);
        }
        int i8 = 0;
        while (i8 < this.b && jfVar.d(kjVar) && iBt > 0) {
            int i9 = jfVar.d;
            int iBu = bu(kcVar, kjVar, i9);
            if (iBu > this.b) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iBu + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBt -= iBu;
            if (iBt < 0 || (viewA = jfVar.a(kcVar)) == null) {
                break;
            }
            this.d[i8] = viewA;
            i8++;
        }
        if (i8 == 0) {
            jeVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = 1;
            i2 = i8;
            i = 0;
        } else {
            i = i8 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i10 = 0;
        while (i != i2) {
            View view = this.d[i];
            iy iyVar = (iy) view.getLayoutParams();
            int iBu2 = bu(kcVar, kjVar, bk(view));
            iyVar.b = iBu2;
            iyVar.a = i10;
            i10 += iBu2;
            i += i3;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.d[i12];
            if (jfVar.l != null) {
                z = false;
                if (i7 == 1) {
                    aA(view2);
                } else {
                    aB(view2, 0);
                }
            } else if (i7 == 1) {
                aC(view2);
                z = false;
            } else {
                z = false;
                aD(view2, 0);
            }
            aE(view2, this.h);
            bA(view2, i5, z);
            int iB = this.l.b(view2);
            if (iB > i11) {
                i11 = iB;
            }
            float fC = this.l.c(view2) / ((iy) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            by(Math.max(Math.round(f * this.b), i6));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.d[i13];
                bA(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i11) {
                    i11 = iB2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.d[i14];
            if (this.l.b(view4) != i11) {
                iy iyVar2 = (iy) view4.getLayoutParams();
                Rect rect = iyVar2.d;
                int i15 = rect.top + rect.bottom + iyVar2.topMargin + iyVar2.bottomMargin;
                int i16 = rect.left + rect.right + iyVar2.leftMargin + iyVar2.rightMargin;
                int iC3 = c(iyVar2.a, iyVar2.b);
                if (this.k == 1) {
                    iAn2 = an(iC3, 1073741824, i16, iyVar2.width, false);
                    iAn = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iAn = an(iC3, 1073741824, i15, iyVar2.height, false);
                    iAn2 = iMakeMeasureSpec;
                }
                bB(view4, iAn2, iAn, true);
            }
        }
        jeVar.a = i11;
        if (this.k == 1) {
            if (jfVar.f == -1) {
                int i17 = jfVar.b;
                i4 = i17 - i11;
                iC2 = i17;
            } else {
                i4 = jfVar.b;
                iC2 = i4 + i11;
            }
            iAt = 0;
            iC = 0;
        } else {
            if (jfVar.f == -1) {
                int i18 = jfVar.b;
                iAt = i18 - i11;
                iC2 = 0;
                iC = i18;
            } else {
                int i19 = jfVar.b;
                iC = i19 + i11;
                iC2 = 0;
                iAt = i19;
            }
            i4 = iC2;
        }
        for (int i20 = 0; i20 < i8; i20++) {
            View view5 = this.d[i20];
            iy iyVar3 = (iy) view5.getLayoutParams();
            if (this.k != 1) {
                int iAv = av() + this.c[iyVar3.a];
                i4 = iAv;
                iC2 = this.l.c(view5) + iAv;
            } else if (Z()) {
                int iAt2 = at() + this.c[this.b - iyVar3.a];
                iC = iAt2;
                iAt = iAt2 - this.l.c(view5);
            } else {
                iAt = at() + this.c[iyVar3.a];
                iC = this.l.c(view5) + iAt;
            }
            bm(view5, iAt, i4, iC, iC2);
            if (iyVar3.c() || iyVar3.b()) {
                jeVar.c = true;
            }
            jeVar.d = view5.hasFocusable() | jeVar.d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(kc kcVar, kj kjVar, jd jdVar, int i) {
        bC();
        if (kjVar.a() > 0 && !kjVar.g) {
            int iBt = bt(kcVar, kjVar, jdVar.b);
            if (i == 1) {
                while (iBt > 0) {
                    int i2 = jdVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    jdVar.b = i3;
                    iBt = bt(kcVar, kjVar, i3);
                }
            } else {
                int iA = kjVar.a() - 1;
                int i4 = jdVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBt2 = bt(kcVar, kjVar, i5);
                    if (iBt2 <= iBt) {
                        break;
                    }
                    i4 = i5;
                    iBt = iBt2;
                }
                jdVar.b = i4;
            }
        }
        bz();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final void m(kc kcVar, kj kjVar, vw vwVar) {
        super.m(kcVar, kjVar, vwVar);
        vwVar.f(GridView.class.getName());
        jr jrVar = this.s.m;
        if (jrVar == null || jrVar.a() <= 1) {
            return;
        }
        vwVar.d(vv.i);
    }

    @Override // defpackage.jy
    public final void n(kc kcVar, kj kjVar, View view, vw vwVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof iy)) {
            super.aK(view, vwVar);
            return;
        }
        iy iyVar = (iy) layoutParams;
        int iBs = bs(kcVar, kjVar, iyVar.a());
        if (this.k == 0) {
            vwVar.g(brb.m(iyVar.a, iyVar.b, iBs, 1));
        } else {
            vwVar.g(brb.m(iBs, 1, iyVar.a, iyVar.b));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final void o(kc kcVar, kj kjVar) {
        if (kjVar.g) {
            int iAm = am();
            for (int i = 0; i < iAm; i++) {
                iy iyVar = (iy) ay(i).getLayoutParams();
                int iA = iyVar.a();
                this.e.put(iA, iyVar.b);
                this.f.put(iA, iyVar.a);
            }
        }
        super.o(kcVar, kjVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final void p(kj kjVar) {
        View viewN;
        super.p(kjVar);
        this.a = false;
        int i = this.H;
        if (i == -1 || (viewN = N(i)) == null) {
            return;
        }
        viewN.sendAccessibilityEvent(67108864);
        this.H = -1;
    }

    @Override // defpackage.jy
    public final void q(Rect rect, int i, int i2) {
        int iAl;
        int iAl2;
        if (this.c == null) {
            super.q(rect, i, i2);
        }
        int iAt = at() + au();
        int iAv = av() + as();
        if (this.k == 1) {
            iAl2 = al(i2, rect.height() + iAv, aq());
            iAl = al(i, this.c[r7.length - 1] + iAt, ar());
        } else {
            iAl = al(i, rect.width() + iAt, ar());
            iAl2 = al(i2, this.c[r5.length - 1] + iAv, aq());
        }
        aV(iAl, iAl2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void r(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r(false);
    }

    @Override // defpackage.jy
    public final boolean s(jz jzVar) {
        return jzVar instanceof iy;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259 A[EDGE_INSN: B:194:0x0259->B:153:0x0259 BREAK  A[LOOP:2: B:117:0x019c->B:126:0x01c6, LOOP_LABEL: LOOP:2: B:117:0x019c->B:126:0x01c6], EDGE_INSN: B:200:0x0259->B:153:0x0259 BREAK  A[LOOP:5: B:135:0x01fe->B:146:0x022d, LOOP_LABEL: LOOP:5: B:135:0x01fe->B:146:0x022d]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.t(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.jy
    public final boolean u() {
        return this.p == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void v(kj kjVar, jf jfVar, iu iuVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && jfVar.d(kjVar) && i > 0; i2++) {
            iuVar.a(jfVar.d, Math.max(0, jfVar.g));
            i--;
            jfVar.d += jfVar.e;
        }
    }

    @Override // defpackage.jy
    public final void w(int i, int i2) {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.jy
    public final void x() {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.jy
    public final void y(int i, int i2) {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.jy
    public final void z(int i, int i2) {
        this.g.b();
        this.g.a();
    }
}
