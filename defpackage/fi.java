package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fi extends un implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int c = 0;
    public final ActionProvider a;
    final /* synthetic */ fm b;
    private fuu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(fm fmVar, Context context, ActionProvider actionProvider) {
        super(null);
        this.b = fmVar;
        this.a = actionProvider;
    }

    @Override // defpackage.un
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.un
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(fm.b(subMenu));
    }

    @Override // defpackage.un
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.un
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.un
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.un
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.un
    public final void g(fuu fuuVar) {
        this.d = fuuVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        fuu fuuVar = this.d;
        if (fuuVar != null) {
            ((fh) fuuVar.a).j.C();
        }
    }
}
