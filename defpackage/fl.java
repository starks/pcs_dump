package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fl implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ fm a;
    private final MenuItem.OnMenuItemClickListener b;

    public fl(fm fmVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = fmVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
