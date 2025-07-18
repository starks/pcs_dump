package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jw implements ln {
    final /* synthetic */ jy a;
    private final /* synthetic */ int b;

    public jw(jy jyVar, int i) {
        this.b = i;
        this.a = jyVar;
    }

    @Override // defpackage.ln
    public final int a(View view) {
        int iBe;
        int i;
        if (this.b != 0) {
            jz jzVar = (jz) view.getLayoutParams();
            iBe = jy.bi(view);
            i = jzVar.rightMargin;
        } else {
            jz jzVar2 = (jz) view.getLayoutParams();
            iBe = jy.be(view);
            i = jzVar2.bottomMargin;
        }
        return iBe + i;
    }

    @Override // defpackage.ln
    public final int b(View view) {
        int iBj;
        int i;
        if (this.b != 0) {
            jz jzVar = (jz) view.getLayoutParams();
            iBj = jy.bf(view);
            i = jzVar.leftMargin;
        } else {
            jz jzVar2 = (jz) view.getLayoutParams();
            iBj = jy.bj(view);
            i = jzVar2.topMargin;
        }
        return iBj - i;
    }

    @Override // defpackage.ln
    public final int c() {
        int i;
        int iAs;
        int i2 = this.b;
        jy jyVar = this.a;
        if (i2 != 0) {
            i = jyVar.C;
            iAs = jyVar.au();
        } else {
            i = jyVar.D;
            iAs = jyVar.as();
        }
        return i - iAs;
    }

    @Override // defpackage.ln
    public final int d() {
        int i = this.b;
        jy jyVar = this.a;
        return i != 0 ? jyVar.at() : jyVar.av();
    }

    @Override // defpackage.ln
    public final View e(int i) {
        int i2 = this.b;
        jy jyVar = this.a;
        return i2 != 0 ? jyVar.ay(i) : jyVar.ay(i);
    }
}
