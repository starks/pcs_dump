package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ji implements AbsListView.OnScrollListener {
    final /* synthetic */ jk a;

    public ji(jk jkVar) {
        this.a = jkVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.a.w() || this.a.q.getContentView() == null) {
            return;
        }
        jk jkVar = this.a;
        jkVar.o.removeCallbacks(jkVar.r);
        this.a.r.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
