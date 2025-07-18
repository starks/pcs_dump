package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fy extends ff implements SubMenu {
    public final ff k;
    public final fh l;

    public fy(Context context, ff ffVar, fh fhVar) {
        super(context);
        this.k = ffVar;
        this.l = fhVar;
    }

    @Override // defpackage.ff
    public final ff a() {
        return this.k.a();
    }

    @Override // defpackage.ff
    public final String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.ff
    public final void p(fd fdVar) {
        this.k.p(fdVar);
    }

    @Override // defpackage.ff, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.ff, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.ff
    public final boolean t(fh fhVar) {
        return this.k.t(fhVar);
    }

    @Override // defpackage.ff
    public final boolean u(ff ffVar, MenuItem menuItem) {
        return super.u(ffVar, menuItem) || this.k.u(ffVar, menuItem);
    }

    @Override // defpackage.ff
    public final boolean v(fh fhVar) {
        return this.k.v(fhVar);
    }

    @Override // defpackage.ff
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.ff
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.ff
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }
}
