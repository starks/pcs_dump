package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000do extends cc implements ge {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    dn f;
    ei g;
    eh h;
    public int i;
    public boolean j;
    public boolean k;
    public er l;
    boolean m;
    final uz n;
    final uz o;
    public ll p;
    final fuu q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public C0000do(Activity activity, boolean z) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.z = true;
        this.n = new dl(this);
        this.o = new dm(this);
        this.q = new fuu(this, null);
        View decorView = activity.getWindow().getDecorView();
        l(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    static boolean k(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void l(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.as.oss.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((C0000do) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = ut.a;
                    ul.b(actionBarOverlayLayout);
                }
            }
        }
        View viewFindViewById = view.findViewById(com.google.android.as.oss.R.id.action_bar);
        if (!(viewFindViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) viewFindViewById).A();
        this.d = (ActionBarContextView) view.findViewById(com.google.android.as.oss.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.as.oss.R.id.action_bar_container);
        this.c = actionBarContainer;
        ll llVar = this.p;
        if (llVar == null || this.d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = llVar.b();
        if ((this.p.a() & 4) != 0) {
            this.u = true;
        }
        fsc fscVar = new fsc(this.a);
        int i2 = ((Context) fscVar.a).getApplicationInfo().targetSdkVersion;
        i(fscVar.au());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, dp.a, com.google.android.as.oss.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            int[] iArr2 = ut.a;
            un.o(this.c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.cc
    public final Context a() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.as.oss.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.cc
    public final void b(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cb) this.w.get(i)).a();
        }
    }

    @Override // defpackage.cc
    public final void c(boolean z) {
        if (this.u) {
            return;
        }
        d(z);
    }

    @Override // defpackage.cc
    public final void d(boolean z) {
        h(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.cc
    public final void e(boolean z) {
        er erVar;
        this.A = z;
        if (z || (erVar = this.l) == null) {
            return;
        }
        erVar.a();
    }

    @Override // defpackage.cc
    public final void f(CharSequence charSequence) {
        this.p.m(charSequence);
    }

    public final void g(boolean z) {
        fsc fscVarG;
        fsc fscVarG2;
        if (z) {
            if (!this.y) {
                this.y = true;
                j(false);
            }
        } else if (this.y) {
            this.y = false;
            j(false);
        }
        if (!this.c.isLaidOut()) {
            if (z) {
                this.p.k(4);
                this.d.setVisibility(0);
                return;
            } else {
                this.p.k(0);
                this.d.setVisibility(8);
                return;
            }
        }
        if (z) {
            fscVarG = this.p.v(4, 100L);
            fscVarG2 = this.d.g(0, 200L);
        } else {
            fsc fscVarV = this.p.v(0, 200L);
            fscVarG = this.d.g(8, 100L);
            fscVarG2 = fscVarV;
        }
        er erVar = new er();
        erVar.a.add(fscVarG);
        View view = (View) ((WeakReference) fscVarG.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) fscVarG2.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        erVar.a.add(fscVarG2);
        erVar.b();
    }

    public final void h(int i, int i2) {
        int iA = this.p.a();
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        this.p.f((i & i2) | ((~i2) & iA));
    }

    public final void i(boolean z) {
        this.x = z;
        this.p.e(false);
        this.b.e = false;
    }

    public final void j(boolean z) {
        View view;
        View view2;
        View view3;
        if (!k(this.k, this.y)) {
            if (this.z) {
                this.z = false;
                er erVar = this.l;
                if (erVar != null) {
                    erVar.a();
                }
                if (this.i == 0) {
                    if (!this.A) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    er erVar2 = new er();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    fsc fscVarO = ut.o(this.c);
                    fscVarO.ao(f);
                    fscVarO.aB(this.q);
                    erVar2.f(fscVarO);
                    if (this.j && (view = this.e) != null) {
                        fsc fscVarO2 = ut.o(view);
                        fscVarO2.ao(f);
                        erVar2.f(fscVarO2);
                    }
                    erVar2.d(r);
                    erVar2.c();
                    erVar2.e(this.n);
                    this.l = erVar2;
                    erVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (this.z) {
            return;
        }
        this.z = true;
        er erVar3 = this.l;
        if (erVar3 != null) {
            erVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.o.a();
        } else {
            if (!this.A) {
                if (z) {
                    z = true;
                }
                this.c.setAlpha(1.0f);
                this.c.setTranslationY(0.0f);
                if (this.j) {
                    view2.setTranslationY(0.0f);
                }
                this.o.a();
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f2 -= r6[1];
            }
            this.c.setTranslationY(f2);
            er erVar4 = new er();
            fsc fscVarO3 = ut.o(this.c);
            fscVarO3.ao(0.0f);
            fscVarO3.aB(this.q);
            erVar4.f(fscVarO3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                fsc fscVarO4 = ut.o(this.e);
                fscVarO4.ao(0.0f);
                erVar4.f(fscVarO4);
            }
            erVar4.d(s);
            erVar4.c();
            erVar4.e(this.o);
            this.l = erVar4;
            erVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ut.a;
            ul.b(actionBarOverlayLayout);
        }
    }

    public C0000do(Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.z = true;
        this.n = new dl(this);
        this.o = new dm(this);
        this.q = new fuu(this, null);
        l(dialog.getWindow().getDecorView());
    }
}
