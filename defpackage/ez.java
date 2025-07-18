package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.as.oss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ez extends fn implements View.OnKeyListener, PopupWindow.OnDismissListener, fr {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private fq y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new fw(this, 1);
    private final View.OnAttachStateChangeListener m = new ex(this, 0);
    private final jl n = new ey(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public ez(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(defpackage.ff r17) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez.z(ff):void");
    }

    @Override // defpackage.fv
    public final ListView aJ() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((cgm) this.b.get(r1.size() - 1)).b();
    }

    @Override // defpackage.fn
    public final void b(ff ffVar) {
        ffVar.h(this, this.h);
        if (u()) {
            z(ffVar);
        } else {
            this.l.add(ffVar);
        }
    }

    @Override // defpackage.fr
    public final void d(ff ffVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ffVar == ((cgm) this.b.get(i)).c) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            ((ff) ((cgm) this.b.get(i2)).c).i(false);
        }
        cgm cgmVar = (cgm) this.b.remove(i);
        ((ff) cgmVar.c).m(this);
        if (this.f) {
            ((jn) cgmVar.b).q.setExitTransition(null);
            ((jk) cgmVar.b).q.setAnimationStyle(0);
        }
        ((jk) cgmVar.b).f();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = ((cgm) this.b.get(size2 - 1)).a;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((ff) ((cgm) this.b.get(0)).c).i(false);
                return;
            }
            return;
        }
        f();
        fq fqVar = this.y;
        if (fqVar != null) {
            fqVar.a(ffVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.fr
    public final void e(fq fqVar) {
        this.y = fqVar;
    }

    @Override // defpackage.fv
    public final void f() {
        int size = this.b.size();
        if (size <= 0) {
            return;
        }
        cgm[] cgmVarArr = (cgm[]) this.b.toArray(new cgm[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cgm cgmVar = cgmVarArr[size];
            if (((jk) cgmVar.b).u()) {
                ((jk) cgmVar.b).f();
            }
        }
    }

    @Override // defpackage.fr
    public final boolean g() {
        return false;
    }

    @Override // defpackage.fr
    public final boolean h(fy fyVar) {
        for (cgm cgmVar : this.b) {
            if (fyVar == cgmVar.c) {
                cgmVar.b().requestFocus();
                return true;
            }
        }
        if (!fyVar.hasVisibleItems()) {
            return false;
        }
        b(fyVar);
        fq fqVar = this.y;
        if (fqVar != null) {
            fqVar.b(fyVar);
        }
        return true;
    }

    @Override // defpackage.fn
    public final void k(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.fr
    public final void l() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((cgm) it.next()).b().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.fn
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.fn
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.fn
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        cgm cgmVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cgmVar = null;
                break;
            }
            cgmVar = (cgm) this.b.get(i);
            if (!((jk) cgmVar.b).u()) {
                break;
            } else {
                i++;
            }
        }
        if (cgmVar != null) {
            ((ff) cgmVar.c).i(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.fn
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.fn
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.fv
    public final void s() {
        if (u()) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            z((ff) it.next());
        }
        this.l.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.fn
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.fv
    public final boolean u() {
        return this.b.size() > 0 && ((jk) ((cgm) this.b.get(0)).b).u();
    }
}
