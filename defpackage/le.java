package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class le implements fd {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public le(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.fd
    public final void F(ff ffVar) {
        if (this.b == 0) {
            if (((Toolbar) this.a).a.m()) {
                return;
            }
            ((Toolbar) this.a).z.u(ffVar);
        } else {
            fd fdVar = ((ActionMenuView) this.a).d;
            if (fdVar != null) {
                fdVar.F(ffVar);
            }
        }
    }

    @Override // defpackage.fd
    public final boolean J(ff ffVar, MenuItem menuItem) {
        fuu fuuVar;
        return (this.b == 0 || (fuuVar = ((ActionMenuView) this.a).e) == null || !((Toolbar) fuuVar.a).z.v(menuItem)) ? false : true;
    }
}
