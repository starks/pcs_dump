package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jo extends jq {
    public jo(jy jyVar) {
        super(jyVar);
    }

    @Override // defpackage.jq
    public final int a(View view) {
        return jy.bi(view) + ((jz) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.jq
    public final int b(View view) {
        jz jzVar = (jz) view.getLayoutParams();
        return jy.bh(view) + jzVar.leftMargin + jzVar.rightMargin;
    }

    @Override // defpackage.jq
    public final int c(View view) {
        jz jzVar = (jz) view.getLayoutParams();
        return jy.bg(view) + jzVar.topMargin + jzVar.bottomMargin;
    }

    @Override // defpackage.jq
    public final int d(View view) {
        return jy.bf(view) - ((jz) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.jq
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.jq
    public final int f() {
        jy jyVar = this.a;
        return jyVar.C - jyVar.au();
    }

    @Override // defpackage.jq
    public final int g() {
        return this.a.au();
    }

    @Override // defpackage.jq
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.jq
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.jq
    public final int j() {
        return this.a.at();
    }

    @Override // defpackage.jq
    public final int k() {
        jy jyVar = this.a;
        return (jyVar.C - jyVar.at()) - this.a.au();
    }

    @Override // defpackage.jq
    public final int l(View view) {
        this.a.bl(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.jq
    public final int m(View view) {
        this.a.bl(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.jq
    public final void n(int i) {
        this.a.aI(i);
    }
}
