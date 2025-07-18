package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ct extends va {
    final /* synthetic */ cu a;

    public ct(cu cuVar) {
        this.a = cuVar;
    }

    @Override // defpackage.va, defpackage.uz
    public final void a() {
        this.a.a.o.setVisibility(8);
        de deVar = this.a.a;
        PopupWindow popupWindow = deVar.p;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (deVar.o.getParent() instanceof View) {
            View view = (View) this.a.a.o.getParent();
            int[] iArr = ut.a;
            ul.b(view);
        }
        this.a.a.o.i();
        this.a.a.H.an(null);
        de deVar2 = this.a.a;
        deVar2.H = null;
        ViewGroup viewGroup = deVar2.s;
        int[] iArr2 = ut.a;
        ul.b(viewGroup);
    }
}
