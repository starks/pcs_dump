package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahk extends ahc {
    ArrayList u;
    int v;
    boolean w;
    private boolean x;
    private int y;
    private ahc[] z;

    public ahk(byte[] bArr) {
        this();
        O();
        N(new agq(2));
        N(new ago());
        N(new agq(1));
    }

    private final void P(ahc ahcVar) {
        this.u.add(ahcVar);
        ahcVar.g = this;
    }

    private final void Q(ahc[] ahcVarArr) {
        Arrays.fill(ahcVarArr, (Object) null);
        this.z = ahcVarArr;
    }

    private final ahc[] R() {
        ahc[] ahcVarArr = this.z;
        this.z = null;
        if (ahcVarArr == null) {
            ahcVarArr = new ahc[this.u.size()];
        }
        return (ahc[]) this.u.toArray(ahcVarArr);
    }

    @Override // defpackage.ahc
    public final boolean A() {
        for (int i = 0; i < this.u.size(); i++) {
            if (((ahc) this.u.get(i)).A()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahc
    public final /* synthetic */ void D(agz agzVar) {
        super.D(agzVar);
    }

    @Override // defpackage.ahc
    public final /* bridge */ /* synthetic */ void E(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((ahc) this.u.get(i)).E(view);
        }
        super.E(view);
    }

    @Override // defpackage.ahc
    public final /* synthetic */ void F(agz agzVar) {
        super.F(agzVar);
    }

    @Override // defpackage.ahc
    public final /* bridge */ /* synthetic */ void G(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((ahc) this.u.get(i)).G(view);
        }
        super.G(view);
    }

    @Override // defpackage.ahc
    public final /* bridge */ /* synthetic */ void H(long j) {
        ArrayList arrayList;
        this.b = 0L;
        if (this.b < 0 || (arrayList = this.u) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ahc) this.u.get(i)).H(0L);
        }
    }

    @Override // defpackage.ahc
    public final /* bridge */ /* synthetic */ void I() {
        this.y |= 1;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahc) this.u.get(i)).I();
            }
        }
    }

    @Override // defpackage.ahc
    public final void J() {
        this.y |= 2;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((ahc) this.u.get(i)).J();
        }
    }

    @Override // defpackage.ahc
    public final /* synthetic */ void K(long j) {
        this.a = j;
    }

    @Override // defpackage.ahc
    public final void L(us usVar) {
        this.s = usVar;
        this.y |= 8;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((ahc) this.u.get(i)).L(usVar);
        }
    }

    @Override // defpackage.ahc
    public final void M(us usVar) {
        super.M(usVar);
        this.y |= 4;
        if (this.u != null) {
            for (int i = 0; i < this.u.size(); i++) {
                ((ahc) this.u.get(i)).M(usVar);
            }
        }
    }

    public final void N(ahc ahcVar) {
        P(ahcVar);
        if (this.b >= 0) {
            ahcVar.H(0L);
        }
        if ((this.y & 1) != 0) {
            ahcVar.I();
        }
        if ((this.y & 2) != 0) {
            ahcVar.J();
        }
        if ((this.y & 4) != 0) {
            ahcVar.M(this.t);
        }
        if ((this.y & 8) != 0) {
            ahcVar.L(this.s);
        }
    }

    public final void O() {
        this.x = false;
    }

    @Override // defpackage.ahc
    public final void b(ahl ahlVar) {
        if (C(ahlVar.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ahc ahcVar = (ahc) arrayList.get(i);
                if (ahcVar.C(ahlVar.b)) {
                    ahcVar.b(ahlVar);
                    ahlVar.c.add(ahcVar);
                }
            }
        }
    }

    @Override // defpackage.ahc
    public final void c(ahl ahlVar) {
        if (C(ahlVar.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ahc ahcVar = (ahc) arrayList.get(i);
                if (ahcVar.C(ahlVar.b)) {
                    ahcVar.c(ahlVar);
                    ahlVar.c.add(ahcVar);
                }
            }
        }
    }

    @Override // defpackage.ahc
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.ahc
    public final boolean d() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            if (!((ahc) this.u.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.u.size();
    }

    public final ahc g(int i) {
        if (i < 0 || i >= this.u.size()) {
            return null;
        }
        return (ahc) this.u.get(i);
    }

    @Override // defpackage.ahc
    /* renamed from: i */
    public final ahc clone() {
        ahk ahkVar = (ahk) super.clone();
        ahkVar.u = new ArrayList();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ahkVar.P(((ahc) this.u.get(i)).clone());
        }
        return ahkVar;
    }

    @Override // defpackage.ahc
    public final String m(String str) {
        String strM = super.m(str);
        for (int i = 0; i < this.u.size(); i++) {
            strM = strM + "\n" + ((ahc) this.u.get(i)).m(String.valueOf(str).concat("  "));
        }
        return strM;
    }

    @Override // defpackage.ahc
    public final void n() {
        super.n();
        ahc[] ahcVarArrR = R();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ahcVarArrR[i].n();
        }
        Q(ahcVarArrR);
    }

    @Override // defpackage.ahc
    public final void o(ahl ahlVar) {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((ahc) this.u.get(i)).o(ahlVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.ahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(android.view.ViewGroup r13, defpackage.ahm r14, defpackage.ahm r15, java.util.ArrayList r16, java.util.ArrayList r17) {
        /*
            r12 = this;
            long r0 = r12.a
            java.util.ArrayList r2 = r12.u
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L3d
            java.util.ArrayList r5 = r12.u
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            ahc r6 = (defpackage.ahc) r6
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            boolean r5 = r12.x
            if (r5 != 0) goto L22
            if (r4 != 0) goto L30
            r4 = r3
        L22:
            long r9 = r6.a
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2d
            long r9 = r9 + r0
            r6.K(r9)
            goto L30
        L2d:
            r6.K(r0)
        L30:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.r(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto La
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahk.r(android.view.ViewGroup, ahm, ahm, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // defpackage.ahc
    public final void u(View view) {
        super.u(view);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((ahc) this.u.get(i)).u(view);
        }
    }

    @Override // defpackage.ahc
    public final void v() {
        this.p = 0L;
        ahi ahiVar = new ahi(this);
        for (int i = 0; i < this.u.size(); i++) {
            ahc ahcVar = (ahc) this.u.get(i);
            ahcVar.D(ahiVar);
            ahcVar.v();
            long j = ahcVar.p;
            if (this.x) {
                this.p = Math.max(this.p, j);
            } else {
                long j2 = this.p;
                ahcVar.r = j2;
                this.p = j2 + j;
            }
        }
    }

    @Override // defpackage.ahc
    public final void w(View view) {
        super.w(view);
        ahc[] ahcVarArrR = R();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ahcVarArrR[i].w(view);
        }
        Q(ahcVarArrR);
    }

    @Override // defpackage.ahc
    protected final void x() {
        if (this.u.isEmpty()) {
            z();
            s();
            return;
        }
        ahj ahjVar = new ahj(this);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ahc) arrayList.get(i)).D(ahjVar);
        }
        this.v = this.u.size();
        if (this.x) {
            ArrayList arrayList2 = this.u;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ahc) arrayList2.get(i2)).x();
            }
            return;
        }
        for (int i3 = 1; i3 < this.u.size(); i3++) {
            ((ahc) this.u.get(i3 - 1)).D(new ahh((ahc) this.u.get(i3)));
        }
        ahc ahcVar = (ahc) this.u.get(0);
        if (ahcVar != null) {
            ahcVar.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahk.y(long, long):void");
    }

    public ahk() {
        this.u = new ArrayList();
        this.x = true;
        this.w = false;
        this.y = 0;
    }
}
