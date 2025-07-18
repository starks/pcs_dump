package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aby extends tp {
    final /* synthetic */ abz a;

    public aby(abz abzVar) {
        this.a = abzVar;
    }

    @Override // defpackage.tp
    public final void b(View view, vw vwVar) {
        this.a.e.b(view, vwVar);
        km kmVarG = RecyclerView.g(view);
        int iA = kmVarG != null ? kmVarG.a() : -1;
        jr jrVar = this.a.d.m;
        if (jrVar instanceof abs) {
            ((abs) jrVar).b(iA);
        }
    }

    @Override // defpackage.tp
    public final boolean h(View view, int i, Bundle bundle) {
        return this.a.e.h(view, i, bundle);
    }
}
