package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ic {
    public View d;
    public final fuu e;
    public int c = 0;
    public final ib a = new ib();
    public final List b = new ArrayList();

    public ic(fuu fuuVar) {
        this.e = fuuVar;
    }

    public final int a() {
        return this.e.G() - this.b.size();
    }

    public final int b(int i) {
        if (i < 0) {
            return -1;
        }
        int iG = this.e.G();
        int i2 = i;
        while (i2 < iG) {
            int iA = i - (i2 - this.a.a(i2));
            if (iA == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int c() {
        return this.e.G();
    }

    final int d(View view) {
        int iH = this.e.H(view);
        if (iH == -1 || this.a.f(iH)) {
            return -1;
        }
        return iH - this.a.a(iH);
    }

    public final View e(int i) {
        return this.e.I(b(i));
    }

    public final View f(int i) {
        return this.e.I(i);
    }

    public final void g(View view, int i, boolean z) {
        int iG = i < 0 ? this.e.G() : b(0);
        this.a.c(iG, z);
        if (z) {
            j(view);
        }
        ((RecyclerView) this.e.a).addView(view, iG);
        RecyclerView.g(view);
    }

    public final void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iG = i < 0 ? this.e.G() : b(i);
        this.a.c(iG, z);
        if (z) {
            j(view);
        }
        fuu fuuVar = this.e;
        km kmVarG = RecyclerView.g(view);
        if (kmVarG != null) {
            if (!kmVarG.x() && !kmVarG.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + kmVarG + ((RecyclerView) fuuVar.a).j());
            }
            kmVarG.j();
        }
        ((RecyclerView) fuuVar.a).attachViewToParent(view, iG, layoutParams);
    }

    final void i(int i) {
        ib ibVar = this.a;
        int iB = b(i);
        ibVar.g(iB);
        fuu fuuVar = this.e;
        View viewI = fuuVar.I(iB);
        if (viewI != null) {
            km kmVarG = RecyclerView.g(viewI);
            if (kmVarG != null) {
                if (kmVarG.x() && !kmVarG.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + kmVarG + ((RecyclerView) fuuVar.a).j());
                }
                kmVarG.f(256);
            }
        } else {
            int i2 = RecyclerView.W;
        }
        ((RecyclerView) fuuVar.a).detachViewFromParent(iB);
    }

    public final void j(View view) {
        this.b.add(view);
        km kmVarG = RecyclerView.g(view);
        if (kmVarG != null) {
            fuu fuuVar = this.e;
            int i = kmVarG.p;
            if (i != -1) {
                kmVarG.o = i;
            } else {
                kmVarG.o = kmVarG.a.getImportantForAccessibility();
            }
            ((RecyclerView) fuuVar.a).ak(kmVarG, 4);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.J(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
