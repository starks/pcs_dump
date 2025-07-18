package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ad extends aj implements rn, ro, br, bs, aad, ml, mt, aey, ba, tu {
    final /* synthetic */ ae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ae aeVar) {
        super(aeVar, aeVar, new Handler());
        this.a = aeVar;
    }

    @Override // defpackage.yz
    public final yw E() {
        return this.a.a;
    }

    @Override // defpackage.aj, defpackage.ag
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.aey
    public final fsc aj() {
        return this.a.aj();
    }

    @Override // defpackage.aad
    public final fsc ak() {
        return this.a.ak();
    }

    @Override // defpackage.aj, defpackage.ag
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.aj
    public final LayoutInflater c() {
        ae aeVar = this.a;
        return aeVar.getLayoutInflater().cloneInContext(aeVar);
    }

    @Override // defpackage.ml
    public final mk d() {
        return this.a.d();
    }

    @Override // defpackage.mt
    public final ms e() {
        return this.a.g;
    }

    @Override // defpackage.aj
    public final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.rn
    public final void g(tj tjVar) {
        this.a.g(tjVar);
    }

    @Override // defpackage.br
    public final void h(tj tjVar) {
        this.a.h(tjVar);
    }

    @Override // defpackage.bs
    public final void i(tj tjVar) {
        this.a.i(tjVar);
    }

    @Override // defpackage.ro
    public final void j(tj tjVar) {
        this.a.j(tjVar);
    }

    @Override // defpackage.aj
    public final void k() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.rn
    public final void l(tj tjVar) {
        this.a.l(tjVar);
    }

    @Override // defpackage.br
    public final void m(tj tjVar) {
        this.a.m(tjVar);
    }

    @Override // defpackage.bs
    public final void n(tj tjVar) {
        this.a.n(tjVar);
    }

    @Override // defpackage.ro
    public final void o(tj tjVar) {
        this.a.o(tjVar);
    }

    @Override // defpackage.aj
    public final void q(PrintWriter printWriter, String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }

    @Override // defpackage.tu
    public final void r(fuu fuuVar) {
        this.a.r(fuuVar);
    }

    @Override // defpackage.tu
    public final void s(fuu fuuVar) {
        this.a.s(fuuVar);
    }

    @Override // defpackage.ba
    public final void p() {
    }
}
