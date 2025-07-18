package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jp extends jq {
    public jp(jy jyVar) {
        super(jyVar);
    }

    @Override // defpackage.jq
    public final int a(View view) {
        return jy.be(view) + ((jz) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.jq
    public final int b(View view) {
        jz jzVar = (jz) view.getLayoutParams();
        return jy.bg(view) + jzVar.topMargin + jzVar.bottomMargin;
    }

    @Override // defpackage.jq
    public final int c(View view) {
        jz jzVar = (jz) view.getLayoutParams();
        return jy.bh(view) + jzVar.leftMargin + jzVar.rightMargin;
    }

    @Override // defpackage.jq
    public final int d(View view) {
        return jy.bj(view) - ((jz) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.jq
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.jq
    public final int f() {
        jy jyVar = this.a;
        return jyVar.D - jyVar.as();
    }

    @Override // defpackage.jq
    public final int g() {
        return this.a.as();
    }

    @Override // defpackage.jq
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.jq
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.jq
    public final int j() {
        return this.a.av();
    }

    @Override // defpackage.jq
    public final int k() {
        jy jyVar = this.a;
        return (jyVar.D - jyVar.av()) - this.a.as();
    }

    @Override // defpackage.jq
    public final int l(View view) {
        this.a.bl(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.jq
    public final int m(View view) {
        this.a.bl(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.jq
    public final void n(int i) {
        this.a.aJ(i);
    }
}
