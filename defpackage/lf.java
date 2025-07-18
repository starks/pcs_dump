package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lf implements fr {
    ff a;
    public fh b;
    final /* synthetic */ Toolbar c;

    public lf(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.fr
    public final void c(Context context, ff ffVar) {
        fh fhVar;
        ff ffVar2 = this.a;
        if (ffVar2 != null && (fhVar = this.b) != null) {
            ffVar2.t(fhVar);
        }
        this.a = ffVar;
    }

    @Override // defpackage.fr
    public final void e(fq fqVar) {
        throw null;
    }

    @Override // defpackage.fr
    public final boolean g() {
        return false;
    }

    @Override // defpackage.fr
    public final boolean h(fy fyVar) {
        return false;
    }

    @Override // defpackage.fr
    public final boolean i(fh fhVar) {
        KeyEvent.Callback callback = this.c.h;
        if (callback instanceof ej) {
            ((ej) callback).a();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        int size = toolbar3.u.size();
        while (true) {
            size--;
            if (size < 0) {
                toolbar3.u.clear();
                this.b = null;
                this.c.requestLayout();
                fhVar.h(false);
                this.c.w();
                return true;
            }
            toolbar3.addView((View) toolbar3.u.get(size));
        }
    }

    @Override // defpackage.fr
    public final boolean j(fh fhVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new ha(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            lg lgVar = new lg();
            lgVar.a = (toolbar.m & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM) | 8388611;
            lgVar.b = 2;
            toolbar.g.setLayoutParams(lgVar);
            toolbar.g.setOnClickListener(new gc(toolbar, 2));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = fhVar.getActionView();
        this.b = fhVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            lg lgVar2 = new lg();
            Toolbar toolbar5 = this.c;
            lgVar2.a = 8388611 | (toolbar5.m & AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM);
            lgVar2.b = 2;
            toolbar5.h.setLayoutParams(lgVar2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((lg) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.u.add(childAt);
            }
        }
        this.c.requestLayout();
        fhVar.h(true);
        KeyEvent.Callback callback = this.c.h;
        if (callback instanceof ej) {
            ((ej) callback).b();
        }
        this.c.w();
        return true;
    }

    @Override // defpackage.fr
    public final void l() {
        if (this.b != null) {
            ff ffVar = this.a;
            if (ffVar != null) {
                int size = ffVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            i(this.b);
        }
    }

    @Override // defpackage.fr
    public final void d(ff ffVar, boolean z) {
    }
}
