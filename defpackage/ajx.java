package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajx implements ua {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ajx(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.ua
    public final vs a(View view, vs vsVar) {
        int i = this.b;
        if (i == 0) {
            rz rzVarF = vsVar.f(655);
            view.setPadding(rzVarF.b, ((lx) this.a).getWindow().getDecorView().getRootWindowInsets().getInsets(1).top, rzVarF.d, rzVarF.e);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            return vs.a;
        }
        if (i != 1) {
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            vs vsVar2 = true != appBarLayout.getFitsSystemWindows() ? null : vsVar;
            if (!Objects.equals(appBarLayout.c, vsVar2)) {
                appBarLayout.c = vsVar2;
                appBarLayout.k();
                appBarLayout.requestLayout();
                return vsVar;
            }
        } else {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, vsVar)) {
                coordinatorLayout.e = vsVar;
                boolean z = vsVar.d() > 0;
                coordinatorLayout.f = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!vsVar.r()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        int[] iArr = ut.a;
                        if (childAt.getFitsSystemWindows() && ((rb) childAt.getLayoutParams()).a != null && vsVar.r()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
        }
        return vsVar;
    }

    public /* synthetic */ ajx(lx lxVar, int i) {
        this.b = i;
        this.a = lxVar;
    }
}
