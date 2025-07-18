package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gl extends ev {
    gj i;
    public int j;
    public gk k;
    public gh l;
    public ckp m;
    final dd n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private fuu u;

    public gl(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.n = new dd(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ev
    public final View a(fh fhVar, View view, ViewGroup viewGroup) {
        View actionView = fhVar.getActionView();
        if (actionView == null || fhVar.m()) {
            fs fsVar = view instanceof fs ? (fs) view : (fs) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            b(fhVar, fsVar);
            actionView = (View) fsVar;
        }
        actionView.setVisibility(true == fhVar.o ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof go)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.ev
    public final void b(fh fhVar, fs fsVar) {
        fsVar.f(fhVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) fsVar;
        actionMenuItemView.b = (ActionMenuView) this.h;
        if (this.u == null) {
            this.u = new fuu(this);
        }
        actionMenuItemView.c = this.u;
    }

    @Override // defpackage.ev, defpackage.fr
    public final void c(Context context, ff ffVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = ffVar;
        Resources resources = context.getResources();
        fsc fscVar = new fsc(context);
        if (!this.p) {
            this.o = true;
        }
        this.q = ((Context) fscVar.a).getResources().getDisplayMetrics().widthPixels / 2;
        this.j = fscVar.at();
        int measuredWidth = this.q;
        if (this.o) {
            if (this.i == null) {
                this.i = new gj(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.r = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.ev, defpackage.fr
    public final void d(ff ffVar, boolean z) {
        s();
        fq fqVar = this.e;
        if (fqVar != null) {
            fqVar.a(ffVar, z);
        }
    }

    @Override // defpackage.ev
    public final boolean f(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.i) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // defpackage.ev, defpackage.fr
    public final boolean g() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        ff ffVar = this.c;
        View view = null;
        boolean z4 = false;
        if (ffVar != null) {
            arrayListF = ffVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.j;
        int i2 = this.r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i3 = 0;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            fh fhVar = (fh) arrayListF.get(i3);
            if (fhVar.r()) {
                i4++;
            } else if (fhVar.q()) {
                i5++;
            } else {
                z5 = true;
            }
            if (this.s && fhVar.o) {
                i = 0;
            }
            i3++;
        }
        if (this.o && (z5 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            fh fhVar2 = (fh) arrayListF.get(i7);
            if (fhVar2.r()) {
                View viewA = a(fhVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = fhVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                fhVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (fhVar2.q()) {
                int i10 = fhVar2.b;
                boolean z6 = sparseBooleanArray.get(i10);
                boolean z7 = ((i6 > 0 || z6) && i2 > 0) ? z : z4;
                if (z7) {
                    View viewA2 = a(fhVar2, view, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z7 = i2 + i8 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z6) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        fh fhVar3 = (fh) arrayListF.get(i11);
                        boolean z9 = z;
                        if (fhVar3.b == i10) {
                            if (fhVar3.o()) {
                                i6++;
                            }
                            fhVar3.k(false);
                        }
                        i11++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i6--;
                }
                fhVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                fhVar2.k(z2);
            }
            i7++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ff] */
    @Override // defpackage.ev, defpackage.fr
    public final boolean h(fy fyVar) {
        boolean z = false;
        if (!fyVar.hasVisibleItems()) {
            return false;
        }
        fy fyVar2 = fyVar;
        while (true) {
            ff ffVar = fyVar2.k;
            if (ffVar == this.c) {
                break;
            }
            fyVar2 = (fy) ffVar;
        }
        fh fhVar = fyVar2.l;
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof fs) && ((fs) childAt).a() == fhVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        fh fhVar2 = fyVar.l;
        int size = fyVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = fyVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        gh ghVar = new gh(this, this.b, fyVar, view);
        this.l = ghVar;
        ghVar.d(z);
        if (!this.l.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        fq fqVar = this.e;
        fy fyVar3 = fyVar;
        if (fqVar != null) {
            if (fyVar == null) {
                fyVar3 = this.c;
            }
            fqVar.b(fyVar3);
        }
        return true;
    }

    @Override // defpackage.ev
    public final boolean k(fh fhVar) {
        return fhVar.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    @Override // defpackage.ev, defpackage.fr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl.l():void");
    }

    public final ft m(ViewGroup viewGroup) {
        ft ftVar = this.h;
        if (this.h == null) {
            this.h = (ft) this.d.inflate(R.layout.abc_action_menu_layout, viewGroup, false);
            this.h.a(this.c);
            l();
        }
        ft ftVar2 = this.h;
        if (ftVar != ftVar2) {
            ((ActionMenuView) ftVar2).k(this);
        }
        return ftVar2;
    }

    public final void n(ActionMenuView actionMenuView) {
        this.h = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean o() {
        Object obj;
        ckp ckpVar = this.m;
        if (ckpVar != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(ckpVar);
            this.m = null;
            return true;
        }
        gk gkVar = this.k;
        if (gkVar == null) {
            return false;
        }
        gkVar.b();
        return true;
    }

    public final boolean p() {
        gh ghVar = this.l;
        if (ghVar == null) {
            return false;
        }
        ghVar.b();
        return true;
    }

    public final boolean q() {
        gk gkVar = this.k;
        return gkVar != null && gkVar.g();
    }

    public final boolean r() {
        ff ffVar;
        if (!this.o || q() || (ffVar = this.c) == null || this.h == null || this.m != null || ffVar.e().isEmpty()) {
            return false;
        }
        this.m = new ckp(this, new gk(this, this.b, this.c, this.i), 1);
        ((View) this.h).post(this.m);
        return true;
    }

    public final void s() {
        o();
        p();
    }

    public final void t() {
        this.s = true;
    }

    public final void u() {
        this.o = true;
        this.p = true;
    }
}
