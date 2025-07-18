package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ev implements fr {
    protected final Context a;
    public Context b;
    public ff c;
    protected final LayoutInflater d;
    public fq e;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public ft h;

    public ev(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    public View a(fh fhVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    public abstract void b(fh fhVar, fs fsVar);

    @Override // defpackage.fr
    public void c(Context context, ff ffVar) {
        throw null;
    }

    @Override // defpackage.fr
    public void d(ff ffVar, boolean z) {
        throw null;
    }

    @Override // defpackage.fr
    public final void e(fq fqVar) {
        throw null;
    }

    protected boolean f(ViewGroup viewGroup, int i) {
        throw null;
    }

    @Override // defpackage.fr
    public boolean g() {
        throw null;
    }

    @Override // defpackage.fr
    public boolean h(fy fyVar) {
        throw null;
    }

    @Override // defpackage.fr
    public final boolean i(fh fhVar) {
        return false;
    }

    @Override // defpackage.fr
    public final boolean j(fh fhVar) {
        return false;
    }

    public boolean k(fh fhVar) {
        throw null;
    }

    @Override // defpackage.fr
    public void l() {
        throw null;
    }
}
