package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ek extends ei implements fd {
    public final ff a;
    private final Context b;
    private final ActionBarContextView c;
    private final eh f;
    private WeakReference g;
    private boolean h;

    public ek(Context context, ActionBarContextView actionBarContextView, eh ehVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = ehVar;
        ff ffVar = new ff(actionBarContextView.getContext());
        ffVar.D();
        this.a = ffVar;
        ffVar.p(this);
    }

    @Override // defpackage.fd
    public final void F(ff ffVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.fd
    public final boolean J(ff ffVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.ei
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.ei
    public final MenuInflater b() {
        return new ep(this.c.getContext());
    }

    @Override // defpackage.ei
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ei
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.ei
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.ei
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.ei
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.ei
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.ei
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.ei
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.ei
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.ei
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.ei
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.ei
    public final boolean n() {
        return this.c.j;
    }
}
