package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kn extends tp {
    final ko a;
    public final Map b = new WeakHashMap();

    public kn(ko koVar) {
        this.a = koVar;
    }

    @Override // defpackage.tp
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        tp tpVar = (tp) this.b.get(view);
        if (tpVar != null) {
            tpVar.a(view, accessibilityEvent);
        } else {
            super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.tp
    public final void b(View view, vw vwVar) {
        jy jyVar;
        if (this.a.k() || (jyVar = this.a.a.n) == null) {
            super.b(view, vwVar);
            return;
        }
        jyVar.aK(view, vwVar);
        tp tpVar = (tp) this.b.get(view);
        if (tpVar != null) {
            tpVar.b(view, vwVar);
        } else {
            super.b(view, vwVar);
        }
    }

    @Override // defpackage.tp
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        tp tpVar = (tp) this.b.get(view);
        if (tpVar != null) {
            tpVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.tp
    public final void d(View view, int i) {
        tp tpVar = (tp) this.b.get(view);
        if (tpVar != null) {
            tpVar.d(view, i);
        } else {
            super.d(view, i);
        }
    }

    @Override // defpackage.tp
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        tp tpVar = (tp) this.b.get(view);
        if (tpVar != null) {
            tpVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.tp
    public final boolean f(View view, AccessibilityEvent accessibilityEvent) {
        tp tpVar = (tp) this.b.get(view);
        return tpVar != null ? tpVar.f(view, accessibilityEvent) : super.f(view, accessibilityEvent);
    }

    @Override // defpackage.tp
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        tp tpVar = (tp) this.b.get(viewGroup);
        return tpVar != null ? tpVar.g(viewGroup, view, accessibilityEvent) : super.g(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.tp
    public final boolean h(View view, int i, Bundle bundle) {
        if (this.a.k() || this.a.a.n == null) {
            return super.h(view, i, bundle);
        }
        tp tpVar = (tp) this.b.get(view);
        if (tpVar != null) {
            if (tpVar.h(view, i, bundle)) {
                return true;
            }
        } else if (super.h(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.a.a.n.s;
        kc kcVar = recyclerView.f;
        kj kjVar = recyclerView.K;
        return false;
    }

    @Override // defpackage.tp
    public final brb i(View view) {
        tp tpVar = (tp) this.b.get(view);
        return tpVar != null ? tpVar.i(view) : super.i(view);
    }
}
