package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes.dex */
class ew {
    final Context a;
    public oc b;

    public ew(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof si)) {
            return menuItem;
        }
        si siVar = (si) menuItem;
        if (this.b == null) {
            this.b = new oc();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(siVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        fm fmVar = new fm(this.a, siVar);
        this.b.put(siVar, fmVar);
        return fmVar;
    }

    static final SubMenu b(SubMenu subMenu) {
        return subMenu;
    }
}
