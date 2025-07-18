package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cq implements ua {
    final /* synthetic */ de a;

    public cq(de deVar) {
        this.a = deVar;
    }

    @Override // defpackage.ua
    public final vs a(View view, vs vsVar) {
        boolean z;
        boolean z2;
        int iD = vsVar.d();
        int iD2 = vsVar.d();
        de deVar = this.a;
        ActionBarContextView actionBarContextView = deVar.o;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) deVar.o.getLayoutParams();
            if (deVar.o.isShown()) {
                if (deVar.F == null) {
                    deVar.F = new Rect();
                    deVar.G = new Rect();
                }
                Rect rect = deVar.F;
                Rect rect2 = deVar.G;
                rect.set(vsVar.b(), vsVar.d(), vsVar.c(), vsVar.a());
                Insets systemWindowInsets = deVar.s.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup = deVar.s;
                int[] iArr = ut.a;
                vs vsVarA = uo.a(viewGroup);
                int iB = vsVarA == null ? 0 : vsVarA.b();
                int iC = vsVarA == null ? 0 : vsVarA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || deVar.t != null) {
                    View view2 = deVar.t;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            deVar.t.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    deVar.t = new View(deVar.h);
                    deVar.t.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    deVar.s.addView(deVar.t, -1, layoutParams);
                }
                View view3 = deVar.t;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = deVar.t;
                    view4.setBackgroundColor((view4.getWindowSystemUiVisibility() & 8192) != 0 ? deVar.h.getColor(R.color.abc_decor_view_status_guard_light) : deVar.h.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!deVar.w && z) {
                    iD2 = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                deVar.o.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = deVar.t;
        if (view5 != null) {
            view5.setVisibility(true == z ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = vsVar.b();
            int iC2 = vsVar.c();
            int iA = vsVar.a();
            brb brbVar = new brb(vsVar);
            brbVar.j(rz.c(iB2, iD2, iC2, iA));
            vsVar = brbVar.i();
        }
        return ut.b(view, vsVar);
    }
}
