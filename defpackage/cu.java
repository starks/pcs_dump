package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cu implements eh {
    final /* synthetic */ de a;
    private final eh b;

    public cu(de deVar, eh ehVar) {
        this.a = deVar;
        this.b = ehVar;
    }

    @Override // defpackage.eh
    public final void a(ei eiVar) {
        this.b.a(eiVar);
        de deVar = this.a;
        if (deVar.p != null) {
            deVar.i.getDecorView().removeCallbacks(this.a.q);
        }
        de deVar2 = this.a;
        if (deVar2.o != null) {
            deVar2.C();
            de deVar3 = this.a;
            fsc fscVarO = ut.o(deVar3.o);
            fscVarO.al(0.0f);
            deVar3.H = fscVarO;
            this.a.H.an(new ct(this));
        }
        de deVar4 = this.a;
        deVar4.n = null;
        ViewGroup viewGroup = deVar4.s;
        int[] iArr = ut.a;
        ul.b(viewGroup);
        this.a.G();
    }

    @Override // defpackage.eh
    public final boolean b(ei eiVar, MenuItem menuItem) {
        return this.b.b(eiVar, menuItem);
    }

    @Override // defpackage.eh
    public final boolean c(ei eiVar, Menu menu) {
        return this.b.c(eiVar, menu);
    }

    @Override // defpackage.eh
    public final boolean d(ei eiVar, Menu menu) {
        ViewGroup viewGroup = this.a.s;
        int[] iArr = ut.a;
        ul.b(viewGroup);
        return this.b.d(eiVar, menu);
    }
}
