package defpackage;

import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vs {
    public static final vs a = vo.d;
    public final vp b;

    private vs(WindowInsets windowInsets) {
        this.b = new vo(this, windowInsets);
    }

    static rz h(rz rzVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, rzVar.b - i);
        int iMax2 = Math.max(0, rzVar.c - i2);
        int iMax3 = Math.max(0, rzVar.d - i3);
        int iMax4 = Math.max(0, rzVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? rzVar : rz.c(iMax, iMax2, iMax3, iMax4);
    }

    public static vs m(WindowInsets windowInsets) {
        return n(windowInsets, null);
    }

    public static vs n(WindowInsets windowInsets, View view) {
        un.y(windowInsets);
        vs vsVar = new vs(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = ut.a;
            vsVar.p(uo.a(view));
            vsVar.o(view.getRootView());
            vsVar.q(view.getWindowSystemUiVisibility());
        }
        return vsVar;
    }

    @Deprecated
    public final int a() {
        return this.b.c().e;
    }

    @Deprecated
    public final int b() {
        return this.b.c().b;
    }

    @Deprecated
    public final int c() {
        return this.b.c().d;
    }

    @Deprecated
    public final int d() {
        return this.b.c().c;
    }

    public final WindowInsets e() {
        vp vpVar = this.b;
        if (vpVar instanceof vj) {
            return ((vj) vpVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vs) {
            return Objects.equals(this.b, ((vs) obj).b);
        }
        return false;
    }

    public final rz f(int i) {
        return this.b.a(i);
    }

    @Deprecated
    public final rz g() {
        return this.b.l();
    }

    public final int hashCode() {
        vp vpVar = this.b;
        if (vpVar == null) {
            return 0;
        }
        return vpVar.hashCode();
    }

    @Deprecated
    public final vs i() {
        return this.b.q();
    }

    @Deprecated
    public final vs j() {
        return this.b.m();
    }

    @Deprecated
    public final vs k() {
        return this.b.n();
    }

    public final vs l(int i, int i2, int i3, int i4) {
        return this.b.d(i, i2, i3, i4);
    }

    final void o(View view) {
        this.b.e(view);
    }

    final void p(vs vsVar) {
        this.b.h(vsVar);
    }

    final void q(int i) {
        this.b.i(i);
    }

    public final boolean r() {
        return this.b.o();
    }

    public vs(vs vsVar) {
        this.b = new vp(this);
    }
}
