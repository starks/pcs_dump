package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abl extends jt {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ abp d;

    public abl(abp abpVar) {
        this.d = abpVar;
    }

    private final boolean b(View view, RecyclerView recyclerView) {
        km kmVarF = recyclerView.f(view);
        if (!(kmVarF instanceof aca) || !((aca) kmVarF).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        km kmVarF2 = recyclerView.f(recyclerView.getChildAt(iIndexOfChild + 1));
        return (kmVarF2 instanceof aca) && ((aca) kmVarF2).u;
    }

    @Override // defpackage.jt
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (b(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }

    @Override // defpackage.jt
    public final void m(Rect rect, View view, RecyclerView recyclerView) {
        if (b(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }
}
