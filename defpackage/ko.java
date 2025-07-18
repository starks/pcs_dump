package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ko extends tp {
    final RecyclerView a;
    public final kn b;

    public ko(RecyclerView recyclerView) {
        this.a = recyclerView;
        tp tpVarJ = j();
        if (tpVarJ == null || !(tpVarJ instanceof kn)) {
            this.b = new kn(this);
        } else {
            this.b = (kn) tpVarJ;
        }
    }

    @Override // defpackage.tp
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        jy jyVar;
        super.a(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (jyVar = ((RecyclerView) view).n) == null) {
            return;
        }
        jyVar.R(accessibilityEvent);
    }

    @Override // defpackage.tp
    public final void b(View view, vw vwVar) {
        jy jyVar;
        super.b(view, vwVar);
        if (k() || (jyVar = this.a.n) == null) {
            return;
        }
        RecyclerView recyclerView = jyVar.s;
        jyVar.m(recyclerView.f, recyclerView.K, vwVar);
    }

    @Override // defpackage.tp
    public final boolean h(View view, int i, Bundle bundle) {
        jy jyVar;
        if (super.h(view, i, bundle)) {
            return true;
        }
        if (k() || (jyVar = this.a.n) == null) {
            return false;
        }
        return jyVar.t(i, bundle);
    }

    public tp j() {
        return this.b;
    }

    final boolean k() {
        return this.a.ad();
    }
}
