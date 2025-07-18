package defpackage;

import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class vj extends vp {
    final WindowInsets a;
    rz b;
    int c;
    private rz[] d;
    private rz g;
    private vs h;

    public vj(vs vsVar, WindowInsets windowInsets) {
        super(vsVar);
        this.g = null;
        this.a = windowInsets;
    }

    static boolean k(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private rz u(int i, boolean z) {
        rz rzVarB = rz.a;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                rzVarB = rz.b(rzVarB, b(i2, false));
            }
        }
        return rzVarB;
    }

    private rz v() {
        vs vsVar = this.h;
        return vsVar != null ? vsVar.g() : rz.a;
    }

    private rz w(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // defpackage.vp
    public rz a(int i) {
        return u(i, false);
    }

    protected rz b(int i, boolean z) {
        rz rzVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    rz rzVarC = c();
                    rz rzVarV = v();
                    int i2 = rzVarC.e;
                    if (i2 > rzVarV.e || ((rzVar = this.b) != null && !rzVar.equals(rz.a) && (i2 = this.b.e) > rzVarV.e)) {
                        return rz.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return s();
                    }
                    if (i == 32) {
                        return r();
                    }
                    if (i == 64) {
                        return t();
                    }
                    if (i == 128) {
                        vs vsVar = this.h;
                        ts tsVarP = vsVar != null ? vsVar.b.p() : p();
                        if (tsVarP != null) {
                            return rz.c(tsVarP.a.getSafeInsetLeft(), tsVarP.a.getSafeInsetTop(), tsVarP.a.getSafeInsetRight(), tsVarP.a.getSafeInsetBottom());
                        }
                    }
                }
            } else if ((this.c & 2) == 0) {
                rz rzVarC2 = c();
                vs vsVar2 = this.h;
                rz rzVarG = vsVar2 != null ? vsVar2.g() : null;
                int iMin = rzVarC2.e;
                if (rzVarG != null) {
                    iMin = Math.min(iMin, rzVarG.e);
                }
                return rz.c(rzVarC2.b, 0, rzVarC2.d, iMin);
            }
        } else if ((this.c & 4) == 0) {
            return rz.c(0, c().c, 0, 0);
        }
        return rz.a;
    }

    @Override // defpackage.vp
    public final rz c() {
        if (this.g == null) {
            WindowInsets windowInsets = this.a;
            this.g = rz.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.g;
    }

    @Override // defpackage.vp
    public vs d(int i, int i2, int i3, int i4) {
        brb brbVar = new brb(vs.m(this.a));
        brbVar.j(vs.h(c(), i, i2, i3, i4));
        ((vi) brbVar.a).b(vs.h(l(), i, i2, i3, i4));
        return brbVar.i();
    }

    @Override // defpackage.vp
    public void e(View view) {
        rz rzVarW = w(view);
        if (rzVarW == null) {
            rzVarW = rz.a;
        }
        g(rzVarW);
    }

    @Override // defpackage.vp
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return Objects.equals(this.b, vjVar.b) && k(this.c, vjVar.c);
    }

    @Override // defpackage.vp
    public void f(rz[] rzVarArr) {
        this.d = null;
    }

    @Override // defpackage.vp
    public void g(rz rzVar) {
        this.b = rzVar;
    }

    @Override // defpackage.vp
    public void h(vs vsVar) {
        this.h = vsVar;
    }

    @Override // defpackage.vp
    public void i(int i) {
        this.c = i;
    }

    @Override // defpackage.vp
    public boolean j() {
        return this.a.isRound();
    }
}
