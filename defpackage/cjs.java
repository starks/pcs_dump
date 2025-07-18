package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjs extends tp {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior d;

    public cjs(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.d = baseBehavior;
    }

    @Override // defpackage.tp
    public final void b(View view, vw vwVar) {
        View viewM;
        super.b(view, vwVar);
        vwVar.f(ScrollView.class.getName());
        if (this.a.f() == 0 || (viewM = AppBarLayout.BaseBehavior.M(this.b)) == null) {
            return;
        }
        AppBarLayout appBarLayout = this.a;
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((cju) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (this.d.F() != (-this.a.f())) {
                    vwVar.d(vv.a);
                    vwVar.i();
                }
                if (this.d.F() != 0) {
                    if (!viewM.canScrollVertically(-1)) {
                        vwVar.d(vv.b);
                        vwVar.i();
                        return;
                    } else {
                        if ((-this.a.b()) != 0) {
                            vwVar.d(vv.b);
                            vwVar.i();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.tp
    public final boolean h(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.i(false);
            return true;
        }
        if (i != 8192) {
            return super.h(view, i, bundle);
        }
        if (this.d.F() != 0) {
            View viewM = AppBarLayout.BaseBehavior.M(this.b);
            if (!viewM.canScrollVertically(-1)) {
                this.a.i(true);
                return true;
            }
            int i2 = -this.a.b();
            if (i2 != 0) {
                this.d.P(this.b, this.a, viewM, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
