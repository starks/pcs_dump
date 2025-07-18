package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eu extends is {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.is
    public final fv a() {
        gh ghVar;
        fuu fuuVar = this.a.c;
        if (fuuVar == null || (ghVar = ((gl) fuuVar.a).l) == null) {
            return null;
        }
        return ghVar.a();
    }

    @Override // defpackage.is
    public final boolean b() {
        fv fvVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        fe feVar = actionMenuItemView.b;
        return feVar != null && feVar.b(actionMenuItemView.a) && (fvVarA = a()) != null && fvVarA.u();
    }
}
