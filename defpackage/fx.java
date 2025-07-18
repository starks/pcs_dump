package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fx extends fn implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, fr {
    final jn a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final ff f;
    private final fc h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private fq o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new fw(this, 0);
    private final View.OnAttachStateChangeListener l = new ex(this, 2);
    private int s = 0;

    public fx(Context context, ff ffVar, View view, int i, boolean z) {
        this.e = context;
        this.f = ffVar;
        this.i = z;
        this.h = new fc(ffVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new jn(context, i);
        ffVar.h(this, context);
    }

    @Override // defpackage.fv
    public final ListView aJ() {
        return this.a.e;
    }

    @Override // defpackage.fr
    public final void d(ff ffVar, boolean z) {
        if (ffVar != this.f) {
            return;
        }
        f();
        fq fqVar = this.o;
        if (fqVar != null) {
            fqVar.a(ffVar, z);
        }
    }

    @Override // defpackage.fr
    public final void e(fq fqVar) {
        this.o = fqVar;
    }

    @Override // defpackage.fv
    public final void f() {
        if (u()) {
            this.a.f();
        }
    }

    @Override // defpackage.fr
    public final boolean g() {
        return false;
    }

    @Override // defpackage.fr
    public final boolean h(fy fyVar) {
        if (fyVar.hasVisibleItems()) {
            fp fpVar = new fp(this.e, fyVar, this.c, this.i, this.k);
            fpVar.e(this.o);
            fpVar.d(fn.w(fyVar));
            fpVar.c = this.m;
            this.m = null;
            this.f.i(false);
            jn jnVar = this.a;
            int width = jnVar.g;
            int iB = jnVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!fpVar.g()) {
                if (fpVar.a != null) {
                    fpVar.f(width, iB, true, true);
                }
            }
            fq fqVar = this.o;
            if (fqVar != null) {
                fqVar.b(fyVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.fn
    public final void k(View view) {
        this.n = view;
    }

    @Override // defpackage.fr
    public final void l() {
        this.q = false;
        fc fcVar = this.h;
        if (fcVar != null) {
            fcVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fn
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.fn
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.fn
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.fn
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.fn
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.fn
    public final void r(int i) {
        this.a.k(i);
    }

    @Override // defpackage.fv
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.v(this);
        jn jnVar = this.a;
        jnVar.m = this;
        jnVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        jn jnVar2 = this.a;
        jnVar2.l = view2;
        jnVar2.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.x();
        this.a.t(this.g);
        this.a.s();
        io ioVar = this.a.e;
        ioVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ioVar, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            ioVar.addHeaderView(frameLayout, null, false);
        }
        this.a.e(this.h);
        this.a.s();
    }

    @Override // defpackage.fv
    public final boolean u() {
        return !this.p && this.a.u();
    }

    @Override // defpackage.fn
    public final void b(ff ffVar) {
    }
}
