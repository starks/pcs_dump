package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ke extends a {
    final /* synthetic */ RecyclerView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(RecyclerView recyclerView) {
        super(null);
        this.a = recyclerView;
    }

    final void J() {
        RecyclerView recyclerView = this.a;
        recyclerView.x = true;
        recyclerView.requestLayout();
    }

    @Override // defpackage.a
    public final void n() {
        this.a.q(null);
        RecyclerView recyclerView = this.a;
        recyclerView.K.f = true;
        recyclerView.O(true);
        if (this.a.h.l()) {
            return;
        }
        this.a.requestLayout();
    }

    @Override // defpackage.a
    public final void o(int i, int i2, Object obj) {
        this.a.q(null);
        gq gqVar = this.a.h;
        if (i2 <= 0) {
            return;
        }
        gqVar.a.add(gqVar.c(4, i, i2, obj));
        gqVar.c |= 4;
        if (gqVar.a.size() == 1) {
            J();
        }
    }

    @Override // defpackage.a
    public final void p(int i, int i2) {
        this.a.q(null);
        gq gqVar = this.a.h;
        if (i2 <= 0) {
            return;
        }
        gqVar.a.add(gqVar.c(1, i, i2, null));
        gqVar.c |= 1;
        if (gqVar.a.size() == 1) {
            J();
        }
    }

    @Override // defpackage.a
    public final void q(int i, int i2) {
        this.a.q(null);
        gq gqVar = this.a.h;
        if (i2 <= 0) {
            return;
        }
        gqVar.a.add(gqVar.c(2, i, i2, null));
        gqVar.c |= 2;
        if (gqVar.a.size() == 1) {
            J();
        }
    }

    @Override // defpackage.a
    public final void r(int i, int i2) {
        this.a.q(null);
        gq gqVar = this.a.h;
        if (i == i2) {
            return;
        }
        gqVar.a.add(gqVar.c(8, i, i2, null));
        gqVar.c |= 8;
        if (gqVar.a.size() == 1) {
            J();
        }
    }
}
