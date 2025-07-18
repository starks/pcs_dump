package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjy implements Runnable {
    final /* synthetic */ cjz a;
    private final CoordinatorLayout b;
    private final View c;

    public cjy(cjz cjzVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = cjzVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.c) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            this.a.I(this.b, this.c);
            return;
        }
        cjz cjzVar = this.a;
        cjzVar.V(this.b, this.c, cjzVar.c.getCurrY());
        this.c.postOnAnimation(this);
    }
}
