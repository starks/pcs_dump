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
public final class dn extends ei implements fd {
    public final ff a;
    public eh b;
    final /* synthetic */ C0000do c;
    private final Context f;
    private WeakReference g;

    public dn(C0000do c0000do, Context context, eh ehVar) {
        this.c = c0000do;
        this.f = context;
        this.b = ehVar;
        ff ffVar = new ff(context);
        ffVar.D();
        this.a = ffVar;
        ffVar.p(this);
    }

    @Override // defpackage.fd
    public final void F(ff ffVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.n();
    }

    @Override // defpackage.fd
    public final boolean J(ff ffVar, MenuItem menuItem) {
        eh ehVar = this.b;
        if (ehVar != null) {
            return ehVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.ei
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.ei
    public final MenuInflater b() {
        return new ep(this.f);
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
        return this.c.d.h;
    }

    @Override // defpackage.ei
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.ei
    public final void f() {
        C0000do c0000do = this.c;
        if (c0000do.f != this) {
            return;
        }
        if (C0000do.k(c0000do.k, false)) {
            this.b.a(this);
        } else {
            c0000do.g = this;
            c0000do.h = this.b;
        }
        this.b = null;
        this.c.g(false);
        ActionBarContextView actionBarContextView = this.c.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        C0000do c0000do2 = this.c;
        c0000do2.b.k(c0000do2.m);
        this.c.f = null;
    }

    @Override // defpackage.ei
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.ei
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.ei
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ei
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.ei
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ei
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.ei
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.ei
    public final boolean n() {
        return this.c.d.j;
    }
}
