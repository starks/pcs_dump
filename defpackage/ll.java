package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ll {
    final Toolbar a;
    CharSequence b;
    Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private gl m;
    private int n;
    private final Drawable o;

    public ll(Toolbar toolbar) {
        this.n = 0;
        this.a = toolbar;
        this.b = toolbar.s;
        this.k = toolbar.t;
        this.j = this.b != null;
        this.i = toolbar.e();
        zw zwVarR = zw.r(toolbar.getContext(), null, dp.a, R.attr.actionBarStyle, 0);
        Drawable drawableI = zwVarR.i(15);
        this.o = drawableI;
        CharSequence charSequenceK = zwVarR.k(27);
        if (!TextUtils.isEmpty(charSequenceK)) {
            j(charSequenceK);
        }
        CharSequence charSequenceK2 = zwVarR.k(25);
        if (!TextUtils.isEmpty(charSequenceK2)) {
            this.k = charSequenceK2;
            if ((this.e & 8) != 0) {
                toolbar.u(charSequenceK2);
            }
        }
        Drawable drawableI2 = zwVarR.i(20);
        if (drawableI2 != null) {
            g(drawableI2);
        }
        Drawable drawableI3 = zwVarR.i(17);
        if (drawableI3 != null) {
            this.g = drawableI3;
            z();
        }
        if (this.i == null && drawableI != null) {
            this.i = drawableI;
            y();
        }
        f(zwVarR.d(10, 0));
        int iG = zwVarR.g(9, 0);
        if (iG != 0) {
            View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iG, (ViewGroup) toolbar, false);
            View view = this.f;
            if (view != null && (this.e & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f = viewInflate;
            if (viewInflate != null && (this.e & 16) != 0) {
                toolbar.addView(viewInflate);
            }
            f(this.e | 16);
        }
        int iF = zwVarR.f(13, 0);
        if (iF > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = iF;
            toolbar.setLayoutParams(layoutParams);
        }
        int iB = zwVarR.b(7, -1);
        int iB2 = zwVarR.b(3, -1);
        if (iB >= 0 || iB2 >= 0) {
            int iMax = Math.max(iB, 0);
            int iMax2 = Math.max(iB2, 0);
            toolbar.k();
            toolbar.r.a(iMax, iMax2);
        }
        int iG2 = zwVarR.g(28, 0);
        if (iG2 != 0) {
            Context context = toolbar.getContext();
            toolbar.k = iG2;
            TextView textView = toolbar.b;
            if (textView != null) {
                textView.setTextAppearance(context, iG2);
            }
        }
        int iG3 = zwVarR.g(26, 0);
        if (iG3 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.l = iG3;
            TextView textView2 = toolbar.c;
            if (textView2 != null) {
                textView2.setTextAppearance(context2, iG3);
            }
        }
        int iG4 = zwVarR.g(22, 0);
        if (iG4 != 0) {
            toolbar.t(iG4);
        }
        zwVarR.m();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i = this.n;
                this.l = i != 0 ? b().getString(i) : null;
                x();
            }
        }
        this.l = toolbar.h();
        toolbar.q(new lj(this));
    }

    public static final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public static final void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    private final void w(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.v(charSequence);
            if (this.j) {
                ut.k(this.a.getRootView(), charSequence);
            }
        }
    }

    private final void x() {
        if ((this.e & 4) != 0) {
            if (!TextUtils.isEmpty(this.l)) {
                this.a.o(this.l);
                return;
            }
            Toolbar toolbar = this.a;
            int i = this.n;
            toolbar.o(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    private final void y() {
        if ((this.e & 4) == 0) {
            this.a.p(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.p(drawable);
    }

    private final void z() {
        Drawable drawable;
        int i = this.e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.n(drawable);
    }

    public final int a() {
        return this.e;
    }

    public final Context b() {
        return this.a.getContext();
    }

    public final void c() {
        this.a.j();
    }

    public final void d() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.i();
        }
    }

    public final void e(boolean z) {
        Toolbar toolbar = this.a;
        toolbar.y = false;
        toolbar.requestLayout();
    }

    public final void f(int i) {
        View view;
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    x();
                }
                y();
            }
            if ((i2 & 3) != 0) {
                z();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.v(this.b);
                    this.a.u(this.k);
                } else {
                    this.a.v(null);
                    this.a.u(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public final void g(Drawable drawable) {
        this.h = drawable;
        z();
    }

    public final void h(Menu menu, fq fqVar) {
        if (this.m == null) {
            this.m = new gl(this.a.getContext());
        }
        gl glVar = this.m;
        glVar.e = fqVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.l();
        ff ffVar = toolbar.a.a;
        if (ffVar == menu) {
            return;
        }
        if (ffVar != null) {
            ffVar.m(toolbar.w);
            ffVar.m(toolbar.x);
        }
        if (toolbar.x == null) {
            toolbar.x = new lf(toolbar);
        }
        glVar.t();
        if (menu != null) {
            ff ffVar2 = (ff) menu;
            ffVar2.h(glVar, toolbar.i);
            ffVar2.h(toolbar.x, toolbar.i);
        } else {
            glVar.c(toolbar.i, null);
            toolbar.x.c(toolbar.i, null);
            glVar.l();
            toolbar.x.l();
        }
        toolbar.a.j(toolbar.j);
        toolbar.a.k(glVar);
        toolbar.w = glVar;
        toolbar.w();
    }

    public final void i() {
        this.d = true;
    }

    public final void j(CharSequence charSequence) {
        this.j = true;
        w(charSequence);
    }

    public final void k(int i) {
        this.a.setVisibility(i);
    }

    public final void l(Window.Callback callback) {
        this.c = callback;
    }

    public final void m(CharSequence charSequence) {
        if (this.j) {
            return;
        }
        w(charSequence);
    }

    public final boolean n() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    public final boolean o() {
        return this.a.x();
    }

    public final boolean p() {
        gl glVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (glVar = actionMenuView.c) == null || !glVar.o()) ? false : true;
    }

    public final boolean q() {
        gl glVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (glVar = actionMenuView.c) == null) {
            return false;
        }
        return glVar.m != null || glVar.q();
    }

    public final boolean r() {
        return this.a.y();
    }

    public final boolean s() {
        return this.a.z();
    }

    public final fsc v(int i, long j) {
        float f = i == 0 ? 1.0f : 0.0f;
        fsc fscVarO = ut.o(this.a);
        fscVarO.al(f);
        fscVarO.am(j);
        fscVarO.an(new lk(this, i));
        return fscVarO;
    }
}
