package com.google.android.material.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.cke;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean e;

    public SearchBar$ScrollingViewBehavior() {
        this.e = false;
    }

    @Override // defpackage.cka
    public final boolean J() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ckc, defpackage.qy
    public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.j(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.qy
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
        super.o(coordinatorLayout, view, view2);
        if (this.e || !(view2 instanceof AppBarLayout)) {
            return;
        }
        this.e = true;
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        appBarLayout.setBackgroundColor(0);
        cke.a(appBarLayout, 0.0f);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.qy
    public final /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return super.q(coordinatorLayout, view, i, i2, i3);
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
